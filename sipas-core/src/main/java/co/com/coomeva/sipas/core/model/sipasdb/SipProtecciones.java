package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Date;
import java.util.Set;


/**
 * SipProtecciones generated by MyEclipse - Hibernate Tools
 */
public class SipProtecciones extends AbstractSipProtecciones implements java.io.Serializable {

    // Constructors

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** default constructor */
    public SipProtecciones() {
    }

	/** minimal constructor */
    public SipProtecciones(Long proCod, SipProductos sipProductos, Date proFechaReg, String proEstado) {
        super(proCod, sipProductos, proFechaReg, proEstado);        
    }
    
    /** full constructor */
    public SipProtecciones(Long proCod, SipColectivos sipColectivos, SipNombresComerciales sipNombresComerciales, SipProductos sipProductos, Long asoNumint, Double proProteccionAcumulada, Long proCuotaAcumulada, String proObservacion, String proTipoPago, Date proFechaReg, String proEstado, String proPerseverancia, Date proFechaPerseverancia, Set sipFacAjusteses, Set sipBeneficiariosAsociados, Set sipFacPagosAcumuladoses, Set sipProteccionesEventoses) {
        super(proCod, sipColectivos, sipNombresComerciales, sipProductos, asoNumint, proProteccionAcumulada, proCuotaAcumulada, proObservacion, proTipoPago, proFechaReg, proEstado, proPerseverancia, proFechaPerseverancia, sipFacAjusteses, sipBeneficiariosAsociados, sipFacPagosAcumuladoses, sipProteccionesEventoses);        
    }

    public final int compareTo(Object o) {
		
		if(o instanceof SipProtecciones){
			return this.getProFechaReg()
			.compareTo(((SipProtecciones)o).getProFechaReg());
		}
		return 0;
	}
   
}
