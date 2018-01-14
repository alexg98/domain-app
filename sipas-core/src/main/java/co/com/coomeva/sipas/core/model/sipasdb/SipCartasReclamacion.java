package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;

/**
 * SipCartasReclamacion entity. @author MyEclipse Persistence Tools
 */
public class SipCartasReclamacion extends AbstractSipCartasReclamacion
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipCartasReclamacion() {
	}

	/** minimal constructor */
	public SipCartasReclamacion(Long carCodigo, Long carTipoCarta,
			Long carUsuarioRegistro, Date carFechaRegistro) {
		super(carCodigo, carTipoCarta, carUsuarioRegistro, carFechaRegistro);
	}

	/** full constructor */
	public SipCartasReclamacion(Long carCodigo,
			SipReclamaciones sipReclamaciones, Long carTipoCarta,
			String carContenido, String carConsecutivoCarta,
			Long carUsuarioRegistro, Date carFechaRegistro,
			Long carUsuarioGeneracion, Date carFechaGeneracion,
			Long carUsuarioRadicacion, Long carEstado) {
		super(carCodigo, sipReclamaciones, carTipoCarta, carContenido,
				carConsecutivoCarta, carUsuarioRegistro, carFechaRegistro,
				carUsuarioGeneracion, carFechaGeneracion, carUsuarioRadicacion,
				carEstado);
	}

}
