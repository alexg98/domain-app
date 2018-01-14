package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;

/**
 * AbstractSipBloqueos entity provides the base persistence definition of the
 * SipBloqueos entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipBloqueos implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 7578380071470045115L;
	private Long bloCodigo;
	private Long recCodigo;
	private Long asoNumint;
	private Long bloTipoAuxilio;
	private Long bloUsuarioBloqueado;
	private String bloObservacion;
	private Long bloEstadoBloqueo;
	private Long bloUsuarioSistema;
	private Date bloFecha;

	// Constructors

	/** default constructor */
	public AbstractSipBloqueos() {
	}

	/** minimal constructor */
	public AbstractSipBloqueos(Long bloCodigo, Long recCodigo,
			Long asoNumint, String bloObservacion, Long bloEstadoBloqueo,
			Long bloUsuarioSistema,Date bloFecha) {
		this.bloCodigo = bloCodigo;
		this.recCodigo = recCodigo;
		this.asoNumint = asoNumint;
		this.bloObservacion = bloObservacion;
		this.bloEstadoBloqueo = bloEstadoBloqueo;
		this.bloUsuarioSistema = bloUsuarioSistema;
		this.bloFecha = bloFecha;
	}

	/** full constructor */
	public AbstractSipBloqueos(Long bloCodigo, Long recCodigo,
			Long asoNumint, Long bloTipoAuxilio, Long bloUsuarioBloqueado,
			String bloObservacion, Long bloEstadoBloqueo,
			Long bloUsuarioSistema,Date bloFecha) {
		this.bloCodigo = bloCodigo;
		this.recCodigo = recCodigo;
		this.asoNumint = asoNumint;
		this.bloTipoAuxilio = bloTipoAuxilio;
		this.bloUsuarioBloqueado = bloUsuarioBloqueado;
		this.bloObservacion = bloObservacion;
		this.bloEstadoBloqueo = bloEstadoBloqueo;
		this.bloUsuarioSistema = bloUsuarioSistema;
		this.bloFecha = bloFecha;
	}

	// Property accessors

	public Long getBloCodigo() {
		return this.bloCodigo;
	}

	public void setBloCodigo(Long bloCodigo) {
		this.bloCodigo = bloCodigo;
	}

	public Long getRecCodigo() {
		return this.recCodigo;
	}

	public void setRecCodigo(Long recCodigo) {
		this.recCodigo = recCodigo;
	}

	public Long getAsoNumint() {
		return this.asoNumint;
	}

	public void setAsoNumint(Long asoNumint) {
		this.asoNumint = asoNumint;
	}

	public Long getBloTipoAuxilio() {
		return this.bloTipoAuxilio;
	}

	public void setBloTipoAuxilio(Long bloTipoAuxilio) {
		this.bloTipoAuxilio = bloTipoAuxilio;
	}

	public Long getBloUsuarioBloqueado() {
		return this.bloUsuarioBloqueado;
	}

	public void setBloUsuarioBloqueado(Long bloUsuarioBloqueado) {
		this.bloUsuarioBloqueado = bloUsuarioBloqueado;
	}

	public String getBloObservacion() {
		return this.bloObservacion;
	}

	public void setBloObservacion(String bloObservacion) {
		this.bloObservacion = bloObservacion;
	}

	public Long getBloEstadoBloqueo() {
		return this.bloEstadoBloqueo;
	}

	public void setBloEstadoBloqueo(Long bloEstadoBloqueo) {
		this.bloEstadoBloqueo = bloEstadoBloqueo;
	}

	public Long getBloUsuarioSistema() {
		return this.bloUsuarioSistema;
	}

	public void setBloUsuarioSistema(Long bloUsuarioSistema) {
		this.bloUsuarioSistema = bloUsuarioSistema;
	}

	public Date getBloFecha() {
		return bloFecha;
	}

	public void setBloFecha(Date bloFecha) {
		this.bloFecha = bloFecha;
	}
	
}