package com.domainexample.dataaccess.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * The Class AbstractDomainexampleDAO representing the common Data Access methods
 * than apply to all the DAOs in the application.
 * 
 * @param <T> the generic type that would be procesed by the logic of this
 *            Generic Class
 */
public abstract class AbstractDomainexampleDAO<T> {

	/** The type. */
	private Class<T> type;

	/** The session factory. */
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * Creates a new instance of AbstractDomainexampleDAO.
	 */
	public AbstractDomainexampleDAO() {

	}

	/**
	 * Creates a new instance of AbstractDomainexampleDAO.
	 * 
	 * @param type the type
	 */
	public AbstractDomainexampleDAO(Class<T> type) {
		this.type = type;
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
	 * Creates a new instance of type <T> in the data base.
	 * 
	 * @param instance of type <T> that would be created.
	 * @return the element recently inserted
	 */
	//@Loggable(level = LoggingLevel.DEBUG)
	@SuppressWarnings("unchecked")
	public T save(T instance) {
		instance = (T) getSession().save(instance);
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
		getSession().update(instance);
	}

	/**
	 * Delete an instance of type <T> in the data base, referenced by the
	 * instance recieved.
	 * 
	 * @param instance of type <T> that would be created.
	 */
	//@Loggable(level = LoggingLevel.DEBUG)
	public void delete(T instance) {
		getSession().delete(instance);
	}

	/**
	 * Find a record and creates an instance of type <T>, search is made by id.
	 * 
	 * @param id the id of the searched entity
	 * @return the instance if exists
	 */
	//@Loggable(level = LoggingLevel.DEBUG)
	public T findById(java.lang.Long id) {
		T instance = (T) getSession().get(type, id);
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
		List<T> results = getSession().createCriteria(type).add(Example.create(instance).ignoreCase().enableLike(MatchMode.ANYWHERE).excludeZeroes()).list();
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
		Query queryObject = getSession().createQuery(queryString);
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
		Query queryObject = getSession().createQuery(queryString);
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
		Query query = getSession().createQuery(queryString);
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
			return getSession().createQuery(queryString).setFirstResult(startRow).setMaxResults(maxResults).list();
		} else {
			String queryString = "select model from " + type.getName() + " model";
			return getSession().createQuery(queryString).setFirstResult(startRow).setMaxResults(maxResults).list();
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
		Query queryObject = getSession().createQuery(queryString);
		return (Long) queryObject.list().get(0);
	}

	/**
	 * This method removes from the current session the entity passed as
	 * argument.
	 * 
	 * @param entity that will be removed from session
	 */
	public void evictEntityFromSession(T entity) {
		getSession().evict(entity);
	}
}
