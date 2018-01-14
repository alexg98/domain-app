package co.com.coomeva.sipas.bpm.dataaccess.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.com.coomeva.sipas.databaseutil.dao.AbstractSipasDAO;

public class BaseHibernateDao<T> extends AbstractSipasDAO<T> {

	public BaseHibernateDao(Class<T> type, SessionFactory sessionFactory) {
		super(type,sessionFactory);
	}
	
	/**
	 * Se limita el uso de session a nivel de capa de acceso a datos DAO  
	 */
	@Deprecated
	public Session getSession() {
		throw new UnsupportedOperationException("Operacion no permitidad, usar metodo getCurrentSession a nivel de capa Dao");
	}
	
	/**
	 * Se obtiene la session actual, se limita a acesso protegido para evitar extender su uso en otras capas. 
	 * @return
	 */
	protected Session getCurrentSession() {
		return super.getSession();
	}
}