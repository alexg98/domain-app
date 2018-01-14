package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Set;

/**
 * SipDocumentosReqSolicitud entity. @author MyEclipse Persistence Tools
 */
public class SipDocumentosReqSolicitud extends AbstractSipDocumentosReqSolicitud implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipDocumentosReqSolicitud() {
	}

	/** minimal constructor */
	public SipDocumentosReqSolicitud(SipDocumentosReqSolicitudId id,
			SipTipoSolicitud sipTipoSolicitud, Boolean docRecEstado) {
		super(id, sipTipoSolicitud, docRecEstado);
	}

	/** full constructor */
	public SipDocumentosReqSolicitud(SipDocumentosReqSolicitudId id,
			SipTipoSolicitud sipTipoSolicitud, Boolean docRecEstado,
			Set sipDetalleDocSolicituds) {
		super(id, sipTipoSolicitud, docRecEstado, sipDetalleDocSolicituds);
	}

}
