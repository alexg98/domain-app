package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;

/**
 * SipAsoCambioVinEdad entity. @author MyEclipse Persistence Tools
 */
public class SipAsoCambioVinEdad extends AbstractSipAsoCambioVinEdad implements java.io.Serializable {

  // Constructors

  /** default constructor */
  public SipAsoCambioVinEdad() {
  }

  /** minimal constructor */
  public SipAsoCambioVinEdad(Long consecutivo, Long asoNumint, Short vinCod, Boolean estado) {
    super(consecutivo, asoNumint, vinCod, estado);
  }

  /** full constructor */
  public SipAsoCambioVinEdad(Long consecutivo, Long asoNumint, Short vinCod, Boolean estado, Timestamp fechaRegistro) {
    super(consecutivo, asoNumint, vinCod, estado, fechaRegistro);
  }

}
