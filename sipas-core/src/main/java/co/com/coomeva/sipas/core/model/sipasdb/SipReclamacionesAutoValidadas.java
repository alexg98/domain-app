package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.util.Date;

/**
 * SipReclamacionesAutoValidadas entity. @author MyEclipse Persistence Tools
 */
public class SipReclamacionesAutoValidadas extends
		AbstractSipReclamacionesAutoValidadas implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipReclamacionesAutoValidadas() {
	}

	/** full constructor */
	public SipReclamacionesAutoValidadas(Long ravCodigo,
			Long recCodigo, Long ravEstado, String ravObservacion,
			Date ravFechaValidacion, Long ravUsuarioSistema) {
		super(ravCodigo, recCodigo, ravEstado, ravObservacion,
				ravFechaValidacion, ravUsuarioSistema);
	}

}
