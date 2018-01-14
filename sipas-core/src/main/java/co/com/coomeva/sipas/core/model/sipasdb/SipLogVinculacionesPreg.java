package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * SipLogVinculacionesPreg entity. @author MyEclipse Persistence Tools
 */

public class SipLogVinculacionesPreg implements java.io.Serializable {

	// Fields

	private SipLogVinculacionesPregId id;
	private String respuestaPregunta;
	private Long pretCodigo;

	// Constructors

	/** default constructor */
	public SipLogVinculacionesPreg() {
	}

	/** minimal constructor */
	public SipLogVinculacionesPreg(SipLogVinculacionesPregId id) {
		this.id = id;
	}

	/** full constructor */
	public SipLogVinculacionesPreg(SipLogVinculacionesPregId id,
			String respuestaPregunta, Long pretCodigo) {
		this.id = id;
		this.respuestaPregunta = respuestaPregunta;
		this.pretCodigo = pretCodigo;
	}

	// Property accessors

	public SipLogVinculacionesPregId getId() {
		return this.id;
	}

	public void setId(SipLogVinculacionesPregId id) {
		this.id = id;
	}

	public String getRespuestaPregunta() {
		return this.respuestaPregunta;
	}

	public void setRespuestaPregunta(String respuestaPregunta) {
		this.respuestaPregunta = respuestaPregunta;
	}

	public Long getPretCodigo() {
		return pretCodigo;
	}

	public void setPretCodigo(Long pretCodigo) {
		this.pretCodigo = pretCodigo;
	}
}