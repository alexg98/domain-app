package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSipPersonal entity provides the base persistence definition of the
 * SipPersonal entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipPersonal implements java.io.Serializable {

	// Fields

	private Long perCod;
	private Long perTipoIdentificacion;
	private Long perIdentificacion;
	private String perNombres;
	private String perApellido1;
	private String perApellido2;
	private String perCargo;
	private String perCorreo;
	private String perTelefono;
	private String perDireccion;
	private String perFax;
	private Long perCiudad;
	private String perEstado;
	private String perFirma;
	private Long perUsuario;
	private Date perFechaRegistro;
	private String perImagen;
	private Set sipFirmas = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSipPersonal() {
	}

	/** minimal constructor */
	public AbstractSipPersonal(Long perCod, Long perTipoIdentificacion,
			Long perIdentificacion, String perApellido1, Long perUsuario,
			Date perFechaRegistro) {
		this.perCod = perCod;
		this.perTipoIdentificacion = perTipoIdentificacion;
		this.perIdentificacion = perIdentificacion;
		this.perApellido1 = perApellido1;
		this.perUsuario = perUsuario;
		this.perFechaRegistro = perFechaRegistro;
	}

	/** full constructor */
	public AbstractSipPersonal(Long perCod, Long perTipoIdentificacion,
			Long perIdentificacion, String perNombres, String perApellido1,
			String perApellido2, String perCargo, String perCorreo,
			String perTelefono, String perDireccion, String perFax,
			Long perCiudad, String perEstado, String perFirma, Long perUsuario,
			Date perFechaRegistro, String perImagen, Set sipFirmas) {
		this.perCod = perCod;
		this.perTipoIdentificacion = perTipoIdentificacion;
		this.perIdentificacion = perIdentificacion;
		this.perNombres = perNombres;
		this.perApellido1 = perApellido1;
		this.perApellido2 = perApellido2;
		this.perCargo = perCargo;
		this.perCorreo = perCorreo;
		this.perTelefono = perTelefono;
		this.perDireccion = perDireccion;
		this.perFax = perFax;
		this.perCiudad = perCiudad;
		this.perEstado = perEstado;
		this.perFirma = perFirma;
		this.perUsuario = perUsuario;
		this.perFechaRegistro = perFechaRegistro;
		this.perImagen = perImagen;
		this.sipFirmas = sipFirmas;
	}

	// Property accessors

	public Long getPerCod() {
		return this.perCod;
	}

	public void setPerCod(Long perCod) {
		this.perCod = perCod;
	}

	public Long getPerTipoIdentificacion() {
		return this.perTipoIdentificacion;
	}

	public void setPerTipoIdentificacion(Long perTipoIdentificacion) {
		this.perTipoIdentificacion = perTipoIdentificacion;
	}

	public Long getPerIdentificacion() {
		return this.perIdentificacion;
	}

	public void setPerIdentificacion(Long perIdentificacion) {
		this.perIdentificacion = perIdentificacion;
	}

	public String getPerNombres() {
		return this.perNombres;
	}

	public void setPerNombres(String perNombres) {
		this.perNombres = perNombres;
	}

	public String getPerApellido1() {
		return this.perApellido1;
	}

	public void setPerApellido1(String perApellido1) {
		this.perApellido1 = perApellido1;
	}

	public String getPerApellido2() {
		return this.perApellido2;
	}

	public void setPerApellido2(String perApellido2) {
		this.perApellido2 = perApellido2;
	}

	public String getPerCargo() {
		return this.perCargo;
	}

	public void setPerCargo(String perCargo) {
		this.perCargo = perCargo;
	}

	public String getPerCorreo() {
		return this.perCorreo;
	}

	public void setPerCorreo(String perCorreo) {
		this.perCorreo = perCorreo;
	}

	public String getPerTelefono() {
		return this.perTelefono;
	}

	public void setPerTelefono(String perTelefono) {
		this.perTelefono = perTelefono;
	}

	public String getPerDireccion() {
		return this.perDireccion;
	}

	public void setPerDireccion(String perDireccion) {
		this.perDireccion = perDireccion;
	}

	public String getPerFax() {
		return this.perFax;
	}

	public void setPerFax(String perFax) {
		this.perFax = perFax;
	}

	public Long getPerCiudad() {
		return this.perCiudad;
	}

	public void setPerCiudad(Long perCiudad) {
		this.perCiudad = perCiudad;
	}

	public String getPerEstado() {
		return this.perEstado;
	}

	public void setPerEstado(String perEstado) {
		this.perEstado = perEstado;
	}

	public String getPerFirma() {
		return this.perFirma;
	}

	public void setPerFirma(String perFirma) {
		this.perFirma = perFirma;
	}

	public Long getPerUsuario() {
		return this.perUsuario;
	}

	public void setPerUsuario(Long perUsuario) {
		this.perUsuario = perUsuario;
	}

	public Date getPerFechaRegistro() {
		return this.perFechaRegistro;
	}

	public void setPerFechaRegistro(Date perFechaRegistro) {
		this.perFechaRegistro = perFechaRegistro;
	}

	public String getPerImagen() {
		return this.perImagen;
	}

	public void setPerImagen(String perImagen) {
		this.perImagen = perImagen;
	}

	public Set getSipFirmas() {
		return this.sipFirmas;
	}

	public void setSipFirmas(Set sipFirmas) {
		this.sipFirmas = sipFirmas;
	}

}