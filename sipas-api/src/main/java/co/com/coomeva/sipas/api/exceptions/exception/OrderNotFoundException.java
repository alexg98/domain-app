package co.com.coomeva.sipas.api.exceptions.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 */
@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Not found ... happy")
public class OrderNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 855578754995511181L;

}