package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSipDocumentosReqSolicitud entity provides the base persistence
 * definition of the SipDocumentosReqSolicitud entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipDocumentosReqSolicitud implements
		java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1456810491413086060L;
	private SipDocumentosReqSolicitudId id;
	private SipTipoSolicitud sipTipoSolicitud;
	private Boolean docRecEstado;
	private Boolean docRecObligatorio;
	private Set sipDetalleDocSolicituds = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSipDocumentosReqSolicitud() {
	}

	/** minimal constructor */
	public AbstractSipDocumentosReqSolicitud(SipDocumentosReqSolicitudId id,
			SipTipoSolicitud sipTipoSolicitud, Boolean docRecEstado) {
		this.id = id;
		this.sipTipoSolicitud = sipTipoSolicitud;
		this.docRecEstado = docRecEstado;
	}

	/** full constructor */
	public AbstractSipDocumentosReqSolicitud(SipDocumentosReqSolicitudId id,
			SipTipoSolicitud sipTipoSolicitud, Boolean docRecEstado,
			Set sipDetalleDocSolicituds) {
		this.id = id;
		this.sipTipoSolicitud = sipTipoSolicitud;
		this.docRecEstado = docRecEstado;
		this.sipDetalleDocSolicituds = sipDetalleDocSolicituds;
	}

	// Property accessors

	public SipDocumentosReqSolicitudId getId() {
		return this.id;
	}

	public void setId(SipDocumentosReqSolicitudId id) {
		this.id = id;
	}

	public SipTipoSolicitud getSipTipoSolicitud() {
		return this.sipTipoSolicitud;
	}

	public void setSipTipoSolicitud(SipTipoSolicitud sipTipoSolicitud) {
		this.sipTipoSolicitud = sipTipoSolicitud;
	}

	public Boolean getDocRecEstado() {
		return this.docRecEstado;
	}

	public void setDocRecEstado(Boolean docRecEstado) {
		this.docRecEstado = docRecEstado;
	}

	public Set getSipDetalleDocSolicituds() {
		return this.sipDetalleDocSolicituds;
	}

	public void setSipDetalleDocSolicituds(Set sipDetalleDocSolicituds) {
		this.sipDetalleDocSolicituds = sipDetalleDocSolicituds;
	}
	
	public void setDocRecObligatorio(Boolean docRecObligatorio) {
		this.docRecObligatorio = docRecObligatorio;
	}
	
	public Boolean getDocRecObligatorio() {
		return docRecObligatorio;
	}

}