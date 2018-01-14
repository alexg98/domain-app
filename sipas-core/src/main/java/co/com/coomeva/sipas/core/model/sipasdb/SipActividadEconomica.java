package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * SipActividadEconomica entity. @author MyEclipse Persistence Tools
 */
public class SipActividadEconomica extends AbstractSipActividadEconomica
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipActividadEconomica() {
	}

	/** minimal constructor */
	public SipActividadEconomica(String acecCodi) {
		super(acecCodi);
	}

	/** full constructor */
	public SipActividadEconomica(String acecCodi, String acecNomb) {
		super(acecCodi, acecNomb);
	}

}
