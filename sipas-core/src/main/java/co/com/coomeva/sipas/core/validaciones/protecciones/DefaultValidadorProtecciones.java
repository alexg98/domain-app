package co.com.coomeva.sipas.core.validaciones.protecciones;

import co.com.coomeva.sipas.core.config.dto.parametros.ParamRegistroProtecciones;
/**
 * Validaciones genericas para la grabacion de una proteccion
 * @author alge3325
 *
 */
public final class DefaultValidadorProtecciones implements ValidadorProtecciones {

	/**
	 * Validaciones por defecto para la grabacion de una proteccion
	 */
	@Override
	public final void validaCondicionesDeRegistro(ParamRegistroProtecciones param) {
		ValidadorProtecciones.super.validaCondicionesDeRegistro(param);
	}

	@Override
	public final void validaCondicionesDisminucion(ParamRegistroProtecciones param) {
		ValidadorProtecciones.super.validaCondicionesDisminucion(param);
	}
}