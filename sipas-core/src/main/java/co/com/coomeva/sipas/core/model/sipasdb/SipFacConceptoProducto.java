package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Set;


/**
 * SipFacConceptoProducto generated by MyEclipse - Hibernate Tools
 */
public class SipFacConceptoProducto extends AbstractSipFacConceptoProducto implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipFacConceptoProducto() {
    }

	/** minimal constructor */
    public SipFacConceptoProducto(SipFacConceptoProductoId id, SipFacConcepto sipFacConcepto, SipProductos sipProductos, String tipo) {
        super(id, sipFacConcepto, sipProductos, tipo);        
    }
    
    /** full constructor */
    public SipFacConceptoProducto(SipFacConceptoProductoId id, SipFacConcepto sipFacConcepto, SipProductos sipProductos, String tipo, String codcon, Set sipFacPagosAcumuladoses, Set sipFacDescapitalizacioneses, Set sipCuentasContableses, Set sipRecaudoses, Set sipFacturaDetalles, Set sipFacAjusteses) {
        super(id, sipFacConcepto, sipProductos, tipo, codcon, sipFacPagosAcumuladoses, sipFacDescapitalizacioneses, sipCuentasContableses, sipRecaudoses, sipFacturaDetalles, sipFacAjusteses);        
    }
   
}
