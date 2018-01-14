package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * SipConceptosLiquidacionId entity. @author MyEclipse Persistence Tools
 */
public class SipConceptosLiquidacionId extends
		AbstractSipConceptosLiquidacionId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipConceptosLiquidacionId() {
	}

	/** full constructor */
	public SipConceptosLiquidacionId(SipLiquidaciones sipLiquidaciones,
			SipProductos sipProductos, Long conlCodigo,Long prodCodigoPagado) {
		super(sipLiquidaciones, sipProductos, conlCodigo,prodCodigoPagado);
	}

}
