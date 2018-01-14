package co.com.coomeva.sipas.core.model.sipasdb;

import java.io.Serializable;
import java.util.Date;

public class SipRangosProteccionProdAdic implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1922725375170542524L;
	
	private Integer ranCod;
	private SipVinculacionesTipo sipVinculacionesTipo;
	private SipNivelesRiesgo sipNivelesRiesgo;
	private SipProductos sipProductos;
	private Double ranProteccionMin;
    private Double ranProteccionMax;
    private Long ranEdadMin;
    private Long ranEdadMax;
	private Long ranEstado;
	private Date ranFechaIni;
    private Date ranFechaFin;
    private Long ranAno;
    
    
    public SipRangosProteccionProdAdic(){
    }
      
	public SipRangosProteccionProdAdic(Integer ranCod,
			SipVinculacionesTipo sipVinculacionesTipo,
			SipNivelesRiesgo sipNivelesRiesgo, SipProductos sipProductos,
			Double ranProteccionMin, Double ranProteccionMax, Long ranEdadMin,
			Long ranEdadMax, Long ranEstado, Date ranFechaIni,
			Date ranFechaFin, Long ranAno) {
		this.ranCod = ranCod;
		this.sipVinculacionesTipo = sipVinculacionesTipo;
		this.sipNivelesRiesgo = sipNivelesRiesgo;
		this.sipProductos = sipProductos;
		this.ranProteccionMin = ranProteccionMin;
		this.ranProteccionMax = ranProteccionMax;
		this.ranEdadMin = ranEdadMin;
		this.ranEdadMax = ranEdadMax;
		this.ranEstado = ranEstado;
		this.ranFechaIni = ranFechaIni;
		this.ranFechaFin = ranFechaFin;
		this.ranAno = ranAno;
	}
	
	public Integer getRanCod() {
		return ranCod;
	}
	
	public void setRanCod(Integer ranCod) {
		this.ranCod = ranCod;
	}
	
	public SipVinculacionesTipo getSipVinculacionesTipo() {
		return sipVinculacionesTipo;
	}
	
	public void setSipVinculacionesTipo(SipVinculacionesTipo sipVinculacionesTipo) {
		this.sipVinculacionesTipo = sipVinculacionesTipo;
	}
	
	public SipNivelesRiesgo getSipNivelesRiesgo() {
		return sipNivelesRiesgo;
	}
	
	public void setSipNivelesRiesgo(SipNivelesRiesgo sipNivelesRiesgo) {
		this.sipNivelesRiesgo = sipNivelesRiesgo;
	}
	
	public SipProductos getSipProductos() {
		return sipProductos;
	}
	
	public void setSipProductos(SipProductos sipProductos) {
		this.sipProductos = sipProductos;
	}
	
	public Double getRanProteccionMin() {
		return ranProteccionMin;
	}
	
	public void setRanProteccionMin(Double ranProteccionMin) {
		this.ranProteccionMin = ranProteccionMin;
	}
	
	public Double getRanProteccionMax() {
		return ranProteccionMax;
	}
	
	public void setRanProteccionMax(Double ranProteccionMax) {
		this.ranProteccionMax = ranProteccionMax;
	}
	
	public Long getRanEdadMin() {
		return ranEdadMin;
	}
	
	public void setRanEdadMin(Long ranEdadMin) {
		this.ranEdadMin = ranEdadMin;
	}
	
	public Long getRanEdadMax() {
		return ranEdadMax;
	}
	
	public void setRanEdadMax(Long ranEdadMax) {
		this.ranEdadMax = ranEdadMax;
	}
	
	public Long getRanEstado() {
		return ranEstado;
	}
	
	public void setRanEstado(Long ranEstado) {
		this.ranEstado = ranEstado;
	}
	
	public Date getRanFechaIni() {
		return ranFechaIni;
	}
	
	public void setRanFechaIni(Date ranFechaIni) {
		this.ranFechaIni = ranFechaIni;
	}
	
	public Date getRanFechaFin() {
		return ranFechaFin;
	}
	
	public void setRanFechaFin(Date ranFechaFin) {
		this.ranFechaFin = ranFechaFin;
	}
	
	public Long getRanAno() {
		return ranAno;
	}
	
	public void setRanAno(Long ranAno) {
		this.ranAno = ranAno;
	}
	
}
