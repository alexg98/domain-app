package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * SipRentas entity. @author MyEclipse Persistence Tools
 */
public class SipDetalleReclamacionesRentas extends
		AbstractSipDetalleReclamacionesRentas implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipDetalleReclamacionesRentas() {
	}

	/** minimal constructor */
	public SipDetalleReclamacionesRentas(Long liqPagConsecutivo, Long recCodigo,
			Long detRecValorBase, Long detRecTratEsp,
			Double detRecTratEspPorRe, Double detRecValorProteccBase,
			Long detRecTratEspValor) {
		super(liqPagConsecutivo, recCodigo, detRecValorBase, detRecTratEsp,
				detRecTratEspPorRe, detRecValorProteccBase, detRecTratEspValor);
	}

}
