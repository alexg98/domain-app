package co.com.coomeva.sipas.core.validaciones;

import java.lang.reflect.Constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import co.com.coomeva.sipas.core.validaciones.protecciones.ValidadorProtecciones;

/**
 * @author Giovanni Arzayus - UTI COOMEVA
 * @version 1.0
 * Descripci�n : Provee la funcionalidad para construir
 * objetos de tipo validador.
 */

@PropertySource(value = { "classpath:validadores_producto.properties" })
public class FabricaValidadores {
	private static FabricaValidadores fabricaValidadores = null;
	
	@Autowired
	private Environment env;
	
	private FabricaValidadores() {
	}

	/**
	 * Retorna la instancia de la fabrica de validadores
	 * de condiciones particulares de las protecciones.
	 * @return FabricaValidadores fabricaValidadores
	 */
	public static synchronized  FabricaValidadores getInstance(){
		if(fabricaValidadores==null){
			fabricaValidadores = new FabricaValidadores();
		}		
		return fabricaValidadores;
	}
	
	/**
	 * Construye y retorna el validador espec�fico de la protecci�n para el tipo de producto proporcionado.
	 * @param codidogProducto
	 * @return Validador validador
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public ValidadorProtecciones construirValidador(String codidogProducto) throws Exception{
		ValidadorProtecciones validador = null;
		Class<? extends ValidadorProtecciones> loadClassOk = null;
		try{
			String nombreClaseValidador = env.getProperty(codidogProducto,String.class);  
			if (nombreClaseValidador!=null){
				loadClassOk = loadClass(nombreClaseValidador);
				Constructor cons = loadClassOk.getConstructors()[0];
				validador = (ValidadorProtecciones) cons.newInstance();
			}else
				validador=null;
			
		}catch(Exception ex){
			validador = null;
			throw new Exception("FabricaValidadores.construirValidador -> [No se pudo cargar la clase Validador de protecci�n espec�fica] :"+ex.toString());
		} 
		return validador;
	}
	
	/**
	 * Carga la clase de acuerdo a la instancia proporcionada
	 * @param instance
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public  Class<? extends ValidadorProtecciones> loadClass(String className) throws Exception{
		Class loadClassOk = null;
		try{
			StringBuffer classLoad = new StringBuffer();
			classLoad.append("co.com.coomeva.sipas.core.validaciones.protecciones");
			classLoad.append(".");
			classLoad.append(className);
			loadClassOk = Class.forName(classLoad.toString());
		}catch(Exception ex){
			loadClassOk = null;
			throw new Exception(ex.toString());
		} 
		return loadClassOk;
	}
	
	
}
