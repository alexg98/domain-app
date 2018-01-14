package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * AbstractSipDocumentosReqSolicitudId entity provides the base persistence
 * definition of the SipDocumentosReqSolicitudId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipDocumentosReqSolicitudId implements
		java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 5588166508203759006L;
	private Short tipCodigo;
	private Short docReqCodigo;

	// Constructors

	/** default constructor */
	public AbstractSipDocumentosReqSolicitudId() {
	}

	/** full constructor */
	public AbstractSipDocumentosReqSolicitudId(Short tipCodigo,
			Short docReqCodigo) {
		this.tipCodigo = tipCodigo;
		this.docReqCodigo = docReqCodigo;
	}

	// Property accessors

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
		if (!(other instanceof AbstractSipDocumentosReqSolicitudId))
			return false;
		AbstractSipDocumentosReqSolicitudId castOther = (AbstractSipDocumentosReqSolicitudId) other;

		return ((this.getTipCodigo() == castOther.getTipCodigo()) || (this
				.getTipCodigo() != null
				&& castOther.getTipCodigo() != null && this.getTipCodigo()
				.equals(castOther.getTipCodigo())))
				&& ((this.getDocReqCodigo() == castOther.getDocReqCodigo()) || (this
						.getDocReqCodigo() != null
						&& castOther.getDocReqCodigo() != null && this
						.getDocReqCodigo().equals(castOther.getDocReqCodigo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTipCodigo() == null ? 0 : this.getTipCodigo().hashCode());
		result = 37
				* result
				+ (getDocReqCodigo() == null ? 0 : this.getDocReqCodigo()
						.hashCode());
		return result;
	}

}