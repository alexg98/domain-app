package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * SipDetalleDocSolicitudId entity. @author MyEclipse Persistence Tools
 */
public class SipDetalleDocSolicitudId extends AbstractSipDetalleDocSolicitudId
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipDetalleDocSolicitudId() {
	}

	/** full constructor */
	public SipDetalleDocSolicitudId(Long solCodigo, Short tipCodigo,
			Short docReqCodigo) {
		super(solCodigo, tipCodigo, docReqCodigo);
	}

}
