package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Date;
/**
 * SipProteccionesEventosAud generated by MyEclipse - Hibernate Tools
 */
public class SipProteccionesEventosAud extends AbstractSipProteccionesEventosAud implements java.io.Serializable {

	private static final long serialVersionUID = 3514764032968384969L;

	// Constructors

    /** default constructor */
    public SipProteccionesEventosAud() {
    }

	/** minimal constructor */
    public SipProteccionesEventosAud(Long consecutivoAud, Long consecutivo, Date proFechaRegistro, String proEstado) {
        super(consecutivoAud, consecutivo, proFechaRegistro, proEstado);        
    }
    
    /** full constructor */
    public SipProteccionesEventosAud(Long consecutivoAud, Long consecutivo, Long proCod, Long factorCodigo, Long codigo, Double proValor, Long proCuota, Double proValorSolicitado, String proObservacion, Date proFechaRegistro, Date proFechaSolicitud, Date proFechaRequisitos, Date proFechaPrimeraContribucion, Date proFechaVigencia, String proVigente, Long proPromotor, String proUsuario, String proEstadoProteccion, String proEstado, Date fechaRegistro, Long consAudAfectado, Date proFechaAprobacion, Double factorValor, Date fechaHistoria, Double proValorAnt, Long proCuotaAnt, Long ano, String proTipo, Long promConsecutivo, String proCanal, Long proFlujo, String proMotivo, Long proConsecutivo,Long proTipAnulacion,String proUsuarioError) {
        super(consecutivoAud, consecutivo, proCod, factorCodigo, codigo, proValor, proCuota, proValorSolicitado, proObservacion, proFechaRegistro, proFechaSolicitud, proFechaRequisitos, proFechaPrimeraContribucion, proFechaVigencia, proVigente, proPromotor, proUsuario, proEstadoProteccion, proEstado, fechaRegistro, consAudAfectado, proFechaAprobacion, factorValor, fechaHistoria, proValorAnt, proCuotaAnt, ano, proTipo, promConsecutivo, proCanal, proFlujo,proMotivo, proConsecutivo,proTipAnulacion,proUsuarioError);        
    }
   
}
