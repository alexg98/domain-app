package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractSipRentas entity provides the base persistence definition of the
 * SipRentas entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipRentas  implements
		java.io.Serializable {

	// Fields

	private Long renConsecutivo;
	private SipLiquidaciones sipLiquidaciones;
	private SipReclamaciones sipReclamaciones;
	private Integer renNumeroRenta;
	private Date renFechaGeneracion;
	private Date renFechaPago;
	private Long renValor;
	private String renEstado;
	private String renObservaciones;
	private Date renFechaRenovacion;
	private Long renTipo;
	
	private String nombreAsociado;
	private Long nitcli;
	private String tipoAuxilio;
	
	private String renDescEstado;
	private String renDescTipoRenta;

	// Constructors

	/** default constructor */
	public AbstractSipRentas() {
	}

	/** minimal constructor */
	public AbstractSipRentas(Long renConsecutivo,
			SipLiquidaciones sipLiquidaciones,
			SipReclamaciones sipReclamaciones, Integer renNumeroRenta,
			Timestamp renFechaGeneracion, Long renValor, String renEstado) {
		this.renConsecutivo = renConsecutivo;
		this.sipLiquidaciones = sipLiquidaciones;
		this.sipReclamaciones = sipReclamaciones;
		this.renNumeroRenta = renNumeroRenta;
		this.renFechaGeneracion = renFechaGeneracion;
		this.renValor = renValor;
		this.renEstado = renEstado;
	}

	/** full constructor */
	public AbstractSipRentas(Long renConsecutivo,
			SipLiquidaciones sipLiquidaciones,
			SipReclamaciones sipReclamaciones, Integer renNumeroRenta,
			Timestamp renFechaGeneracion, Long renValor, String renEstado,
			String renObservaciones,Long renTipo) {
		this.renConsecutivo = renConsecutivo;
		this.sipLiquidaciones = sipLiquidaciones;
		this.sipReclamaciones = sipReclamaciones;
		this.renNumeroRenta = renNumeroRenta;
		this.renFechaGeneracion = renFechaGeneracion;
		this.renValor = renValor;
		this.renEstado = renEstado;
		this.renObservaciones = renObservaciones;
		this.renTipo=renTipo;
	}

	// Property accessors

	public Long getRenConsecutivo() {
		return this.renConsecutivo;
	}

	public void setRenConsecutivo(Long renConsecutivo) {
		this.renConsecutivo = renConsecutivo;
	}

	public SipLiquidaciones getSipLiquidaciones() {
		return this.sipLiquidaciones;
	}

	public void setSipLiquidaciones(SipLiquidaciones sipLiquidaciones) {
		this.sipLiquidaciones = sipLiquidaciones;
	}

	public SipReclamaciones getSipReclamaciones() {
		return this.sipReclamaciones;
	}

	public void setSipReclamaciones(SipReclamaciones sipReclamaciones) {
		this.sipReclamaciones = sipReclamaciones;
	}

	public Integer getRenNumeroRenta() {
		return this.renNumeroRenta;
	}

	public void setRenNumeroRenta(Integer renNumeroRenta) {
		this.renNumeroRenta = renNumeroRenta;
	}

	public Date getRenFechaGeneracion() {
		return this.renFechaGeneracion;
	}

	public void setRenFechaGeneracion(Date renFechaGeneracion) {
		this.renFechaGeneracion = renFechaGeneracion;
	}

	public Long getRenValor() {
		return this.renValor;
	}

	public void setRenValor(Long renValor) {
		this.renValor = renValor;
	}

	public String getRenEstado() {
		return this.renEstado;
	}

	public void setRenEstado(String renEstado) {
		this.renEstado = renEstado;
	}

	public String getRenObservaciones() {
		return this.renObservaciones;
	}

	public void setRenObservaciones(String renObservaciones) {
		this.renObservaciones = renObservaciones;
	}

	public Date getRenFechaPago() {
		return renFechaPago;
	}

	public void setRenFechaPago(Date renFechaPago) {
		this.renFechaPago = renFechaPago;
	}

	public Date getRenFechaRenovacion() {
		return renFechaRenovacion;
	}

	public void setRenFechaRenovacion(Date renFechaRenovacion) {
		this.renFechaRenovacion = renFechaRenovacion;
	}

	public Long getRenTipo() {
		return renTipo;
	}

	public void setRenTipo(Long renTipo) {
		this.renTipo = renTipo;
	}

	public String getNombreAsociado() {
		return nombreAsociado;
	}

	public void setNombreAsociado(String nombreAsociado) {
		this.nombreAsociado = nombreAsociado;
	}

	public Long getNitcli() {
		return nitcli;
	}

	public void setNitcli(Long nitcli) {
		this.nitcli = nitcli;
	}

	public String getTipoAuxilio() {
		return tipoAuxilio;
	}

	public void setTipoAuxilio(String tipoAuxilio) {
			this.tipoAuxilio = tipoAuxilio;	
	}

	public String getRenDescEstado() {
		return renDescEstado;
	}

	public void setRenDescEstado(String renDescEstado) {
		if( renDescEstado == null ){
			this.renDescEstado = "-";
		}else{
			this.renDescEstado = renDescEstado;	
		}
	}

	public String getRenDescTipoRenta() {
		return renDescTipoRenta;
	}

	public void setRenDescTipoRenta(String renDescTipoRenta) {
		
		if( renDescTipoRenta == null ){
			this.renDescTipoRenta = "-";
		}else{
			this.renDescTipoRenta = renDescTipoRenta;	
		}
	}
	
}