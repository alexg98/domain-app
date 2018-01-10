package com.domainexample.dataaccess.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import co.com.sipas.databaseutil.dao.AbstractDomainexampleDAO;

public class BaseHibernateDao<T> extends AbstractDomainexampleDAO<T> {

	public BaseHibernateDao(Class<T> type,SessionFactory sessionFactory) {
		super(type,sessionFactory);
	}
	
}