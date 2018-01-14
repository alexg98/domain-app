package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * AbstractSipTareasFlujoTipAuxEstados entity provides the base persistence
 * definition of the SipTareasFlujoTipAuxEstados entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipTareasFlujoTipAuxEstados implements
		java.io.Serializable {

	// Fields

	private SipTareasFlujoTipAuxEstadosId id;
	private Boolean tarFluTipAuxEstEstado;

	// Constructors

	/** default constructor */
	public AbstractSipTareasFlujoTipAuxEstados() {
	}

	/** full constructor */
	public AbstractSipTareasFlujoTipAuxEstados(
			SipTareasFlujoTipAuxEstadosId id, Boolean tarFluTipAuxEstEstado) {
		this.id = id;
		this.tarFluTipAuxEstEstado = tarFluTipAuxEstEstado;
	}

	// Property accessors

	public SipTareasFlujoTipAuxEstadosId getId() {
		return this.id;
	}

	public void setId(SipTareasFlujoTipAuxEstadosId id) {
		this.id = id;
	}

	public Boolean getTarFluTipAuxEstEstado() {
		return this.tarFluTipAuxEstEstado;
	}

	public void setTarFluTipAuxEstEstado(Boolean tarFluTipAuxEstEstado) {
		this.tarFluTipAuxEstEstado = tarFluTipAuxEstEstado;
	}

}