package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Set;

/**
 * SipDepartamento entity. @author MyEclipse Persistence Tools
 */
public class SipDepartamento extends AbstractSipDepartamento implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipDepartamento() {
	}

	/** minimal constructor */
	public SipDepartamento(String depaCodi) {
		super(depaCodi);
	}

	/** full constructor */
	public SipDepartamento(String depaCodi, String depaNomb, Set sipMunicipios) {
		super(depaCodi, depaNomb, sipMunicipios);
	}

}
