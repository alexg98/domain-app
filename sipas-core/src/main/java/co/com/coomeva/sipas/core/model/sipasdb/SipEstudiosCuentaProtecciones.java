package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;


/**
 * SipEstudiosCuentaProtecciones entity. @author MyEclipse Persistence Tools
 */
public class SipEstudiosCuentaProtecciones extends AbstractSipEstudiosCuentaProtecciones implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipEstudiosCuentaProtecciones() {
    }

	/** minimal constructor */
    public SipEstudiosCuentaProtecciones(SipEstudiosCuentaProteccionesId id, Long estProConsecutivoProteccion) {
        super(id, estProConsecutivoProteccion);        
    }
    
    /** full constructor */
    public SipEstudiosCuentaProtecciones(SipEstudiosCuentaProteccionesId id, Double estProValorProteccion, Date estProFechaIngreso, String estProClasificacionIngreso, String estProCodFactor, Long estProConsecutivoProteccion,String estProConcepto, Set sipEstudiosCuentaDetalles) {
        super(id, estProValorProteccion, estProFechaIngreso, estProClasificacionIngreso, estProCodFactor, estProConsecutivoProteccion,estProConcepto ,sipEstudiosCuentaDetalles);        
    }
   
}
