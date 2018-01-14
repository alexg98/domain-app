package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;

/**
 * AbstractSipProteccionesSimulacionReactivacionId entity provides the base
 * persistence definition of the SipProteccionesSimulacionReactivacionId entity. @author
 * MyEclipse Persistence Tools
 */

public abstract class AbstractSipProteccionesSimulacionReactivacionId implements
		java.io.Serializable {

	// Fields

	private SipSimulacionesReactivacion sipSimulacionesReactivacion;
	private Long psrConsecutivo;

	// Constructors

	/** default constructor */
	public AbstractSipProteccionesSimulacionReactivacionId() {
	}

	/** full constructor */
	public AbstractSipProteccionesSimulacionReactivacionId(
			SipSimulacionesReactivacion sipSimulacionesReactivacion,
			Long psrConsecutivo) {
		this.sipSimulacionesReactivacion = sipSimulacionesReactivacion;
		this.psrConsecutivo = psrConsecutivo;
	}

	// Property accessors

	public SipSimulacionesReactivacion getSipSimulacionesReactivacion() {
		return this.sipSimulacionesReactivacion;
	}

	public void setSipSimulacionesReactivacion(
			SipSimulacionesReactivacion sipSimulacionesReactivacion) {
		this.sipSimulacionesReactivacion = sipSimulacionesReactivacion;
	}

	public Long getPsrConsecutivo() {
		return this.psrConsecutivo;
	}

	public void setPsrConsecutivo(Long psrConsecutivo) {
		this.psrConsecutivo = psrConsecutivo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSipProteccionesSimulacionReactivacionId))
			return false;
		AbstractSipProteccionesSimulacionReactivacionId castOther = (AbstractSipProteccionesSimulacionReactivacionId) other;

		return ((this.getSipSimulacionesReactivacion() == castOther
				.getSipSimulacionesReactivacion()) || (this
				.getSipSimulacionesReactivacion() != null
				&& castOther.getSipSimulacionesReactivacion() != null && this
				.getSipSimulacionesReactivacion().equals(
						castOther.getSipSimulacionesReactivacion())))
				&& ((this.getPsrConsecutivo() == castOther.getPsrConsecutivo()) || (this
						.getPsrConsecutivo() != null
						&& castOther.getPsrConsecutivo() != null && this
						.getPsrConsecutivo().equals(
								castOther.getPsrConsecutivo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSipSimulacionesReactivacion() == null ? 0 : this
						.getSipSimulacionesReactivacion().hashCode());
		result = 37
				* result
				+ (getPsrConsecutivo() == null ? 0 : this.getPsrConsecutivo()
						.hashCode());
		return result;
	}

}