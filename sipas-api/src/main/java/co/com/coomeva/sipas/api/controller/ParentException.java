package co.com.coomeva.sipas.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ParentException {
	
	protected Logger logger;

	public ParentException() {
		logger = LoggerFactory.getLogger(getClass());
	}
	
	@ExceptionHandler({ ClassCastException.class })
	public String errorCasteo(Exception exception) {
		logger.error("Captura de excepciones " + exception.getClass().getSimpleName());
		logger.error("Error conrolado"+exception.getMessage());
		return "errorCasteo";
	}

}
