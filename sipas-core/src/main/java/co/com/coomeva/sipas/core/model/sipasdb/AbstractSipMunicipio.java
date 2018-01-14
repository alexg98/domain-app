package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * AbstractSipMunicipio entity provides the base persistence definition of the
 * SipMunicipio entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipMunicipio implements java.io.Serializable {

	// Fields

	private SipMunicipioId id;
	private String muninomb;

	// Constructors

	/** default constructor */
	public AbstractSipMunicipio() {
	}

	/** minimal constructor */
	public AbstractSipMunicipio(SipMunicipioId id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractSipMunicipio(SipMunicipioId id, String muninomb) {
		this.id = id;
		this.muninomb = muninomb;
	}

	// Property accessors

	public SipMunicipioId getId() {
		return this.id;
	}

	public void setId(SipMunicipioId id) {
		this.id = id;
	}

	public String getMuninomb() {
		return this.muninomb;
	}

	public void setMuninomb(String muninomb) {
		this.muninomb = muninomb;
	}

}