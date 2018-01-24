package co.com.coomeva.sipas.core.protecciones.template;

import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.Transactional;

import co.com.coomeva.sipas.core.config.dto.parametros.ParamRegistroProtecciones;
import co.com.coomeva.sipas.core.factory.FactoryProxy;
import co.com.coomeva.sipas.core.model.sipasdb.SipProtecciones;
import co.com.coomeva.sipas.core.model.sipasdb.SipProteccionesEventos;
import co.com.coomeva.sipas.core.validaciones.protecciones.ValidadorProtecciones;
import co.com.coomeva.sipas.util.excepciones.RuntimeExceptionSipas;

@Transactional(readOnly = false)
public abstract class AbstractProteccionTemplate implements IProteccionTemplate {	

	/**
	 * Template methods registro incremento
	 * <br>Realiza las validaciones generales y especificas del producto
	 * <br>Registra la proteccion en el caso que no exista
	 * <br>Registra el incremento de la proteccion
	 * @param param
	 */	
	public final void ejecutarIncremento(ParamRegistroProtecciones param) {
		ValidadorProtecciones valid = FactoryProxy.of( param.getProdCodigo().toString() ).getValidadorProteccion();
		valid.validaCondicionesDeRegistro(param);
		registrarProteccion(param);
		registrarIncremento(param);
		this.determinaryEjecutarFlujo(param);		
	}	
	/**
	 * Template methods registro disminucion
	 * @param param
	 */
	public final void registrarDsiminucion(ParamRegistroProtecciones param) {
		registrarDisminucion(param);
	}

	/**
	 * Logica generica para la creacion de una proteccion
	 */
	@Override
	public SipProtecciones registrarProteccion(ParamRegistroProtecciones param) {
		throw new RuntimeExceptionSipas("Metodo no implementado");
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
	/**
	 * Determina y genera flujo de auditoria medica
	 * @param param
	 */
	public Boolean determinaryEjecutarFlujo(ParamRegistroProtecciones param) {
		throw new RuntimeExceptionSipas("Metodo no implementado");
	}
}
