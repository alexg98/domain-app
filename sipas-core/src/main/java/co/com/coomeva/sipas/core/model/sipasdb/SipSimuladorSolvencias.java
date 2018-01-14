package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * SipSimuladorSolvencias entity. @author MyEclipse Persistence Tools
 */
public class SipSimuladorSolvencias extends AbstractSipSimuladorSolvencias
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipSimuladorSolvencias() {
	}

	/** minimal constructor */
	public SipSimuladorSolvencias(Long simConsec) {
		super(simConsec);
	}

	/** full constructor */
	public SipSimuladorSolvencias(Long simConsec, Long simRecCodigo,
			Long simAsoNumint, Long simValProActual, Long simValCuoTotal,
			Long simValCuoSolve, Long simNumCuoPag, String simPriPerPag,
			Date simFecNacAso, Byte simEdadSoliSolve, Byte simAnoPlanSolve,
			String simSexAso, Long simCapAporta, Long simValDevSolve,
			Boolean simEstado, Timestamp simFecReg) {
		super(simConsec, simRecCodigo, simAsoNumint, simValProActual,
				simValCuoTotal, simValCuoSolve, simNumCuoPag, simPriPerPag,
				simFecNacAso, simEdadSoliSolve, simAnoPlanSolve, simSexAso,
				simCapAporta, simValDevSolve, simEstado, simFecReg);
	}

}
