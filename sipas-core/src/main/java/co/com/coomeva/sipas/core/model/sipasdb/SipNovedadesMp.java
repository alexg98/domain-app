package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * SipNovedadesMp entity. @author MyEclipse Persistence Tools
 */
public class SipNovedadesMp extends AbstractSipNovedadesMp implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipNovedadesMp() {
	}

	/** minimal constructor */
	public SipNovedadesMp(Long consecutivo, BigDecimal nitcli, String tipoNovedad, String descNovedad,
			Timestamp fechaNovedad, Timestamp fechaRegistro, String sistema) {
		super(consecutivo, nitcli, tipoNovedad, descNovedad, fechaNovedad, fechaRegistro, sistema);
	}

	/** full constructor */
	public SipNovedadesMp(Long consecutivo, BigDecimal nitcli, String tipoNovedad, String descNovedad,
			Timestamp fechaNovedad, Timestamp fechaRegistro, String sistema, Long estado, String observacion,
			Timestamp fechaAplicacion) {
		super(consecutivo, nitcli, tipoNovedad, descNovedad, fechaNovedad, fechaRegistro, sistema, estado, observacion,
				fechaAplicacion);
	}

}
