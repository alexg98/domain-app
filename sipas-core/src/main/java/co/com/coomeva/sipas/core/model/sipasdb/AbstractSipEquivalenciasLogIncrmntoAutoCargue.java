package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractSipEquivalenciasLogIncrmntoAutoCargue entity provides the base
 * persistence definition of the SipEquivalenciasLogIncrmntoAutoCargue entity. @author
 * MyEclipse Persistence Tools
 */

public abstract class AbstractSipEquivalenciasLogIncrmntoAutoCargue implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -5502523567158501335L;
	private Long iacCodigo;
	private Timestamp iacRanFechaCargue;
	private BigDecimal iacIdRegistro;
	private Timestamp iacFechaRegistro;
	private BigDecimal iacIdentificacionAsociado;
	private String iacProducto;
	private String iacPromocion;
	private String iacValorIncremento;
	private Date iacFechaVenta;
	private Date iacFechaNacimiento;
	private String iacPreexistencia;
	private String iacPeso;
	private String iacTalla;
	private Double iacIndiceMasaCorporal;
	private String iacPregunta1;
	private String iacPregunta2;
	private String iacPregunta3;
	private String iacPregunta4;
	private String iacPregunta5;
	private String iacPregunta6;
	private String iacResultadoCargue;
	private String iacResultadoCargueDesc;
	private String iacNumeroSolicitud;
	private String iacEstadoSolicitud;
	private String iacObservaciones;

	// Constructors

	/** default constructor */
	public AbstractSipEquivalenciasLogIncrmntoAutoCargue() {
	}

	/** minimal constructor */
	public AbstractSipEquivalenciasLogIncrmntoAutoCargue(Long iacCodigo) {
		this.iacCodigo = iacCodigo;
	}

	/** full constructor */
	public AbstractSipEquivalenciasLogIncrmntoAutoCargue(Long iacCodigo, Timestamp iacRanFechaCargue,
			BigDecimal iacIdRegistro, Timestamp iacFechaRegistro, BigDecimal iacIdentificacionAsociado,
			String iacProducto, String iacPromocion, String iacValorIncremento, Date iacFechaVenta,
			Date iacFechaNacimiento, String iacPreexistencia, String iacPeso, String iacTalla,
			Double iacIndiceMasaCorporal, String iacPregunta1, String iacPregunta2, String iacPregunta3,
			String iacPregunta4, String iacPregunta5, String iacPregunta6, String iacResultadoCargue,
			String iacNumeroSolicitud, String iacEstadoSolicitud, String iacObservaciones, String iacResultadoCargueDesc) {
		this.iacCodigo = iacCodigo;
		this.iacRanFechaCargue = iacRanFechaCargue;
		this.iacIdRegistro = iacIdRegistro;
		this.iacFechaRegistro = iacFechaRegistro;
		this.iacIdentificacionAsociado = iacIdentificacionAsociado;
		this.iacProducto = iacProducto;
		this.iacPromocion = iacPromocion;
		this.iacValorIncremento = iacValorIncremento;
		this.iacFechaVenta = iacFechaVenta;
		this.iacFechaNacimiento = iacFechaNacimiento;
		this.iacPreexistencia = iacPreexistencia;
		this.iacPeso = iacPeso;
		this.iacTalla = iacTalla;
		this.iacIndiceMasaCorporal = iacIndiceMasaCorporal;
		this.iacPregunta1 = iacPregunta1;
		this.iacPregunta2 = iacPregunta2;
		this.iacPregunta3 = iacPregunta3;
		this.iacPregunta4 = iacPregunta4;
		this.iacPregunta5 = iacPregunta5;
		this.iacPregunta6 = iacPregunta6;
		this.iacResultadoCargue = iacResultadoCargue;
		this.iacNumeroSolicitud = iacNumeroSolicitud;
		this.iacEstadoSolicitud = iacEstadoSolicitud;
		this.iacObservaciones = iacObservaciones;
		this.iacResultadoCargueDesc = iacResultadoCargueDesc;
	}

	// Property accessors

	public Long getIacCodigo() {
		return this.iacCodigo;
	}

	public void setIacCodigo(Long iacCodigo) {
		this.iacCodigo = iacCodigo;
	}

	public Timestamp getIacRanFechaCargue() {
		return this.iacRanFechaCargue;
	}

	public void setIacRanFechaCargue(Timestamp iacRanFechaCargue) {
		this.iacRanFechaCargue = iacRanFechaCargue;
	}

	public BigDecimal getIacIdRegistro() {
		return this.iacIdRegistro;
	}

	public void setIacIdRegistro(BigDecimal iacIdRegistro) {
		this.iacIdRegistro = iacIdRegistro;
	}

	public Timestamp getIacFechaRegistro() {
		return this.iacFechaRegistro;
	}

	public void setIacFechaRegistro(Timestamp iacFechaRegistro) {
		this.iacFechaRegistro = iacFechaRegistro;
	}

	public BigDecimal getIacIdentificacionAsociado() {
		return this.iacIdentificacionAsociado;
	}

	public void setIacIdentificacionAsociado(BigDecimal iacIdentificacionAsociado) {
		this.iacIdentificacionAsociado = iacIdentificacionAsociado;
	}

	public String getIacProducto() {
		return this.iacProducto;
	}

	public void setIacProducto(String iacProducto) {
		this.iacProducto = iacProducto;
	}

	public String getIacPromocion() {
		return this.iacPromocion;
	}

	public void setIacPromocion(String iacPromocion) {
		this.iacPromocion = iacPromocion;
	}

	public String getIacValorIncremento() {
		return this.iacValorIncremento;
	}

	public void setIacValorIncremento(String iacValorIncremento) {
		this.iacValorIncremento = iacValorIncremento;
	}

	public Date getIacFechaVenta() {
		return this.iacFechaVenta;
	}

	public void setIacFechaVenta(Date iacFechaVenta) {
		this.iacFechaVenta = iacFechaVenta;
	}

	public Date getIacFechaNacimiento() {
		return this.iacFechaNacimiento;
	}

	public void setIacFechaNacimiento(Date iacFechaNacimiento) {
		this.iacFechaNacimiento = iacFechaNacimiento;
	}

	public String getIacPreexistencia() {
		return this.iacPreexistencia;
	}

	public void setIacPreexistencia(String iacPreexistencia) {
		this.iacPreexistencia = iacPreexistencia;
	}

	public String getIacPeso() {
		return this.iacPeso;
	}

	public void setIacPeso(String iacPeso) {
		this.iacPeso = iacPeso;
	}

	public String getIacTalla() {
		return this.iacTalla;
	}

	public void setIacTalla(String iacTalla) {
		this.iacTalla = iacTalla;
	}

	public Double getIacIndiceMasaCorporal() {
		return this.iacIndiceMasaCorporal;
	}

	public void setIacIndiceMasaCorporal(Double iacIndiceMasaCorporal) {
		this.iacIndiceMasaCorporal = iacIndiceMasaCorporal;
	}

	public String getIacPregunta1() {
		return this.iacPregunta1;
	}

	public void setIacPregunta1(String iacPregunta1) {
		this.iacPregunta1 = iacPregunta1;
	}

	public String getIacPregunta2() {
		return this.iacPregunta2;
	}

	public void setIacPregunta2(String iacPregunta2) {
		this.iacPregunta2 = iacPregunta2;
	}

	public String getIacPregunta3() {
		return this.iacPregunta3;
	}

	public void setIacPregunta3(String iacPregunta3) {
		this.iacPregunta3 = iacPregunta3;
	}

	public String getIacPregunta4() {
		return this.iacPregunta4;
	}

	public void setIacPregunta4(String iacPregunta4) {
		this.iacPregunta4 = iacPregunta4;
	}

	public String getIacPregunta5() {
		return this.iacPregunta5;
	}

	public void setIacPregunta5(String iacPregunta5) {
		this.iacPregunta5 = iacPregunta5;
	}

	public String getIacPregunta6() {
		return this.iacPregunta6;
	}

	public void setIacPregunta6(String iacPregunta6) {
		this.iacPregunta6 = iacPregunta6;
	}

	public String getIacResultadoCargue() {
		return this.iacResultadoCargue;
	}

	public void setIacResultadoCargue(String iacResultadoCargue) {
		this.iacResultadoCargue = iacResultadoCargue;
	}

	public String getIacNumeroSolicitud() {
		return this.iacNumeroSolicitud;
	}

	public void setIacNumeroSolicitud(String iacNumeroSolicitud) {
		this.iacNumeroSolicitud = iacNumeroSolicitud;
	}

	public String getIacEstadoSolicitud() {
		return this.iacEstadoSolicitud;
	}

	public void setIacEstadoSolicitud(String iacEstadoSolicitud) {
		this.iacEstadoSolicitud = iacEstadoSolicitud;
	}

	public String getIacObservaciones() {
		return this.iacObservaciones;
	}

	public void setIacObservaciones(String iacObservaciones) {
		this.iacObservaciones = iacObservaciones;
	}

	public String getIacResultadoCargueDesc() {
		return iacResultadoCargueDesc;
	}

	public void setIacResultadoCargueDesc(String iacResultadoCargueDesc) {
		this.iacResultadoCargueDesc = iacResultadoCargueDesc;
	}
}