package co.com.coomeva.sipas.api.controller.HandlerException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import co.com.coomeva.sipas.util.excepciones.ExceptionsSipasUtils;
import co.com.coomeva.sipas.util.excepciones.ValidRuntimeExceptionSipas;

@RestController
public class ExceptionHandlingController {

	protected Logger logger;

	public ExceptionHandlingController() {
		logger = LoggerFactory.getLogger(getClass());
	}
	
	@ExceptionHandler({ NullPointerException.class })
	public String nullPointerException(Exception exception) {
		logger.error("Request raised " + ExceptionsSipasUtils.getTraced(exception) );
		return "null pointer exception";		
	}
	
	@ExceptionHandler({ Exception.class })
	public String exception(Exception exception) {
		logger.error("Request raised " + ExceptionsSipasUtils.getTraced(exception) );
		return "Exception";
	}
	
	@ExceptionHandler({ RuntimeException.class })
	public String runtimeException(Exception exception) {
		logger.error("Request raised " + ExceptionsSipasUtils.getTraced(exception) );
		return "Runtime Exception";
	}
	
	@ExceptionHandler({ ValidRuntimeExceptionSipas.class })
	public String validRuntimeExceptionSipas(Exception exception) {
		logger.error("Request raised " + ExceptionsSipasUtils.getTraced(exception) );
		return "Valid Runtime ExceptionSipas";
	}	
}
