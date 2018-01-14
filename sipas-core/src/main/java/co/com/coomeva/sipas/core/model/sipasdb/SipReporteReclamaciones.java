package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;

/**
 * SipReporteReclamaciones entity. @author MyEclipse Persistence Tools
 */
public class SipReporteReclamaciones extends AbstractSipReporteReclamaciones
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipReporteReclamaciones() {
	}

	/** minimal constructor */
	public SipReporteReclamaciones(Long consecutivo) {
		super(consecutivo);
	}

	/** full constructor */
	public SipReporteReclamaciones(Long consecutivo,
			Long codigoReclamacion, Long idTaskInstance,
			Date fechaUltimaAccion, Long diasGestion, String tareaFlujo,
			Long idSubEstado, String subEstado, Long idTipoServicio,
			String tipoServicio, String tipoSolicitud, Long idAnalistaActual,
			String analistaActual, Date fechaRadicacion, Long asoNumint,
			Long nitCli, String nombreAsociado, Long idRegionalAsociado,
			String regionalAsociado, Long idOficinaVinculacion,
			String oficinaVinculacion, Long idUsuarioTraslado,
			String usuarioTraslado) {
		super(consecutivo, codigoReclamacion, idTaskInstance,
				fechaUltimaAccion, diasGestion, tareaFlujo, idSubEstado,
				subEstado, idTipoServicio, tipoServicio, tipoSolicitud,
				idAnalistaActual, analistaActual, fechaRadicacion, asoNumint,
				nitCli, nombreAsociado, idRegionalAsociado, regionalAsociado,
				idOficinaVinculacion, oficinaVinculacion, idUsuarioTraslado,
				usuarioTraslado);
	}

}
