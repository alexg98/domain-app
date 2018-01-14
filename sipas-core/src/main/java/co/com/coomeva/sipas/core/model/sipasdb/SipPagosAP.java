package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;


/**
 * SipPagosAP entity. @author MyEclipse Persistence Tools
 */
public class SipPagosAP extends AbstractSipPagosAP implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	// Constructors

	/** default constructor */
    public SipPagosAP() {
    }

	/** minimal constructor */
    public SipPagosAP(Long pagCodigo, String pagNitEmpresa, String pagIdCabecera, String pagConsecLiq, String pagTipoTransaccion, Date pagFechaFactura, String pagTipoDocBen, String pagNumDocBen, Double pagValorFactura, String pagMoneda, String pagTerminoPago, Date pagFechaRecepFac, Date pagFechaTerminos, String pagOrigen, Date pagFechaContable, String pagGrupoPago, String pagCuentaAlterna, String pagMetodoPago, String pagNombreTercero, String pagTipoContribuyente, String pagPais, String pagDireccionBen, String pagNumeroLinea, Double pagValorLinea, Date pagFechaContLinea, String pagCodigoImpuesto, String pagCuentaContable, String pagRetencionRenta, String pagRetencionIva, String pagRetencionIca, String pagEstadoPago, String pagEstadoEnvio) {
        super(pagCodigo, pagNitEmpresa, pagIdCabecera, pagConsecLiq, pagTipoTransaccion, pagFechaFactura, pagTipoDocBen, pagNumDocBen, pagValorFactura, pagMoneda, pagTerminoPago, pagFechaRecepFac, pagFechaTerminos, pagOrigen, pagFechaContable, pagGrupoPago, pagCuentaAlterna, pagMetodoPago, pagNombreTercero, pagTipoContribuyente, pagPais, pagDireccionBen, pagNumeroLinea, pagValorLinea, pagFechaContLinea, pagCodigoImpuesto, pagCuentaContable, pagRetencionRenta, pagRetencionIva, pagRetencionIca, pagEstadoPago, pagEstadoEnvio);        
    }
    
    /** full constructor */
    public SipPagosAP(Long pagCodigo, String pagNitEmpresa, String pagIdCabecera, String pagConsecLiq, String pagTipoTransaccion, Date pagFechaFactura, String pagTipoDocBen, String pagNumDocBen, String pagIdSucursal, Double pagValorFactura, String pagMoneda, String pagTerminoPago, String pagDescripcionCab, Date pagFechaRecepFac, Date pagFechaTerminos, String pagFacturaNotaCredito, String pagOrigen, Date pagFechaContable, String pagGrupoPago, String pagCuentaAlterna, String pagNitProveedorRemito, String pagMetodoPago, String pagNombreTercero, String pagTipoContribuyente, String pagDigitoVerificacion, String pagPais, String pagDireccionBen, String pagActividadEcon, String pagDirElecBen, String pagCuentaBancaria, String pagTipoCuentaBancaria, String pagNombreBanco, String pagCodigoOficina, String pagNomPersonaAut1, String pagNitPersonaAut1, String pagNomPersonaAut2, String pagNitPersonaAut2, String pagAgenciaCredito, String pagLineaCredito, String pagNumeroPagareCredito, String pagTipoAbono, String pagNumeroLinea, Double pagValorLinea, Date pagFechaContLinea, String pagDescripcionLinea, String pagCodigoImpuesto, String pagCuentaContable, String pagCopago, String pagCuotaModeradora, String pagRetencionRenta, String pagRetencionIva, String pagRetencionIca, String pagNumDocImpuesto, String pagNombreImpuesto, String pagTipoContrImp, String pagDigitoVerImp, String pagPrimerAuxiliar, String pagSegundoAuxiliar, String pagTercerAuxiliar, Double pagVlrRetefuente, Double pagVlrNetoPagado, String pagEstadoPago, String pagEstadoEnvio, String pagCodigoRetorno) {
        super(pagCodigo, pagNitEmpresa, pagIdCabecera, pagConsecLiq, pagTipoTransaccion, pagFechaFactura, pagTipoDocBen, pagNumDocBen, pagIdSucursal, pagValorFactura, pagMoneda, pagTerminoPago, pagDescripcionCab, pagFechaRecepFac, pagFechaTerminos, pagFacturaNotaCredito, pagOrigen, pagFechaContable, pagGrupoPago, pagCuentaAlterna, pagNitProveedorRemito, pagMetodoPago, pagNombreTercero, pagTipoContribuyente, pagDigitoVerificacion, pagPais, pagDireccionBen, pagActividadEcon, pagDirElecBen, pagCuentaBancaria, pagTipoCuentaBancaria, pagNombreBanco, pagCodigoOficina, pagNomPersonaAut1, pagNitPersonaAut1, pagNomPersonaAut2, pagNitPersonaAut2, pagAgenciaCredito, pagLineaCredito, pagNumeroPagareCredito, pagTipoAbono, pagNumeroLinea, pagValorLinea, pagFechaContLinea, pagDescripcionLinea, pagCodigoImpuesto, pagCuentaContable, pagCopago, pagCuotaModeradora, pagRetencionRenta, pagRetencionIva, pagRetencionIca, pagNumDocImpuesto, pagNombreImpuesto, pagTipoContrImp, pagDigitoVerImp, pagPrimerAuxiliar, pagSegundoAuxiliar, pagTercerAuxiliar, pagVlrRetefuente, pagVlrNetoPagado, pagEstadoPago, pagEstadoEnvio, pagCodigoRetorno);        
    }
   
}
