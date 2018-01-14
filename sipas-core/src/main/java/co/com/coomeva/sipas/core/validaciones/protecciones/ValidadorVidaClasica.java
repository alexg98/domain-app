package co.com.coomeva.sipas.core.validaciones.protecciones;

import java.util.function.Consumer;

import org.springframework.stereotype.Service;

import co.com.coomeva.sipas.core.config.dto.parametros.ParamRegistroProtecciones;
import static co.com.coomeva.sipas.core.enums.EnumProductos.*;
/**
 * @ Validaciones generales requeridas para la grabacion de un producto.
 * @author alge3325
 *
 */
@Service
public class ValidadorVidaClasica implements ValidadorProtecciones {
	
	Consumer<ParamRegistroProtecciones> validarEstadoAsociado = (param) -> param.getClimae();
	
	Consumer<ParamRegistroProtecciones> validarProteccionesPendientesAprobacion = (param) -> 
		RepositorioValidaciones.of(param).validarProteccionesPendientesAprobacion(param,  VIDA_CLASICO.getProdCodigo());
	
	@Override
	public void validaCondicionesRegistro(ParamRegistroProtecciones param) {
		/**
		 * Llama al validador general
		 */
		validate(param); 
		
		validarEstadoAsociado.accept(param);
		validarProteccionesPendientesAprobacion.accept(param);
	}

	@Override
	public void validaCondicionesDisminucion(ParamRegistroProtecciones param) {
		
	}	
}