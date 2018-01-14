package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

/**
 * SipSimulacionesReactivacion entity. @author MyEclipse Persistence Tools
 */
public class SipSimulacionesReactivacion extends
		AbstractSipSimulacionesReactivacion implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipSimulacionesReactivacion() {
	}

	/** minimal constructor */
	public SipSimulacionesReactivacion(Long sreaConsecutivo,
			Long asoNumint, Date sreaFechaSimulacion, String sreaEstado,
			Short sreaAntiguedadAsociado) {
		super(sreaConsecutivo, asoNumint, sreaFechaSimulacion, sreaEstado,
				sreaAntiguedadAsociado);
	}

	/** full constructor */
	public SipSimulacionesReactivacion(Long sreaConsecutivo,
			Long asoNumint, Date sreaFechaSimulacion, String sreaEstado,
			Short sreaAntiguedadAsociado,
			Set sipProteccionesSimulacionReactivacions,String sreaTratamientoEspecial,Timestamp sreafechaPerseverancia) {
		super(sreaConsecutivo, asoNumint, sreaFechaSimulacion, sreaEstado,
				sreaAntiguedadAsociado, sipProteccionesSimulacionReactivacions,sreaTratamientoEspecial,sreafechaPerseverancia);
	}

}
