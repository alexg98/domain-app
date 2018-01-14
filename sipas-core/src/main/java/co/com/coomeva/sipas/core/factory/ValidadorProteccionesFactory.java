package co.com.coomeva.sipas.core.factory;

import co.com.coomeva.sipas.core.validaciones.protecciones.ValidadorProtecciones;

public interface ValidadorProteccionesFactory {
	
	ValidadorProtecciones get(String proucto);
}
