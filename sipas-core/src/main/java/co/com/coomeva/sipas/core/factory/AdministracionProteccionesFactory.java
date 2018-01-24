package co.com.coomeva.sipas.core.factory;

import co.com.coomeva.sipas.core.protecciones.template.AbstractProteccionTemplate;

public interface AdministracionProteccionesFactory {
	
	AbstractProteccionTemplate get(String proucto);
}
