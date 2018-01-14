package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * AbstractSipHomologacionDiagnosticoId entity provides the base persistence
 * definition of the SipHomologacionDiagnosticoId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipHomologacionDiagnosticoId implements
		java.io.Serializable {

	// Fields

	private String cie09;
	private String cie10;

	// Constructors

	/** default constructor */
	public AbstractSipHomologacionDiagnosticoId() {
	}

	/** full constructor */
	public AbstractSipHomologacionDiagnosticoId(String cie09, String cie10) {
		this.cie09 = cie09;
		this.cie10 = cie10;
	}

	// Property accessors

	public String getCie09() {
		return this.cie09;
	}

	public void setCie09(String cie09) {
		this.cie09 = cie09;
	}

	public String getCie10() {
		return this.cie10;
	}

	public void setCie10(String cie10) {
		this.cie10 = cie10;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSipHomologacionDiagnosticoId))
			return false;
		AbstractSipHomologacionDiagnosticoId castOther = (AbstractSipHomologacionDiagnosticoId) other;

		return ((this.getCie09() == castOther.getCie09()) || (this.getCie09() != null
				&& castOther.getCie09() != null && this.getCie09().equals(
				castOther.getCie09())))
				&& ((this.getCie10() == castOther.getCie10()) || (this
						.getCie10() != null && castOther.getCie10() != null && this
						.getCie10().equals(castOther.getCie10())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCie09() == null ? 0 : this.getCie09().hashCode());
		result = 37 * result
				+ (getCie10() == null ? 0 : this.getCie10().hashCode());
		return result;
	}

}