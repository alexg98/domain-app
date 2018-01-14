package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;

/**
 * SipPorcenGtosAdmReservaAud entity. @author MyEclipse Persistence Tools
 */
public class SipPorcenGtosAdmReservaAud extends
		AbstractSipPorcenGtosAdmReservaAud implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipPorcenGtosAdmReservaAud() {
	}

	/** minimal constructor */
	public SipPorcenGtosAdmReservaAud(Long porcenAudCodigo,
			String usuario, Timestamp fechaCambio, Double porcentajeAnt,
			Double porcentajeCam, String observaciones) {
		super(porcenAudCodigo, usuario, fechaCambio, porcentajeAnt,
				porcentajeCam, observaciones);
	}

	/** full constructor */
	public SipPorcenGtosAdmReservaAud(Long porcenAudCodigo,
			SipPorcenGtosAdmReserva sipPorcenGtosAdmReserva, String usuario,
			Timestamp fechaCambio, Double porcentajeAnt, Double porcentajeCam,
			String observaciones) {
		super(porcenAudCodigo, sipPorcenGtosAdmReserva, usuario, fechaCambio,
				porcentajeAnt, porcentajeCam, observaciones);
	}

}
