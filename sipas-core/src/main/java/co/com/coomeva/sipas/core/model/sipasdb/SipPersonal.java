package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;
import java.util.Set;

/**
 * SipPersonal entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SipPersonal extends AbstractSipPersonal implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipPersonal() {
	}

	/** minimal constructor */
	public SipPersonal(Long perCod, Long perTipoIdentificacion,
			Long perIdentificacion, String perApellido1, Long perUsuario, Date perFechaRegistro) {
		super(perCod, perTipoIdentificacion, perIdentificacion, perApellido1, perUsuario, perFechaRegistro);
	}

	/** full constructor */
	public SipPersonal(Long perCod, Long perTipoIdentificacion,
			Long perIdentificacion, String perNombres, String perApellido1,
			String perApellido2, String perCargo, String perCorreo,
			String perTelefono, String perDireccion, String perFax,
			Long perCiudad, String perEstado, String perFirma, Long perUsuario,
			Date perFechaRegistro, String perImagen, Set sipFirmas) {
		super(perCod, perTipoIdentificacion, perIdentificacion, perNombres, perApellido1, perApellido2, perCargo, perCorreo, perTelefono, perDireccion, perFax, perCiudad, perEstado, perFirma, perUsuario, perFechaRegistro, perImagen, sipFirmas);
	}

}
