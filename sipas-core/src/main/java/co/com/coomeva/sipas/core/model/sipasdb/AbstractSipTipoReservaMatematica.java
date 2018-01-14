package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSipTipoReservaMatematica entity provides the base persistence
 * definition of the SipTipoReservaMatematica entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipTipoReservaMatematica implements
		java.io.Serializable {

	// Fields

	private Long tipoResCodigo;
	private String nombre;
	private String descripcion;
	private Boolean activo;
	private Set sipPorcenGtosAdmReservas = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSipTipoReservaMatematica() {
	}

	/** minimal constructor */
	public AbstractSipTipoReservaMatematica(Long tipoResCodigo,
			String nombre, String descripcion, Boolean activo) {
		this.tipoResCodigo = tipoResCodigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.activo = activo;
	}

	/** full constructor */
	public AbstractSipTipoReservaMatematica(Long tipoResCodigo,
			String nombre, String descripcion, Boolean activo,
			Set sipPorcenGtosAdmReservas) {
		this.tipoResCodigo = tipoResCodigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.activo = activo;
		this.sipPorcenGtosAdmReservas = sipPorcenGtosAdmReservas;
	}

	// Property accessors


	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getActivo() {
		return this.activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Set getSipPorcenGtosAdmReservas() {
		return this.sipPorcenGtosAdmReservas;
	}

	public void setSipPorcenGtosAdmReservas(Set sipPorcenGtosAdmReservas) {
		this.sipPorcenGtosAdmReservas = sipPorcenGtosAdmReservas;
	}

	public Long getTipoResCodigo() {
		return tipoResCodigo;
	}

	public void setTipoResCodigo(Long tipoResCodigo) {
		this.tipoResCodigo = tipoResCodigo;
	}

}