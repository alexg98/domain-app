package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;

/**
 * AbstractSipPorcenGtosAdmReservaAud entity provides the base persistence
 * definition of the SipPorcenGtosAdmReservaAud entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipPorcenGtosAdmReservaAud implements
		java.io.Serializable {

	// Fields

	private Long porcenAudCodigo;
	private SipPorcenGtosAdmReserva sipPorcenGtosAdmReserva;
	private String usuario;
	private Timestamp fechaCambio;
	private Double porcentajeAnt;
	private Double porcentajeCam;
	private String observaciones;

	// Constructors

	/** default constructor */
	public AbstractSipPorcenGtosAdmReservaAud() {
	}

	/** minimal constructor */
	public AbstractSipPorcenGtosAdmReservaAud(Long porcenAudCodigo,
			String usuario, Timestamp fechaCambio, Double porcentajeAnt,
			Double porcentajeCam, String observaciones) {
		this.porcenAudCodigo = porcenAudCodigo;
		this.usuario = usuario;
		this.fechaCambio = fechaCambio;
		this.porcentajeAnt = porcentajeAnt;
		this.porcentajeCam = porcentajeCam;
		this.observaciones = observaciones;
	}

	/** full constructor */
	public AbstractSipPorcenGtosAdmReservaAud(Long porcenAudCodigo,
			SipPorcenGtosAdmReserva sipPorcenGtosAdmReserva, String usuario,
			Timestamp fechaCambio, Double porcentajeAnt, Double porcentajeCam,
			String observaciones) {
		this.porcenAudCodigo = porcenAudCodigo;
		this.sipPorcenGtosAdmReserva = sipPorcenGtosAdmReserva;
		this.usuario = usuario;
		this.fechaCambio = fechaCambio;
		this.porcentajeAnt = porcentajeAnt;
		this.porcentajeCam = porcentajeCam;
		this.observaciones = observaciones;
	}

	// Property accessors

	public SipPorcenGtosAdmReserva getSipPorcenGtosAdmReserva() {
		return this.sipPorcenGtosAdmReserva;
	}

	public void setSipPorcenGtosAdmReserva(
			SipPorcenGtosAdmReserva sipPorcenGtosAdmReserva) {
		this.sipPorcenGtosAdmReserva = sipPorcenGtosAdmReserva;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Timestamp getFechaCambio() {
		return this.fechaCambio;
	}

	public void setFechaCambio(Timestamp fechaCambio) {
		this.fechaCambio = fechaCambio;
	}

	public Double getPorcentajeAnt() {
		return this.porcentajeAnt;
	}

	public void setPorcentajeAnt(Double porcentajeAnt) {
		this.porcentajeAnt = porcentajeAnt;
	}

	public Double getPorcentajeCam() {
		return this.porcentajeCam;
	}

	public void setPorcentajeCam(Double porcentajeCam) {
		this.porcentajeCam = porcentajeCam;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Long getPorcenAudCodigo() {
		return porcenAudCodigo;
	}

	public void setPorcenAudCodigo(Long porcenAudCodigo) {
		this.porcenAudCodigo = porcenAudCodigo;
	}

}