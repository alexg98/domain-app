package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;

/**
 * SipRentas entity. @author MyEclipse Persistence Tools
 */
public class SipRentas extends AbstractSipRentas implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipRentas() {
	}

	/** minimal constructor */
	public SipRentas(Long renConsecutivo,
			SipLiquidaciones sipLiquidaciones,
			SipReclamaciones sipReclamaciones, Integer renNumeroRenta,
			Timestamp renFechaGeneracion, Long renValor, String renEstado) {
		super(renConsecutivo, sipLiquidaciones, sipReclamaciones,
				renNumeroRenta, renFechaGeneracion, renValor, renEstado);
	}

	/** full constructor */
	public SipRentas(Long renConsecutivo,
			SipLiquidaciones sipLiquidaciones,
			SipReclamaciones sipReclamaciones, Integer renNumeroRenta,
			Timestamp renFechaGeneracion, Long renValor, String renEstado,
			String renObservaciones, Long renTipo) {
		super(renConsecutivo, sipLiquidaciones, sipReclamaciones,
				renNumeroRenta, renFechaGeneracion, renValor, renEstado,
				renObservaciones,renTipo);
	}

}
