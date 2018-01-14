package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * AbstractSipHomologacionDiagnostico entity provides the base persistence
 * definition of the SipHomologacionDiagnostico entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipHomologacionDiagnostico implements
		java.io.Serializable {

	// Fields

	private SipHomologacionDiagnosticoId id;
	private String detalle;

	// Constructors

	/** default constructor */
	public AbstractSipHomologacionDiagnostico() {
	}

	/** minimal constructor */
	public AbstractSipHomologacionDiagnostico(SipHomologacionDiagnosticoId id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractSipHomologacionDiagnostico(SipHomologacionDiagnosticoId id,
			String detalle) {
		this.id = id;
		this.detalle = detalle;
	}

	// Property accessors

	public SipHomologacionDiagnosticoId getId() {
		return this.id;
	}

	public void setId(SipHomologacionDiagnosticoId id) {
		this.id = id;
	}

	public String getDetalle() {
		return this.detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

}