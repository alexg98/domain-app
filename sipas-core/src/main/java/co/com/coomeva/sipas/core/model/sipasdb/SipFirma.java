package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;

/**
 * SipFirma entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SipFirma extends AbstractSipFirma implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipFirma() {
	}

	/** full constructor */
	public SipFirma(Long firCod, SipPersonal sipPersonal, Long regCod,
			Long carCod, Date firFechaRegistro, Long firUsuario) {
		super(firCod, sipPersonal, regCod, carCod, firFechaRegistro, firUsuario);
	}

}
