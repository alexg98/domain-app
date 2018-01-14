package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Set;

/**
 * SipTipoReservaMatematica entity. @author MyEclipse Persistence Tools
 */
public class SipTipoReservaMatematica extends AbstractSipTipoReservaMatematica
		implements java.io.Serializable {

	// Constructors

	/**
	 * 
	 */
	private static final long serialVersionUID = -6003527410538209012L;

	/** default constructor */
	public SipTipoReservaMatematica() {
	}

	/** minimal constructor */
	public SipTipoReservaMatematica(Long tipoResCodigo, String nombre,
			String descripcion, Boolean activo) {
		super(tipoResCodigo, nombre, descripcion, activo);
	}

	/** full constructor */
	public SipTipoReservaMatematica(Long tipoResCodigo, String nombre,
			String descripcion, Boolean activo, Set sipPorcenGtosAdmReservas) {
		super(tipoResCodigo, nombre, descripcion, activo,
				sipPorcenGtosAdmReservas);
	}

}
