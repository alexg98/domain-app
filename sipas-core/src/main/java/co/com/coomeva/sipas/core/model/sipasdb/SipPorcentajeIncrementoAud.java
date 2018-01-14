package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.util.Date;


/**
 * SipPorcentajeIncrementoAud entity. @author MyEclipse Persistence Tools
 */
public class SipPorcentajeIncrementoAud extends AbstractSipPorcentajeIncrementoAud implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipPorcentajeIncrementoAud() {
    }

	/** minimal constructor */
    public SipPorcentajeIncrementoAud(Long porIncAudConsecutivo) {
        super(porIncAudConsecutivo);        
    }
    
    /** full constructor */
    public SipPorcentajeIncrementoAud(Long porIncAudConsecutivo, String porIncAudEstado, String porIncAudTipo, Integer porIncAudAnno, Double porIncAudValor, String porIncAudMesIncre, Date porIncAudFechaRegistro) {
        super(porIncAudConsecutivo, porIncAudEstado, porIncAudTipo, porIncAudAnno, porIncAudValor, porIncAudMesIncre, porIncAudFechaRegistro);        
    }
   
}
