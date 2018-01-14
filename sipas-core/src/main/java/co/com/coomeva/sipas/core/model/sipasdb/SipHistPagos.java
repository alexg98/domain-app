package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Date;


/**
 * SipHistPagos generated by MyEclipse - Hibernate Tools
 */
public class SipHistPagos extends AbstractSipHistPagos implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipHistPagos() {
    }

	/** minimal constructor */
    public SipHistPagos(SipHistPagosId id, Long sipHisPagCodret, Date sipHisPagFechaEstado) {
        super(id, sipHisPagCodret, sipHisPagFechaEstado);        
    }
    
    /** full constructor */
    public SipHistPagos(SipHistPagosId id, Long sipHisPagCodret, Date sipHisPagFechaEstado, String observacion) {
        super(id, sipHisPagCodret, sipHisPagFechaEstado, observacion);        
    }
   
}