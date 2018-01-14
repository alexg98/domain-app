package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSipSimulacionesReactivacion entity provides the base persistence
 * definition of the SipSimulacionesReactivacion entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipSimulacionesReactivacion implements
		java.io.Serializable {

	// Fields

	private Long sreaConsecutivo;
	private Long asoNumint;
	private Date sreaFechaSimulacion;
	private String sreaEstado;
	private Short sreaAntiguedadAsociado;
	private String sreaTratamientoEspecial;
	private Timestamp sreafechaPerseverancia;
	private Set sipProteccionesSimulacionReactivacions = new HashSet(0);
	

	// Constructors

	/** default constructor */
	public AbstractSipSimulacionesReactivacion() {
	}

	/** minimal constructor */
	public AbstractSipSimulacionesReactivacion(Long sreaConsecutivo,
			Long asoNumint, Date sreaFechaSimulacion, String sreaEstado,
			Short sreaAntiguedadAsociado) {
		this.sreaConsecutivo = sreaConsecutivo;
		this.asoNumint = asoNumint;
		this.sreaFechaSimulacion = sreaFechaSimulacion;
		this.sreaEstado = sreaEstado;
		this.sreaAntiguedadAsociado = sreaAntiguedadAsociado;
		
	}

	/** full constructor */
	public AbstractSipSimulacionesReactivacion(Long sreaConsecutivo,
			Long asoNumint, Date sreaFechaSimulacion, String sreaEstado,
			Short sreaAntiguedadAsociado,
			Set sipProteccionesSimulacionReactivacions,String sreaTratamientoEspecial,Timestamp sreafechaPerseverancia) {
		this.sreaConsecutivo = sreaConsecutivo;
		this.asoNumint = asoNumint;
		this.sreaFechaSimulacion = sreaFechaSimulacion;
		this.sreaEstado = sreaEstado;
		this.sreaAntiguedadAsociado = sreaAntiguedadAsociado;
		this.sipProteccionesSimulacionReactivacions = sipProteccionesSimulacionReactivacions;
		this.sreaTratamientoEspecial=sreaTratamientoEspecial;
		this.sreafechaPerseverancia=sreafechaPerseverancia;
	}

	// Property accessors

	public Long getSreaConsecutivo() {
		return this.sreaConsecutivo;
	}

	public void setSreaConsecutivo(Long sreaConsecutivo) {
		this.sreaConsecutivo = sreaConsecutivo;
	}

	public Long getAsoNumint() {
		return this.asoNumint;
	}

	public void setAsoNumint(Long asoNumint) {
		this.asoNumint = asoNumint;
	}

	public Date getSreaFechaSimulacion() {
		return this.sreaFechaSimulacion;
	}

	public void setSreaFechaSimulacion(Date sreaFechaSimulacion) {
		this.sreaFechaSimulacion = sreaFechaSimulacion;
	}

	public String getSreaEstado() {
		return this.sreaEstado;
	}

	public void setSreaEstado(String sreaEstado) {
		this.sreaEstado = sreaEstado;
	}

	public Short getSreaAntiguedadAsociado() {
		return this.sreaAntiguedadAsociado;
	}

	public void setSreaAntiguedadAsociado(Short sreaAntiguedadAsociado) {
		this.sreaAntiguedadAsociado = sreaAntiguedadAsociado;
	}

	public Set getSipProteccionesSimulacionReactivacions() {
		return this.sipProteccionesSimulacionReactivacions;
	}

	public void setSipProteccionesSimulacionReactivacions(
			Set sipProteccionesSimulacionReactivacions) {
		this.sipProteccionesSimulacionReactivacions = sipProteccionesSimulacionReactivacions;
	}

	public void setSreaTratamientoEspecial(String sreaTratamientoEspecial) {
		this.sreaTratamientoEspecial = sreaTratamientoEspecial;
	}

	public String getSreaTratamientoEspecial() {
		return sreaTratamientoEspecial;
	}

	public void setSreafechaPerseverancia(Timestamp sreafechaPerseverancia) {
		this.sreafechaPerseverancia = sreafechaPerseverancia;
	}

	public Timestamp getSreafechaPerseverancia() {
		return sreafechaPerseverancia;
	}



}