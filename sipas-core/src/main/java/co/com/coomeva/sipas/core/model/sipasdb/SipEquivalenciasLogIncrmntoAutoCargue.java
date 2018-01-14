package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * SipEquivalenciasLogIncrmntoAutoCargue entity. @author MyEclipse Persistence
 * Tools
 */
public class SipEquivalenciasLogIncrmntoAutoCargue extends AbstractSipEquivalenciasLogIncrmntoAutoCargue implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipEquivalenciasLogIncrmntoAutoCargue() {
	}

	/** minimal constructor */
	public SipEquivalenciasLogIncrmntoAutoCargue(Long iacCodigo) {
		super(iacCodigo);
	}

	/** full constructor */
	public SipEquivalenciasLogIncrmntoAutoCargue(Long iacCodigo, Timestamp iacRanFechaCargue, BigDecimal iacIdRegistro,
			Timestamp iacFechaRegistro, BigDecimal iacIdentificacionAsociado, String iacProducto, String iacPromocion,
			String iacValorIncremento, Date iacFechaVenta, Date iacFechaNacimiento, String iacPreexistencia,
			String iacPeso, String iacTalla, Double iacIndiceMasaCorporal, String iacPregunta1,
			String iacPregunta2, String iacPregunta3, String iacPregunta4, String iacPregunta5, String iacPregunta6,
			String iacResultadoCargue, String iacNumeroSolicitud, String iacEstadoSolicitud, String iacObservaciones, String iacResultadoCargueDesc) {
		super(iacCodigo, iacRanFechaCargue, iacIdRegistro, iacFechaRegistro, iacIdentificacionAsociado, iacProducto,
				iacPromocion, iacValorIncremento, iacFechaVenta, iacFechaNacimiento, iacPreexistencia, iacPeso,
				iacTalla, iacIndiceMasaCorporal, iacPregunta1, iacPregunta2, iacPregunta3, iacPregunta4, iacPregunta5,
				iacPregunta6, iacResultadoCargue, iacNumeroSolicitud, iacEstadoSolicitud, iacObservaciones, iacResultadoCargueDesc);
	}

}
