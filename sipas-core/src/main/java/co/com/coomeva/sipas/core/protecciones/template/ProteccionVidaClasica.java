package co.com.coomeva.sipas.core.protecciones.template;

import org.springframework.stereotype.Component;

import co.com.coomeva.sipas.core.config.dto.parametros.ParamRegistroProtecciones;
import co.com.coomeva.sipas.core.model.sipasdb.SipProtecciones;
import co.com.coomeva.sipas.core.model.sipasdb.SipProteccionesEventos;
import co.com.coomeva.sipas.util.excepciones.RuntimeExceptionSipas;

@Component("template_99")
public class ProteccionVidaClasica extends AbstractProteccionTemplate {

	/**
	 * Creacion del producto vida clasico
	 */
	@Override
	public SipProtecciones registrarProteccion(ParamRegistroProtecciones param) {
		if(param.getProdCodigo() == null){
			
		}
		return null;
	}

	/**
	 * Logica generica para la creacion de un incremento
	 */
	@Override
	public SipProteccionesEventos registrarIncremento(ParamRegistroProtecciones param) {
		throw new RuntimeExceptionSipas("Metodo no implementado");
	}
	/**
	 * Logica generica para la creacion de una disminucion
	 */
	@Override
	public SipProteccionesEventos registrarDisminucion(ParamRegistroProtecciones param) {
		throw new RuntimeExceptionSipas("Metodo no implementado");
	}
}
