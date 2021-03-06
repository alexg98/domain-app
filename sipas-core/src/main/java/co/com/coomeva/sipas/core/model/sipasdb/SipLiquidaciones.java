package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Date;
import java.util.Set;


/**
 * SipLiquidaciones generated by MyEclipse - Hibernate Tools
 */
public class SipLiquidaciones extends AbstractSipLiquidaciones implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipLiquidaciones() {
    }

	/** minimal constructor */
    public SipLiquidaciones(Long liqPagConsecutivo, Long liqPagAsonumint, Date liqPagoFechaCreacion, Long liqPagValorBase, Long liqPagNetoPago, Long liqPagoEstado) {
        super(liqPagConsecutivo, liqPagAsonumint, liqPagoFechaCreacion, liqPagValorBase, liqPagNetoPago, liqPagoEstado);        
    }
    
    /** full constructor */
    public SipLiquidaciones(Long liqPagConsecutivo, SipLiquidaciones sipLiquidaciones, Long liqPagAsonumint, Date liqPagoFechaCreacion, Date liqPagFechaAprob, Double liqPagValorRetefuente, Long liqPagValorBase, Long liqPagDescuentosCart, String liqPagPagoCuotaMes, Long liqPagValorCuotaMes, Long liqPagNetoPago, Long liqPagoFormaPago, Long liqPagoEstado, String liqPagoOficinaCobro, Long liqPagoAgenciaCobro, String liqPagoObservaciones, Long liqPagValorProteccion, Long liqPagValorCapitalizado, Long liqPagNumCtaDep, String liqPagTipoFraccionamiento, Long liqPagDescVar, Long liqPagPagarA, String liqTipDistribucion, Long liqPagExcDist, Long liqPagRetefuente, String liqPagDescuentoSaldos, Long liqPagUsuarioDescuento, Long liqPagTipoDeduccion, Long liqPagValorDeduccion, Set sipPlanDePagoses, Set sipLiquidacioneses) {
        super(liqPagConsecutivo, sipLiquidaciones, liqPagAsonumint, liqPagoFechaCreacion, liqPagFechaAprob, liqPagValorRetefuente, liqPagValorBase, liqPagDescuentosCart, liqPagPagoCuotaMes, liqPagValorCuotaMes, liqPagNetoPago, liqPagoFormaPago, liqPagoEstado, liqPagoOficinaCobro, liqPagoAgenciaCobro, liqPagoObservaciones, liqPagValorProteccion, liqPagValorCapitalizado, liqPagNumCtaDep, liqPagTipoFraccionamiento, liqPagDescVar, liqPagPagarA, liqTipDistribucion, liqPagExcDist, liqPagRetefuente, liqPagDescuentoSaldos, liqPagUsuarioDescuento, liqPagTipoDeduccion, liqPagValorDeduccion, sipPlanDePagoses, sipLiquidacioneses);        
    }
   
}
