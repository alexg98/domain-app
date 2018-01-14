package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;

/**
 * SipClinton entity. @author MyEclipse Persistence Tools
 */
public class SipClinton extends AbstractSipClinton implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipClinton() {
	}

	/** minimal constructor */
	public SipClinton(Long cliCodigo, Long cliNit,
			Long cliTipoIdentificacion, String cliNombre, String cliTipo,
			Date cliFechaNacimiento, String cliEstado,
			Date cliFechaRegistro) {
		super(cliCodigo, cliNit, cliTipoIdentificacion, cliNombre, cliTipo,
				cliFechaNacimiento, cliEstado, cliFechaRegistro);
	}

	/** full constructor */
	public SipClinton(Long cliCodigo, Long cliNit,
			Long cliTipoIdentificacion, String cliNombre, String cliTipo,
			Date cliFechaNacimiento, Date cliFechaCartaBen, String cliEstado,
			Date cliFechaRegistro) {
		super(cliCodigo, cliNit, cliTipoIdentificacion, cliNombre, cliTipo,
				cliFechaNacimiento, cliFechaCartaBen, cliEstado,
				cliFechaRegistro);
	}

}
