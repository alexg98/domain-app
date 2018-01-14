package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Set;

/**
 * SipTareasFlujoTipAux entity. @author MyEclipse Persistence Tools
 */
public class SipTareasFlujoTipAux extends AbstractSipTareasFlujoTipAux
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipTareasFlujoTipAux() {
	}

	/** minimal constructor */
	public SipTareasFlujoTipAux(SipTareasFlujoTipAuxId id,
			Boolean tarFluTipAuxEstado) {
		super(id, tarFluTipAuxEstado);
	}

	/** full constructor */
	public SipTareasFlujoTipAux(SipTareasFlujoTipAuxId id,
			Boolean tarFluTipAuxEstado, Set sipTareasFlujoTipAuxEstadoses) {
		super(id, tarFluTipAuxEstado, sipTareasFlujoTipAuxEstadoses);
	}

}
