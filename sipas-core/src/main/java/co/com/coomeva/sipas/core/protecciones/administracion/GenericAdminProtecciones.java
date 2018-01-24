package co.com.coomeva.sipas.core.protecciones.administracion;

import co.com.coomeva.sipas.core.config.dto.parametros.ParamRegistroProtecciones;
import co.com.coomeva.sipas.core.model.sipasdb.SipProtecciones;
import co.com.coomeva.sipas.core.model.sipasdb.SipProteccionesEventos;
import co.com.coomeva.sipas.util.excepciones.RuntimeExceptionSipas;
/**
 * Clase generica con los metodos propios para la creacion de cualquier proteccion
 * @author alge3325
 *
 */
public class GenericAdminProtecciones {
	/**
	 * Crer proteccione
	 * @param param
	 * @return
	 */
	public SipProtecciones registrarProteccion(ParamRegistroProtecciones param) {
		throw new RuntimeExceptionSipas("Operacion no soportada");
	}
	/**
	 * Registrar incrmento
	 * @param param
	 * @return
	 */	
	public SipProteccionesEventos registrarIncremento(ParamRegistroProtecciones param) {
		throw new RuntimeExceptionSipas("Operacion no soportada");
	}
	/**
	 * Registrar Disminucion
	 * @param param
	 * @return
	 */
	public SipProteccionesEventos registrarDisminucion(ParamRegistroProtecciones param) {
		throw new RuntimeExceptionSipas("Operacion no soportada");
	}
}
