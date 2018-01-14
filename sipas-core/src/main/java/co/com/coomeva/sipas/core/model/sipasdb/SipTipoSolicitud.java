package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Set;

/**
 * SipTipoSolicitud entity. @author MyEclipse Persistence Tools
 */
public class SipTipoSolicitud extends AbstractSipTipoSolicitud implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipTipoSolicitud() {
	}

	/** minimal constructor */
	public SipTipoSolicitud(Short tipCodigo, String tipNombre) {
		super(tipCodigo, tipNombre);
	}

	/** full constructor */
	public SipTipoSolicitud(Short tipCodigo, String tipNombre,
			String tipDescripcion, Set sipDocumentosReqSolicituds) {
		super(tipCodigo, tipNombre, tipDescripcion, sipDocumentosReqSolicituds);
	}

}
