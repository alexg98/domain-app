package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Date;
import java.util.Set;


/**
 * SipProteccionesEventos generated by MyEclipse - Hibernate Tools
 */
public class SipProteccionesEventos extends AbstractSipProteccionesEventos implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipProteccionesEventos() {
    }

	/** minimal constructor */
    public SipProteccionesEventos(Long consecutivo, Date proFechaRegistro, String proEstado) {
        super(consecutivo, proFechaRegistro, proEstado);        
    }
    
    /** full constructor */
    public SipProteccionesEventos(Long consecutivo, SipProtecciones sipProtecciones, SipPromocion sipPromocion, SipFactores sipFactores, SipBeneficiariosAsociado sipBeneficiariosAsociado, Double proValor, Long proCuota, Double proValorSolicitado, String proObservacion, Date proFechaRegistro, Date proFechaSolicitud, Date proFechaRequisitos, Date proFechaPrimeraContribucion, Date proFechaVigencia, String proVigente, Long proPromotor, String proUsuario, String proEstadoProteccion, String proEstado, Date proFechaAprobacion, Double factorValor, Double proValorAnt, Long proCuotaAnt, String proTipo, String proCanal, Long proFlujo, String proMotivo, Long proConsecutivo,Long proTipAnulacion,String proUsuarioError, Long proEdadProteccion, Date proFechaAprobacionReal, Long proConsecutivoAfectado, Set sipFacInactividads, Set sipFacProteccioneses, Set sipIncrementoErroreses, Set sipFacAjusteses) {
        super(consecutivo, sipProtecciones, sipPromocion, sipFactores, sipBeneficiariosAsociado, proValor, proCuota, proValorSolicitado, proObservacion, proFechaRegistro, proFechaSolicitud, proFechaRequisitos, proFechaPrimeraContribucion, proFechaVigencia, proVigente, proPromotor, proUsuario, proEstadoProteccion, proEstado, proFechaAprobacion, factorValor, proValorAnt, proCuotaAnt, proTipo, proCanal, proFlujo, proMotivo, proConsecutivo,proTipAnulacion,proUsuarioError,proEdadProteccion,proFechaAprobacionReal,proConsecutivoAfectado, sipFacInactividads, sipFacProteccioneses, sipIncrementoErroreses, sipFacAjusteses);        
    }

	@Override
	public String toString() {
		return "SipProteccionesEventos [getConsecutivo()=" + getConsecutivo()
				+ ", getProValor()=" + getProValor() + ", getProCuota()="
				+ getProCuota() + ", getProPromotor()=" + getProPromotor()
				+ ", getProUsuario()=" + getProUsuario()
				+ ", getFactorValor()=" + getFactorValor()
				+ ", getProValorAnt()=" + getProValorAnt() + "]";
	}
    
   
}
