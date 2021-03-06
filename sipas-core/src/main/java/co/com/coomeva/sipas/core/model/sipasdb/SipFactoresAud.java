package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Date;


/**
 * SipFactoresAud generated by MyEclipse - Hibernate Tools
 */
public class SipFactoresAud extends AbstractSipFactoresAud implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipFactoresAud() {
    }

	/** minimal constructor */
    public SipFactoresAud(Long consecutivo, Long factorCodigo, Long perCodigo, Double valor, String usuario, Date fechaRegistro) {
        super(consecutivo, factorCodigo, perCodigo, valor, usuario, fechaRegistro);        
    }
    
    /** full constructor */
    public SipFactoresAud(Long consecutivo, Long factorCodigo, Long codigo, Long tipCod, Long vinCod, Long perCodigo, Long edad, Double valor, String usuario, Date fechaRegistro, String incremento, Long ano) {
        super(consecutivo, factorCodigo, codigo, tipCod, vinCod, perCodigo, edad, valor, usuario, fechaRegistro, incremento, ano);        
    }
   
}
