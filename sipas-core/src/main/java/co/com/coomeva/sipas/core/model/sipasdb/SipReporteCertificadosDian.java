package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;

/**
 * SipReporteCertificadosDian entity. @author MyEclipse Persistence Tools
 */
public class SipReporteCertificadosDian extends
		AbstractSipReporteCertificadosDian implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipReporteCertificadosDian() {
	}

	/** full constructor */
	public SipReporteCertificadosDian(Long codigoCertificado, Long agno,
			Long asoNumInt, String tipoIdentificacion, Long cedulaAsociado,
			String nombreAsociado, String ciudadAsociado, Long fechaNacimiento,
			String genero, Long edadIngresoProducto, Long edadActual,
			Date fechaUltimoPago, String estadoAsociadoCierreAgno,
			Long fechaIngresoCooperativa, Date fechaIngresoFondo,
			Long codigoProducto, String descripcionProducto, Date fechaAprobacion,
			String estadoProductoCierre, Date fechaPerseverancia,
			Double valorAcumuladoContribucion,
			Double valorAcumuladoContribuciones,
			Long numeroContribucionesPagadas, Long valorProteccionAgnoVigente,
			Long valorCuotaAgnoVigente, Double valoresRescate,
			Long reservaMatematica, Long reservaMatematicaUltimoPeriodo,
			Long valorAnualidad) {
		super(codigoCertificado, agno, asoNumInt, tipoIdentificacion,
				cedulaAsociado, nombreAsociado, ciudadAsociado,
				fechaNacimiento, genero, edadIngresoProducto, edadActual,
				fechaUltimoPago, estadoAsociadoCierreAgno,
				fechaIngresoCooperativa, fechaIngresoFondo, codigoProducto,
				descripcionProducto, fechaAprobacion, estadoProductoCierre, fechaPerseverancia,
				valorAcumuladoContribucion, valorAcumuladoContribuciones,
				numeroContribucionesPagadas, valorProteccionAgnoVigente,
				valorCuotaAgnoVigente, valoresRescate, reservaMatematica,
				reservaMatematicaUltimoPeriodo, valorAnualidad);
	}

}
