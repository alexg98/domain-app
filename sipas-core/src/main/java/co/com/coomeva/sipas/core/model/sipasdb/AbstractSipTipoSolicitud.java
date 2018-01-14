package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSipTipoSolicitud entity provides the base persistence definition of
 * the SipTipoSolicitud entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipTipoSolicitud implements java.io.Serializable {

	// Fields

	private Short tipCodigo;
	private String tipNombre;
	private String tipDescripcion;
	private Set sipDocumentosReqSolicituds = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSipTipoSolicitud() {
	}

	/** minimal constructor */
	public AbstractSipTipoSolicitud(Short tipCodigo, String tipNombre) {
		this.tipCodigo = tipCodigo;
		this.tipNombre = tipNombre;
	}

	/** full constructor */
	public AbstractSipTipoSolicitud(Short tipCodigo, String tipNombre,
			String tipDescripcion, Set sipDocumentosReqSolicituds) {
		this.tipCodigo = tipCodigo;
		this.tipNombre = tipNombre;
		this.tipDescripcion = tipDescripcion;
		this.sipDocumentosReqSolicituds = sipDocumentosReqSolicituds;
	}

	// Property accessors

	public Short getTipCodigo() {
		return this.tipCodigo;
	}

	public void setTipCodigo(Short tipCodigo) {
		this.tipCodigo = tipCodigo;
	}

	public String getTipNombre() {
		return this.tipNombre;
	}

	public void setTipNombre(String tipNombre) {
		this.tipNombre = tipNombre;
	}

	public String getTipDescripcion() {
		return this.tipDescripcion;
	}

	public void setTipDescripcion(String tipDescripcion) {
		this.tipDescripcion = tipDescripcion;
	}

	public Set getSipDocumentosReqSolicituds() {
		return this.sipDocumentosReqSolicituds;
	}

	public void setSipDocumentosReqSolicituds(Set sipDocumentosReqSolicituds) {
		this.sipDocumentosReqSolicituds = sipDocumentosReqSolicituds;
	}

}