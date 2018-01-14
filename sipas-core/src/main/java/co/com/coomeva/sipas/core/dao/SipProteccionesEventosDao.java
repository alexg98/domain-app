package co.com.coomeva.sipas.core.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import co.com.coomeva.sipas.core.model.sipasdb.SipProtecciones;
import co.com.coomeva.sipas.core.model.sipasdb.SipProteccionesEventos;

@Scope("singleton")
@Repository
public class SipProteccionesEventosDao extends BaseHibernateDao<SipProteccionesEventos> implements ISipProteccionesEventosDao {
	
	@Autowired
	public SipProteccionesEventosDao(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		super(SipProteccionesEventos.class, sessionFactory);
	}
}
