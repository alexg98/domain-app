package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;

/**
 * AbstractSipLogIncrementosAutoCargue entity provides the base persistence
 * definition of the SipLogIncrementosAutoCargue entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipLogIncrementosAutoCargue implements
		java.io.Serializable {

	// Fields

	private Long incrCodigoLogCod;
	private Timestamp ranFechaCargue;

	// Constructors

	/** default constructor */
	public AbstractSipLogIncrementosAutoCargue() {
	}

	/** minimal constructor */
	public AbstractSipLogIncrementosAutoCargue(Long incrCodigoLogCod) {
		this.incrCodigoLogCod = incrCodigoLogCod;
	}

	/** full constructor */
	public AbstractSipLogIncrementosAutoCargue(Long incrCodigoLogCod,
			Timestamp ranFechaCargue) {
		this.incrCodigoLogCod = incrCodigoLogCod;
		this.ranFechaCargue = ranFechaCargue;
	}

	// Property accessors

	public Long getIncrCodigoLogCod() {
		return this.incrCodigoLogCod;
	}

	public void setIncrCodigoLogCod(Long incrCodigoLogCod) {
		this.incrCodigoLogCod = incrCodigoLogCod;
	}

	public Timestamp getRanFechaCargue() {
		return this.ranFechaCargue;
	}

	public void setRanFechaCargue(Timestamp ranFechaCargue) {
		this.ranFechaCargue = ranFechaCargue;
	}

}