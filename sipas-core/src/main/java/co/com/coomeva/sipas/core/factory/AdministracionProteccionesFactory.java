package co.com.coomeva.sipas.core.factory;

import co.com.coomeva.sipas.core.protecciones.administracion.IAdminProtecciones;

public interface AdministracionProteccionesFactory {
	
	IAdminProtecciones get(String proucto);
}
