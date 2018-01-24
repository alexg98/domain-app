package co.com.coomeva.sipas.core.factory;

import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

import co.com.coomeva.sipas.bpm.context.ContextWrapper;
import co.com.coomeva.sipas.core.protecciones.template.AbstractProteccionTemplate;
import co.com.coomeva.sipas.core.protecciones.template.DefaultProteccionTemplate;
import co.com.coomeva.sipas.core.validaciones.protecciones.DefaultValidadorProtecciones;
import co.com.coomeva.sipas.core.validaciones.protecciones.ValidadorProtecciones;

//@PropertySource(value = { "classpath:/validadores_producto.properties"})

@PropertySources({ @PropertySource(value = "classpath:validadores_producto.properties"),
	 @PropertySource(value = "classpath:factory_producto.properties") })
public final class FactoryProxy {

	private final String codigoFactory;
	
	private static Environment env;
	
    private static ValidadorProteccionesFactory serviceLocatedFactory;

	private static AdministracionProteccionesFactory serviceLocatedFactoryAdmin;
	
	
	private FactoryProxy(String codigoFactory) {
		serviceLocatedFactory = ContextWrapper.getContext().getBean("factoryValidadorProtecciones", ValidadorProteccionesFactory.class);
		serviceLocatedFactoryAdmin = ContextWrapper.getContext().getBean("factoryProteccionesTemplate", AdministracionProteccionesFactory.class);
		env = ContextWrapper.getContext().getEnvironment();
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
		String validor =  env.getProperty(codigoFactory);	
		if(validor == null) {
			return new DefaultValidadorProtecciones();
		}
		return serviceLocatedFactory.get(validor);
	}
	
	public synchronized AbstractProteccionTemplate getProteccionTemplate() {		
		String template =  env.getProperty(codigoFactory);		
		if(template == null) {
			return new DefaultProteccionTemplate();
		}
		return serviceLocatedFactoryAdmin.get(template);
	}	
}
