package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;


/**
 * SipEstudiosCuenta entity. @author MyEclipse Persistence Tools
 */
public class SipEstudiosCuenta extends AbstractSipEstudiosCuenta implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipEstudiosCuenta() {
    }

	/** minimal constructor */
    public SipEstudiosCuenta(Long estConsecutivo, Long asoNumint) {
        super(estConsecutivo, asoNumint);        
    }
    
    /** full constructor */
    public SipEstudiosCuenta(Long estConsecutivo, Long asoNumint, Date estFechaSimulacion, String estEstado, Date estAsoFechaNacimiento, Set sipEstudiosCuentaProteccioneses,String estTipoSimulacion,Long estConsecutivoPadre,Date estAsoNuevaFechaNacimiento,Date estAsoFechaIngreso) {
        super(estConsecutivo, asoNumint, estFechaSimulacion, estEstado, estAsoFechaNacimiento, sipEstudiosCuentaProteccioneses, estTipoSimulacion, estConsecutivoPadre,estAsoNuevaFechaNacimiento,estAsoFechaIngreso);        
    }
   
}
