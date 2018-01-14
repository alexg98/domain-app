package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.util.Date;


/**
 * SipCondonacionesReactivacion entity. @author MyEclipse Persistence Tools
 */
public class SipCondonacionesReactivacion extends AbstractSipCondonacionesReactivacion implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipCondonacionesReactivacion() {
    }

    
    /** full constructor */
    public SipCondonacionesReactivacion(Long scrConsecutivo, Long asoNitcli, Long asoNumint, Date scrFechaCondonacion, String scrEstado) {
        super(scrConsecutivo, asoNitcli, asoNumint, scrFechaCondonacion, scrEstado);        
    }
   
}
