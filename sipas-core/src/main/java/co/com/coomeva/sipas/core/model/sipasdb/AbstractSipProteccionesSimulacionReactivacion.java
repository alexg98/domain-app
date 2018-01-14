package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSipProteccionesSimulacionReactivacion entity provides the base
 * persistence definition of the SipProteccionesSimulacionReactivacion entity. @author
 * MyEclipse Persistence Tools
 */

public abstract class AbstractSipProteccionesSimulacionReactivacion implements
		java.io.Serializable {

	// Fields

	private SipProteccionesSimulacionReactivacionId id;
	private Long psrConsecutivoProteccion;
	private Long psrProCod;
	private Short psrProdCodigo;
	private String psrProdDescripcion;
	private Long psrProValor;
	private Long psrProCuotaContribucion;
	private Long psrProValorNuevo;
	private Long psrContribucionNueva;
	private Date psrProFechaIngProteccion;
	private Long psrSaldoFactura;
	private Long psrValorMora;
	private String psrProObservacion;
	private Set sipCuotasSimulacionReactivacions = new HashSet(0);
	private String psrProAdicional;
	private Long psrValorMoraOculto;

	// Constructors

	/** default constructor */
	public AbstractSipProteccionesSimulacionReactivacion() {
	}

	/** minimal constructor */
	public AbstractSipProteccionesSimulacionReactivacion(
			SipProteccionesSimulacionReactivacionId id,
			Long psrConsecutivoProteccion, Long psrProCod,
			String psrProdDescripcion, Long psrValorMora) {
		this.id = id;
		this.psrConsecutivoProteccion = psrConsecutivoProteccion;
		this.psrProCod = psrProCod;
		this.psrProdDescripcion = psrProdDescripcion;
		this.psrValorMora = psrValorMora;
	}

	/** full constructor */
	public AbstractSipProteccionesSimulacionReactivacion(
			SipProteccionesSimulacionReactivacionId id,
			Long psrConsecutivoProteccion, Long psrProCod,
			Short psrProdCodigo, String psrProdDescripcion, Long psrProValor,
			Long psrProCuotaContribucion, Long psrProValorNuevo,
			Long psrContribucionNueva, Date psrProFechaIngProteccion,
			Long psrSaldoFactura, Long psrValorMora, String psrProObservacion,
			Set sipCuotasSimulacionReactivacions,String psrProAdicional,Long psrValorMoraOculto) {
		this.id = id;
		this.psrConsecutivoProteccion = psrConsecutivoProteccion;
		this.psrProCod = psrProCod;
		this.psrProdCodigo = psrProdCodigo;
		this.psrProdDescripcion = psrProdDescripcion;
		this.psrProValor = psrProValor;
		this.psrProCuotaContribucion = psrProCuotaContribucion;
		this.psrProValorNuevo = psrProValorNuevo;
		this.psrContribucionNueva = psrContribucionNueva;
		this.psrProFechaIngProteccion = psrProFechaIngProteccion;
		this.psrSaldoFactura = psrSaldoFactura;
		this.psrValorMora = psrValorMora;
		this.psrProObservacion = psrProObservacion;
		this.sipCuotasSimulacionReactivacions = sipCuotasSimulacionReactivacions;
		this.psrProAdicional=psrProAdicional;
	}

	// Property accessors

	public SipProteccionesSimulacionReactivacionId getId() {
		return this.id;
	}

	public void setId(SipProteccionesSimulacionReactivacionId id) {
		this.id = id;
	}

	public Long getPsrConsecutivoProteccion() {
		return this.psrConsecutivoProteccion;
	}

	public void setPsrConsecutivoProteccion(Long psrConsecutivoProteccion) {
		this.psrConsecutivoProteccion = psrConsecutivoProteccion;
	}

	public Long getPsrProCod() {
		return this.psrProCod;
	}

	public void setPsrProCod(Long psrProCod) {
		this.psrProCod = psrProCod;
	}

	public Short getPsrProdCodigo() {
		return this.psrProdCodigo;
	}

	public void setPsrProdCodigo(Short psrProdCodigo) {
		this.psrProdCodigo = psrProdCodigo;
	}

	public String getPsrProdDescripcion() {
		return this.psrProdDescripcion;
	}

	public void setPsrProdDescripcion(String psrProdDescripcion) {
		this.psrProdDescripcion = psrProdDescripcion;
	}

	public Long getPsrProValor() {
		return this.psrProValor;
	}

	public void setPsrProValor(Long psrProValor) {
		this.psrProValor = psrProValor;
	}

	public Long getPsrProCuotaContribucion() {
		return this.psrProCuotaContribucion;
	}

	public void setPsrProCuotaContribucion(Long psrProCuotaContribucion) {
		this.psrProCuotaContribucion = psrProCuotaContribucion;
	}

	public Long getPsrProValorNuevo() {
		return this.psrProValorNuevo;
	}

	public void setPsrProValorNuevo(Long psrProValorNuevo) {
		this.psrProValorNuevo = psrProValorNuevo;
	}

	public Long getPsrContribucionNueva() {
		return this.psrContribucionNueva;
	}

	public void setPsrContribucionNueva(Long psrContribucionNueva) {
		this.psrContribucionNueva = psrContribucionNueva;
	}

	public Date getPsrProFechaIngProteccion() {
		return this.psrProFechaIngProteccion;
	}

	public void setPsrProFechaIngProteccion(Date psrProFechaIngProteccion) {
		this.psrProFechaIngProteccion = psrProFechaIngProteccion;
	}

	public Long getPsrSaldoFactura() {
		return this.psrSaldoFactura;
	}

	public void setPsrSaldoFactura(Long psrSaldoFactura) {
		this.psrSaldoFactura = psrSaldoFactura;
	}

	public Long getPsrValorMora() {
		return this.psrValorMora;
	}

	public void setPsrValorMora(Long psrValorMora) {
		this.psrValorMora = psrValorMora;
	}

	public String getPsrProObservacion() {
		return this.psrProObservacion;
	}

	public void setPsrProObservacion(String psrProObservacion) {
		this.psrProObservacion = psrProObservacion;
	}

	public Set getSipCuotasSimulacionReactivacions() {
		return this.sipCuotasSimulacionReactivacions;
	}

	public void setSipCuotasSimulacionReactivacions(
			Set sipCuotasSimulacionReactivacions) {
		this.sipCuotasSimulacionReactivacions = sipCuotasSimulacionReactivacions;
	}

	public void setPsrProAdicional(String psrProAdicional) {
		this.psrProAdicional = psrProAdicional;
	}

	public String getPsrProAdicional() {
		return psrProAdicional;
	}

	public void setPsrValorMoraOculto(Long psrValorMoraOculto) {
		this.psrValorMoraOculto = psrValorMoraOculto;
	}

	public Long getPsrValorMoraOculto() {
		return psrValorMoraOculto;
	}

}