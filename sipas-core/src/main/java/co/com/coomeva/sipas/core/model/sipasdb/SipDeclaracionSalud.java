package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools



/**
 * SipDeclaracionSalud generated by MyEclipse - Hibernate Tools
 */
public class SipDeclaracionSalud extends AbstractSipDeclaracionSalud implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipDeclaracionSalud() {
    }

	/** minimal constructor */
    public SipDeclaracionSalud(Long decCodigo, Long decEdadMin, Long decEdadMax, Double decProteccionMin, Double decProteccionMax, String decMensaje) {
        super(decCodigo, decEdadMin, decEdadMax, decProteccionMin, decProteccionMax, decMensaje);        
    }
    
    /** full constructor */
    public SipDeclaracionSalud(Long decCodigo, Long decEdadMin, Long decEdadMax, Double decProteccionMin, Double decProteccionMax, String decMensaje, String decEstado, Long decTipo) {
        super(decCodigo, decEdadMin, decEdadMax, decProteccionMin, decProteccionMax, decMensaje, decEstado, decTipo);        
    }
   
}