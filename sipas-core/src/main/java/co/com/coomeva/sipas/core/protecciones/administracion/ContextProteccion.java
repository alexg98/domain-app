package co.com.coomeva.sipas.core.protecciones.administracion;

import org.springframework.beans.factory.annotation.Autowired;

import co.com.coomeva.sipas.core.config.dto.parametros.ParamRegistroProtecciones;
import co.com.coomeva.sipas.core.factory.AdministracionProteccionesFactory;
import co.com.coomeva.sipas.core.factory.ValidadorProteccionesFactory;
import co.com.coomeva.sipas.core.validaciones.protecciones.ValidadorProtecciones;

public class ContextProteccion {

	@Autowired
	private AdministracionProteccionesFactory serviceLocatedFactory;	
	
	@Autowired
	private ValidadorProteccionesFactory serviceValidFactory;
	
	void registrarProtecciones() {		
		this.registrarProteccion(99l);
	}	
	/**
	 * Metodo encargado de ejecutar todas las operaciones necesarias para la creacion de un proteccion
	 * - validar las condiciones para grabar proteccion
	 * @param proteccion
	 * @return
	 */
	String registrarProteccion(Long proteccion) {
		
		ParamRegistroProtecciones param = new ParamRegistroProtecciones();		

		ValidadorProtecciones valid = serviceValidFactory.get("prodcodigo_99");
		valid.validaCondicionesDeRegistro(param);
		
		IProteccionesStrategy admin = null;//serviceLocatedFactory.get("prodcodigo_99");
		admin.registrarProteccion(param);
		admin.registrarIncremento(param);
		return null;
	}	
}
