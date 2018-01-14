package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSipDepartamento entity provides the base persistence definition of
 * the SipDepartamento entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipDepartamento implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1102529263200843013L;
	private String depaCodi;
	private String depaNomb;
	private Set<SipMunicipio> sipMunicipios = new HashSet<>(0);

	// Constructors

	/** default constructor */
	public AbstractSipDepartamento() {
	}

	/** minimal constructor */
	public AbstractSipDepartamento(String depaCodi) {
		this.depaCodi = depaCodi;
	}

	/** full constructor */
	public AbstractSipDepartamento(String depaCodi, String depaNomb,
			Set<SipMunicipio> sipMunicipios) {
		this.depaCodi = depaCodi;
		this.depaNomb = depaNomb;
		this.sipMunicipios = sipMunicipios;
	}

	// Property accessors

	public String getDepaCodi() {
		return this.depaCodi;
	}

	public void setDepaCodi(String depaCodi) {
		this.depaCodi = depaCodi;
	}

	public String getDepaNomb() {
		return this.depaNomb;
	}

	public void setDepaNomb(String depaNomb) {
		this.depaNomb = depaNomb;
	}

	public Set<SipMunicipio> getSipMunicipios() {
		return this.sipMunicipios;
	}

	public void setSipMunicipios(Set<SipMunicipio> sipMunicipios) {
		this.sipMunicipios = sipMunicipios;
	}

}