package co.com.coomeva.sipas.core.protecciones.template;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import co.com.coomeva.sipas.api.DomainSpringBootApplication;
import co.com.coomeva.sipas.bpm.context.ContextWrapper;
import co.com.coomeva.sipas.core.config.dto.parametros.ParamRegistroProtecciones;
import co.com.coomeva.sipas.core.factory.FactoryProxy;
import co.com.coomeva.sipas.core.service.protecciones.ProteccionService;

@ActiveProfiles("dev")
@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes = DomainSpringBootApplication.class, loader = AnnotationConfigContextLoader.class)
public class ProteccionVidaClasicaTemplateTest {

	@Mock
	private ProteccionService service;	 
	
	@Mock
	private ContextWrapper context;
		
	@Test
	public void registrarProteccion() {
		try {		
			service.getProteccioneByAsonumint(1252l);
		
			ParamRegistroProtecciones param = new ParamRegistroProtecciones();		
			IProteccionTemplate template = FactoryProxy.of("99").getProteccionTemplate();
			template.ejecutarIncremento(param);			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
}
