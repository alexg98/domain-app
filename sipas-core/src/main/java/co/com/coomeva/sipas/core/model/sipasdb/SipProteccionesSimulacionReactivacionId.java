package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;

/**
 * SipProteccionesSimulacionReactivacionId entity. @author MyEclipse Persistence
 * Tools
 */
public class SipProteccionesSimulacionReactivacionId extends
		AbstractSipProteccionesSimulacionReactivacionId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipProteccionesSimulacionReactivacionId() {
	}

	/** full constructor */
	public SipProteccionesSimulacionReactivacionId(
			SipSimulacionesReactivacion sipSimulacionesReactivacion,
			Long psrConsecutivo) {
		super(sipSimulacionesReactivacion, psrConsecutivo);
	}

}
