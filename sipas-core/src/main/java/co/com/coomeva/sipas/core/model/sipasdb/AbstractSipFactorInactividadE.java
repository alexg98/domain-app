package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;

/**
 * AbstractSipFactorInactividadE entity provides the base persistence definition
 * of the SipFactorInactividadE entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipFactorInactividadE implements
		java.io.Serializable {

	// Fields

	private Long faeConsecutivo;
	private String faeLinea;
	private Long faeTipoError;
	private Timestamp faeFechaRegistro;
	private Long faeEstado;

	// Constructors

	/** default constructor */
	public AbstractSipFactorInactividadE() {
	}

	/** minimal constructor */
	public AbstractSipFactorInactividadE(Long faeConsecutivo) {
		this.faeConsecutivo = faeConsecutivo;
	}

	/** full constructor */
	public AbstractSipFactorInactividadE(Long faeConsecutivo,
			String faeLinea,Long faeTipoError ,Long faeEstado,Timestamp faeFechaRegistro) {
		this.faeConsecutivo = faeConsecutivo;
		this.faeLinea = faeLinea;
		this.faeFechaRegistro = faeFechaRegistro;
		this.faeTipoError=faeTipoError;
		this.faeEstado=faeEstado;
	}

	// Property accessors

	public Long getFaeConsecutivo() {
		return this.faeConsecutivo;
	}

	public void setFaeConsecutivo(Long faeConsecutivo) {
		this.faeConsecutivo = faeConsecutivo;
	}

	public String getFaeLinea() {
		return this.faeLinea;
	}

	public void setFaeLinea(String faeLinea) {
		this.faeLinea = faeLinea;
	}

	public Timestamp getFaeFechaRegistro() {
		return this.faeFechaRegistro;
	}

	public void setFaeFechaRegistro(Timestamp faeFechaRegistro) {
		this.faeFechaRegistro = faeFechaRegistro;
	}

	public void setFaeTipoError(Long faeTipoError) {
		this.faeTipoError = faeTipoError;
	}

	public Long getFaeTipoError() {
		return faeTipoError;
	}

	public void setFaeEstado(Long faeEstado) {
		this.faeEstado = faeEstado;
	}

	public Long getFaeEstado() {
		return faeEstado;
	}

}