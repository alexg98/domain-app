package co.com.coomeva.sipas.core.model.sipasdb;


/**
 * AbstractSipTareasFlujoTipAuxId entity provides the base persistence
 * definition of the SipTareasFlujoTipAuxId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipTareasFlujoTipAuxId implements
		java.io.Serializable {

	// Fields

	private SipTareasFlujo sipTareasFlujo;
	private SipTipoAuxilios sipTipoAuxilios;

	// Constructors

	/** default constructor */
	public AbstractSipTareasFlujoTipAuxId() {
	}

	/** full constructor */
	public AbstractSipTareasFlujoTipAuxId(SipTareasFlujo sipTareasFlujo,
			SipTipoAuxilios sipTipoAuxilios) {
		this.sipTareasFlujo = sipTareasFlujo;
		this.sipTipoAuxilios = sipTipoAuxilios;
	}

	// Property accessors

	public SipTareasFlujo getSipTareasFlujo() {
		return this.sipTareasFlujo;
	}

	public void setSipTareasFlujo(SipTareasFlujo sipTareasFlujo) {
		this.sipTareasFlujo = sipTareasFlujo;
	}

	public SipTipoAuxilios getSipTipoAuxilios() {
		return this.sipTipoAuxilios;
	}

	public void setSipTipoAuxilios(SipTipoAuxilios sipTipoAuxilios) {
		this.sipTipoAuxilios = sipTipoAuxilios;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSipTareasFlujoTipAuxId))
			return false;
		AbstractSipTareasFlujoTipAuxId castOther = (AbstractSipTareasFlujoTipAuxId) other;

		return ((this.getSipTareasFlujo() == castOther.getSipTareasFlujo()) || (this
				.getSipTareasFlujo() != null
				&& castOther.getSipTareasFlujo() != null && this
				.getSipTareasFlujo().equals(castOther.getSipTareasFlujo())))
				&& ((this.getSipTipoAuxilios() == castOther
						.getSipTipoAuxilios()) || (this.getSipTipoAuxilios() != null
						&& castOther.getSipTipoAuxilios() != null && this
						.getSipTipoAuxilios().equals(
								castOther.getSipTipoAuxilios())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSipTareasFlujo() == null ? 0 : this.getSipTareasFlujo()
						.hashCode());
		result = 37
				* result
				+ (getSipTipoAuxilios() == null ? 0 : this.getSipTipoAuxilios()
						.hashCode());
		return result;
	}

}