package co.com.coomeva.sipas.api.exceptions;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.coomeva.sipas.api.exceptions.exception.AddErrorInformationException;
import co.com.coomeva.sipas.api.exceptions.exception.OrderNotFoundException;

@RestController
@RequestMapping("/global")
public class WithoutExceptionHandlingController {

	protected Logger logger;

	public WithoutExceptionHandlingController() {
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
	 * [databaseError
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
}