package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;

/**
 * AbstractSipFactorInactividadEId entity provides the base persistence
 * definition of the SipFactorInactividadEId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipFactorInactividadEId implements
		java.io.Serializable {

	// Fields

	private String faeFactorCodigo;
	private String faePerCodigo;
	private String faeEdad;
	private String faeProdCodigo;
	private String faeGenero;
	private String faeValor;
	private String faeAno;
	private String faeUsuario;
	private Timestamp faeFechaRegistro;

	// Constructors

	/** default constructor */
	public AbstractSipFactorInactividadEId() {
	}

	/** full constructor */
	public AbstractSipFactorInactividadEId(String faeFactorCodigo,
			String faePerCodigo, String faeEdad, String faeProdCodigo,
			String faeGenero, String faeValor, String faeAno,
			String faeUsuario, Timestamp faeFechaRegistro) {
		this.faeFactorCodigo = faeFactorCodigo;
		this.faePerCodigo = faePerCodigo;
		this.faeEdad = faeEdad;
		this.faeProdCodigo = faeProdCodigo;
		this.faeGenero = faeGenero;
		this.faeValor = faeValor;
		this.faeAno = faeAno;
		this.faeUsuario = faeUsuario;
		this.faeFechaRegistro = faeFechaRegistro;
	}

	// Property accessors

	public String getFaeFactorCodigo() {
		return this.faeFactorCodigo;
	}

	public void setFaeFactorCodigo(String faeFactorCodigo) {
		this.faeFactorCodigo = faeFactorCodigo;
	}

	public String getFaePerCodigo() {
		return this.faePerCodigo;
	}

	public void setFaePerCodigo(String faePerCodigo) {
		this.faePerCodigo = faePerCodigo;
	}

	public String getFaeEdad() {
		return this.faeEdad;
	}

	public void setFaeEdad(String faeEdad) {
		this.faeEdad = faeEdad;
	}

	public String getFaeProdCodigo() {
		return this.faeProdCodigo;
	}

	public void setFaeProdCodigo(String faeProdCodigo) {
		this.faeProdCodigo = faeProdCodigo;
	}

	public String getFaeGenero() {
		return this.faeGenero;
	}

	public void setFaeGenero(String faeGenero) {
		this.faeGenero = faeGenero;
	}

	public String getFaeValor() {
		return this.faeValor;
	}

	public void setFaeValor(String faeValor) {
		this.faeValor = faeValor;
	}

	public String getFaeAno() {
		return this.faeAno;
	}

	public void setFaeAno(String faeAno) {
		this.faeAno = faeAno;
	}

	public String getFaeUsuario() {
		return this.faeUsuario;
	}

	public void setFaeUsuario(String faeUsuario) {
		this.faeUsuario = faeUsuario;
	}

	public Timestamp getFaeFechaRegistro() {
		return this.faeFechaRegistro;
	}

	public void setFaeFechaRegistro(Timestamp faeFechaRegistro) {
		this.faeFechaRegistro = faeFechaRegistro;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSipFactorInactividadEId))
			return false;
		AbstractSipFactorInactividadEId castOther = (AbstractSipFactorInactividadEId) other;

		return ((this.getFaeFactorCodigo() == castOther.getFaeFactorCodigo()) || (this
				.getFaeFactorCodigo() != null
				&& castOther.getFaeFactorCodigo() != null && this
				.getFaeFactorCodigo().equals(castOther.getFaeFactorCodigo())))
				&& ((this.getFaePerCodigo() == castOther.getFaePerCodigo()) || (this
						.getFaePerCodigo() != null
						&& castOther.getFaePerCodigo() != null && this
						.getFaePerCodigo().equals(castOther.getFaePerCodigo())))
				&& ((this.getFaeEdad() == castOther.getFaeEdad()) || (this
						.getFaeEdad() != null
						&& castOther.getFaeEdad() != null && this.getFaeEdad()
						.equals(castOther.getFaeEdad())))
				&& ((this.getFaeProdCodigo() == castOther.getFaeProdCodigo()) || (this
						.getFaeProdCodigo() != null
						&& castOther.getFaeProdCodigo() != null && this
						.getFaeProdCodigo()
						.equals(castOther.getFaeProdCodigo())))
				&& ((this.getFaeGenero() == castOther.getFaeGenero()) || (this
						.getFaeGenero() != null
						&& castOther.getFaeGenero() != null && this
						.getFaeGenero().equals(castOther.getFaeGenero())))
				&& ((this.getFaeValor() == castOther.getFaeValor()) || (this
						.getFaeValor() != null
						&& castOther.getFaeValor() != null && this
						.getFaeValor().equals(castOther.getFaeValor())))
				&& ((this.getFaeAno() == castOther.getFaeAno()) || (this
						.getFaeAno() != null
						&& castOther.getFaeAno() != null && this.getFaeAno()
						.equals(castOther.getFaeAno())))
				&& ((this.getFaeUsuario() == castOther.getFaeUsuario()) || (this
						.getFaeUsuario() != null
						&& castOther.getFaeUsuario() != null && this
						.getFaeUsuario().equals(castOther.getFaeUsuario())))
				&& ((this.getFaeFechaRegistro() == castOther
						.getFaeFechaRegistro()) || (this.getFaeFechaRegistro() != null
						&& castOther.getFaeFechaRegistro() != null && this
						.getFaeFechaRegistro().equals(
								castOther.getFaeFechaRegistro())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFaeFactorCodigo() == null ? 0 : this.getFaeFactorCodigo()
						.hashCode());
		result = 37
				* result
				+ (getFaePerCodigo() == null ? 0 : this.getFaePerCodigo()
						.hashCode());
		result = 37 * result
				+ (getFaeEdad() == null ? 0 : this.getFaeEdad().hashCode());
		result = 37
				* result
				+ (getFaeProdCodigo() == null ? 0 : this.getFaeProdCodigo()
						.hashCode());
		result = 37 * result
				+ (getFaeGenero() == null ? 0 : this.getFaeGenero().hashCode());
		result = 37 * result
				+ (getFaeValor() == null ? 0 : this.getFaeValor().hashCode());
		result = 37 * result
				+ (getFaeAno() == null ? 0 : this.getFaeAno().hashCode());
		result = 37
				* result
				+ (getFaeUsuario() == null ? 0 : this.getFaeUsuario()
						.hashCode());
		result = 37
				* result
				+ (getFaeFechaRegistro() == null ? 0 : this
						.getFaeFechaRegistro().hashCode());
		return result;
	}

}