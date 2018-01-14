package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;

/**
 * AbstractSipFactoresDescuento entity provides the base persistence definition
 * of the SipFactoresDescuento entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipFactoresDescuento implements
		java.io.Serializable {

	// Fields

	private Long desCod;
	private Short desAno;
	private Byte desTipo;
	private Double desValor;
	private String desEstado;
	private Timestamp desFechaRegistro;

	// Constructors

	/** default constructor */
	public AbstractSipFactoresDescuento() {
	}

	/** minimal constructor */
	public AbstractSipFactoresDescuento(Long desCod, Short desAno, Byte desTipo) {
		this.desCod = desCod;
		this.desAno = desAno;
		this.desTipo = desTipo;
	}

	/** full constructor */
	public AbstractSipFactoresDescuento(Long desCod, Short desAno,
			Byte desTipo, Double desValor, String desEstado,
			Timestamp desFechaRegistro) {
		this.desCod = desCod;
		this.desAno = desAno;
		this.desTipo = desTipo;
		this.desValor = desValor;
		this.desEstado = desEstado;
		this.desFechaRegistro = desFechaRegistro;
	}

	// Property accessors

	public Long getDesCod() {
		return this.desCod;
	}

	public void setDesCod(Long desCod) {
		this.desCod = desCod;
	}

	public Short getDesAno() {
		return this.desAno;
	}

	public void setDesAno(Short desAno) {
		this.desAno = desAno;
	}

	public Byte getDesTipo() {
		return this.desTipo;
	}

	public void setDesTipo(Byte desTipo) {
		this.desTipo = desTipo;
	}

	public Double getDesValor() {
		return this.desValor;
	}

	public void setDesValor(Double desValor) {
		this.desValor = desValor;
	}

	public String getDesEstado() {
		return this.desEstado;
	}

	public void setDesEstado(String desEstado) {
		this.desEstado = desEstado;
	}

	public Timestamp getDesFechaRegistro() {
		return this.desFechaRegistro;
	}

	public void setDesFechaRegistro(Timestamp desFechaRegistro) {
		this.desFechaRegistro = desFechaRegistro;
	}

}