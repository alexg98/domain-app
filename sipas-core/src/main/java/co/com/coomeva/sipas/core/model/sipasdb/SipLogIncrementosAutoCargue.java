package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;

/**
 * SipLogIncrementosAutoCargue entity. @author MyEclipse Persistence Tools
 */
public class SipLogIncrementosAutoCargue extends
		AbstractSipLogIncrementosAutoCargue implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipLogIncrementosAutoCargue() {
	}

	/** minimal constructor */
	public SipLogIncrementosAutoCargue(Long incrCodigoLogCod) {
		super(incrCodigoLogCod);
	}

	/** full constructor */
	public SipLogIncrementosAutoCargue(Long incrCodigoLogCod,
			Timestamp ranFechaCargue) {
		super(incrCodigoLogCod, ranFechaCargue);
	}

}
