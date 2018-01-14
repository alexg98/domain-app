package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Date;
import java.util.Set;


/**
 * SipDetalleAuxProd generated by MyEclipse - Hibernate Tools
 */
public class SipDetalleAuxProd extends AbstractSipDetalleAuxProd implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipDetalleAuxProd() {
    }

	/** minimal constructor */
    public SipDetalleAuxProd(SipDetalleAuxProdId id, SipAuxilios sipAuxilios, SipProductos sipProductos) {
        super(id, sipAuxilios, sipProductos);        
    }
    
    /** full constructor */
    public SipDetalleAuxProd(SipDetalleAuxProdId id, SipAuxilios sipAuxilios, SipProductos sipProductos, Date fechaVigencia, Date fechaFinVigencia,String codAuxPlataforma,String cuentaContable, Set sipDetalleReclamacioneses) {
        super(id, sipAuxilios, sipProductos, fechaVigencia, fechaFinVigencia,codAuxPlataforma,cuentaContable, sipDetalleReclamacioneses);        
    }
   
}