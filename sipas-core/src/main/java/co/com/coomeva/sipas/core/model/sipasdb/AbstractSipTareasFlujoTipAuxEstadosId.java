package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * AbstractSipTareasFlujoTipAuxEstadosId entity provides the base persistence
 * definition of the SipTareasFlujoTipAuxEstadosId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipTareasFlujoTipAuxEstadosId implements
		java.io.Serializable {

	// Fields

	private SipTareasFlujoTipAux sipTareasFlujoTipAux;
	private Short tipCod;
	private Integer codigo;

	// Constructors

	/** default constructor */
	public AbstractSipTareasFlujoTipAuxEstadosId() {
	}

	/** full constructor */
	public AbstractSipTareasFlujoTipAuxEstadosId(
			SipTareasFlujoTipAux sipTareasFlujoTipAux, Short tipCod,
			Integer codigo) {
		this.sipTareasFlujoTipAux = sipTareasFlujoTipAux;
		this.tipCod = tipCod;
		this.codigo = codigo;
	}

	// Property accessors

	public SipTareasFlujoTipAux getSipTareasFlujoTipAux() {
		return this.sipTareasFlujoTipAux;
	}

	public void setSipTareasFlujoTipAux(
			SipTareasFlujoTipAux sipTareasFlujoTipAux) {
		this.sipTareasFlujoTipAux = sipTareasFlujoTipAux;
	}

	public Short getTipCod() {
		return this.tipCod;
	}

	public void setTipCod(Short tipCod) {
		this.tipCod = tipCod;
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSipTareasFlujoTipAuxEstadosId))
			return false;
		AbstractSipTareasFlujoTipAuxEstadosId castOther = (AbstractSipTareasFlujoTipAuxEstadosId) other;

		return ((this.getSipTareasFlujoTipAux() == castOther
				.getSipTareasFlujoTipAux()) || (this.getSipTareasFlujoTipAux() != null
				&& castOther.getSipTareasFlujoTipAux() != null && this
				.getSipTareasFlujoTipAux().equals(
						castOther.getSipTareasFlujoTipAux())))
				&& ((this.getTipCod() == castOther.getTipCod()) || (this
						.getTipCod() != null
						&& castOther.getTipCod() != null && this.getTipCod()
						.equals(castOther.getTipCod())))
				&& ((this.getCodigo() == castOther.getCodigo()) || (this
						.getCodigo() != null
						&& castOther.getCodigo() != null && this.getCodigo()
						.equals(castOther.getCodigo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSipTareasFlujoTipAux() == null ? 0 : this
						.getSipTareasFlujoTipAux().hashCode());
		result = 37 * result
				+ (getTipCod() == null ? 0 : this.getTipCod().hashCode());
		result = 37 * result
				+ (getCodigo() == null ? 0 : this.getCodigo().hashCode());
		return result;
	}

}