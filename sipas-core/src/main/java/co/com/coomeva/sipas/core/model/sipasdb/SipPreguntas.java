package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * SipPreguntas entity. @author MyEclipse Persistence Tools
 */
public class SipPreguntas extends AbstractSipPreguntas implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipPreguntas() {
	}

	/** full constructor */
	public SipPreguntas(Long preCodigo,
			SipPreguntasTipo sipPreguntasTipo, String preDesc, String preTexto,
			Long preCodSexo, String preEstado) {
		super(preCodigo, sipPreguntasTipo, preDesc, preTexto, preCodSexo,
				preEstado);
	}

}
