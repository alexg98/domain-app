package co.com.coomeva.sipas.core.model.sipasdb;


import java.util.Date;

/**
 * AbstractSipLogAsociadosPerseAnticipadas entity provides the base persistence
 * definition of the SipLogAsociadosPerseAnticipadas entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipLogAsociadosPerseAnticipadas implements
		java.io.Serializable {

	// Fields

	private Long aspCodigo;
	private String aspRegistroOriginal;
	private Long aspResultado;
	private String aspObservaciones;
	private Long aspUsuarioRegistro;
	private Date aspFechaRegistro;

	// Constructors

	/** default constructor */
	public AbstractSipLogAsociadosPerseAnticipadas() {
	}

	/** minimal constructor */
	public AbstractSipLogAsociadosPerseAnticipadas(Long aspCodigo,
			Long aspUsuarioRegistro, Date aspFechaRegistro) {
		this.aspCodigo = aspCodigo;
		this.aspUsuarioRegistro = aspUsuarioRegistro;
		this.aspFechaRegistro = aspFechaRegistro;
	}

	/** full constructor */
	public AbstractSipLogAsociadosPerseAnticipadas(Long aspCodigo,
			String aspRegistroOriginal, Long aspResultado, String aspObservaciones,
			Long aspUsuarioRegistro, Date aspFechaRegistro) {
		this.aspCodigo = aspCodigo;
		this.aspRegistroOriginal = aspRegistroOriginal;
		this.aspResultado = aspResultado;
		this.aspObservaciones = aspObservaciones;
		this.aspUsuarioRegistro = aspUsuarioRegistro;
		this.aspFechaRegistro = aspFechaRegistro;
	}

	// Property accessors

	public Long getAspCodigo() {
		return this.aspCodigo;
	}

	public void setAspCodigo(Long aspCodigo) {
		this.aspCodigo = aspCodigo;
	}

	public String getAspRegistroOriginal() {
		return this.aspRegistroOriginal;
	}

	public void setAspRegistroOriginal(String aspRegistroOriginal) {
		this.aspRegistroOriginal = aspRegistroOriginal;
	}

	public Long getAspResultado() {
		return this.aspResultado;
	}

	public void setAspResultado(Long aspResultado) {
		this.aspResultado = aspResultado;
	}

	public String getAspObservaciones() {
		return aspObservaciones;
	}

	public void setAspObservaciones(String aspObservaciones) {
		this.aspObservaciones = aspObservaciones;
	}

	public Long getAspUsuarioRegistro() {
		return this.aspUsuarioRegistro;
	}

	public void setAspUsuarioRegistro(Long aspUsuarioRegistro) {
		this.aspUsuarioRegistro = aspUsuarioRegistro;
	}

	public Date getAspFechaRegistro() {
		return this.aspFechaRegistro;
	}

	public void setAspFechaRegistro(Date aspFechaRegistro) {
		this.aspFechaRegistro = aspFechaRegistro;
	}

}