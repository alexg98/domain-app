package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * AbstractSipIncreAutoCambioVinEdad entity provides the base persistence
 * definition of the SipIncreAutoCambioVinEdad entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipIncreAutoCambioVinEdad implements
		java.io.Serializable {

	// Fields

	private Long consecutivo;
	private Timestamp fechaRegistro;
	private Long asoNumint;
	private BigDecimal proCod;
	private Short prodCodigo;
	private Long valorIncrementoSolicitado;
	private Boolean generoFlujo;
	private Byte tipoIncrementoAuto;
	private String observacion;

	// Constructors

	/** default constructor */
	public AbstractSipIncreAutoCambioVinEdad() {
	}

	/** minimal constructor */
	public AbstractSipIncreAutoCambioVinEdad(Long consecutivo, Long asoNumint,
			BigDecimal proCod, Short prodCodigo,
			Long valorIncrementoSolicitado, Boolean generoFlujo,
			Byte tipoIncrementoAuto) {
		this.consecutivo = consecutivo;
		this.asoNumint = asoNumint;
		this.proCod = proCod;
		this.prodCodigo = prodCodigo;
		this.valorIncrementoSolicitado = valorIncrementoSolicitado;
		this.generoFlujo = generoFlujo;
		this.tipoIncrementoAuto = tipoIncrementoAuto;
	}

	/** full constructor */
	public AbstractSipIncreAutoCambioVinEdad(Long consecutivo,
			Timestamp fechaRegistro, Long asoNumint, BigDecimal proCod,
			Short prodCodigo, Long valorIncrementoSolicitado,
			Boolean generoFlujo, Byte tipoIncrementoAuto, String observacion) {
		this.consecutivo = consecutivo;
		this.fechaRegistro = fechaRegistro;
		this.asoNumint = asoNumint;
		this.proCod = proCod;
		this.prodCodigo = prodCodigo;
		this.valorIncrementoSolicitado = valorIncrementoSolicitado;
		this.generoFlujo = generoFlujo;
		this.tipoIncrementoAuto = tipoIncrementoAuto;
		this.observacion = observacion;
	}

	// Property accessors

	public Long getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(Long consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Timestamp getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Timestamp fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Long getAsoNumint() {
		return this.asoNumint;
	}

	public void setAsoNumint(Long asoNumint) {
		this.asoNumint = asoNumint;
	}

	public BigDecimal getProCod() {
		return this.proCod;
	}

	public void setProCod(BigDecimal proCod) {
		this.proCod = proCod;
	}

	public Short getProdCodigo() {
		return this.prodCodigo;
	}

	public void setProdCodigo(Short prodCodigo) {
		this.prodCodigo = prodCodigo;
	}

	public Long getValorIncrementoSolicitado() {
		return this.valorIncrementoSolicitado;
	}

	public void setValorIncrementoSolicitado(Long valorIncrementoSolicitado) {
		this.valorIncrementoSolicitado = valorIncrementoSolicitado;
	}

	public Boolean getGeneroFlujo() {
		return this.generoFlujo;
	}

	public void setGeneroFlujo(Boolean generoFlujo) {
		this.generoFlujo = generoFlujo;
	}

	public Byte getTipoIncrementoAuto() {
		return this.tipoIncrementoAuto;
	}

	public void setTipoIncrementoAuto(Byte tipoIncrementoAuto) {
		this.tipoIncrementoAuto = tipoIncrementoAuto;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}