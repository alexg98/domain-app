package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;

/**
 * AbstractSipFirma entity provides the base persistence definition of the
 * SipFirma entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipFirma implements java.io.Serializable {

	// Fields

	private Long firCod;
	private SipPersonal sipPersonal;
	private Long regCod;
	private Long carCod;
	private Date firFechaRegistro;
	private Long firUsuario;

	// Constructors

	/** default constructor */
	public AbstractSipFirma() {
	}

	/** full constructor */
	public AbstractSipFirma(Long firCod, SipPersonal sipPersonal, Long regCod,
			Long carCod, Date firFechaRegistro, Long firUsuario) {
		this.firCod = firCod;
		this.sipPersonal = sipPersonal;
		this.regCod = regCod;
		this.carCod = carCod;
		this.firFechaRegistro = firFechaRegistro;
		this.firUsuario = firUsuario;
	}

	// Property accessors

	public Long getFirCod() {
		return this.firCod;
	}

	public void setFirCod(Long firCod) {
		this.firCod = firCod;
	}

	public SipPersonal getSipPersonal() {
		return this.sipPersonal;
	}

	public void setSipPersonal(SipPersonal sipPersonal) {
		this.sipPersonal = sipPersonal;
	}

	public Long getRegCod() {
		return this.regCod;
	}

	public void setRegCod(Long regCod) {
		this.regCod = regCod;
	}

	public Long getCarCod() {
		return this.carCod;
	}

	public void setCarCod(Long carCod) {
		this.carCod = carCod;
	}

	public Date getFirFechaRegistro() {
		return this.firFechaRegistro;
	}

	public void setFirFechaRegistro(Date firFechaRegistro) {
		this.firFechaRegistro = firFechaRegistro;
	}

	public Long getFirUsuario() {
		return this.firUsuario;
	}

	public void setFirUsuario(Long firUsuario) {
		this.firUsuario = firUsuario;
	}

}