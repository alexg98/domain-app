package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;

/**
 * SipFactorInactividadE entity. @author MyEclipse Persistence Tools
 */
public class SipFactorInactividadE extends AbstractSipFactorInactividadE
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipFactorInactividadE() {
	}

	/** minimal constructor */
	public SipFactorInactividadE(Long faeConsecutivo) {
		super(faeConsecutivo);
	}

	/** full constructor */
	public SipFactorInactividadE(Long faeConsecutivo, String faeLinea,
			Long faeTipoError,Long faeEstado,Timestamp faeFechaRegistro) {
		super(faeConsecutivo, faeLinea, faeTipoError,faeEstado,faeFechaRegistro);
	}

}
