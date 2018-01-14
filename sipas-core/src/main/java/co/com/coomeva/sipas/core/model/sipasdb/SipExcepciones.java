package co.com.coomeva.sipas.core.model.sipasdb;


/**
 * Entidad SipExcepciones 
 * @author Bernardo Lopez - Pragma S.A.
 */
public class SipExcepciones extends AbstractSipExcepciones implements java.io.Serializable {
	
		/** default constructor */
	 	public SipExcepciones() {
	 		
	    }
		
	 	/** minimal constructor */
	    public SipExcepciones(Long excCodigo, Long excTipoFlujo) {
	    	super(excCodigo, excTipoFlujo);
	    }
	    
	    /** full constructor */
	    public SipExcepciones(Long excCodigo, String excDescripcion, String excMensaje, Long excEstado, Long excTipoFlujo) {
	       super(excCodigo, excDescripcion, excMensaje, excEstado, excTipoFlujo);
	    }
	
	    public SipExcepciones(Long excCodigo, String excMensaje) {
	    	super(excCodigo,excMensaje);
		}
}


