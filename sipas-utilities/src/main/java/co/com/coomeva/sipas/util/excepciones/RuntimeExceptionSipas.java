package co.com.coomeva.sipas.util.excepciones;

public class RuntimeExceptionSipas extends RuntimeException {

	private static final long serialVersionUID = 1L;	

	public RuntimeExceptionSipas(String message) {		
        super(message);        
    }
	
	public RuntimeExceptionSipas(String message, Throwable cause) {		
        super(message, cause);        
    }	
}
