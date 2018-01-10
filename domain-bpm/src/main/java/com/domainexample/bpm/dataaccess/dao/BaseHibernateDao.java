package com.domainexample.bpm.dataaccess.dao;

import org.hibernate.SessionFactory;

import co.com.sipas.databaseutil.dao.AbstractDomainexampleDAO;

public class BaseHibernateDao<T> extends AbstractDomainexampleDAO<T> {

	public BaseHibernateDao(Class<T> type, SessionFactory sessionFactory) {
		super(type,sessionFactory);
	}
	
	
}