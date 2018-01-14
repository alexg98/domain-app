package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * AbstractSipDetalleDocSolicitudId entity provides the base persistence
 * definition of the SipDetalleDocSolicitudId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipDetalleDocSolicitudId implements
		java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 2048785058756184188L;
	private Long solCodigo;
	private Short tipCodigo;
	private Short docReqCodigo;

	// Constructors

	/** default constructor */
	public AbstractSipDetalleDocSolicitudId() {
	}

	/** full constructor */
	public AbstractSipDetalleDocSolicitudId(Long solCodigo, Short tipCodigo,
			Short docReqCodigo) {
		this.solCodigo = solCodigo;
		this.tipCodigo = tipCodigo;
		this.docReqCodigo = docReqCodigo;
	}

	// Property accessors

	public Long getSolCodigo() {
		return this.solCodigo;
	}

	public void setSolCodigo(Long solCodigo) {
		this.solCodigo = solCodigo;
	}

	public Short getTipCodigo() {
		return this.tipCodigo;
	}

	public void setTipCodigo(Short tipCodigo) {
		this.tipCodigo = tipCodigo;
	}

	public Short getDocReqCodigo() {
		return this.docReqCodigo;
	}

	public void setDocReqCodigo(Short docReqCodigo) {
		this.docReqCodigo = docReqCodigo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSipDetalleDocSolicitudId))
			return false;
		AbstractSipDetalleDocSolicitudId castOther = (AbstractSipDetalleDocSolicitudId) other;

		return ((this.getSolCodigo() == castOther.getSolCodigo()) || (this
				.getSolCodigo() != null
				&& castOther.getSolCodigo() != null && this.getSolCodigo()
				.equals(castOther.getSolCodigo())))
				&& ((this.getTipCodigo() == castOther.getTipCodigo()) || (this
						.getTipCodigo() != null
						&& castOther.getTipCodigo() != null && this
						.getTipCodigo().equals(castOther.getTipCodigo())))
				&& ((this.getDocReqCodigo() == castOther.getDocReqCodigo()) || (this
						.getDocReqCodigo() != null
						&& castOther.getDocReqCodigo() != null && this
						.getDocReqCodigo().equals(castOther.getDocReqCodigo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSolCodigo() == null ? 0 : this.getSolCodigo().hashCode());
		result = 37 * result
				+ (getTipCodigo() == null ? 0 : this.getTipCodigo().hashCode());
		result = 37
				* result
				+ (getDocReqCodigo() == null ? 0 : this.getDocReqCodigo()
						.hashCode());
		return result;
	}

}