package co.com.coomeva.sipas.api.exceptions.aop;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import co.com.coomeva.sipas.api.exceptions.exception.AddErrorInformationException;

/*
 *  see https://github.com/cosmic-cowboy/spring-boot-exception-handling
 * 
 */
@ControllerAdvice
public class ExceptionHandlingControllerAdvice {

	protected Logger logger;

	public ExceptionHandlingControllerAdvice() {
		logger = LoggerFactory.getLogger(getClass());
	}

	/**
	 *  IllegalArgumentException
	 */
	@ResponseStatus(value=HttpStatus.CONFLICT, reason = "Global_ID")
	@ExceptionHandler(IllegalArgumentException.class)
	public void conflict(){
		logger.error("Request raised a IllegalArgumentException");
	}
	
	/**
	 * SQLException
	 * @param exception
	 * @return
	 */
	@ExceptionHandler({ SQLException.class })
	public String databaseError(Exception exception) {
		logger.error("Request raised " + exception.getClass().getSimpleName());
		return "Global_databaseError";
	}
	
	/**
	 * @param e
	 * @param response
	 * @throws IOException
	 */
	@ExceptionHandler({ AddErrorInformationException.class })
	public void handleAddErrorInformationException(AddErrorInformationException e, HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.BAD_REQUEST.value(), "Global_ID");
	}
}
