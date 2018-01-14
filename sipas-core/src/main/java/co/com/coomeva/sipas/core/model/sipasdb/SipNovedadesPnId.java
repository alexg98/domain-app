package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * SipNovedadesPnId entity. @author MyEclipse Persistence Tools
 */
public class SipNovedadesPnId extends AbstractSipNovedadesPnId implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipNovedadesPnId() {
    }

	/** minimal constructor */
    public SipNovedadesPnId(Long consecutivo, Long nitcli, Timestamp fechaRegistro, String sistemaOrigen, Long tipoNovedad) {
        super(consecutivo, nitcli, fechaRegistro, sistemaOrigen, tipoNovedad);        
    }
    
    /** full constructor */
    public SipNovedadesPnId(Long consecutivo, Long nitcli, Timestamp fechaAprobacion, Timestamp fechaRegistro, Timestamp fechaRetiro, String sistemaOrigen, String descripcion, Long tipoNovedad, String estado) {
        super(consecutivo, nitcli, fechaAprobacion, fechaRegistro, fechaRetiro, sistemaOrigen, descripcion, tipoNovedad, estado);        
    }
   
}
