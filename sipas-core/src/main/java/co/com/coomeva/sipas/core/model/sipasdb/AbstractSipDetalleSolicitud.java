package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;

/**
 * AbstractSipDetalleSolicitud entity provides the base persistence definition
 * of the SipDetalleSolicitud entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipDetalleSolicitud implements
		java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 4888638216775545499L;
	private SipDetalleSolicitudId id;
	private SipSolicitud sipSolicitud;
	private Long solConsecutivoProteccion;
	private String solObservaciones;
	private Date gsrrFechaRetiro;
	private Date gsrrFechaActa;
	private Boolean gsrrRequiereExamMed;
	private Long gsrrNumeroActa;
	private Byte gsrrCodigoConcepto;
	private Byte gsrrCodigoCausaNegacion;
	private Date gscfnNuevaFechaNac;
	private Long gscfnTipoError;
	private Double gscfnValorAsociadoCuota;
	private Double gscfnValorAsociadoPro;
	private Double gscfnValorFondoCuota;
	private Double gscfnValorFondoPro;
	private Date gscfnFechaNacOriginal;
	private Long gscfnTipoSolucion;
	private String gsaPerInicio;
	private String gsaPerFin;
	private Long gsaValorAjuste;
	private String gsaCausaAjuste;
	private Short gsaTipoAjuste;
	private String gspdPerInicio;
	private String gspdPerFin;
	private Long gspdValorDesc;
	
	private Boolean gsrrActivacionProtecciones;
	private Boolean gsrrActivacionCtaInactiva;
	private Boolean gsrrActivacionCtaCompletas;
	private Boolean gsrrCreacionInactividad;
	private Boolean gsrrActivacionBeneficiarios;
	
	private Date gscfnNuevaFechaNacCast;

	// Constructors

	/** default constructor */
	public AbstractSipDetalleSolicitud() {
	}

	/** minimal constructor */
	public AbstractSipDetalleSolicitud(SipDetalleSolicitudId id,
			SipSolicitud sipSolicitud) {
		this.id = id;
		this.sipSolicitud = sipSolicitud;
	}

	/** full constructor */
	public AbstractSipDetalleSolicitud(SipDetalleSolicitudId id,
			SipSolicitud sipSolicitud, Long solConsecutivoProteccion,
			String solObservaciones, Date gsrrFechaRetiro, Date gsrrFechaActa,
			Boolean gsrrRequiereExamMed, Long gsrrNumeroActa,
			Byte gsrrCodigoConcepto, Byte gsrrCodigoCausaNegacion,
			Date gscfnNuevaFechaNac, String gsaPerInicio, String gsaPerFin,
			Long gsaValorAjuste, String gsaCausaAjuste, Short gsaTipoAjuste,
			String gspdPerInicio, String gspdPerFin, Long gspdValorDesc,Long gscfnTipoError, 
			Double gscfnValorAsociadoCuota, Double gscfnValorAsociadoPro,Double gscfnValorFondoCuota,
			Double gscfnValorFondoPro,Long gscfnTipoSolucion,Date gscfnFechaNacOriginal) {
		this.id = id;
		this.sipSolicitud = sipSolicitud;
		this.solConsecutivoProteccion = solConsecutivoProteccion;
		this.solObservaciones = solObservaciones;
		this.gsrrFechaRetiro = gsrrFechaRetiro;
		this.gsrrFechaActa = gsrrFechaActa;
		this.gsrrRequiereExamMed = gsrrRequiereExamMed;
		this.gsrrNumeroActa = gsrrNumeroActa;
		this.gsrrCodigoConcepto = gsrrCodigoConcepto;
		this.gsrrCodigoCausaNegacion = gsrrCodigoCausaNegacion;
		this.gscfnNuevaFechaNac = gscfnNuevaFechaNac;
		this.gsaPerInicio = gsaPerInicio;
		this.gsaPerFin = gsaPerFin;
		this.gsaValorAjuste = gsaValorAjuste;
		this.gsaCausaAjuste = gsaCausaAjuste;
		this.gsaTipoAjuste = gsaTipoAjuste;
		this.gspdPerInicio = gspdPerInicio;
		this.gspdPerFin = gspdPerFin;
		this.gspdValorDesc = gspdValorDesc;
		this.gscfnTipoError=gscfnTipoError;
		this.gscfnValorAsociadoCuota=gscfnValorAsociadoCuota;
		this.gscfnValorAsociadoPro=gscfnValorAsociadoPro;
		this.gscfnValorFondoCuota=gscfnValorFondoCuota;
		this.gscfnValorFondoPro=gscfnValorFondoPro;
		this.gscfnTipoSolucion=gscfnTipoSolucion;
		this.gscfnFechaNacOriginal=gscfnFechaNacOriginal;
	}

	// Property accessors

	public SipDetalleSolicitudId getId() {
		return this.id;
	}

	public void setId(SipDetalleSolicitudId id) {
		this.id = id;
	}

	public SipSolicitud getSipSolicitud() {
		return this.sipSolicitud;
	}

	public void setSipSolicitud(SipSolicitud sipSolicitud) {
		this.sipSolicitud = sipSolicitud;
	}

	public Long getSolConsecutivoProteccion() {
		return this.solConsecutivoProteccion;
	}

	public void setSolConsecutivoProteccion(Long solConsecutivoProteccion) {
		this.solConsecutivoProteccion = solConsecutivoProteccion;
	}

	public String getSolObservaciones() {
		return this.solObservaciones;
	}

	public void setSolObservaciones(String solObservaciones) {
		this.solObservaciones = solObservaciones;
	}

	public Date getGsrrFechaRetiro() {
		return this.gsrrFechaRetiro;
	}

	public void setGsrrFechaRetiro(Date gsrrFechaRetiro) {
		this.gsrrFechaRetiro = gsrrFechaRetiro;
	}

	public Date getGsrrFechaActa() {
		return this.gsrrFechaActa;
	}

	public void setGsrrFechaActa(Date gsrrFechaActa) {
		this.gsrrFechaActa = gsrrFechaActa;
	}

	public Boolean getGsrrRequiereExamMed() {
		return this.gsrrRequiereExamMed;
	}

	public void setGsrrRequiereExamMed(Boolean gsrrRequiereExamMed) {
		this.gsrrRequiereExamMed = gsrrRequiereExamMed;
	}

	public Long getGsrrNumeroActa() {
		return this.gsrrNumeroActa;
	}

	public void setGsrrNumeroActa(Long gsrrNumeroActa) {
		this.gsrrNumeroActa = gsrrNumeroActa;
	}

	public Byte getGsrrCodigoConcepto() {
		return this.gsrrCodigoConcepto;
	}

	public void setGsrrCodigoConcepto(Byte gsrrCodigoConcepto) {
		this.gsrrCodigoConcepto = gsrrCodigoConcepto;
	}

	public Byte getGsrrCodigoCausaNegacion() {
		return this.gsrrCodigoCausaNegacion;
	}

	public void setGsrrCodigoCausaNegacion(Byte gsrrCodigoCausaNegacion) {
		this.gsrrCodigoCausaNegacion = gsrrCodigoCausaNegacion;
	}

	public Date getGscfnNuevaFechaNac() {
		if(gscfnNuevaFechaNac==null)
			gscfnNuevaFechaNac=gscfnNuevaFechaNacCast;
		return gscfnNuevaFechaNac;
	}

	public void setGscfnNuevaFechaNac(Date gscfnNuevaFechaNac) {
		this.gscfnNuevaFechaNac = gscfnNuevaFechaNac;
	}

	public String getGsaPerInicio() {
		return this.gsaPerInicio;
	}

	public void setGsaPerInicio(String gsaPerInicio) {
		this.gsaPerInicio = gsaPerInicio;
	}

	public String getGsaPerFin() {
		return this.gsaPerFin;
	}

	public void setGsaPerFin(String gsaPerFin) {
		this.gsaPerFin = gsaPerFin;
	}

	public Long getGsaValorAjuste() {
		return this.gsaValorAjuste;
	}

	public void setGsaValorAjuste(Long gsaValorAjuste) {
		this.gsaValorAjuste = gsaValorAjuste;
	}

	public String getGsaCausaAjuste() {
		return this.gsaCausaAjuste;
	}

	public void setGsaCausaAjuste(String gsaCausaAjuste) {
		this.gsaCausaAjuste = gsaCausaAjuste;
	}

	public Short getGsaTipoAjuste() {
		return this.gsaTipoAjuste;
	}

	public void setGsaTipoAjuste(Short gsaTipoAjuste) {
		this.gsaTipoAjuste = gsaTipoAjuste;
	}

	public String getGspdPerInicio() {
		return this.gspdPerInicio;
	}

	public void setGspdPerInicio(String gspdPerInicio) {
		this.gspdPerInicio = gspdPerInicio;
	}

	public String getGspdPerFin() {
		return this.gspdPerFin;
	}

	public void setGspdPerFin(String gspdPerFin) {
		this.gspdPerFin = gspdPerFin;
	}

	public Long getGspdValorDesc() {
		return this.gspdValorDesc;
	}

	public void setGspdValorDesc(Long gspdValorDesc) {
		this.gspdValorDesc = gspdValorDesc;
	}

	public void setGscfnTipoError(Long gscfnTipoError) {
		this.gscfnTipoError = gscfnTipoError;
	}

	public Long getGscfnTipoError() {
		return gscfnTipoError;
	}

	public void setGscfnValorAsociadoCuota(Double gscfnValorAsociadoCuota) {
		this.gscfnValorAsociadoCuota = gscfnValorAsociadoCuota;
	}

	public Double getGscfnValorAsociadoCuota() {
		return gscfnValorAsociadoCuota;
	}

	public void setGscfnValorAsociadoPro(Double gscfnValorAsociadoPro) {
		this.gscfnValorAsociadoPro = gscfnValorAsociadoPro;
	}

	public Double getGscfnValorAsociadoPro() {
		return gscfnValorAsociadoPro;
	}

	public void setGscfnValorFondoCuota(Double gscfnValorFondoCuota) {
		this.gscfnValorFondoCuota = gscfnValorFondoCuota;
	}

	public Double getGscfnValorFondoCuota() {
		return gscfnValorFondoCuota;
	}

	public void setGscfnValorFondoPro(Double gscfnValorFondoPro) {
		this.gscfnValorFondoPro = gscfnValorFondoPro;
	}

	public Double getGscfnValorFondoPro() {
		return gscfnValorFondoPro;
	}

	public void setGscfnTipoSolucion(Long gscfnTipoSolucion) {
		this.gscfnTipoSolucion = gscfnTipoSolucion;
	}

	public Long getGscfnTipoSolucion() {
		return gscfnTipoSolucion;
	}

	public Boolean getGsrrActivacionProtecciones() {
		return gsrrActivacionProtecciones;
	}

	public void setGsrrActivacionProtecciones(Boolean gsrrActivacionProtecciones) {
		this.gsrrActivacionProtecciones = gsrrActivacionProtecciones;
	}

	public Boolean getGsrrActivacionCtaInactiva() {
		return gsrrActivacionCtaInactiva;
	}

	public void setGsrrActivacionCtaInactiva(Boolean gsrrActivacionCtaInactiva) {
		this.gsrrActivacionCtaInactiva = gsrrActivacionCtaInactiva;
	}

	public Boolean getGsrrActivacionCtaCompletas() {
		return gsrrActivacionCtaCompletas;
	}

	public void setGsrrActivacionCtaCompletas(Boolean gsrrActivacionCtaCompletas) {
		this.gsrrActivacionCtaCompletas = gsrrActivacionCtaCompletas;
	}

	public Boolean getGsrrCreacionInactividad() {
		return gsrrCreacionInactividad;
	}

	public void setGsrrCreacionInactividad(Boolean gsrrCreacionInactividad) {
		this.gsrrCreacionInactividad = gsrrCreacionInactividad;
	}

	public Boolean getGsrrActivacionBeneficiarios() {
		return gsrrActivacionBeneficiarios;
	}

	public void setGsrrActivacionBeneficiarios(Boolean gsrrActivacionBeneficiarios) {
		this.gsrrActivacionBeneficiarios = gsrrActivacionBeneficiarios;
	}

	public void setGscfnFechaNacOriginal(Date gscfnFechaNacOriginal) {
		this.gscfnFechaNacOriginal = gscfnFechaNacOriginal;
	}

	public Date getGscfnFechaNacOriginal() {
		return gscfnFechaNacOriginal;
	}

	public Date getGscfnNuevaFechaNacCast() {
		return gscfnNuevaFechaNacCast;
	}

	public void setGscfnNuevaFechaNacCast(Date gscfnNuevaFechaNacCast) {
		this.gscfnNuevaFechaNacCast = gscfnNuevaFechaNacCast;
	}
	
	

}