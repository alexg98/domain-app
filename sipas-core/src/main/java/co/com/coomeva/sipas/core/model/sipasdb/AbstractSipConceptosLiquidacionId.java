package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * AbstractSipConceptosLiquidacionId entity provides the base persistence
 * definition of the SipConceptosLiquidacionId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipConceptosLiquidacionId implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -3312729095836698047L;
	private SipLiquidaciones sipLiquidaciones;
	private SipProductos sipProductos;
	private Long conlCodigo;
	private Long prodCodigoPagado;

	// Constructors

	/** default constructor */
	public AbstractSipConceptosLiquidacionId() {
	}

	/** full constructor */
	public AbstractSipConceptosLiquidacionId(SipLiquidaciones sipLiquidaciones,
			SipProductos sipProductos, Long conlCodigo,Long prodCodigoPagado) {
		this.sipLiquidaciones = sipLiquidaciones;
		this.sipProductos = sipProductos;
		this.conlCodigo = conlCodigo;
		this.prodCodigoPagado = prodCodigoPagado;
	}

	// Property accessors


	public SipProductos getSipProductos() {
		return this.sipProductos;
	}

	public SipLiquidaciones getSipLiquidaciones() {
		return sipLiquidaciones;
	}

	public void setSipLiquidaciones(SipLiquidaciones sipLiquidaciones) {
		this.sipLiquidaciones = sipLiquidaciones;
	}

	public void setSipProductos(SipProductos sipProductos) {
		this.sipProductos = sipProductos;
	}

	public Long getConlCodigo() {
		return this.conlCodigo;
	}

	public void setConlCodigo(Long conlCodigo) {
		this.conlCodigo = conlCodigo;
	}

	public Long getProdCodigoPagado() {
		return prodCodigoPagado;
	}

	public void setProdCodigoPagado(Long prodCodigoPagado) {
		this.prodCodigoPagado = prodCodigoPagado;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSipConceptosLiquidacionId))
			return false;
		AbstractSipConceptosLiquidacionId castOther = (AbstractSipConceptosLiquidacionId) other;

		return ((this.getSipLiquidaciones() == castOther.getSipLiquidaciones()) || (this.getSipLiquidaciones() != null
				&& castOther.getSipLiquidaciones() != null && this.getSipLiquidaciones().equals(castOther.getSipLiquidaciones())))
				&& ((this.getSipProductos() == castOther.getSipProductos()) || (this.getSipProductos() != null
				&& castOther.getSipProductos() != null && this.getSipProductos().equals(castOther.getSipProductos())))
				&& ((this.getConlCodigo() == castOther.getConlCodigo()) || (this.getConlCodigo() != null
				&& castOther.getConlCodigo() != null && this.getConlCodigo().equals(castOther.getConlCodigo()))
				&& ((this.getProdCodigoPagado() == castOther.getProdCodigoPagado()) || (this.getProdCodigoPagado() != null
				&& castOther.getProdCodigoPagado() != null && this.getProdCodigoPagado().equals(castOther.getProdCodigoPagado()))));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSipLiquidaciones() == null ? 0 : this.getSipLiquidaciones().hashCode());
		result = 37
				* result
				+ (getSipProductos() == null ? 0 : this.getSipProductos().hashCode());
		result = 37
				* result
				+ (getConlCodigo() == null ? 0 : this.getConlCodigo()
						.hashCode());
		return result;
	}

}