package co.com.coomeva.sipas.core.protecciones.administracion;

import co.com.coomeva.sipas.core.config.dto.parametros.ParamRegistroProtecciones;
/**
 * Interfaz con las operaciones necesarias para la creacion de una proteccion
 * @author alge3325
 *
 */
public interface IAdminProtecciones {

	/**
	 * Crer proteccione
	 * @param param
	 * @return
	 */
	String registrarProteccion(ParamRegistroProtecciones param);
	/**
	 * Registrar incrmento
	 * @param param
	 * @return
	 */	
	String registrarIncremento(ParamRegistroProtecciones param);
	/**
	 * Registrar Disminucion
	 * @param param
	 * @return
	 */
	String registrarDisminucion(ParamRegistroProtecciones param);
}
