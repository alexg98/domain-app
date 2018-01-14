package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;
import java.util.Set;

/**
 * SipSolicitud entity. @author MyEclipse Persistence Tools
 */
public class SipSolicitud extends AbstractSipSolicitud implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipSolicitud() {
	}

	/** minimal constructor */
	public SipSolicitud(Long solCodigo, Timestamp solFechaRegistro,
			Timestamp solFechaSolicitud, Long solAsoNumint, Short solTipo,
			String solOfiRadicacion, String solUsuario, Byte solEstado) {
		super(solCodigo, solFechaRegistro, solFechaSolicitud, solAsoNumint,
				solTipo, solOfiRadicacion, solUsuario, solEstado);
	}

	/** full constructor */
	public SipSolicitud(Long solCodigo, Timestamp solFechaRegistro,
			Timestamp solFechaSolicitud, Long solAsoNumint, Short solTipo,
			String solOfiRadicacion, String solUsuario, Byte solEstado,Long solValorTotalDescapitalizacion,
			Set sipDetalleDocSolicituds, Set sipDetalleSolicituds) {
		super(solCodigo, solFechaRegistro, solFechaSolicitud, solAsoNumint,
				solTipo, solOfiRadicacion, solUsuario, solEstado,solValorTotalDescapitalizacion,
				sipDetalleDocSolicituds, sipDetalleSolicituds);
	}

}
