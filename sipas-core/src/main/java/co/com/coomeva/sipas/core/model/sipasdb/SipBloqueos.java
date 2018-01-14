package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.util.Date;

/**
 * SipBloqueos entity. @author MyEclipse Persistence Tools
 */
public class SipBloqueos extends AbstractSipBloqueos implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipBloqueos() {
	}

	/** minimal constructor */
	public SipBloqueos(Long bloCodigo, Long recCodigo, Long asoNumint,
			String bloObservacion, Long bloEstadoBloqueo,
			Long bloUsuarioSistema,Date bloFecha) {
		super(bloCodigo, recCodigo, asoNumint, bloObservacion,
				bloEstadoBloqueo, bloUsuarioSistema,bloFecha);
	}

	/** full constructor */
	public SipBloqueos(Long bloCodigo, Long recCodigo, Long asoNumint,
			Long bloTipoAuxilio, Long bloUsuarioBloqueado,
			String bloObservacion, Long bloEstadoBloqueo,
			Long bloUsuarioSistema,Date bloFecha) {
		super(bloCodigo, recCodigo, asoNumint, bloTipoAuxilio,
				bloUsuarioBloqueado, bloObservacion, bloEstadoBloqueo,
				bloUsuarioSistema,bloFecha);
	}

}
