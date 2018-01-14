package co.com.coomeva.sipas.util.excepciones;

public class NotFoundRuntimeExceptionSipas extends RuntimeExceptionSipas{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7577203190237210833L;

	public NotFoundRuntimeExceptionSipas(String message) {
		super(message);
	}
	
	public NotFoundRuntimeExceptionSipas(String message, Throwable cause) {		
        super(message, cause);        
    }	

}
