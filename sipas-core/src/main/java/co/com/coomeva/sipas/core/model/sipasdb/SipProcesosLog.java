package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Date;


/**
 * SipProcesosLog generated by MyEclipse - Hibernate Tools
 */
public class SipProcesosLog extends AbstractSipProcesosLog implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipProcesosLog() {
    }

	/** minimal constructor */
    public SipProcesosLog(Long logCod, SipProcesos sipProcesos, String descripcion) {
        super(logCod, sipProcesos, descripcion);        
    }
    
    /** full constructor */
    public SipProcesosLog(Long logCod, SipProcesos sipProcesos, Long asoNumint, String descripcion, Long periodo, Date fechaProceso, Date fechaRegistro) {
        super(logCod, sipProcesos, asoNumint, descripcion, periodo, fechaProceso, fechaRegistro);        
    }
   
}
