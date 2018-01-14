package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * AbstractSipDetalleSolicitudId entity provides the base persistence definition
 * of the SipDetalleSolicitudId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipDetalleSolicitudId implements
		java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -1104854644109234363L;
	private Long solCodigo;
	private Long solConsecutivo;

	// Constructors

	/** default constructor */
	public AbstractSipDetalleSolicitudId() {
	}

	/** full constructor */
	public AbstractSipDetalleSolicitudId(Long solCodigo, Long solConsecutivo) {
		this.solCodigo = solCodigo;
		this.solConsecutivo = solConsecutivo;
	}

	// Property accessors

	public Long getSolCodigo() {
		return this.solCodigo;
	}

	public void setSolCodigo(Long solCodigo) {
		this.solCodigo = solCodigo;
	}

	public Long getSolConsecutivo() {
		return this.solConsecutivo;
	}

	public void setSolConsecutivo(Long solConsecutivo) {
		this.solConsecutivo = solConsecutivo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSipDetalleSolicitudId))
			return false;
		AbstractSipDetalleSolicitudId castOther = (AbstractSipDetalleSolicitudId) other;

		return ((this.getSolCodigo() == castOther.getSolCodigo()) || (this
				.getSolCodigo() != null
				&& castOther.getSolCodigo() != null && this.getSolCodigo()
				.equals(castOther.getSolCodigo())))
				&& ((this.getSolConsecutivo() == castOther.getSolConsecutivo()) || (this
						.getSolConsecutivo() != null
						&& castOther.getSolConsecutivo() != null && this
						.getSolConsecutivo().equals(
								castOther.getSolConsecutivo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSolCodigo() == null ? 0 : this.getSolCodigo().hashCode());
		result = 37
				* result
				+ (getSolConsecutivo() == null ? 0 : this.getSolConsecutivo()
						.hashCode());
		return result;
	}

}