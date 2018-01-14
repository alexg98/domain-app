package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;

/**
 * SipFactoresDescuento entity. @author MyEclipse Persistence Tools
 */
public class SipFactoresDescuento extends AbstractSipFactoresDescuento
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SipFactoresDescuento() {
	}

	/** minimal constructor */
	public SipFactoresDescuento(Long desCod, Short desAno, Byte desTipo) {
		super(desCod, desAno, desTipo);
	}

	/** full constructor */
	public SipFactoresDescuento(Long desCod, Short desAno, Byte desTipo,
			Double desValor, String desEstado, Timestamp desFechaRegistro) {
		super(desCod, desAno, desTipo, desValor, desEstado, desFechaRegistro);
	}

}
