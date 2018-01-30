package co.com.coomeva.sipas.api.exceptions;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.com.coomeva.sipas.api.exceptions.exception.AddErrorInformationException;
import co.com.coomeva.sipas.api.exceptions.exception.OrderNotFoundException;

@RestController
@RequestMapping("/local")
public class ExceptionHandlingController1 {

	protected Logger logger;

	public ExceptionHandlingController1() {
		logger = LoggerFactory.getLogger(getClass());
	}

	/**
	 * @return 
	 */
	@RequestMapping("/order")
	String order() {
		logger.info("Throw RuntimeException");
		throw new RuntimeException();
	}
	
	/**
	 * @return 
	 */
	@RequestMapping("/orderNotFound")
	String throwOrderNotFoundException() {
		logger.info("Throw OrderNotFoundException");
		throw new OrderNotFoundException();
	}
	
	/**
	 * @return
	 */
	@RequestMapping("/order/{id}")
	String throwIllegalArgumentException(){
		throw new IllegalArgumentException();
	}

	/**
	 * SQLException
	 * [databaseError]
	 * @return
	 * @throws SQLException
	 */
	@RequestMapping("/databaseError")
	String throwDatabaseException1() throws SQLException {
		logger.info("Throw SQLException");
		throw new SQLException();
	}
	
	@RequestMapping("/add")
	String throwAddErrorInformationException() throws SQLException {
		logger.info("Throw AddErrorInformationException");
		throw new AddErrorInformationException();
	}

	/**
	 *  IllegalArgumentException
	 */
	@ResponseStatus(value=HttpStatus.CONFLICT, reason = "IDが重複しています")
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
		return "databaseError";
	}	
	
	/**
	 * @param e
	 * @param response
	 * @throws IOException
	 */
	@ExceptionHandler({ AddErrorInformationException.class })
	public void handleAddErrorInformationException(AddErrorInformationException e, HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.BAD_REQUEST.value(), "LOooooogs");
	}
	
}	