package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * AbstractSipConceptosLiquidacion entity provides the base persistence
 * definition of the SipConceptosLiquidacion entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipConceptosLiquidacion implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 7386900234350108393L;
	private SipConceptosLiquidacionId id;
	private Long conlValor;
	private Double conlPorcentaje;
	private Long conlPadre;	
	private Long conlLiqPago;
	// Constructors

	/** default constructor */
	public AbstractSipConceptosLiquidacion() {
	}

	/** minimal constructor */
	public AbstractSipConceptosLiquidacion(SipConceptosLiquidacionId id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractSipConceptosLiquidacion(SipConceptosLiquidacionId id,
			Long conlValor, Double conlPorcentaje, Long conlPadre,Long conlLiqPago) {
		this.id = id;
		this.conlValor = conlValor;
		this.conlPorcentaje = conlPorcentaje;
		this.conlPadre = conlPadre;
		this.conlLiqPago = conlLiqPago;
	}

	// Property accessors

	public SipConceptosLiquidacionId getId() {
		return this.id;
	}

	public void setId(SipConceptosLiquidacionId id) {
		this.id = id;
	}

	public Long getConlValor() {
		return this.conlValor;
	}

	public void setConlValor(Long conlValor) {
		this.conlValor = conlValor;
	}

	public Double getConlPorcentaje() {
		return this.conlPorcentaje;
	}

	public void setConlPorcentaje(Double conlPorcentaje) {
		this.conlPorcentaje = conlPorcentaje;
	}

	public Long getConlPadre() {
		return this.conlPadre;
	}

	public void setConlPadre(Long conlPadre) {
		this.conlPadre = conlPadre;
	}

	public Long getConlLiqPago() {
		return conlLiqPago;
	}

	public void setConlLiqPago(Long conlLiqPago) {
		this.conlLiqPago = conlLiqPago;
	}
}