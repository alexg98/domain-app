package co.com.coomeva.sipas.core.factory;

import co.com.coomeva.sipas.bpm.context.ContextWrapper;
import co.com.coomeva.sipas.core.protecciones.template.DefaultProteccionTemplate;
import co.com.coomeva.sipas.core.protecciones.template.IProteccionTemplate;
import co.com.coomeva.sipas.core.validaciones.protecciones.DefaultValidadorProtecciones;
import co.com.coomeva.sipas.core.validaciones.protecciones.ValidadorProtecciones;

public final class FactoryProxy {

	private final String codigoFactory;
	
    private static ValidadorProteccionesFactory serviceLocatedFactory;

	private static AdministracionProteccionesFactory serviceLocatedFactoryAdmin;
	
	
	private FactoryProxy(String codigoFactory) {
		serviceLocatedFactory = ContextWrapper.getContext().getBean("factoryValidadorProtecciones", ValidadorProteccionesFactory.class);
		serviceLocatedFactoryAdmin = ContextWrapper.getContext().getBean("factoryProteccionesTemplate", AdministracionProteccionesFactory.class);
		this.codigoFactory = codigoFactory;
	}
	
	public static FactoryProxy of(String value) {		
        return new FactoryProxy(value);
    }	
	
	/**
	 * Metodo encargado de retornar el validador de proteccion de acuerdo al producto que llega por parametro
	 * en caso que no exista debe tomar un validador por defecto 
	 * el validador por defecto.
	 * @param param codigo del producto
	 * @return ValidadorProtecciones
	 */
	public synchronized ValidadorProtecciones getValidadorProteccion() {
		ValidadorProtecciones validador = serviceLocatedFactory.get("validador_"+codigoFactory);
		if(validador == null) {
			return new DefaultValidadorProtecciones();
		}
		return validador;
	}
	
	public synchronized IProteccionTemplate getProteccionTemplate() {
		IProteccionTemplate template = serviceLocatedFactoryAdmin.get("template_"+codigoFactory);		
		if(template == null) {
			return new DefaultProteccionTemplate();
		}
		return template;
	}	
}
