package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * AbstractSipActividadEconomica entity provides the base persistence definition
 * of the SipActividadEconomica entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipActividadEconomica implements
		java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -8031039920433748362L;
	private String acecCodi;
	private String acecNomb;

	// Constructors

	/** default constructor */
	public AbstractSipActividadEconomica() {
	}

	/** minimal constructor */
	public AbstractSipActividadEconomica(String acecCodi) {
		this.acecCodi = acecCodi;
	}

	/** full constructor */
	public AbstractSipActividadEconomica(String acecCodi, String acecNomb) {
		this.acecCodi = acecCodi;
		this.acecNomb = acecNomb;
	}

	// Property accessors

	public String getAcecCodi() {
		return this.acecCodi;
	}

	public void setAcecCodi(String acecCodi) {
		this.acecCodi = acecCodi;
	}

	public String getAcecNomb() {
		return this.acecNomb;
	}

	public void setAcecNomb(String acecNomb) {
		this.acecNomb = acecNomb;
	}

}