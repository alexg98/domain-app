package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractSipReclamacionesAutoValidadas entity provides the base persistence
 * definition of the SipReclamacionesAutoValidadas entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipReclamacionesAutoValidadas implements
		java.io.Serializable {

	// Fields

	private Long ravCodigo;
	private Long recCodigo;
	private Long ravEstado;
	private String ravObservacion;
	private Date ravFechaValidacion;
	private Long ravUsuarioSistema;

	// Constructors

	/** default constructor */
	public AbstractSipReclamacionesAutoValidadas() {
	}

	/** full constructor */
	public AbstractSipReclamacionesAutoValidadas(Long ravCodigo,
			Long recCodigo, Long ravEstado, String ravObservacion,
			Date ravFechaValidacion, Long ravUsuarioSistema) {
		this.ravCodigo = ravCodigo;
		this.recCodigo = recCodigo;
		this.ravEstado = ravEstado;
		this.ravObservacion = ravObservacion;
		this.ravFechaValidacion = ravFechaValidacion;
		this.ravUsuarioSistema = ravUsuarioSistema;
	}

	// Property accessors

	public Long getRavCodigo() {
		return this.ravCodigo;
	}

	public void setRavCodigo(Long ravCodigo) {
		this.ravCodigo = ravCodigo;
	}

	public Long getRecCodigo() {
		return this.recCodigo;
	}

	public void setRecCodigo(Long recCodigo) {
		this.recCodigo = recCodigo;
	}

	public Long getRavEstado() {
		return this.ravEstado;
	}

	public void setRavEstado(Long ravEstado) {
		this.ravEstado = ravEstado;
	}

	public String getRavObservacion() {
		return this.ravObservacion;
	}

	public void setRavObservacion(String ravObservacion) {
		this.ravObservacion = ravObservacion;
	}

	public Date getRavFechaValidacion() {
		return this.ravFechaValidacion;
	}

	public void setRavFechaValidacion(Date ravFechaValidacion) {
		this.ravFechaValidacion = ravFechaValidacion;
	}

	public Long getRavUsuarioSistema() {
		return this.ravUsuarioSistema;
	}

	public void setRavUsuarioSistema(Long ravUsuarioSistema) {
		this.ravUsuarioSistema = ravUsuarioSistema;
	}

}