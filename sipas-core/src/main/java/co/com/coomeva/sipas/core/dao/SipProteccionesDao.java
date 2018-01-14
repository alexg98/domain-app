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

	public static final String CONSECUTIVO = "consecutivo";
	public static final String PRO_COD = "sipProtecciones.proCod";
	public static final String FACTOR_CODIGO = "sipFactores.factorCodigo";
	public static final String CODIGO = "codigo";
	public static final String PRO_VALOR = "proValor";
	public static final String PRO_CUOTA = "proCuota";
	public static final String PRO_VALOR_SOLICITADO = "proValorSolicitado";
	public static final String PRO_FECHA_REGISTRO = "proFechaRegistro";
	public static final String PRO_FECHA_SOLICITUD = "proFechaSolicitud";
	public static final String PRO_FECHA_REQUISITOS = "proFechaRequisitos";
	public static final String PRO_FECHA_VIGENCIA = "proFechaVigencia";
	
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
