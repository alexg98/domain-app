package co.com.coomeva.sipas.core.protecciones.template;

import co.com.coomeva.sipas.core.config.dto.parametros.ParamRegistroProtecciones;
import co.com.coomeva.sipas.core.model.sipasdb.SipProtecciones;
import co.com.coomeva.sipas.core.model.sipasdb.SipProteccionesEventos;

public interface IProteccionTemplate {
	/**
	 * Registrar incmreneto
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
	
	
	void ejecutarIncremento(ParamRegistroProtecciones param);
}
