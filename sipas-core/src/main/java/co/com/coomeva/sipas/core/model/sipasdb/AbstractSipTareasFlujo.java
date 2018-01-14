package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSipTareasFlujo entity provides the base persistence definition of the
 * SipTareasFlujo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipTareasFlujo implements java.io.Serializable {

	// Fields

	private Long tarFluCodigo;
	private String tarFluNombre;
	private Boolean tarFluEstado;
	private Set sipTareasFlujoTipAuxes = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSipTareasFlujo() {
	}

	/** minimal constructor */
	public AbstractSipTareasFlujo(Long tarFluCodigo, String tarFluNombre,
			Boolean tarFluEstado) {
		this.tarFluCodigo = tarFluCodigo;
		this.tarFluNombre = tarFluNombre;
		this.tarFluEstado = tarFluEstado;
	}

	/** full constructor */
	public AbstractSipTareasFlujo(Long tarFluCodigo, String tarFluNombre,
			Boolean tarFluEstado, Set sipTareasFlujoTipAuxes) {
		this.tarFluCodigo = tarFluCodigo;
		this.tarFluNombre = tarFluNombre;
		this.tarFluEstado = tarFluEstado;
		this.sipTareasFlujoTipAuxes = sipTareasFlujoTipAuxes;
	}

	// Property accessors

	public Long getTarFluCodigo() {
		return this.tarFluCodigo;
	}

	public void setTarFluCodigo(Long tarFluCodigo) {
		this.tarFluCodigo = tarFluCodigo;
	}

	public String getTarFluNombre() {
		return this.tarFluNombre;
	}

	public void setTarFluNombre(String tarFluNombre) {
		this.tarFluNombre = tarFluNombre;
	}

	public Boolean getTarFluEstado() {
		return this.tarFluEstado;
	}

	public void setTarFluEstado(Boolean tarFluEstado) {
		this.tarFluEstado = tarFluEstado;
	}

	public Set getSipTareasFlujoTipAuxes() {
		return this.sipTareasFlujoTipAuxes;
	}

	public void setSipTareasFlujoTipAuxes(Set sipTareasFlujoTipAuxes) {
		this.sipTareasFlujoTipAuxes = sipTareasFlujoTipAuxes;
	}

}