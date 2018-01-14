package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Set;

/**
 * SipPreguntasTipo entity. @author MyEclipse Persistence Tools
 */
public class SipPreguntasTipo extends AbstractSipPreguntasTipo implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipPreguntasTipo() {
	}

	/** minimal constructor */
	public SipPreguntasTipo(Long pretCodigo, String pretDesc) {
		super(pretCodigo, pretDesc);
	}

	/** full constructor */
	public SipPreguntasTipo(Long pretCodigo, String pretDesc,
			Set sipPreguntases) {
		super(pretCodigo, pretDesc, sipPreguntases);
	}

}
