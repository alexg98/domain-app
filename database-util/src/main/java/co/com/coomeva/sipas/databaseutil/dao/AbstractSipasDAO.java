package co.com.coomeva.sipas.databaseutil.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.hibernate.transform.Transformers;

import co.com.coomeva.sipas.databaseutil.extendhibernate.QueryCustom;
import co.com.coomeva.sipas.databaseutil.model.MapValue;


/**
 * The Class AbstractDomainexampleDAO representing the common Data Access methods
 * than apply to all the DAOs in the application.
 * 
 * @param <T> the generic type that would be procesed by the logic of this
 *            Generic Class
 */
public abstract class AbstractSipasDAO<T> {

	/** The type. */
	private Class<T> type;

	/** The session factory. */
	private SessionFactory sessionFactory;

	private QueryCustom queryCustom;
	/**
	 * Creates a new instance of AbstractDomainexampleDAO.
	 */
	public AbstractSipasDAO() {
		
	}

	/**
	 * Creates a new instance of AbstractDomainexampleDAO.
	 * 
	 * @param type the type
	 */
	public AbstractSipasDAO(Class<T> type,SessionFactory sessionFactory) {
		queryCustom = new QueryCustom();
		this.type = type;
		this.sessionFactory = sessionFactory;
	}

	/**
	 * Accesor method to get the reference/value of the attribute session.
	 * 
	 * @return The actual reference/value of the attribute session
	 */
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * acceso restringido a nivel de clase
	 * @return
	 */
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	/**
	 * Creates a new instance of type <T> in the data base.
	 * 
	 * @param instance of type <T> that would be created.
	 * @return the element recently inserted
	 */
	//@Loggable(level = LoggingLevel.DEBUG)
	@SuppressWarnings("unchecked")
	public T save(T instance) {
		instance = (T) getCurrentSession().save(instance);
		return instance;
	}

	/**
	 * Update an instance of type <T> in the data base, referenced by the
	 * instance recieved.
	 * 
	 * @param instance of type <T> that would be created.
	 */
	//@Loggable(level = LoggingLevel.DEBUG)
	public void update(T instance) {
		getCurrentSession().update(instance);
	}

	/**
	 * Delete an instance of type <T> in the data base, referenced by the
	 * instance recieved.
	 * 
	 * @param instance of type <T> that would be created.
	 */
	//@Loggable(level = LoggingLevel.DEBUG)
	public void delete(T instance) {
		getCurrentSession().delete(instance);
	}

	/**
	 * Find a record and creates an instance of type <T>, search is made by id.
	 * 
	 * @param id the id of the searched entity
	 * @return the instance if exists
	 */
	//@Loggable(level = LoggingLevel.DEBUG)
	public T findById(java.lang.Long id) {
		T instance = (T) getCurrentSession().get(type, id);
		return instance;
	}

	/**
	 * Find a record and creates an instance of type <T>, search is made by an
	 * example of the searched entity.
	 * 
	 * @param instance the instance of type <T> as example of search
	 * @return List<T> of the entities that matches with the example entity
	 */
	//@Loggable(level = LoggingLevel.DEBUG)
	@SuppressWarnings("unchecked")
	public List<T> findByExample(T instance) {
		List<T> results = getCurrentSession().createCriteria(type).add(Example.create(instance).ignoreCase().enableLike(MatchMode.ANYWHERE).excludeZeroes()).list();
		return results;
	}

	/**
	 * Find all <T> entities.
	 * 
	 * @return List<T> all <T> instances
	 */
	@SuppressWarnings("unchecked")
	//@Loggable(level = LoggingLevel.DEBUG)
	public List<T> findAll() {
		String queryString = "from " + type.getName();
		Query queryObject = getCurrentSession().createQuery(queryString);
		return queryObject.list();
	}

	/**
	 * Find all T entities with a specific property value.
	 * 
	 * @param propertyName the property to search in the instance
	 * @param value the property value to match
	 * @return List<T> found by query
	 */
	@SuppressWarnings("unchecked")
	//@Loggable(level = LoggingLevel.DEBUG)
	public List<T> findByProperty(String propertyName, Object value) {
		String queryString = "from " + type.getName() + " as model where model." + propertyName + "= ?";
		Query queryObject = getCurrentSession().createQuery(queryString);
		queryObject.setParameter(0, value);
		return queryObject.list();
	}

