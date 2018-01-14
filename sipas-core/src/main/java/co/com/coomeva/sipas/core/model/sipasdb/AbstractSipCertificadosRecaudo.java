package co.com.coomeva.sipas.core.model.sipasdb;
// default package

import java.sql.Timestamp;


/**
 * AbstractSipCertificadosRecaudo entity provides the base persistence definition of the SipCertificadosRecaudo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipCertificadosRecaudo  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 904118107182952727L;
	private Long cerConsecutivo;
     private Long cerAsonumint;
     private Long cerNitcli;
     private Integer cerConsecutivoCertificado;
     private Integer cerTipoCertificado;
     private Timestamp cerFechaGeneracion;


    // Constructors

    /** default constructor */
    public AbstractSipCertificadosRecaudo() {
    }

	/** minimal constructor */
    public AbstractSipCertificadosRecaudo(Long cerConsecutivo, Long cerAsonumint, Long cerNitcli, Integer cerConsecutivoCertificado, Integer cerTipoCertificado) {
        this.cerConsecutivo = cerConsecutivo;
        this.cerAsonumint = cerAsonumint;
        this.cerNitcli = cerNitcli;
        this.cerConsecutivoCertificado = cerConsecutivoCertificado;
        this.cerTipoCertificado = cerTipoCertificado;
    }
    
    /** full constructor */
    public AbstractSipCertificadosRecaudo(Long cerConsecutivo, Long cerAsonumint, Long cerNitcli, Integer cerConsecutivoCertificado, Integer cerTipoCertificado, Timestamp cerFechaGeneracion) {
        this.cerConsecutivo = cerConsecutivo;
        this.cerAsonumint = cerAsonumint;
        this.cerNitcli = cerNitcli;
        this.cerConsecutivoCertificado = cerConsecutivoCertificado;
        this.cerTipoCertificado = cerTipoCertificado;
        this.cerFechaGeneracion = cerFechaGeneracion;
    }

   
    // Property accessors

    public Long getCerConsecutivo() {
        return this.cerConsecutivo;
    }
    
    public void setCerConsecutivo(Long cerConsecutivo) {
        this.cerConsecutivo = cerConsecutivo;
    }

    public Long getCerAsonumint() {
        return this.cerAsonumint;
    }
    
    public void setCerAsonumint(Long cerAsonumint) {
        this.cerAsonumint = cerAsonumint;
    }

    public Long getCerNitcli() {
        return this.cerNitcli;
    }
    
    public void setCerNitcli(Long cerNitcli) {
        this.cerNitcli = cerNitcli;
    }

    public Integer getCerConsecutivoCertificado() {
        return this.cerConsecutivoCertificado;
    }
    
    public void setCerConsecutivoCertificado(Integer cerConsecutivoCertificado) {
        this.cerConsecutivoCertificado = cerConsecutivoCertificado;
    }

    public Integer getCerTipoCertificado() {
        return this.cerTipoCertificado;
    }
    
    public void setCerTipoCertificado(Integer cerTipoCertificado) {
        this.cerTipoCertificado = cerTipoCertificado;
    }

    public Timestamp getCerFechaGeneracion() {
        return this.cerFechaGeneracion;
    }
    
    public void setCerFechaGeneracion(Timestamp cerFechaGeneracion) {
        this.cerFechaGeneracion = cerFechaGeneracion;
    }
   








}