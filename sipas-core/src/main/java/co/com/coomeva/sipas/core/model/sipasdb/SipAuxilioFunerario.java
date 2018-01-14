package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Date;


/**
 * SipAuxilioFunerario generated by MyEclipse - Hibernate Tools
 */
public class SipAuxilioFunerario extends AbstractSipAuxilioFunerario implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipAuxilioFunerario() {
    }

	/** minimal constructor */
    public SipAuxilioFunerario(Long codigo, Double proteccion, Date fechaIni, Date fechaFin) {
        super(codigo, proteccion, fechaIni, fechaFin);        
    }
    
    /** full constructor */
    public SipAuxilioFunerario(Long codigo, Double proteccion, String descripcion, Date fechaIni, Date fechaFin) {
        super(codigo, proteccion, descripcion, fechaIni, fechaFin);        
    }
   
}
