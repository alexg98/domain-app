package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;

/**
 * AbstractSipAsoCambioVinEdad entity provides the base persistence definition of the SipAsoCambioVinEdad entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipAsoCambioVinEdad implements java.io.Serializable {

  // Fields

  /**
	 * 
	 */
	private static final long serialVersionUID = -8038440685431611656L;
private Long consecutivo;
  private Long asoNumint;
  private Short vinCod;
  private Boolean estado;
  private Timestamp fechaRegistro;

  // Constructors

  /** default constructor */
  public AbstractSipAsoCambioVinEdad() {
  }

  /** minimal constructor */
  public AbstractSipAsoCambioVinEdad(Long consecutivo, Long asoNumint, Short vinCod, Boolean estado) {
    this.consecutivo = consecutivo;
    this.asoNumint = asoNumint;
    this.vinCod = vinCod;
    this.estado = estado;
  }

  /** full constructor */
  public AbstractSipAsoCambioVinEdad(Long consecutivo, Long asoNumint, Short vinCod, Boolean estado, Timestamp fechaRegistro) {
    this.consecutivo = consecutivo;
    this.asoNumint = asoNumint;
    this.vinCod = vinCod;
    this.estado = estado;
    this.fechaRegistro = fechaRegistro;
  }

  // Property accessors

  public Long getConsecutivo() {
    return this.consecutivo;
  }

  public void setConsecutivo(Long consecutivo) {
    this.consecutivo = consecutivo;
  }

  public Long getAsoNumint() {
    return this.asoNumint;
  }

  public void setAsoNumint(Long asoNumint) {
    this.asoNumint = asoNumint;
  }

  public Short getVinCod() {
    return this.vinCod;
  }

  public void setVinCod(Short vinCod) {
    this.vinCod = vinCod;
  }

  public Boolean getEstado() {
    return this.estado;
  }

  public void setEstado(Boolean estado) {
    this.estado = estado;
  }

  public Timestamp getFechaRegistro() {
    return this.fechaRegistro;
  }

  public void setFechaRegistro(Timestamp fechaRegistro) {
    this.fechaRegistro = fechaRegistro;
  }

}