package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * SipIncreAutoCambioVinEdad entity. @author MyEclipse Persistence Tools
 */
public class SipIncreAutoCambioVinEdad extends
		AbstractSipIncreAutoCambioVinEdad implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipIncreAutoCambioVinEdad() {
	}

	/** minimal constructor */
	public SipIncreAutoCambioVinEdad(Long consecutivo, Long asoNumint,
			BigDecimal proCod, Short prodCodigo,
			Long valorIncrementoSolicitado, Boolean generoFlujo,
			Byte tipoIncrementoAuto) {
		super(consecutivo, asoNumint, proCod, prodCodigo,
				valorIncrementoSolicitado, generoFlujo, tipoIncrementoAuto);
	}

	/** full constructor */
	public SipIncreAutoCambioVinEdad(Long consecutivo, Timestamp fechaRegistro,
			Long asoNumint, BigDecimal proCod, Short prodCodigo,
			Long valorIncrementoSolicitado, Boolean generoFlujo,
			Byte tipoIncrementoAuto, String observacion) {
		super(consecutivo, fechaRegistro, asoNumint, proCod, prodCodigo,
				valorIncrementoSolicitado, generoFlujo, tipoIncrementoAuto,
				observacion);
	}

}
