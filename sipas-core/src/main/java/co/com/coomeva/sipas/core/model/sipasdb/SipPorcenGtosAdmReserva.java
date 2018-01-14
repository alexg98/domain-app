package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.util.Set;

/**
 * SipPorcenGtosAdmReserva entity. @author MyEclipse Persistence Tools
 */
public class SipPorcenGtosAdmReserva extends AbstractSipPorcenGtosAdmReserva
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipPorcenGtosAdmReserva() {
	}

	/** minimal constructor */
	public SipPorcenGtosAdmReserva(Long porcenCodigo, Integer edadIngreso,
			Integer antiguedad, Double porcentaje) {
		super(porcenCodigo, edadIngreso, antiguedad, porcentaje);
	}

	/** full constructor */
	public SipPorcenGtosAdmReserva(Long porcenCodigo,
			SipTipoReservaMatematica sipTipoReservaMatematica,
			Integer edadIngreso, Integer antiguedad, Double porcentaje,
			Set sipPorcenGtosAdmReservaAuds) {
		super(porcenCodigo, sipTipoReservaMatematica, edadIngreso, antiguedad,
				porcentaje, sipPorcenGtosAdmReservaAuds);
	}

}
