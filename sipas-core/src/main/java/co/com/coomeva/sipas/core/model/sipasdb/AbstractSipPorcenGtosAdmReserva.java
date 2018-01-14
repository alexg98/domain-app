package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSipPorcenGtosAdmReserva entity provides the base persistence
 * definition of the SipPorcenGtosAdmReserva entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipPorcenGtosAdmReserva implements
		java.io.Serializable {

	// Fields

	private Long porcenCodigo;
	private SipTipoReservaMatematica sipTipoReservaMatematica;
	private Integer edadIngreso;
	private Integer antiguedad;
	private Double porcentaje;
	private Set sipPorcenGtosAdmReservaAuds = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSipPorcenGtosAdmReserva() {
	}

	/** minimal constructor */
	public AbstractSipPorcenGtosAdmReserva(Long porcenCodigo,
			Integer edadIngreso, Integer antiguedad, Double porcentaje) {
		this.porcenCodigo = porcenCodigo;
		this.edadIngreso = edadIngreso;
		this.antiguedad = antiguedad;
		this.porcentaje = porcentaje;
	}

	/** full constructor */
	public AbstractSipPorcenGtosAdmReserva(Long porcenCodigo,
			SipTipoReservaMatematica sipTipoReservaMatematica,
			Integer edadIngreso, Integer antiguedad, Double porcentaje,
			Set sipPorcenGtosAdmReservaAuds) {
		this.porcenCodigo = porcenCodigo;
		this.sipTipoReservaMatematica = sipTipoReservaMatematica;
		this.edadIngreso = edadIngreso;
		this.antiguedad = antiguedad;
		this.porcentaje = porcentaje;
		this.sipPorcenGtosAdmReservaAuds = sipPorcenGtosAdmReservaAuds;
	}

	// Property accessors

	public SipTipoReservaMatematica getSipTipoReservaMatematica() {
		return this.sipTipoReservaMatematica;
	}

	public void setSipTipoReservaMatematica(
			SipTipoReservaMatematica sipTipoReservaMatematica) {
		this.sipTipoReservaMatematica = sipTipoReservaMatematica;
	}

	public Double getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Set getSipPorcenGtosAdmReservaAuds() {
		return this.sipPorcenGtosAdmReservaAuds;
	}

	public void setSipPorcenGtosAdmReservaAuds(Set sipPorcenGtosAdmReservaAuds) {
		this.sipPorcenGtosAdmReservaAuds = sipPorcenGtosAdmReservaAuds;
	}

	public Long getPorcenCodigo() {
		return porcenCodigo;
	}

	public void setPorcenCodigo(Long porcenCodigo) {
		this.porcenCodigo = porcenCodigo;
	}

	public Integer getEdadIngreso() {
		return edadIngreso;
	}

	public void setEdadIngreso(Integer edadIngreso) {
		this.edadIngreso = edadIngreso;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

}