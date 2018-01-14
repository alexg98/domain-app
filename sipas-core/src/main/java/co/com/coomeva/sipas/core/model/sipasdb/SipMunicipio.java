package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * SipMunicipio entity. @author MyEclipse Persistence Tools
 */
public class SipMunicipio extends AbstractSipMunicipio implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipMunicipio() {
	}

	/** minimal constructor */
	public SipMunicipio(SipMunicipioId id) {
		super(id);
	}

	/** full constructor */
	public SipMunicipio(SipMunicipioId id, String muninomb) {
		super(id, muninomb);
	}

}
