package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;

/**
 * SipAsoDebajoMinimo entity. @author MyEclipse Persistence Tools
 */
public class SipAsoDebajoMinimo extends AbstractSipAsoDebajoMinimo implements java.io.Serializable {

  // Constructors

  /** default constructor */
  public SipAsoDebajoMinimo() {
  }

  /** minimal constructor */
  public SipAsoDebajoMinimo(Long consecutivo, Long asoNumint) {
    super(consecutivo, asoNumint);
  }

  /** full constructor */
  public SipAsoDebajoMinimo(Long consecutivo, Long asoNumint, Timestamp fechaRegistro) {
    super(consecutivo, asoNumint, fechaRegistro);
  }

}
