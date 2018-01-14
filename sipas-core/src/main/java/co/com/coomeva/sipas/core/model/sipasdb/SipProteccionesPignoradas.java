package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * SipProteccionesPignoradas entity. @author MyEclipse Persistence Tools
 */
public class SipProteccionesPignoradas extends AbstractSipProteccionesPignoradas implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipProteccionesPignoradas() {
	}

	/** minimal constructor */
	public SipProteccionesPignoradas(Long ppCodigo, Long asoNumint) {
		super(ppCodigo, asoNumint);
	}

	/** full constructor */
	public SipProteccionesPignoradas(Long ppCodigo, Long asoNumint, Long proCod, String ppEstado,
			String ppRegistroActual, String ppTipoTransaccion, Timestamp ppFechaRegistro, Double ppValorPignorado,
			Long valorGarantia, Long valorRetefuente, Double porcentajeReserva, Long consecutivoBanco) {
		super(ppCodigo, asoNumint, proCod, ppEstado, ppRegistroActual, ppTipoTransaccion, ppFechaRegistro,
				ppValorPignorado, valorGarantia, valorRetefuente, porcentajeReserva, consecutivoBanco);
	}

}
