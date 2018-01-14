package co.com.coomeva.sipas.core.validaciones.protecciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.com.coomeva.sipas.core.config.dto.parametros.ParamRegistroProtecciones;
import co.com.coomeva.sipas.core.dao.ISipProteccionesEventosDao;
import static co.com.coomeva.sipas.core.enums.EnumEstadosAprobacionProteccion.*;
import static co.com.coomeva.sipas.core.enums.EnumEstadosProteccion.*;
import static co.com.coomeva.sipas.core.enums.EnumNamedQuerySipasdb.*;
import co.com.coomeva.sipas.core.model.sipasdb.SipProteccionesEventos;
import co.com.coomeva.sipas.util.excepciones.RuntimeExceptionSipas;

/**
 * Representa clase utilitaria con todas la validaciones necesarias para la
 * grabacion de una proteccion.
 * @author alge3325
 *
 * @param <T>
 */

public final class RepositorioValidaciones<T> {
	
	@SuppressWarnings("unused")
	private final T value;
	
	@Autowired
	private ISipProteccionesEventosDao sipProteccionesEventosDao;
	
	private RepositorioValidaciones(T value) {
        this.value = value;
    }
		
	public static <T> RepositorioValidaciones<T> of(T value) {
        return new RepositorioValidaciones<>(value);
    }
	
	@SuppressWarnings("unchecked")
	public void validarProteccionesPendientesAprobacion(ParamRegistroProtecciones param, Long prodcodigo) {
		List<SipProteccionesEventos> result = sipProteccionesEventosDao.getNamedQuery(GET_PROTECCIONES_EVENTOS_PENDIENTES).
				setParam("asoNumint",param.getClimae().getNumInt()).
				setParam("proEstado", ACTIVO).
				setParam("estadoProteccion", EN_PROCESO).list();
		if( result.stream().allMatch( p -> prodcodigo.equals(p.getSipProtecciones().getSipProductos().getProdCodigo()))) {
			throw new RuntimeExceptionSipas("Asociado tiene protecciones pendientes de aprobacion para el producto { prodCodigo} ");
		}
	}
}