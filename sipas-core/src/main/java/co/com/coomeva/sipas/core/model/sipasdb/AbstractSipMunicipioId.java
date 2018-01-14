package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * AbstractSipMunicipioId entity provides the base persistence definition of the
 * SipMunicipioId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipMunicipioId implements java.io.Serializable {

	// Fields

	private String muniCodi;
	private SipDepartamento sipDepartamento;

	// Constructors

	/** default constructor */
	public AbstractSipMunicipioId() {
	}

	/** full constructor */
	public AbstractSipMunicipioId(String muniCodi,
			SipDepartamento sipDepartamento) {
		this.muniCodi = muniCodi;
		this.sipDepartamento = sipDepartamento;
	}

	// Property accessors

	public String getMuniCodi() {
		return this.muniCodi;
	}

	public void setMuniCodi(String muniCodi) {
		this.muniCodi = muniCodi;
	}

	public SipDepartamento getSipDepartamento() {
		return this.sipDepartamento;
	}

	public void setSipDepartamento(SipDepartamento sipDepartamento) {
		this.sipDepartamento = sipDepartamento;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSipMunicipioId))
			return false;
		AbstractSipMunicipioId castOther = (AbstractSipMunicipioId) other;

		return ((this.getMuniCodi() == castOther.getMuniCodi()) || (this
				.getMuniCodi() != null
				&& castOther.getMuniCodi() != null && this.getMuniCodi()
				.equals(castOther.getMuniCodi())))
				&& ((this.getSipDepartamento() == castOther
						.getSipDepartamento()) || (this.getSipDepartamento() != null
						&& castOther.getSipDepartamento() != null && this
						.getSipDepartamento().equals(
								castOther.getSipDepartamento())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMuniCodi() == null ? 0 : this.getMuniCodi().hashCode());
		result = 37
				* result
				+ (getSipDepartamento() == null ? 0 : this.getSipDepartamento()
						.hashCode());
		return result;
	}

}