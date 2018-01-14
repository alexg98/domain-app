package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * SipMunicipioId entity. @author MyEclipse Persistence Tools
 */
public class SipMunicipioId extends AbstractSipMunicipioId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipMunicipioId() {
	}

	/** full constructor */
	public SipMunicipioId(String muniCodi, SipDepartamento sipDepartamento) {
		super(muniCodi, sipDepartamento);
	}

}
