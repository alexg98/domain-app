package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;

/**
 * SipLogIncrementosAuto entity. @author MyEclipse Persistence Tools
 */
public class SipLogIncrementosAuto extends AbstractSipLogIncrementosAuto
		implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	// Constructors

	/** default constructor */
	public SipLogIncrementosAuto() {
	}

	/** minimal constructor */
	public SipLogIncrementosAuto(Long incrCodigo,
			String incrRegistroOriginal, Long incrResultado,
			String incrUsuario, Date incrFechaRegistro, Long incrCodigoLogCod) {
		super(incrCodigo, incrRegistroOriginal, incrResultado, incrUsuario,
				incrFechaRegistro, incrCodigoLogCod);
	}

	/** full constructor */
	public SipLogIncrementosAuto(Long incrCodigo,
			String incrRegistroOriginal, Long incrResultado,
			Long incrFlujo, String incrEstadoProteccion, 
			String incrObservaciones, String incrResultadoDesc,String incrUsuario, 
			Date incrFechaRegistro, Long incrCodigoLogCod) {
		super(incrCodigo, incrRegistroOriginal, incrResultado,
				incrFlujo, incrEstadoProteccion, incrObservaciones, incrResultadoDesc, incrUsuario, 
				incrFechaRegistro, incrCodigoLogCod);
	}

}
