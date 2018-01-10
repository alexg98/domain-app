package com.domainexample.dataaccess.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import co.com.coomeva.sipas.core.model.SipParametros;

@Scope("singleton")
@Repository
public class SipParametroDao extends BaseHibernateDao<SipParametros> implements ISipParametroDao {

	@Autowired
	public SipParametroDao(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		super(SipParametros.class, sessionFactory);
	}	
}