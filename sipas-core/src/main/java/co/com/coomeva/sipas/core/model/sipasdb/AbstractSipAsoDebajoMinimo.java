package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;

/**
 * AbstractSipAsoDebajoMinimo entity provides the base persistence definition of the SipAsoDebajoMinimo entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipAsoDebajoMinimo implements java.io.Serializable {

  // Fields

  /**
	 * 
	 */
	private static final long serialVersionUID = 9183597326165818760L;
private Long consecutivo;
  private Long asoNumint;
  private Timestamp fechaRegistro;

  // Constructors

  /** default constructor */
  public AbstractSipAsoDebajoMinimo() {
  }

  /** minimal constructor */
  public AbstractSipAsoDebajoMinimo(Long consecutivo, Long asoNumint) {
    this.consecutivo = consecutivo;
    this.asoNumint = asoNumint;
  }

  /** full constructor */
  public AbstractSipAsoDebajoMinimo(Long consecutivo, Long asoNumint, Timestamp fechaRegistro) {
    this.consecutivo = consecutivo;
    this.asoNumint = asoNumint;
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

  public Timestamp getFechaRegistro() {
    return this.fechaRegistro;
  }

  public void setFechaRegistro(Timestamp fechaRegistro) {
    this.fechaRegistro = fechaRegistro;
  }

}