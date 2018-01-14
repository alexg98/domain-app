package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractSipEstudiosCuenta entity provides the base persistence definition of the SipEstudiosCuenta entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipEstudiosCuenta  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -7606772032973093395L;
	private Long estConsecutivo;
     private Long asoNumint;
     private Date estFechaSimulacion;
     private String estEstado;
     private Date estAsoFechaNacimiento;
     private String estTipoSimulacion;
     private Long estConsecutivoPadre;
     private Date estAsoNuevaFechaNacimiento;
     private Date estAsoFechaIngreso;
     private Set<SipEstudiosCuentaProtecciones> sipEstudiosCuentaProteccioneses = new HashSet<>(0);
     


    // Constructors

    /** default constructor */
    public AbstractSipEstudiosCuenta() {
    }

	/** minimal constructor */
    public AbstractSipEstudiosCuenta(Long estConsecutivo, Long asoNumint) {
        this.estConsecutivo = estConsecutivo;
        this.asoNumint = asoNumint;
    }
    
    /** full constructor */
    public AbstractSipEstudiosCuenta(Long estConsecutivo, Long asoNumint, Date estFechaSimulacion, String estEstado, Date estAsoFechaNacimiento, Set<SipEstudiosCuentaProtecciones> sipEstudiosCuentaProteccioneses,String estTipoSimulacion,Long estConsecutivoPadre,Date estAsoNuevaFechaNacimiento,Date estAsoFechaIngreso) {
        this.estConsecutivo = estConsecutivo;
        this.asoNumint = asoNumint;
        this.estFechaSimulacion = estFechaSimulacion;
        this.estEstado = estEstado;
        this.estAsoFechaNacimiento = estAsoFechaNacimiento;
        this.sipEstudiosCuentaProteccioneses = sipEstudiosCuentaProteccioneses;
        this.estTipoSimulacion=estTipoSimulacion;
        this.estConsecutivoPadre=estConsecutivoPadre;
        this.estAsoNuevaFechaNacimiento=estAsoNuevaFechaNacimiento;
        this.estAsoFechaIngreso=estAsoFechaIngreso;
    }

   
    // Property accessors

    public Long getEstConsecutivo() {
        return this.estConsecutivo;
    }
    
    public void setEstConsecutivo(Long estConsecutivo) {
        this.estConsecutivo = estConsecutivo;
    }

    public Long getAsoNumint() {
        return this.asoNumint;
    }
    
    public void setAsoNumint(Long asoNumint) {
        this.asoNumint = asoNumint;
    }

    public Date getEstFechaSimulacion() {
        return this.estFechaSimulacion;
    }
    
    public void setEstFechaSimulacion(Date estFechaSimulacion) {
        this.estFechaSimulacion = estFechaSimulacion;
    }

    public String getEstEstado() {
        return this.estEstado;
    }
    
    public void setEstEstado(String estEstado) {
        this.estEstado = estEstado;
    }

    public Date getEstAsoFechaNacimiento() {
        return this.estAsoFechaNacimiento;
    }
    
    public void setEstAsoFechaNacimiento(Date estAsoFechaNacimiento) {
        this.estAsoFechaNacimiento = estAsoFechaNacimiento;
    }

    public Set<SipEstudiosCuentaProtecciones> getSipEstudiosCuentaProteccioneses() {
        return this.sipEstudiosCuentaProteccioneses;
    }
    
    public void setSipEstudiosCuentaProteccioneses(Set<SipEstudiosCuentaProtecciones> sipEstudiosCuentaProteccioneses) {
        this.sipEstudiosCuentaProteccioneses = sipEstudiosCuentaProteccioneses;
    }

	public void setEstTipoSimulacion(String estTipoSimulacion) {
		this.estTipoSimulacion = estTipoSimulacion;
	}

	public String getEstTipoSimulacion() {
		return estTipoSimulacion;
	}

	public void setEstConsecutivoPadre(Long estConsecutivoPadre) {
		this.estConsecutivoPadre = estConsecutivoPadre;
	}

	public Long getEstConsecutivoPadre() {
		return estConsecutivoPadre;
	}

	public void setEstAsoNuevaFechaNacimiento(Date estAsoNuevaFechaNacimiento) {
		this.estAsoNuevaFechaNacimiento = estAsoNuevaFechaNacimiento;
	}

	public Date getEstAsoNuevaFechaNacimiento() {
		return estAsoNuevaFechaNacimiento;
	}

	public void setEstAsoFechaIngreso(Date estAsoFechaIngreso) {
		this.estAsoFechaIngreso = estAsoFechaIngreso;
	}

	public Date getEstAsoFechaIngreso() {
		return estAsoFechaIngreso;
	}
   








}