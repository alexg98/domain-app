package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * AbstractSipNovedadesMp entity provides the base persistence definition of the
 * SipNovedadesMp entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipNovedadesMp implements java.io.Serializable {

	// Fields

	private Long consecutivo;
	private BigDecimal nitcli;
	private String tipoNovedad;
	private String descNovedad;
	private Timestamp fechaNovedad;
	private Timestamp fechaRegistro;
	private String sistema;
	private Long estado;
	private String observacion;
	private Timestamp fechaAplicacion;

	// Constructors

	/** default constructor */
	public AbstractSipNovedadesMp() {
	}

	/** minimal constructor */
	public AbstractSipNovedadesMp(Long consecutivo, BigDecimal nitcli, String tipoNovedad, String descNovedad,
			Timestamp fechaNovedad, Timestamp fechaRegistro, String sistema) {
		this.consecutivo = consecutivo;
		this.nitcli = nitcli;
		this.tipoNovedad = tipoNovedad;
		this.descNovedad = descNovedad;
		this.fechaNovedad = fechaNovedad;
		this.fechaRegistro = fechaRegistro;
		this.sistema = sistema;
	}

	/** full constructor */
	public AbstractSipNovedadesMp(Long consecutivo, BigDecimal nitcli, String tipoNovedad, String descNovedad,
			Timestamp fechaNovedad, Timestamp fechaRegistro, String sistema, Long estado, String observacion,
			Timestamp fechaAplicacion) {
		this.consecutivo = consecutivo;
		this.nitcli = nitcli;
		this.tipoNovedad = tipoNovedad;
		this.descNovedad = descNovedad;
		this.fechaNovedad = fechaNovedad;
		this.fechaRegistro = fechaRegistro;
		this.sistema = sistema;
		this.estado = estado;
		this.observacion = observacion;
		this.fechaAplicacion = fechaAplicacion;
	}

	// Property accessors

	public Long getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(Long consecutivo) {
		this.consecutivo = consecutivo;
	}

	public BigDecimal getNitcli() {
		return this.nitcli;
	}

	public void setNitcli(BigDecimal nitcli) {
		this.nitcli = nitcli;
	}

	public String getTipoNovedad() {
		return this.tipoNovedad;
	}

	public void setTipoNovedad(String tipoNovedad) {
		this.tipoNovedad = tipoNovedad;
	}

	public String getDescNovedad() {
		return this.descNovedad;
	}

	public void setDescNovedad(String descNovedad) {
		this.descNovedad = descNovedad;
	}

	public Timestamp getFechaNovedad() {
		return this.fechaNovedad;
	}

	public void setFechaNovedad(Timestamp fechaNovedad) {
		this.fechaNovedad = fechaNovedad;
	}

	public Timestamp getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Timestamp fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getSistema() {
		return this.sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public Long getEstado() {
		return this.estado;
	}

	public void setEstado(Long estado) {
		this.estado = estado;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Timestamp getFechaAplicacion() {
		return this.fechaAplicacion;
	}

	public void setFechaAplicacion(Timestamp fechaAplicacion) {
		this.fechaAplicacion = fechaAplicacion;
	}

}