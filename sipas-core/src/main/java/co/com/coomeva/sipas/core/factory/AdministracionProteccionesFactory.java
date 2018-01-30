package co.com.coomeva.sipas.core.factory;

import co.com.coomeva.sipas.core.protecciones.template.IProteccionTemplate;

public interface AdministracionProteccionesFactory {
	
	IProteccionTemplate get(String proucto);
}
