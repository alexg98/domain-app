package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSipPreguntasTipo entity provides the base persistence definition of
 * the SipPreguntasTipo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipPreguntasTipo implements java.io.Serializable {

	// Fields

	private Long pretCodigo;
	private String pretDesc;
	private Set sipPreguntases = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSipPreguntasTipo() {
	}

	/** minimal constructor */
	public AbstractSipPreguntasTipo(Long pretCodigo, String pretDesc) {
		this.pretCodigo = pretCodigo;
		this.pretDesc = pretDesc;
	}

	/** full constructor */
	public AbstractSipPreguntasTipo(Long pretCodigo, String pretDesc,
			Set sipPreguntases) {
		this.pretCodigo = pretCodigo;
		this.pretDesc = pretDesc;
		this.sipPreguntases = sipPreguntases;
	}

	// Property accessors

	public Long getPretCodigo() {
		return this.pretCodigo;
	}

	public void setPretCodigo(Long pretCodigo) {
		this.pretCodigo = pretCodigo;
	}

	public String getPretDesc() {
		return this.pretDesc;
	}

	public void setPretDesc(String pretDesc) {
		this.pretDesc = pretDesc;
	}

	public Set getSipPreguntases() {
		return this.sipPreguntases;
	}

	public void setSipPreguntases(Set sipPreguntases) {
		this.sipPreguntases = sipPreguntases;
	}

}