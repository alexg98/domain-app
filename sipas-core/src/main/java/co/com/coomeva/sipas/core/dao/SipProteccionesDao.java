package co.com.coomeva.sipas.core.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import co.com.coomeva.sipas.core.enums.EnumEstadosProteccion;
import co.com.coomeva.sipas.core.enums.EnumNamedQuerySipasdb;
import co.com.coomeva.sipas.core.model.sipasdb.SipProtecciones;

@Scope("singleton")
@Repository
public class SipProteccionesDao extends BaseHibernateDao<SipProtecciones> implements ISipProteccionesDao {
	
	@Autowired
	public SipProteccionesDao(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		super(SipProtecciones.class, sessionFactory);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SipProtecciones> getProteccionesActivasByAsegurabilida(Long asoNumint, Long aseCodigo) {		
		return getNamedQuery(EnumNamedQuerySipasdb.GET_PROTECCIONES_BY_ASECODIGO)
				.setParam("aseCodigo", aseCodigo).setParam("proEstado", EnumEstadosProteccion.getActivoEInactivoMora())
				.setParam("asoNumint", asoNumint).list();
	}

}
