package co.com.coomeva.sipas.core.validaciones.protecciones;

import static co.com.coomeva.sipas.core.enums.EnumEstadosAprobacionProteccion.EN_PROCESO;
import static co.com.coomeva.sipas.core.enums.EnumEstadosProteccion.ACTIVO;
import static co.com.coomeva.sipas.core.enums.EnumNamedQuerySipasdb.GET_PROTECCIONES_EVENTOS_PENDIENTES;

import java.util.List;

import org.springframework.core.env.Environment;

import co.com.coomeva.sipas.bpm.context.ContextWrapper;
import co.com.coomeva.sipas.core.config.dto.parametros.ParamRegistroProtecciones;
import co.com.coomeva.sipas.core.dao.ISipProteccionesEventosDao;
import co.com.coomeva.sipas.core.model.sipasdb.SipProteccionesEventos;
import co.com.coomeva.sipas.util.excepciones.RuntimeExceptionSipas;

/**
 * Representa clase utilitaria con todas la validaciones necesarias para la
 * grabacion de una proteccion.
 * @author alge3325
 *
 * @param <T>
 */
public class RepositorioValidaciones<T> {
	
	@SuppressWarnings("unused")
	private final T value;
	
	private ISipProteccionesEventosDao sipProteccionesEventosDao;
	
	private Environment env;
	
	private RepositorioValidaciones(T value) {
		sipProteccionesEventosDao = ContextWrapper.getContext().getBean("sipProteccionesEventosDao", ISipProteccionesEventosDao.class);
		env = ContextWrapper.getContext().getEnvironment();		
        this.value = value;
    }
		
	public static <T> RepositorioValidaciones<T> of(T value) {		
        return new RepositorioValidaciones<>(value);
    }
	
	@SuppressWarnings("unchecked")
	public void validarProteccionesPendientesAprobacion(ParamRegistroProtecciones param, Long prodcodigo) {
		List<SipProteccionesEventos> result = sipProteccionesEventosDao.getNamedQuery(GET_PROTECCIONES_EVENTOS_PENDIENTES).
				setParam("asoNumint",param.getClimae().getNumInt()).
				setParam("proEstado", ACTIVO.getEstado()).
				setParam("proEstadoProteccion", EN_PROCESO.getEstado()).list();
		if( !result.isEmpty() && result.stream().allMatch( p -> prodcodigo.equals(p.getSipProtecciones().getSipProductos().getProdCodigo()))) {
			throw new RuntimeExceptionSipas(env.getProperty("excepcion.sipas.found.protecciones.pendientes"),prodcodigo.toString());
		}
	}
}