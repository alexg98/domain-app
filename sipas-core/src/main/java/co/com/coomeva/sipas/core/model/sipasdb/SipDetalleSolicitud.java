package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;

/**
 * SipDetalleSolicitud entity. @author MyEclipse Persistence Tools
 */
public class SipDetalleSolicitud extends AbstractSipDetalleSolicitud implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipDetalleSolicitud() {
	}

	/** minimal constructor */
	public SipDetalleSolicitud(SipDetalleSolicitudId id,
			SipSolicitud sipSolicitud) {
		super(id, sipSolicitud);
	}

	/** full constructor */
	public SipDetalleSolicitud(SipDetalleSolicitudId id,
			SipSolicitud sipSolicitud, Long solConsecutivoProteccion,
			String solObservaciones, Date gsrrFechaRetiro, Date gsrrFechaActa,
			Boolean gsrrRequiereExamMed, Long gsrrNumeroActa,
			Byte gsrrCodigoConcepto, Byte gsrrCodigoCausaNegacion,
			Date gscfnNuevaFechaNac, String gsaPerInicio, String gsaPerFin,
			Long gsaValorAjuste, String gsaCausaAjuste, Short gsaTipoAjuste,
			String gspdPerInicio, String gspdPerFin, Long gspdValorDesc,Long gscfnTipoError, 
			Double gscfnValorAsociadoCuota, Double gscfnValorAsociadoPro,Double gscfnValorFondoCuota,
			Double gscfnValorFondoPro,Long gscfnTipoSolucion,Date gscfnFechaNacOriginal) {
		super(id, sipSolicitud, solConsecutivoProteccion, solObservaciones,
				gsrrFechaRetiro, gsrrFechaActa, gsrrRequiereExamMed,
				gsrrNumeroActa, gsrrCodigoConcepto, gsrrCodigoCausaNegacion,
				gscfnNuevaFechaNac, gsaPerInicio, gsaPerFin, gsaValorAjuste,
				gsaCausaAjuste, gsaTipoAjuste, gspdPerInicio, gspdPerFin,
				gspdValorDesc,gscfnTipoError,gscfnValorAsociadoCuota,gscfnValorAsociadoPro,
				gscfnValorFondoCuota,gscfnValorFondoPro,gscfnTipoSolucion,gscfnFechaNacOriginal);
	}

}
