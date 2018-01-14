package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;


/**
 * SipEstudiosCuentaProteccionesId entity. @author MyEclipse Persistence Tools
 */
public class SipEstudiosCuentaProteccionesId extends AbstractSipEstudiosCuentaProteccionesId implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipEstudiosCuentaProteccionesId() {
    }

    
    /** full constructor */
    public SipEstudiosCuentaProteccionesId(SipEstudiosCuenta sipEstudiosCuenta, Long estProConsecutivo) {
        super(sipEstudiosCuenta, estProConsecutivo);        
    }
   
}
