package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * AbstractSipCuotasSimulacionReactivacionId entity provides the base
 * persistence definition of the SipCuotasSimulacionReactivacionId entity. @author
 * MyEclipse Persistence Tools
 */

public abstract class AbstractSipCuotasSimulacionReactivacionId implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 157289460893074727L;
	private Long csrConsecutivo;
	private SipProteccionesSimulacionReactivacion sipProteccionesSimulacionReactivacion;

	// Constructors

	/** default constructor */
	public AbstractSipCuotasSimulacionReactivacionId() {
	}

	/** full constructor */
	public AbstractSipCuotasSimulacionReactivacionId(
			Long csrConsecutivo,
			SipProteccionesSimulacionReactivacion sipProteccionesSimulacionReactivacion) {
		this.csrConsecutivo = csrConsecutivo;
		this.sipProteccionesSimulacionReactivacion = sipProteccionesSimulacionReactivacion;
	}

	// Property accessors

	public Long getCsrConsecutivo() {
		return this.csrConsecutivo;
	}

	public void setCsrConsecutivo(Long csrConsecutivo) {
		this.csrConsecutivo = csrConsecutivo;
	}

	public SipProteccionesSimulacionReactivacion getSipProteccionesSimulacionReactivacion() {
		return this.sipProteccionesSimulacionReactivacion;
	}

	public void setSipProteccionesSimulacionReactivacion(
			SipProteccionesSimulacionReactivacion sipProteccionesSimulacionReactivacion) {
		this.sipProteccionesSimulacionReactivacion = sipProteccionesSimulacionReactivacion;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSipCuotasSimulacionReactivacionId))
			return false;
		AbstractSipCuotasSimulacionReactivacionId castOther = (AbstractSipCuotasSimulacionReactivacionId) other;

		return ((this.getCsrConsecutivo() == castOther.getCsrConsecutivo()) || (this
				.getCsrConsecutivo() != null
				&& castOther.getCsrConsecutivo() != null && this
				.getCsrConsecutivo().equals(castOther.getCsrConsecutivo())))
				&& ((this.getSipProteccionesSimulacionReactivacion() == castOther
						.getSipProteccionesSimulacionReactivacion()) || (this
						.getSipProteccionesSimulacionReactivacion() != null
						&& castOther.getSipProteccionesSimulacionReactivacion() != null && this
						.getSipProteccionesSimulacionReactivacion()
						.equals(
								castOther
										.getSipProteccionesSimulacionReactivacion())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCsrConsecutivo() == null ? 0 : this.getCsrConsecutivo()
						.hashCode());
		result = 37
				* result
				+ (getSipProteccionesSimulacionReactivacion() == null ? 0
						: this.getSipProteccionesSimulacionReactivacion()
								.hashCode());
		return result;
	}

}