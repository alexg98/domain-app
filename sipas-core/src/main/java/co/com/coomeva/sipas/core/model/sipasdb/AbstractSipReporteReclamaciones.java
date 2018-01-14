package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;


/**
 * AbstractSipReporteReclamaciones entity provides the base persistence
 * definition of the SipReporteReclamaciones entity.
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipReporteReclamaciones implements
		java.io.Serializable {

	// Fields

	private Long consecutivo;
	private Long codigoReclamacion;
	private Long idTaskInstance;
	private Date fechaUltimaAccion;
	private Long diasGestion;
	private String tareaFlujo;
	private Long idSubEstado;
	private String subEstado;
	private Long idTipoServicio;
	private String tipoServicio;
	private String tipoSolicitud;
	private Long idAnalistaActual;
	private String analistaActual;
	private Date fechaRadicacion;
	private Long asoNumint;
	private Long nitCli;
	private String nombreAsociado;
	private Long idRegionalAsociado;
	private String regionalAsociado;
	private Long idOficinaVinculacion;
	private String oficinaVinculacion;
	private Long idUsuarioTraslado;
	private String usuarioTraslado;

	// Constructors

	/** default constructor */
	public AbstractSipReporteReclamaciones() {
	}

	/** minimal constructor */
	public AbstractSipReporteReclamaciones(Long consecutivo) {
		this.consecutivo = consecutivo;
	}

	/** full constructor */
	public AbstractSipReporteReclamaciones(Long consecutivo,
			Long codigoReclamacion, Long idTaskInstance,
			Date fechaUltimaAccion, Long diasGestion, String tareaFlujo,
			Long idSubEstado, String subEstado, Long idTipoServicio,
			String tipoServicio, String tipoSolicitud, Long idAnalistaActual,
			String analistaActual, Date fechaRadicacion, Long asoNumint,
			Long nitCli, String nombreAsociado, Long idRegionalAsociado,
			String regionalAsociado, Long idOficinaVinculacion,
			String oficinaVinculacion, Long idUsuarioTraslado,
			String usuarioTraslado) {
		this.consecutivo = consecutivo;
		this.codigoReclamacion = codigoReclamacion;
		this.idTaskInstance = idTaskInstance;
		this.fechaUltimaAccion = fechaUltimaAccion;
		this.diasGestion = diasGestion;
		this.tareaFlujo = tareaFlujo;
		this.idSubEstado = idSubEstado;
		this.subEstado = subEstado;
		this.idTipoServicio = idTipoServicio;
		this.tipoServicio = tipoServicio;
		this.tipoSolicitud = tipoSolicitud;
		this.idAnalistaActual = idAnalistaActual;
		this.analistaActual = analistaActual;
		this.fechaRadicacion = fechaRadicacion;
		this.asoNumint = asoNumint;
		this.nitCli = nitCli;
		this.nombreAsociado = nombreAsociado;
		this.idRegionalAsociado = idRegionalAsociado;
		this.regionalAsociado = regionalAsociado;
		this.idOficinaVinculacion = idOficinaVinculacion;
		this.oficinaVinculacion = oficinaVinculacion;
		this.idUsuarioTraslado = idUsuarioTraslado;
		this.usuarioTraslado = usuarioTraslado;
	}

	// Property accessors

	public Long getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(Long consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Long getCodigoReclamacion() {
		return this.codigoReclamacion;
	}

	public void setCodigoReclamacion(Long codigoReclamacion) {
		this.codigoReclamacion = codigoReclamacion;
	}

	public Long getIdTaskInstance() {
		return this.idTaskInstance;
	}

	public void setIdTaskInstance(Long idTaskInstance) {
		this.idTaskInstance = idTaskInstance;
	}

	public Date getFechaUltimaAccion() {
		return this.fechaUltimaAccion;
	}

	public void setFechaUltimaAccion(Date fechaUltimaAccion) {
		this.fechaUltimaAccion = fechaUltimaAccion;
	}

	public Long getDiasGestion() {
		return this.diasGestion;
	}

	public void setDiasGestion(Long diasGestion) {
		this.diasGestion = diasGestion;
	}

	public String getTareaFlujo() {
		return this.tareaFlujo;
	}

	public void setTareaFlujo(String tareaFlujo) {
		this.tareaFlujo = tareaFlujo;
	}

	public Long getIdSubEstado() {
		return this.idSubEstado;
	}

	public void setIdSubEstado(Long idSubEstado) {
		this.idSubEstado = idSubEstado;
	}

	public String getSubEstado() {
		return this.subEstado;
	}

	public void setSubEstado(String subEstado) {
		this.subEstado = subEstado;
	}

	public Long getIdTipoServicio() {
		return this.idTipoServicio;
	}

	public void setIdTipoServicio(Long idTipoServicio) {
		this.idTipoServicio = idTipoServicio;
	}

	public String getTipoServicio() {
		return this.tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public String getTipoSolicitud() {
		return this.tipoSolicitud;
	}

	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}

	public Long getIdAnalistaActual() {
		return this.idAnalistaActual;
	}

	public void setIdAnalistaActual(Long idAnalistaActual) {
		this.idAnalistaActual = idAnalistaActual;
	}

	public String getAnalistaActual() {
		return this.analistaActual;
	}

	public void setAnalistaActual(String analistaActual) {
		this.analistaActual = analistaActual;
	}

	public Date getFechaRadicacion() {
		return this.fechaRadicacion;
	}

	public void setFechaRadicacion(Date fechaRadicacion) {
		this.fechaRadicacion = fechaRadicacion;
	}

	public Long getAsoNumint() {
		return this.asoNumint;
	}

	public void setAsoNumint(Long asoNumint) {
		this.asoNumint = asoNumint;
	}

	public Long getNitCli() {
		return this.nitCli;
	}

	public void setNitCli(Long nitCli) {
		this.nitCli = nitCli;
	}

	public String getNombreAsociado() {
		return this.nombreAsociado;
	}

	public void setNombreAsociado(String nombreAsociado) {
		this.nombreAsociado = nombreAsociado;
	}

	public Long getIdRegionalAsociado() {
		return this.idRegionalAsociado;
	}

	public void setIdRegionalAsociado(Long idRegionalAsociado) {
		this.idRegionalAsociado = idRegionalAsociado;
	}

	public String getRegionalAsociado() {
		return this.regionalAsociado;
	}

	public void setRegionalAsociado(String regionalAsociado) {
		this.regionalAsociado = regionalAsociado;
	}

	public Long getIdOficinaVinculacion() {
		return this.idOficinaVinculacion;
	}

	public void setIdOficinaVinculacion(Long idOficinaVinculacion) {
		this.idOficinaVinculacion = idOficinaVinculacion;
	}

	public String getOficinaVinculacion() {
		return this.oficinaVinculacion;
	}

	public void setOficinaVinculacion(String oficinaVinculacion) {
		this.oficinaVinculacion = oficinaVinculacion;
	}

	public Long getIdUsuarioTraslado() {
		return this.idUsuarioTraslado;
	}

	public void setIdUsuarioTraslado(Long idUsuarioTraslado) {
		this.idUsuarioTraslado = idUsuarioTraslado;
	}

	public String getUsuarioTraslado() {
		return this.usuarioTraslado;
	}

	public void setUsuarioTraslado(String usuarioTraslado) {
		this.usuarioTraslado = usuarioTraslado;
	}

}