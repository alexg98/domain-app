package co.com.coomeva.sipas.core.dao;

import co.com.coomeva.sipas.core.model.sipasdb.SipProteccionesEventos;
import co.com.coomeva.sipas.databaseutil.dao.IAbstractSipasDAO;


public interface ISipProteccionesEventosDao extends IAbstractSipasDAO<SipProteccionesEventos>{
	
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

	public static final String ASO_NUMINT = "sipProtecciones.asoNumint";
}
