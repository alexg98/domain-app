package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;

/**
 * AbstractSipClinton entity provides the base persistence definition of the
 * SipClinton entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipClinton implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 6454977282909607678L;
	private Long cliCodigo;
	private Long cliNit;
	private Long cliTipoIdentificacion;
	private String cliNombre;
	private String cliTipo;
	private Date cliFechaNacimiento;
	private Date cliFechaCartaBen;
	private String cliEstado;
	private Date cliFechaRegistro;

	// Constructors

	/** default constructor */
	public AbstractSipClinton() {
	}

	/** minimal constructor */
	public AbstractSipClinton(Long cliCodigo, Long cliNit,
			Long cliTipoIdentificacion, String cliNombre, String cliTipo,
			Date cliFechaNacimiento, String cliEstado,
			Date cliFechaRegistro) {
		this.cliCodigo = cliCodigo;
		this.cliNit = cliNit;
		this.cliTipoIdentificacion = cliTipoIdentificacion;
		this.cliNombre = cliNombre;
		this.cliTipo = cliTipo;
		this.cliFechaNacimiento = cliFechaNacimiento;
		this.cliEstado = cliEstado;
		this.cliFechaRegistro = cliFechaRegistro;
	}

	/** full constructor */
	public AbstractSipClinton(Long cliCodigo, Long cliNit,
			Long cliTipoIdentificacion, String cliNombre, String cliTipo,
			Date cliFechaNacimiento, Date cliFechaCartaBen, String cliEstado,
			Date cliFechaRegistro) {
		this.cliCodigo = cliCodigo;
		this.cliNit = cliNit;
		this.cliTipoIdentificacion = cliTipoIdentificacion;
		this.cliNombre = cliNombre;
		this.cliTipo = cliTipo;
		this.cliFechaNacimiento = cliFechaNacimiento;
		this.cliFechaCartaBen = cliFechaCartaBen;
		this.cliEstado = cliEstado;
		this.cliFechaRegistro = cliFechaRegistro;
	}

	// Property accessors

	public Long getCliCodigo() {
		return this.cliCodigo;
	}

	public void setCliCodigo(Long cliCodigo) {
		this.cliCodigo = cliCodigo;
	}

	public Long getCliNit() {
		return this.cliNit;
	}

	public void setCliNit(Long cliNit) {
		this.cliNit = cliNit;
	}

	public Long getCliTipoIdentificacion() {
		return this.cliTipoIdentificacion;
	}

	public void setCliTipoIdentificacion(Long cliTipoIdentificacion) {
		this.cliTipoIdentificacion = cliTipoIdentificacion;
	}

	public String getCliNombre() {
		return this.cliNombre;
	}

	public void setCliNombre(String cliNombre) {
		this.cliNombre = cliNombre;
	}

	public String getCliTipo() {
		return this.cliTipo;
	}

	public void setCliTipo(String cliTipo) {
		this.cliTipo = cliTipo;
	}

	public Date getCliFechaNacimiento() {
		return this.cliFechaNacimiento;
	}

	public void setCliFechaNacimiento(Date cliFechaNacimiento) {
		this.cliFechaNacimiento = cliFechaNacimiento;
	}

	public Date getCliFechaCartaBen() {
		return this.cliFechaCartaBen;
	}

	public void setCliFechaCartaBen(Date cliFechaCartaBen) {
		this.cliFechaCartaBen = cliFechaCartaBen;
	}

	public String getCliEstado() {
		return this.cliEstado;
	}

	public void setCliEstado(String cliEstado) {
		this.cliEstado = cliEstado;
	}

	public Date getCliFechaRegistro() {
		return this.cliFechaRegistro;
	}

	public void setCliFechaRegistro(Date cliFechaRegistro) {
		this.cliFechaRegistro = cliFechaRegistro;
	}

}