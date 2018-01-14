package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * SipLogVinculaciones entity. @author MyEclipse Persistence Tools
 */

public class SipLogVinculaciones implements java.io.Serializable {

	// Fields

	private Long consecutivo;
	private Long asoNumint;
	private String generaFlujo;
	private Double peso;
	private Double talla;
	private Double imc;
	private String reclamaciones;
	private String preexistencias;
	private Timestamp fechaRegistro;
	private Long valorProteccionSolicitada;
	private Long consecutivoEvento;
	private Set sipLogVinculacionesPregs = new HashSet(0);

	// Constructors

	/** default constructor */
	public SipLogVinculaciones() {
	}

	/** minimal constructor */
	public SipLogVinculaciones(Long consecutivo, Long asoNumint) {
		this.consecutivo = consecutivo;
		this.asoNumint = asoNumint;
	}

	/** full constructor */
	public SipLogVinculaciones(Long consecutivo, Long asoNumint,
			String generaFlujo, Double peso, Double talla, Double imc,
			String reclamaciones, String preexistencias,
			Timestamp fechaRegistro, Long valorProteccionSolicitada,
			Long consecutivoEvento, Set sipLogVinculacionesPregs) {
		this.consecutivo = consecutivo;
		this.asoNumint = asoNumint;
		this.generaFlujo = generaFlujo;
		this.peso = peso;
		this.talla = talla;
		this.imc = imc;
		this.reclamaciones = reclamaciones;
		this.preexistencias = preexistencias;
		this.fechaRegistro = fechaRegistro;
		this.valorProteccionSolicitada = valorProteccionSolicitada;
		this.consecutivoEvento = consecutivoEvento;
		this.sipLogVinculacionesPregs = sipLogVinculacionesPregs;
	}

	// Property accessors

	public Long getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(Long consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Long getAsoNumint() {
		return this.asoNumint;
	}

	public void setAsoNumint(Long asoNumint) {
		this.asoNumint = asoNumint;
	}

	public String getGeneraFlujo() {
		return this.generaFlujo;
	}

	public void setGeneraFlujo(String generaFlujo) {
		this.generaFlujo = generaFlujo;
	}

	public Double getPeso() {
		return this.peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getTalla() {
		return this.talla;
	}

	public void setTalla(Double talla) {
		this.talla = talla;
	}

	public Double getImc() {
		return this.imc;
	}

	public void setImc(Double imc) {
		this.imc = imc;
	}

	public String getReclamaciones() {
		return this.reclamaciones;
	}

	public void setReclamaciones(String reclamaciones) {
		this.reclamaciones = reclamaciones;
	}

	public String getPreexistencias() {
		return this.preexistencias;
	}

	public void setPreexistencias(String preexistencias) {
		this.preexistencias = preexistencias;
	}

	public Timestamp getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Timestamp fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Long getValorProteccionSolicitada() {
		return this.valorProteccionSolicitada;
	}

	public void setValorProteccionSolicitada(Long valorProteccionSolicitada) {
		this.valorProteccionSolicitada = valorProteccionSolicitada;
	}

	public Long getConsecutivoEvento() {
		return consecutivoEvento;
	}

	public void setConsecutivoEvento(Long consecutivoEvento) {
		this.consecutivoEvento = consecutivoEvento;
	}

	public Set getSipLogVinculacionesPregs() {
		return this.sipLogVinculacionesPregs;
	}

	public void setSipLogVinculacionesPregs(Set sipLogVinculacionesPregs) {
		this.sipLogVinculacionesPregs = sipLogVinculacionesPregs;
	}

}