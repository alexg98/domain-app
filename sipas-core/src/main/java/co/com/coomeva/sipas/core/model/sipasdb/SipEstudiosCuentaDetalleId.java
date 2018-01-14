package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;


/**
 * SipEstudiosCuentaDetalleId entity. @author MyEclipse Persistence Tools
 */
public class SipEstudiosCuentaDetalleId extends AbstractSipEstudiosCuentaDetalleId implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipEstudiosCuentaDetalleId() {
    }

    
    /** full constructor */
    public SipEstudiosCuentaDetalleId(Long estDetConsecutivo, SipEstudiosCuentaProtecciones sipEstudiosCuentaProtecciones) {
        super(estDetConsecutivo, sipEstudiosCuentaProtecciones);        
    }
   
}
