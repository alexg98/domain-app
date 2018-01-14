package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;

/**
 * SipCuotasSimulacionReactivacion entity. @author MyEclipse Persistence Tools
 */
public class SipCuotasSimulacionReactivacion extends
		AbstractSipCuotasSimulacionReactivacion implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipCuotasSimulacionReactivacion() {
	}

	/** minimal constructor */
	public SipCuotasSimulacionReactivacion(SipCuotasSimulacionReactivacionId id) {
		super(id);
	}

	/** full constructor */
	public SipCuotasSimulacionReactivacion(
			SipCuotasSimulacionReactivacionId id,
			Long csrConsecutivoProteccion, Integer csrPeriodo,
			Long csrProCod, Long csrValorFacturado, Long csrValorPagado,
			String csrEstado, Long csrValorMora, Long csrValorMoraPagada,
			String csrObservacion) {
		super(id, csrConsecutivoProteccion, csrPeriodo, csrProCod,
				csrValorFacturado, csrValorPagado, csrEstado, csrValorMora,
				csrValorMoraPagada, csrObservacion);
	}

}
