package co.com.coomeva.sipas.core.model.sipasdb;
// default package
// Generated 26/11/2014 02:53:17 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * SipFactoresReservaSim generated by hbm2java
 */
public class SipFactoresReservaSimAud implements java.io.Serializable {

	private Long consecutivo;
	private short edad;
	private short plan;
	private short sexo;
	private BigDecimal muertenatural;
	private BigDecimal perseverancia;
	private BigDecimal factorc;
	private BigDecimal factorcuota;
	private Date fecha;
	private String login;

	public SipFactoresReservaSimAud() {
	}
	
	

	public SipFactoresReservaSimAud(Long consecutivo) {
		super();
		this.consecutivo = consecutivo;
	}



	public SipFactoresReservaSimAud(Long consecutivo, short edad, short plan,
			short sexo, BigDecimal muertenatural, BigDecimal perseverancia,
			BigDecimal factorc, BigDecimal factorcuota, Date fecha, String login) {
		super();
		this.consecutivo = consecutivo;
		this.edad = edad;
		this.plan = plan;
		this.sexo = sexo;
		this.muertenatural = muertenatural;
		this.perseverancia = perseverancia;
		this.factorc = factorc;
		this.factorcuota = factorcuota;
		this.fecha = fecha;
		this.login = login; 
	}



	public Long getConsecutivo() {
		return consecutivo;
	}



	public void setConsecutivo(Long consecutivo) {
		this.consecutivo = consecutivo;
	}



	public short getEdad() {
		return edad;
	}



	public void setEdad(short edad) {
		this.edad = edad;
	}



	public short getPlan() {
		return plan;
	}



	public void setPlan(short plan) {
		this.plan = plan;
	}



	public short getSexo() {
		return sexo;
	}



	public void setSexo(short sexo) {
		this.sexo = sexo;
	}



	public BigDecimal getMuertenatural() {
		return muertenatural;
	}



	public void setMuertenatural(BigDecimal muertenatural) {
		this.muertenatural = muertenatural;
	}



	public BigDecimal getPerseverancia() {
		return perseverancia;
	}



	public void setPerseverancia(BigDecimal perseverancia) {
		this.perseverancia = perseverancia;
	}



	public BigDecimal getFactorc() {
		return factorc;
	}



	public void setFactorc(BigDecimal factorc) {
		this.factorc = factorc;
	}



	public BigDecimal getFactorcuota() {
		return factorcuota;
	}



	public void setFactorcuota(BigDecimal factorcuota) {
		this.factorcuota = factorcuota;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}

	

}
