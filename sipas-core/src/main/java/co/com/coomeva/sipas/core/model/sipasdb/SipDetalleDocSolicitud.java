package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;

/**
 * SipDetalleDocSolicitud entity. @author MyEclipse Persistence Tools
 */
public class SipDetalleDocSolicitud extends AbstractSipDetalleDocSolicitud
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipDetalleDocSolicitud() {
	}

	/** minimal constructor */
	public SipDetalleDocSolicitud(SipDetalleDocSolicitudId id,
			SipSolicitud sipSolicitud,
			SipDocumentosReqSolicitud sipDocumentosReqSolicitud,
			Date docRecFechaEntrega) {
		super(id, sipSolicitud, sipDocumentosReqSolicitud, docRecFechaEntrega);
	}

	/** full constructor */
	public SipDetalleDocSolicitud(SipDetalleDocSolicitudId id,
			SipSolicitud sipSolicitud,
			SipDocumentosReqSolicitud sipDocumentosReqSolicitud,
			Date docRecFechaEntrega, String docRecObservaciones) {
		super(id, sipSolicitud, sipDocumentosReqSolicitud, docRecFechaEntrega,
				docRecObservaciones);
	}

}
