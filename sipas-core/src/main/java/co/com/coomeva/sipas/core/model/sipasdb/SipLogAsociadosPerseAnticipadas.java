package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;

/**
 * SipLogAsociadosPerseAnticipadas entity. @author MyEclipse Persistence Tools
 */
public class SipLogAsociadosPerseAnticipadas extends
		AbstractSipLogAsociadosPerseAnticipadas implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipLogAsociadosPerseAnticipadas() {
	}

	/** minimal constructor */
	public SipLogAsociadosPerseAnticipadas(Long aspCodigo,
			Long aspUsuarioRegistro, Date aspFechaRegistro) {
		super(aspCodigo, aspUsuarioRegistro, aspFechaRegistro);
	}

	/** full constructor */
	public SipLogAsociadosPerseAnticipadas(Long aspCodigo,
			String aspRegistroOriginal, Long aspResultado, String aspObservaciones,
			Long aspUsuarioRegistro, Date aspFechaRegistro) {
		super(aspCodigo, aspRegistroOriginal, aspResultado, aspObservaciones, aspUsuarioRegistro,
				aspFechaRegistro);
	}

}
