package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;

/**
 * AbstractSipLogIncrementosAuto entity provides the base persistence definition
 * of the SipLogIncrementosAuto entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipLogIncrementosAuto implements
		java.io.Serializable {

	private static final long serialVersionUID = 1L;
	// Fields

	private Long incrCodigo;
	private String incrRegistroOriginal;
	private Long incrResultado;
	private Long incrFlujo;
	private String incrEstadoProteccion;
	private String incrObservaciones;
	private String incrResultadoDesc;
	private String incrUsuario;
	private Date incrFechaRegistro;
	private Long incrCodigoLogCod;

	// Constructors

	/** default constructor */
	public AbstractSipLogIncrementosAuto() {
	}

	/** minimal constructor */
	public AbstractSipLogIncrementosAuto(Long incrCodigo,
			String incrRegistroOriginal, Long incrResultado,
			String incrUsuario, Date incrFechaRegistro, Long incrCodigoLogCod) {
		this.incrCodigo = incrCodigo;
		this.incrRegistroOriginal = incrRegistroOriginal;
		this.incrResultado = incrResultado;
		this.incrUsuario = incrUsuario;
		this.incrFechaRegistro = incrFechaRegistro;
		this.incrCodigoLogCod = incrCodigoLogCod;
	}

	/** full constructor */
	public AbstractSipLogIncrementosAuto(Long incrCodigo,
			String incrRegistroOriginal, Long incrResultado,
			Long incrFlujo, String incrEstadoProteccion, 
			String incrObservaciones, String incrResultadoDesc,String incrUsuario, 
			Date incrFechaRegistro, Long incrCodigoLogCod) {
		this.incrCodigo = incrCodigo;
		this.incrRegistroOriginal = incrRegistroOriginal;
		this.incrResultado = incrResultado;
		this.incrFlujo = incrFlujo;
		this.incrEstadoProteccion = incrEstadoProteccion;
		this.incrObservaciones = incrObservaciones;
		this.incrUsuario = incrUsuario;
		this.incrFechaRegistro = incrFechaRegistro;
		this.incrCodigoLogCod = incrCodigoLogCod;
		this.incrResultadoDesc = incrResultadoDesc;
	}

	// Property accessors

	public Long getIncrCodigo() {
		return this.incrCodigo;
	}

	public void setIncrCodigo(Long incrCodigo) {
		this.incrCodigo = incrCodigo;
	}

	public String getIncrRegistroOriginal() {
		return this.incrRegistroOriginal;
	}

	public void setIncrRegistroOriginal(String incrRegistroOriginal) {
		this.incrRegistroOriginal = incrRegistroOriginal;
	}

	public Long getIncrResultado() {
		return this.incrResultado;
	}

	public void setIncrResultado(Long incrResultado) {
		this.incrResultado = incrResultado;
	}

	public Long getIncrFlujo() {
		return this.incrFlujo;
	}

	public void setIncrFlujo(Long incrFlujo) {
		this.incrFlujo = incrFlujo;
	}

	public String getIncrEstadoProteccion() {
		return this.incrEstadoProteccion;
	}

	public void setIncrEstadoProteccion(String incrEstadoProteccion) {
		this.incrEstadoProteccion = incrEstadoProteccion;
	}

	public String getIncrObservaciones() {
		return this.incrObservaciones;
	}

	public void setIncrObservaciones(String incrObservaciones) {
		this.incrObservaciones = incrObservaciones;
	}

	public String getIncrUsuario() {
		return this.incrUsuario;
	}

	public void setIncrUsuario(String incrUsuario) {
		this.incrUsuario = incrUsuario;
	}

	public Date getIncrFechaRegistro() {
		return this.incrFechaRegistro;
	}

	public void setIncrFechaRegistro(Date incrFechaRegistro) {
		this.incrFechaRegistro = incrFechaRegistro;
	}
	

	public Long getIncrCodigoLogCod() {
		return incrCodigoLogCod;
	}

	public void setIncrCodigoLogCod(Long incrCodigoLogCod) {
		this.incrCodigoLogCod = incrCodigoLogCod;
	}
	
	public String getIncrResultadoDesc() {
		return incrResultadoDesc;
	}

	public void setIncrResultadoDesc(String incrResultadoDesc) {
		this.incrResultadoDesc = incrResultadoDesc;
	}

}