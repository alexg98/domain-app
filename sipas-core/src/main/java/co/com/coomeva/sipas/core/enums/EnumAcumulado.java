package co.com.coomeva.sipas.core.enums;

import static co.com.coomeva.sipas.core.enums.EnumAsegurabilidad.ACUMULADO_PESEVERANCIA;
import static co.com.coomeva.sipas.core.enums.EnumAsegurabilidad.ACUMULADO_RENTA_DIARIA;
import static co.com.coomeva.sipas.core.enums.EnumAsegurabilidad.ACUMULADO_VIDA;
import static co.com.coomeva.sipas.core.enums.EnumAsegurabilidad.AMULADO_TOTAL;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import co.com.coomeva.sipas.bpm.context.ContextWrapper;
import co.com.coomeva.sipas.core.dao.ISipProteccionesDao;
import co.com.coomeva.sipas.core.model.sipasdb.SipProtecciones;
import co.com.coomeva.sipas.util.excepciones.NotFoundRuntimeExceptionSipas;
/**
 * Enum para calcular los acumulados del asociado
 * @author alge3325
 * 
 *
 */
public enum EnumAcumulado {
	
	PERSEVERANCIA {
		@Override
		public Long getAcumuladoByAsociado(long asoNumint) {			
				return this.ObternerAcumulado(ACUMULADO_PESEVERANCIA, asoNumint);
		}
	},
	VIDA {
		@Override
		public Long getAcumuladoByAsociado(long asoNumint) {
			return this.ObternerAcumulado(ACUMULADO_VIDA , asoNumint);
		}
	},
	RENTA_DIARIA {
		@Override
		public Long getAcumuladoByAsociado(long asoNumint) {
			return this.ObternerAcumulado(ACUMULADO_RENTA_DIARIA , asoNumint);
		}
	},
	ADICIONAL {
		@Override
		public Long getAcumuladoByAsociado(long asoNumint) {
			return this.ObternerAcumulado(AMULADO_TOTAL , asoNumint);
		}		
	};
	
	private Environment env;
	
	private ISipProteccionesDao dao;
	/**
	 * Obtener acumulado de proteccion por acumulado
	 * @param aseCodigo
	 * @param asoNumint
	 * @return
	 */
	public Long ObternerAcumulado(EnumAsegurabilidad aseCodigo, long asoNumint) {
		initContext();
		List<SipProtecciones> list = dao.getProteccionesActivasByAsegurabilida(asoNumint, aseCodigo.getAsecodigo());		
		return Optional.of(list.stream().mapToLong(proteccio -> proteccio.getProProteccionAcumulada().longValue()).sum())
				.orElseThrow(
				() -> new NotFoundRuntimeExceptionSipas(env.getProperty("excepcion.sipas.not.found.acumulados.por.linea", String.class)) );
	}	
	/**
	 * Obtener el acumulado actual por asociado por linea
	 * @param asoNumint
	 * @return
	 */
	public abstract Long getAcumuladoByAsociado(long asoNumint);
	/**
	 * Inicia la instancia dao
	 */
	private void initContext() {
		if(dao == null) { 
			dao = ContextWrapper.getContext().getBean("sipProteccionesDao", ISipProteccionesDao.class);
			env = ContextWrapper.getContext().getEnvironment();
		}	
	}	
}