	/**
	 * Returns a list of type <T> entities that match with the where clause
	 * passed as argument.
	 * 
	 * @param whereCondition where clause to filter
	 * @return List<T> of entities of type <T> that matches with the where
	 *         condition
	 */
	@SuppressWarnings("unchecked")
	//@Loggable(level = LoggingLevel.DEBUG)
	public List<T> findByCriteria(String whereCondition) {
		String where = ((whereCondition == null) || (whereCondition.length() == 0)) ? "" : ("where " + whereCondition);
		final String queryString = "select model from " + type.getName() + " model " + where;
		Query query = getCurrentSession().createQuery(queryString);
		List<T> entitiesList = query.list();
		return entitiesList;
	}

	/**
	 * Returns a List of entities of type <T> that sorted an pagd by the
	 * conditions recieved.
	 * 
	 * @param sortColumnName sorting column
	 * @param sortAscending true if ascending false if descending
	 * @param startRow initial row
	 * @param maxResults max number of results
	 * @return List<T> list of entities of type <T>
	 */
	@SuppressWarnings("unchecked")
	//@Loggable(level = LoggingLevel.DEBUG)
	public List<T> findPageEntities(String sortColumnName, boolean sortAscending, int startRow, int maxResults) {
		StringBuilder builder = new StringBuilder();
		builder.append(sortColumnName);
		builder.append(", ");
		builder.append(sortAscending);
		builder.append(", ");
		builder.append(String.valueOf(startRow));
		builder.append(", ");
		builder.append(String.valueOf(maxResults));

		if ((sortColumnName != null) && (sortColumnName.length() > 0)) {
			String queryString = "select model from " + type.getName() + " model order by model." + sortColumnName + " " + (sortAscending ? "asc" : "desc");
			return getCurrentSession().createQuery(queryString).setFirstResult(startRow).setMaxResults(maxResults).list();
		} else {
			String queryString = "select model from " + type.getName() + " model";
			return getCurrentSession().createQuery(queryString).setFirstResult(startRow).setMaxResults(maxResults).list();
		}
	}

	/**
	 * Returns the total number of the records present in the database of type
	 * <T>.
	 * 
	 * @return total number of records
	 */
	//@Loggable(level = LoggingLevel.DEBUG)
	public Long findTotalNumberEntities() {
		String queryString = "select count(*) from " + type.getName() + " model";
		Query queryObject = getCurrentSession().createQuery(queryString);
		return (Long) queryObject.list().get(0);
	}

	/**
	 * This method removes from the current session the entity passed as
	 * argument.
	 * 
	 * @param entity that will be removed from session
	 */
	public void evictEntityFromSession(T entity) {
		getCurrentSession().evict(entity);
	}
	
	public QueryCustom getNamedQuery(Enum queryName) {
		return queryCustom.getNamedQuery(this.getCurrentSession(),queryName.toString() );
	}
	
	/**
	 * Apply a ResultTransformer to native SQL queries
	 * @param queryName
	 * @param type
	 * @return
	 */
	public QueryCustom getNamedQueryTransoformDto(Enum queryName, Class<T> type) {
		return getNamedQuery(queryName)
				.setResultTransformer(Transformers.aliasToBean( type ));
	}
	
	/**
	 * Devuelve el resulset en un Map clave valor
	 * @param queryName
	 * @return
	 */
	public <T> List<Map<String,T>> getNamedQueryMap(Enum queryName) {	
		try {
			SQLQuery query = (SQLQuery)getCurrentSession().getNamedQuery(queryName.toString());
			query.setResultTransformer(AliasToEntityMapResultTransformer.INSTANCE);
			List<Map<String,T>> result = query.list();
			
			result.forEach(item -> { 
					item.forEach( (k,v) -> item.put(k, (T)new MapValue(v)));  
				});	
			return result;
		} catch (ClassCastException e) {
			StackTraceElement[] trace = e.getStackTrace();
			throw new RuntimeException("[Excepcion 101] Solo aplica para consultas nativas , error : " + trace[0],e);
		}		
	}	
}