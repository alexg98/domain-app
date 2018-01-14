package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;

/**
 * AbstractSipCartasReclamacion entity provides the base persistence definition
 * of the SipCartasReclamacion entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipCartasReclamacion implements
		java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long carCodigo;
	private SipReclamaciones sipReclamaciones;
	private Long carTipoCarta;
	private String carContenido;
	private String carConsecutivoCarta;
	private Long carUsuarioRegistro;
	private Date carFechaRegistro;
	private Long carUsuarioGeneracion;
	private Date carFechaGeneracion;
	private Long carUsuarioRadicacion;
	private Long carEstado;

	// Constructors

	/** default constructor */
	public AbstractSipCartasReclamacion() {
	}

	/** minimal constructor */
	public AbstractSipCartasReclamacion(Long carCodigo,
			Long carTipoCarta, Long carUsuarioRegistro, Date carFechaRegistro) {
		this.carCodigo = carCodigo;
		this.carTipoCarta = carTipoCarta;
		this.carUsuarioRegistro = carUsuarioRegistro;
		this.carFechaRegistro = carFechaRegistro;
	}

	/** full constructor */
	public AbstractSipCartasReclamacion(Long carCodigo,
			SipReclamaciones sipReclamaciones, Long carTipoCarta,
			String carContenido, String carConsecutivoCarta,
			Long carUsuarioRegistro, Date carFechaRegistro,
			Long carUsuarioGeneracion, Date carFechaGeneracion,
			Long carUsuarioRadicacion, Long carEstado) {
		this.carCodigo = carCodigo;
		this.sipReclamaciones = sipReclamaciones;
		this.carTipoCarta = carTipoCarta;
		this.carContenido = carContenido;
		this.carConsecutivoCarta = carConsecutivoCarta;
		this.carUsuarioRegistro = carUsuarioRegistro;
		this.carFechaRegistro = carFechaRegistro;
		this.carUsuarioGeneracion = carUsuarioGeneracion;
		this.carFechaGeneracion = carFechaGeneracion;
		this.carUsuarioRadicacion = carUsuarioRadicacion;
		this.carEstado = carEstado;
	}

	// Property accessors

	public Long getCarCodigo() {
		return this.carCodigo;
	}

	public void setCarCodigo(Long carCodigo) {
		this.carCodigo = carCodigo;
	}

	public SipReclamaciones getSipReclamaciones() {
		return this.sipReclamaciones;
	}

	public void setSipReclamaciones(SipReclamaciones sipReclamaciones) {
		this.sipReclamaciones = sipReclamaciones;
	}

	public Long getCarTipoCarta() {
		return this.carTipoCarta;
	}

	public void setCarTipoCarta(Long carTipoCarta) {
		this.carTipoCarta = carTipoCarta;
	}

	public String getCarContenido() {
		return this.carContenido;
	}

	public void setCarContenido(String carContenido) {
		this.carContenido = carContenido;
	}

	public String getCarConsecutivoCarta() {
		return this.carConsecutivoCarta;
	}

	public void setCarConsecutivoCarta(String carConsecutivoCarta) {
		this.carConsecutivoCarta = carConsecutivoCarta;
	}

	public Long getCarUsuarioRegistro() {
		return this.carUsuarioRegistro;
	}

	public void setCarUsuarioRegistro(Long carUsuarioRegistro) {
		this.carUsuarioRegistro = carUsuarioRegistro;
	}

	public Date getCarFechaRegistro() {
		return this.carFechaRegistro;
	}

	public void setCarFechaRegistro(Date carFechaRegistro) {
		this.carFechaRegistro = carFechaRegistro;
	}

	public Long getCarUsuarioGeneracion() {
		return this.carUsuarioGeneracion;
	}

	public void setCarUsuarioGeneracion(Long carUsuarioGeneracion) {
		this.carUsuarioGeneracion = carUsuarioGeneracion;
	}

	public Date getCarFechaGeneracion() {
		return this.carFechaGeneracion;
	}

	public void setCarFechaGeneracion(Date carFechaGeneracion) {
		this.carFechaGeneracion = carFechaGeneracion;
	}

	public Long getCarUsuarioRadicacion() {
		return this.carUsuarioRadicacion;
	}

	public void setCarUsuarioRadicacion(Long carUsuarioRadicacion) {
		this.carUsuarioRadicacion = carUsuarioRadicacion;
	}

	public Long getCarEstado() {
		return this.carEstado;
	}

	public void setCarEstado(Long carEstado) {
		this.carEstado = carEstado;
	}

}