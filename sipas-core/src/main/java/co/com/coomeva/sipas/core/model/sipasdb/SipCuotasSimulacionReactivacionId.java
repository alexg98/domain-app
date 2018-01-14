package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;

/**
 * SipCuotasSimulacionReactivacionId entity. @author MyEclipse Persistence Tools
 */
public class SipCuotasSimulacionReactivacionId extends
		AbstractSipCuotasSimulacionReactivacionId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipCuotasSimulacionReactivacionId() {
	}

	/** full constructor */
	public SipCuotasSimulacionReactivacionId(
			Long csrConsecutivo,
			SipProteccionesSimulacionReactivacion sipProteccionesSimulacionReactivacion) {
		super(csrConsecutivo, sipProteccionesSimulacionReactivacion);
	}

}
