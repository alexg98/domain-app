package co.com.coomeva.sipas.core.model.sipasdb;


/**
 * AbstractSipPreguntas entity provides the base persistence definition of the
 * SipPreguntas entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipPreguntas implements java.io.Serializable {

	// Fields

	private Long preCodigo;
	private SipPreguntasTipo sipPreguntasTipo;
	private String preDesc;
	private String preTexto;
	private Long preCodSexo;
	private String preEstado;

	// Constructors

	/** default constructor */
	public AbstractSipPreguntas() {
	}

	/** full constructor */
	public AbstractSipPreguntas(Long preCodigo,
			SipPreguntasTipo sipPreguntasTipo, String preDesc, String preTexto,
			Long preCodSexo, String preEstado) {
		this.preCodigo = preCodigo;
		this.sipPreguntasTipo = sipPreguntasTipo;
		this.preDesc = preDesc;
		this.preTexto = preTexto;
		this.preCodSexo = preCodSexo;
		this.preEstado = preEstado;
	}

	// Property accessors

	public Long getPreCodigo() {
		return this.preCodigo;
	}

	public void setPreCodigo(Long preCodigo) {
		this.preCodigo = preCodigo;
	}

	public SipPreguntasTipo getSipPreguntasTipo() {
		return this.sipPreguntasTipo;
	}

	public void setSipPreguntasTipo(SipPreguntasTipo sipPreguntasTipo) {
		this.sipPreguntasTipo = sipPreguntasTipo;
	}

	public String getPreDesc() {
		return this.preDesc;
	}

	public void setPreDesc(String preDesc) {
		this.preDesc = preDesc;
	}

	public String getPreTexto() {
		return this.preTexto;
	}

	public void setPreTexto(String preTexto) {
		this.preTexto = preTexto;
	}

	public Long getPreCodSexo() {
		return this.preCodSexo;
	}

	public void setPreCodSexo(Long preCodSexo) {
		this.preCodSexo = preCodSexo;
	}

	public String getPreEstado() {
		return this.preEstado;
	}

	public void setPreEstado(String preEstado) {
		this.preEstado = preEstado;
	}

}