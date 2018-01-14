package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * SipHomologacionDiagnostico entity. @author MyEclipse Persistence Tools
 */
public class SipHomologacionDiagnostico extends
		AbstractSipHomologacionDiagnostico implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipHomologacionDiagnostico() {
	}

	/** minimal constructor */
	public SipHomologacionDiagnostico(SipHomologacionDiagnosticoId id) {
		super(id);
	}

	/** full constructor */
	public SipHomologacionDiagnostico(SipHomologacionDiagnosticoId id,
			String detalle) {
		super(id, detalle);
	}

}
