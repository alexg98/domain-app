package com.domainexample.extendhibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.ResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QueryCustom extends AbstractQueryCustom implements IQueryCustom{	
		
	private Query query;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public QueryCustom getNamedQuery(String name) {
		this.query = sessionFactory.getCurrentSession().getNamedQuery(name);
		return this;
	}
	
	public QueryCustom setParam(String name,Object val) {
		if(val instanceof Long[]) {
			this.query.setParameterList(name, (Long[])val);
		}else if(val instanceof String[]) {
			this.query.setParameterList(name, (String[])val);
		}else if(val instanceof List<?>) {
			this.query.setParameterList(name, (List<?>)val);
		}else if(val instanceof Integer[]) {
			this.query.setParameterList(name, (Integer[])val);
		}else if(val instanceof Double[]) {
			this.query.setParameterList(name, (Double[])val);
		}else {
			this.query.setParameter(name, val);
		}	
		return this;
	} 
	
	@SuppressWarnings("rawtypes")
	@Override
	public List list() {
		return this.query.list();
	}
	
	@Override
	public QueryCustom setResultTransformer(ResultTransformer  transformer) {
		this.query.setResultTransformer(transformer);
		return this;
	}
	
	@Override
	public Object uniqueResult() {		
		return this.query.uniqueResult();
	}

	public Query getQuery() {
		return query;
	}	 
}
	