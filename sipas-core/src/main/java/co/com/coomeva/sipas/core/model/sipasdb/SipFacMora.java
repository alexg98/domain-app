package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;

public class SipFacMora {

	private Long codigo;
	private int tipo;
	private Long periodo;
	private Long consecutivo;
	private Long asoNumint;
	private Double valorMora;
	private Long periodoAplicado;

	private String estado;
	private String observacion;
	private Date fechaProceso;
	private Date fechaRegistro;
	private Date fechaAplicacion;
	private String concepto;
	private SipProductos sipProductos;

	public SipFacMora() {
	}

	public Long getCodigo() {
		return codigo;
	}

	public int getTipo() {
		return tipo;
	}

	public Long getPeriodo() {
		return periodo;
	}

	public Long getConsecutivo() {
		return consecutivo;
	}

	public Long getAsoNumint() {
		return asoNumint;
	}

	public Double getValorMora() {
		return valorMora;
	}

	public Long getValorMoraAsLong() {
		return Math.round(valorMora);
	}

	public Long getPeriodoAplicado() {
		return periodoAplicado;
	}

	public String getEstado() {
		return estado;
	}

	public String getEstadoDescripcion() {
		if (estado != null && estado.equals("1"))
			return "Aplicado";
		else if (estado != null && estado.equals("2"))
			return "No Aplicado";
		return "Desconocido";
	}

	public String getObservacion() {
		return observacion;
	}

	public Date getFechaProceso() {
		return fechaProceso;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public Date getFechaAplicacion() {
		return fechaAplicacion;
	}

	public String getConcepto() {
		return concepto;
	}

	public SipProductos getSipProductos() {
		return sipProductos;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void setPeriodo(Long periodo) {
		this.periodo = periodo;
	}

	public void setConsecutivo(Long consecutivo) {
		this.consecutivo = consecutivo;
	}

	public void setAsoNumint(Long asoNumint) {
		this.asoNumint = asoNumint;
	}

	public void setValorMora(Double valorMora) {
		this.valorMora = valorMora;
	}

	public void setPeriodoAplicado(Long periodoAplicado) {
		this.periodoAplicado = periodoAplicado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public void setFechaProceso(Date fechaProceso) {
		this.fechaProceso = fechaProceso;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public void setFechaAplicacion(Date fechaAplicacion) {
		this.fechaAplicacion = fechaAplicacion;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public void setSipProductos(SipProductos sipProductos) {
		this.sipProductos = sipProductos;
	}

}
