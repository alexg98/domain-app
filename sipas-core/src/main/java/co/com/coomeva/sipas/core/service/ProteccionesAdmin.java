package co.com.coomeva.sipas.core.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import co.com.coomeva.sipas.core.factory.ValidadorProteccionesFactory;
import co.com.coomeva.sipas.util.annotations.EvictSession;
import co.com.coomeva.sipas.util.excepciones.RuntimeExceptionSipas;

//--este puede aplicar en el servicio
public class ProteccionesAdmin {
	
	/**
	 * Creacion de estructura para determinar la fabriica a ejectura
	 * Enum 
	 */	
	String crearDisminucion() {
		
		return null;
	}	
	/**
	 * Se itera por cada proteccion
	 * @param protecciones
	 * @return
	 */
	String registrarProtecciones(List<Long> protecciones) {
		List<String> mensajes = new ArrayList<>();
		try {
			protecciones.forEach( proteccion -> mensajes.add(  registrarProteccion(proteccion) )	);
		} catch (Exception e) {
			throw new RuntimeExceptionSipas("Error [2]: error al grabar incmremento",e);
		}
		return null;
	}
	
	String registrarProteccion(Long proteccion) {		
		//Fabirca productos 
		AdminProtecciones proteccionVidaClasica = new ProteccionVidaClasico(); ///--producto
		proteccionVidaClasica.vaidate();
		proteccionVidaClasica.registrarIncremento();
		return null;
	}
}


interface AdminProtecciones {
	void registrarProteccion();
	void registrarIncremento();
	void registrarDisminucion();
	double cacluloValorContribucion();
	void vaidate();	
}

/**
 * Clase especifica
 * Cada clase debe implementar los metodos necesarios y especificos para
 * la parametrizacion y creacion de la proteccion
 * @author alge3325
 *
 */
class ProteccionVidaClasico  extends GenericaCreacionRegistros implements AdminProtecciones{

    private ValidadorProteccionesFactory serviceLocatedFactory;
	
	@Override
	@EvictSession  //-- Reepplazar con la anotacion necesario para actualizacion de los valores de proteccion
	public void registrarIncremento() {
		//--Ejecutar condiciones especificas del producto
		super.registrarIncremento();
	}

	@Override
	@EvictSession  //-- Reepplazar con la anotacion necesario para actualizacion de los valores de proteccion
	public void registrarDisminucion() {
		/* En la creacion de la proteccion se especifica las condiciones
		 * particulares 
		 */		
		super.registrarDisminucion();
	}

	@Override
	public void vaidate() {
		long prodCodigo = 0l;
		serviceLocatedFactory.get("prodCodigo_99"+prodCodigo);
	}	
}
/**
 * Ejemplo de clase particular
 */
class ProteccionVida65  extends GenericaCreacionRegistros implements AdminProtecciones{
	@Override
	public void vaidate() {}	
}

@Service("prodcodigo_105")
class ProteccionPlanEducativoEducacionSuperior  extends GenericaCreacionRegistros implements AdminProtecciones{
	@Override
	public void vaidate() {}
	public void registrarProteccion() {
		new ProteccionesAdmin().registrarProteccion(115l);
		new ProteccionesAdmin().registrarProteccion(125l);
	}
}

@Service("prodcodigo_115")
class ProteccionPlanEducativoEduacionBasica  extends GenericaCreacionRegistros implements AdminProtecciones{
	public void vaidate() {}	
}

@Service("prodcodigo_125")
class ProteccionPlanEducativoDesempleo  extends GenericaCreacionRegistros implements AdminProtecciones{
	public void vaidate() {}	
}


/**
 * Clase concreta con la logica necesaria para la grabacion de las
 * protecciones
 * @author alge3325 
 */
abstract class GenericaCreacionRegistros{
	/**
	 * Crea la proteccion en caso que no exista
	 */
	public void registrarProteccion(){
		new CondicionesDeAuditoriaMedica().consultarReglaDeNegocioAuditoriaMedica();
	}
	
	public void registrarIncremento(){}	
	public void registrarDisminucion(){}
	public double cacluloValorContribucion() {
		return 0.0;
	}
}

class cacluloValorContribucion{
	
}

class CondicionesDeAuditoriaMedica{
	void consultarReglaDeNegocioAuditoriaMedica() {}
	void retornarDeclaracionDeSalud() {}
	//--
	void pignoracionDeProtecciones() {}
}

