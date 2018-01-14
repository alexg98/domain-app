package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * AbstractSipProteccionesPignoradas entity provides the base persistence
 * definition of the SipProteccionesPignoradas entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipProteccionesPignoradas implements java.io.Serializable {

	// Fields

	private Long ppCodigo;
	private Long asoNumint;
	private Long proCod;
	private String ppEstado;
	private String ppRegistroActual;
	private String ppTipoTransaccion;
	private Timestamp ppFechaRegistro;
	private Double ppValorPignorado;
	private Long valorGarantia;
	private Long valorRetefuente;
	private Double porcentajeReserva;
	private Long consecutivoBanco;

	// Constructors

	/** default constructor */
	public AbstractSipProteccionesPignoradas() {
	}

	/** minimal constructor */
	public AbstractSipProteccionesPignoradas(Long ppCodigo, Long asoNumint) {
		this.ppCodigo = ppCodigo;
		this.asoNumint = asoNumint;
	}

	/** full constructor */
	public AbstractSipProteccionesPignoradas(Long ppCodigo, Long asoNumint, Long proCod, String ppEstado,
			String ppRegistroActual, String ppTipoTransaccion, Timestamp ppFechaRegistro, Double ppValorPignorado,
			Long valorGarantia, Long valorRetefuente, Double porcentajeReserva, Long consecutivoBanco) {
		this.ppCodigo = ppCodigo;
		this.asoNumint = asoNumint;
		this.proCod = proCod;
		this.ppEstado = ppEstado;
		this.ppRegistroActual = ppRegistroActual;
		this.ppTipoTransaccion = ppTipoTransaccion;
		this.ppFechaRegistro = ppFechaRegistro;
		this.ppValorPignorado = ppValorPignorado;
		this.valorGarantia = valorGarantia;
		this.valorRetefuente = valorRetefuente;
		this.porcentajeReserva = porcentajeReserva;
		this.consecutivoBanco = consecutivoBanco;
	}

	// Property accessors

	public Long getPpCodigo() {
		return this.ppCodigo;
	}

	public void setPpCodigo(Long ppCodigo) {
		this.ppCodigo = ppCodigo;
	}

	public Long getAsoNumint() {
		return this.asoNumint;
	}

	public void setAsoNumint(Long asoNumint) {
		this.asoNumint = asoNumint;
	}

	public Long getProCod() {
		return this.proCod;
	}

	public void setProCod(Long proCod) {
		this.proCod = proCod;
	}

	public String getPpEstado() {
		return this.ppEstado;
	}

	public void setPpEstado(String ppEstado) {
		this.ppEstado = ppEstado;
	}

	public String getPpRegistroActual() {
		return this.ppRegistroActual;
	}

	public void setPpRegistroActual(String ppRegistroActual) {
		this.ppRegistroActual = ppRegistroActual;
	}

	public String getPpTipoTransaccion() {
		return this.ppTipoTransaccion;
	}

	public void setPpTipoTransaccion(String ppTipoTransaccion) {
		this.ppTipoTransaccion = ppTipoTransaccion;
	}

	public Timestamp getPpFechaRegistro() {
		return this.ppFechaRegistro;
	}

	public void setPpFechaRegistro(Timestamp ppFechaRegistro) {
		this.ppFechaRegistro = ppFechaRegistro;
	}

	public Double getPpValorPignorado() {
		return this.ppValorPignorado;
	}

	public void setPpValorPignorado(Double ppValorPignorado) {
		this.ppValorPignorado = ppValorPignorado;
	}

	public Long getValorGarantia() {
		return this.valorGarantia;
	}

	public void setValorGarantia(Long valorGarantia) {
		this.valorGarantia = valorGarantia;
	}

	public Long getValorRetefuente() {
		return this.valorRetefuente;
	}

	public void setValorRetefuente(Long valorRetefuente) {
		this.valorRetefuente = valorRetefuente;
	}

	public Double getPorcentajeReserva() {
		return this.porcentajeReserva;
	}

	public void setPorcentajeReserva(Double porcentajeReserva) {
		this.porcentajeReserva = porcentajeReserva;
	}

	public Long getConsecutivoBanco() {
		return this.consecutivoBanco;
	}

	public void setConsecutivoBanco(Long consecutivoBanco) {
		this.consecutivoBanco = consecutivoBanco;
	}

}