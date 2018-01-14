package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * SipLogVinculacionesPregId entity. @author MyEclipse Persistence Tools
 */

public class SipLogVinculacionesPregId implements java.io.Serializable {

	// Fields

	private Long codPregunta;
	private SipLogVinculaciones sipLogVinculaciones;

	// Constructors

	/** default constructor */
	public SipLogVinculacionesPregId() {
	}

	/** full constructor */
	public SipLogVinculacionesPregId(Long codPregunta,
			SipLogVinculaciones sipLogVinculaciones) {
		this.codPregunta = codPregunta;
		this.sipLogVinculaciones = sipLogVinculaciones;
	}

	// Property accessors

	public Long getCodPregunta() {
		return this.codPregunta;
	}

	public void setCodPregunta(Long codPregunta) {
		this.codPregunta = codPregunta;
	}

	public SipLogVinculaciones getSipLogVinculaciones() {
		return this.sipLogVinculaciones;
	}

	public void setSipLogVinculaciones(SipLogVinculaciones sipLogVinculaciones) {
		this.sipLogVinculaciones = sipLogVinculaciones;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SipLogVinculacionesPregId))
			return false;
		SipLogVinculacionesPregId castOther = (SipLogVinculacionesPregId) other;

		return ((this.getCodPregunta() == castOther.getCodPregunta()) || (this
				.getCodPregunta() != null
				&& castOther.getCodPregunta() != null && this.getCodPregunta()
				.equals(castOther.getCodPregunta())))
				&& ((this.getSipLogVinculaciones() == castOther
						.getSipLogVinculaciones()) || (this
						.getSipLogVinculaciones() != null
						&& castOther.getSipLogVinculaciones() != null && this
						.getSipLogVinculaciones().equals(
								castOther.getSipLogVinculaciones())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodPregunta() == null ? 0 : this.getCodPregunta()
						.hashCode());
		result = 37
				* result
				+ (getSipLogVinculaciones() == null ? 0 : this
						.getSipLogVinculaciones().hashCode());
		return result;
	}

}