package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * AbstractSipRentas entity provides the base persistence definition of the
 * SipRentas entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipDetalleReclamacionesRentas implements
		java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 8598774641163636842L;
	private Long liqPagConsecutivo;
	private Long recCodigo;
	private Long detRecValorBase;
	private Long detRecTratEsp;
	private Double detRecTratEspPorRe;
	private Double detRecValorProteccBase;
	private Long detRecTratEspValor;

	// Constructors

	/** default constructor */
	public AbstractSipDetalleReclamacionesRentas() {
	}

	/** minimal constructor */
	public AbstractSipDetalleReclamacionesRentas(Long liqPagConsecutivo,
			Long recCodigo, Long detRecValorBase, Long detRecTratEsp,
			Double detRecTratEspPorRe, Double detRecValorProteccBase,
			Long detRecTratEspValor) {
		this.liqPagConsecutivo = liqPagConsecutivo;
		this.recCodigo = recCodigo;
		this.detRecValorBase = detRecValorBase;
		this.detRecTratEsp = detRecTratEsp;
		this.detRecTratEspPorRe = detRecTratEspPorRe;
		this.detRecValorProteccBase = detRecValorProteccBase;
		this.detRecTratEspValor = detRecTratEspValor;
	}

	public Long getLiqPagConsecutivo() {
		return liqPagConsecutivo;
	}

	public void setLiqPagConsecutivo(Long renConsecutivo) {
		this.liqPagConsecutivo = renConsecutivo;
	}

	public Long getRecCodigo() {
		return recCodigo;
	}

	public void setRecCodigo(Long recCodigo) {
		this.recCodigo = recCodigo;
	}

	public Long getDetRecValorBase() {
		return detRecValorBase;
	}

	public void setDetRecValorBase(Long detRecValorBase) {
		this.detRecValorBase = detRecValorBase;
	}

	public Long getDetRecTratEsp() {
		return detRecTratEsp;
	}

	public void setDetRecTratEsp(Long detRecTratEsp) {
		this.detRecTratEsp = detRecTratEsp;
	}

	public Double getDetRecTratEspPorRe() {
		return detRecTratEspPorRe;
	}

	public void setDetRecTratEspPorRe(Double detRecTratEspPorRe) {
		this.detRecTratEspPorRe = detRecTratEspPorRe;
	}

	public Double getDetRecValorProteccBase() {
		return detRecValorProteccBase;
	}

	public void setDetRecValorProteccBase(Double detRecValorProteccBase) {
		this.detRecValorProteccBase = detRecValorProteccBase;
	}

	public Long getDetRecTratEspValor() {
		return detRecTratEspValor;
	}

	public void setDetRecTratEspValor(Long detRecTratEspValor) {
		this.detRecTratEspValor = detRecTratEspValor;
	}
	
	

}
