package co.com.coomeva.sipas.core.validaciones.protecciones;

import java.util.function.Consumer;

import org.apache.commons.lang3.time.DateUtils;

import co.com.coomeva.sipas.core.config.dto.parametros.ParamRegistroProtecciones;
import co.com.coomeva.sipas.util.excepciones.ValidRuntimeExceptionSipas;
import co.com.coomeva.sipas.util.fechas.Utilfechas;
/**
 * Representa todas la validaciones generales requeridas para
 * el registro o disminucion de una proteccion,
 * 
 * @author alge3325
 */
public interface ValidadorProtecciones {
	
	Consumer<ParamRegistroProtecciones> validaFechaDeNacimiento = (param) -> {
		if( !DateUtils.isSameDay(param.getFechaNacimiento(), Utilfechas.getDateFromString(param.getClimae().getFecNac() ))) 
			throw new ValidRuntimeExceptionSipas("La fecha ingresada no es igual a la fecha de nacimiento del asociado");
	};

	Consumer<ParamRegistroProtecciones> validarTopesMinimos = (param) -> {
		if( !param.getFechaNacimiento().equals( Utilfechas.getDateFromString(param.getClimae().getFecNac()) )) 
			throw new ValidRuntimeExceptionSipas("El valor ingresado supera el maximo permitido");
	};
		
	Consumer<ParamRegistroProtecciones> validarEdadMaximaDeRegistr = (param) -> {
		if( !param.getFechaNacimiento().equals( Utilfechas.getDateFromString(param.getClimae().getFecNac()) )) 
			throw new ValidRuntimeExceptionSipas("El valor ingresado es infeior al minimo permitido");
	};
	
	Consumer<ParamRegistroProtecciones> validaAcumulado = (param) -> RepositorioValidaciones.of(param);

	Consumer<ParamRegistroProtecciones> validarRegistroDeProteccionPropias = (param) -> {
		if( param.getClimae().getNitCli().equals( param.getPromotor() ))
			throw new ValidRuntimeExceptionSipas("No se puede registrar Incremento/Disminuciones as\\u00ED mismo");
	};	
		
	Consumer<ParamRegistroProtecciones> validarProteccionesPendientesAprobacion = param -> RepositorioValidaciones.of(param);
	
	/**
	 * Validaciones por defecto necesarias para la grabacion de una proteccion
	 * @param param
	 */
	default void validaCondicionesDeRegistro(ParamRegistroProtecciones param) {
		validaFechaDeNacimiento.accept(param);
		validarTopesMinimos.accept(param);
		validarEdadMaximaDeRegistr.accept(param);
		validarRegistroDeProteccionPropias.accept(param);
	}
	
	default void validaCondicionesDisminucion(ParamRegistroProtecciones param) {
		validaFechaDeNacimiento.accept(param);
	}
}
