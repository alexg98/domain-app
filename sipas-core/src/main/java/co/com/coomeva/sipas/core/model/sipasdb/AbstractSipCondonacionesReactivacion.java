package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;


/**
 * AbstractSipCondonacionesReactivacion entity provides the base persistence definition of the SipCondonacionesReactivacion entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipCondonacionesReactivacion  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -4523446153483515535L;
	private Long scrConsecutivo;
     private Long asoNitcli;
     private Long asoNumint;
     private Date scrFechaCondonacion;
     private String scrEstado;


    // Constructors

    /** default constructor */
    public AbstractSipCondonacionesReactivacion() {
    }

    
    /** full constructor */
    public AbstractSipCondonacionesReactivacion(Long scrConsecutivo, Long asoNitcli, Long asoNumint, Date scrFechaCondonacion, String scrEstado) {
        this.scrConsecutivo = scrConsecutivo;
        this.asoNitcli = asoNitcli;
        this.asoNumint = asoNumint;
        this.scrFechaCondonacion = scrFechaCondonacion;
        this.scrEstado = scrEstado;
    }

   
    // Property accessors

    public Long getScrConsecutivo() {
        return this.scrConsecutivo;
    }
    
    public void setScrConsecutivo(Long scrConsecutivo) {
        this.scrConsecutivo = scrConsecutivo;
    }

    public Long getAsoNitcli() {
        return this.asoNitcli;
    }
    
    public void setAsoNitcli(Long asoNitcli) {
        this.asoNitcli = asoNitcli;
    }

    public Long getAsoNumint() {
        return this.asoNumint;
    }
    
    public void setAsoNumint(Long asoNumint) {
        this.asoNumint = asoNumint;
    }

    public Date getScrFechaCondonacion() {
        return this.scrFechaCondonacion;
    }
    
    public void setScrFechaCondonacion(Date scrFechaCondonacion) {
        this.scrFechaCondonacion = scrFechaCondonacion;
    }

    public String getScrEstado() {
        return this.scrEstado;
    }
    
    public void setScrEstado(String scrEstado) {
        this.scrEstado = scrEstado;
    }
   








}