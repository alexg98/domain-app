package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSipTareasFlujoTipAux entity provides the base persistence definition
 * of the SipTareasFlujoTipAux entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipTareasFlujoTipAux implements
		java.io.Serializable {

	// Fields

	private SipTareasFlujoTipAuxId id;
	private Boolean tarFluTipAuxEstado;
	private Set sipTareasFlujoTipAuxEstadoses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSipTareasFlujoTipAux() {
	}

	/** minimal constructor */
	public AbstractSipTareasFlujoTipAux(SipTareasFlujoTipAuxId id,
			Boolean tarFluTipAuxEstado) {
		this.id = id;
		this.tarFluTipAuxEstado = tarFluTipAuxEstado;
	}

	/** full constructor */
	public AbstractSipTareasFlujoTipAux(SipTareasFlujoTipAuxId id,
			Boolean tarFluTipAuxEstado, Set sipTareasFlujoTipAuxEstadoses) {
		this.id = id;
		this.tarFluTipAuxEstado = tarFluTipAuxEstado;
		this.sipTareasFlujoTipAuxEstadoses = sipTareasFlujoTipAuxEstadoses;
	}

	// Property accessors

	public SipTareasFlujoTipAuxId getId() {
		return this.id;
	}

	public void setId(SipTareasFlujoTipAuxId id) {
		this.id = id;
	}

	public Boolean getTarFluTipAuxEstado() {
		return this.tarFluTipAuxEstado;
	}

	public void setTarFluTipAuxEstado(Boolean tarFluTipAuxEstado) {
		this.tarFluTipAuxEstado = tarFluTipAuxEstado;
	}

	public Set getSipTareasFlujoTipAuxEstadoses() {
		return this.sipTareasFlujoTipAuxEstadoses;
	}

	public void setSipTareasFlujoTipAuxEstadoses(
			Set sipTareasFlujoTipAuxEstadoses) {
		this.sipTareasFlujoTipAuxEstadoses = sipTareasFlujoTipAuxEstadoses;
	}

}