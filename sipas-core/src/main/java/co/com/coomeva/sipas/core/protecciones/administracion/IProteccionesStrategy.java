package co.com.coomeva.sipas.core.protecciones.administracion;

import co.com.coomeva.sipas.core.config.dto.parametros.ParamRegistroProtecciones;
import co.com.coomeva.sipas.core.model.sipasdb.SipProtecciones;
import co.com.coomeva.sipas.core.model.sipasdb.SipProteccionesEventos;
/**
 * Interfaz con las operaciones necesarias para la creacion de una proteccion
 * @author alge3325
 *
 */
public interface IProteccionesStrategy {

	/**
	 * Crer proteccione
	 * @param param
	 * @return
	 */
	SipProtecciones registrarProteccion(ParamRegistroProtecciones param);
	/**
	 * Registrar incrmento
	 * @param param
	 * @return
	 */	
	SipProteccionesEventos registrarIncremento(ParamRegistroProtecciones param);
	/**
	 * Registrar Disminucion
	 * @param param
	 * @return
	 */
	SipProteccionesEventos registrarDisminucion(ParamRegistroProtecciones param);
}
