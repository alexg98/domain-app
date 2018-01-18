package co.com.coomeva.sipas.core.validaciones.protecciones;

import static co.com.coomeva.sipas.core.enums.EnumProductos.VIDA_CLASICO;

import java.util.function.Consumer;

import org.springframework.stereotype.Component;

import co.com.coomeva.sipas.core.config.dto.parametros.ParamRegistroProtecciones;
import co.com.coomeva.sipas.util.excepciones.RuntimeExceptionSipas;
/**
 * @ Validaciones generales requeridas para la grabacion de un producto.
 * @author alge3325
 *
 */          
@Component("prodCodigo_99")
public class ValidadorVidaClasica implements ValidadorProtecciones {
	
	Consumer<ParamRegistroProtecciones> validarEstadoAsociado = (param) -> param.getClimae();
	
	Consumer<ParamRegistroProtecciones> validarProteccionesPendientesAprobacion = (param) -> 
		RepositorioValidaciones.of(param).validarProteccionesPendientesAprobacion(param,  VIDA_CLASICO.getProdCodigo());
	
	@Override
	public void validaCondicionesDeRegistro(ParamRegistroProtecciones param) {				
		validarEstadoAsociado.accept(param);
		validarProteccionesPendientesAprobacion.accept(param);
	}

	@Override
	public void validaCondicionesDisminucion(ParamRegistroProtecciones param) {
		throw new RuntimeExceptionSipas("Metodo no soportado");
	}	
}