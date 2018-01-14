package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Set;

/**
 * SipTareasFlujo entity. @author MyEclipse Persistence Tools
 */
public class SipTareasFlujo extends AbstractSipTareasFlujo implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipTareasFlujo() {
	}

	/** minimal constructor */
	public SipTareasFlujo(Long tarFluCodigo, String tarFluNombre,
			Boolean tarFluEstado) {
		super(tarFluCodigo, tarFluNombre, tarFluEstado);
	}

	/** full constructor */
	public SipTareasFlujo(Long tarFluCodigo, String tarFluNombre,
			Boolean tarFluEstado, Set sipTareasFlujoTipAuxes) {
		super(tarFluCodigo, tarFluNombre, tarFluEstado, sipTareasFlujoTipAuxes);
	}

}
