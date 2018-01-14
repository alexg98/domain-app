package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;

/**
 * AbstractSipDetalleDocSolicitud entity provides the base persistence
 * definition of the SipDetalleDocSolicitud entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipDetalleDocSolicitud implements
		java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 7589449968252889144L;
	private SipDetalleDocSolicitudId id;
	private SipSolicitud sipSolicitud;
	private SipDocumentosReqSolicitud sipDocumentosReqSolicitud;
	private Date docRecFechaEntrega;
	private String docRecObservaciones;

	// Constructors

	/** default constructor */
	public AbstractSipDetalleDocSolicitud() {
	}

	/** minimal constructor */
	public AbstractSipDetalleDocSolicitud(SipDetalleDocSolicitudId id,
			SipSolicitud sipSolicitud,
			SipDocumentosReqSolicitud sipDocumentosReqSolicitud,
			Date docRecFechaEntrega) {
		this.id = id;
		this.sipSolicitud = sipSolicitud;
		this.sipDocumentosReqSolicitud = sipDocumentosReqSolicitud;
		this.docRecFechaEntrega = docRecFechaEntrega;
	}

	/** full constructor */
	public AbstractSipDetalleDocSolicitud(SipDetalleDocSolicitudId id,
			SipSolicitud sipSolicitud,
			SipDocumentosReqSolicitud sipDocumentosReqSolicitud,
			Date docRecFechaEntrega, String docRecObservaciones) {
		this.id = id;
		this.sipSolicitud = sipSolicitud;
		this.sipDocumentosReqSolicitud = sipDocumentosReqSolicitud;
		this.docRecFechaEntrega = docRecFechaEntrega;
		this.docRecObservaciones = docRecObservaciones;
	}

	// Property accessors

	public SipDetalleDocSolicitudId getId() {
		return this.id;
	}

	public void setId(SipDetalleDocSolicitudId id) {
		this.id = id;
	}

	public SipSolicitud getSipSolicitud() {
		return this.sipSolicitud;
	}

	public void setSipSolicitud(SipSolicitud sipSolicitud) {
		this.sipSolicitud = sipSolicitud;
	}

	public SipDocumentosReqSolicitud getSipDocumentosReqSolicitud() {
		return this.sipDocumentosReqSolicitud;
	}

	public void setSipDocumentosReqSolicitud(
			SipDocumentosReqSolicitud sipDocumentosReqSolicitud) {
		this.sipDocumentosReqSolicitud = sipDocumentosReqSolicitud;
	}

	public Date getDocRecFechaEntrega() {
		return this.docRecFechaEntrega;
	}

	public void setDocRecFechaEntrega(Date docRecFechaEntrega) {
		this.docRecFechaEntrega = docRecFechaEntrega;
	}

	public String getDocRecObservaciones() {
		return this.docRecObservaciones;
	}

	public void setDocRecObservaciones(String docRecObservaciones) {
		this.docRecObservaciones = docRecObservaciones;
	}

}