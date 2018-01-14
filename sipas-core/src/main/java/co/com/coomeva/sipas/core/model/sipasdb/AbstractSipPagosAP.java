package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;


/**
 * AbstractSipPagosAP entity provides the base persistence definition of the SipPagosAP entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipPagosAP  implements java.io.Serializable {

	 //Fields
	
	 private static final long serialVersionUID = 1L;

     private Long pagCodigo;
     private String pagNitEmpresa;
     private String pagIdCabecera;
     private String pagConsecLiq;
     private String pagTipoTransaccion;
     private Date pagFechaFactura;
     private String pagTipoDocBen;
     private String pagNumDocBen;
     private String pagIdSucursal;
     private Double pagValorFactura;
     private String pagMoneda;
     private String pagTerminoPago;
     private String pagDescripcionCab;
     private Date pagFechaRecepFac;
     private Date pagFechaTerminos;
     private String pagFacturaNotaCredito;
     private String pagOrigen;
     private Date pagFechaContable;
     private String pagGrupoPago;
     private String pagCuentaAlterna;
     private String pagNitProveedorRemito;
     private String pagMetodoPago;
     private String pagNombreTercero;
     private String pagTipoContribuyente;
     private String pagDigitoVerificacion;
     private String pagPais;
     private String pagDireccionBen;
     private String pagActividadEcon;
     private String pagDirElecBen;
     private String pagCuentaBancaria;
     private String pagTipoCuentaBancaria;
     private String pagNombreBanco;
     private String pagCodigoOficina;
     private String pagNomPersonaAut1;
     private String pagNitPersonaAut1;
     private String pagNomPersonaAut2;
     private String pagNitPersonaAut2;
     private String pagAgenciaCredito;
     private String pagLineaCredito;
     private String pagNumeroPagareCredito;
     private String pagTipoAbono;
     private String pagNumeroLinea;
     private Double pagValorLinea;
     private Date pagFechaContLinea;
     private String pagDescripcionLinea;
     private String pagCodigoImpuesto;
     private String pagCuentaContable;
     private String pagCopago;
     private String pagCuotaModeradora;
     private String pagRetencionRenta;
     private String pagRetencionIva;
     private String pagRetencionIca;
     private String pagNumDocImpuesto;
     private String pagNombreImpuesto;
     private String pagTipoContrImp;
     private String pagDigitoVerImp;
     private String pagPrimerAuxiliar;
     private String pagSegundoAuxiliar;
     private String pagTercerAuxiliar;
     private Double pagVlrRetefuente;
     private Double pagVlrNetoPagado;
     private String pagEstadoPago;
     private String pagEstadoEnvio;
     private String pagCodigoRetorno;
     
     private Date pagFechaEnvio;
     private Date pagFechaCorreccion;
     private String pagDescripcionError;
     
     private String descEstadoEnvio;
     private String descMetodoPago;
     private String descEstadoPago;
     private boolean seleccionada;
     private String pagCodigoRetornoTaylor;
     
    // Constructors

    /** default constructor */
    public AbstractSipPagosAP() {
    }

	/** minimal constructor */
    public AbstractSipPagosAP(Long pagCodigo, String pagNitEmpresa, String pagIdCabecera, String pagConsecLiq, String pagTipoTransaccion, Date pagFechaFactura, String pagTipoDocBen, String pagNumDocBen, Double pagValorFactura, String pagMoneda, String pagTerminoPago, Date pagFechaRecepFac, Date pagFechaTerminos, String pagOrigen, Date pagFechaContable, String pagGrupoPago, String pagCuentaAlterna, String pagMetodoPago, String pagNombreTercero, String pagTipoContribuyente, String pagPais, String pagDireccionBen, String pagNumeroLinea, Double pagValorLinea, Date pagFechaContLinea, String pagCodigoImpuesto, String pagCuentaContable, String pagRetencionRenta, String pagRetencionIva, String pagRetencionIca, String pagEstadoPago, String pagEstadoEnvio) {
        this.pagCodigo = pagCodigo;
        this.pagNitEmpresa = pagNitEmpresa;
        this.pagIdCabecera = pagIdCabecera;
        this.pagConsecLiq = pagConsecLiq;
        this.pagTipoTransaccion = pagTipoTransaccion;
        this.pagFechaFactura = pagFechaFactura;
        this.pagTipoDocBen = pagTipoDocBen;
        this.pagNumDocBen = pagNumDocBen;
        this.pagValorFactura = pagValorFactura;
        this.pagMoneda = pagMoneda;
        this.pagTerminoPago = pagTerminoPago;
        this.pagFechaRecepFac = pagFechaRecepFac;
        this.pagFechaTerminos = pagFechaTerminos;
        this.pagOrigen = pagOrigen;
        this.pagFechaContable = pagFechaContable;
        this.pagGrupoPago = pagGrupoPago;
        this.pagCuentaAlterna = pagCuentaAlterna;
        this.pagMetodoPago = pagMetodoPago;
        this.pagNombreTercero = pagNombreTercero;
        this.pagTipoContribuyente = pagTipoContribuyente;
        this.pagPais = pagPais;
        this.pagDireccionBen = pagDireccionBen;
        this.pagNumeroLinea = pagNumeroLinea;
        this.pagValorLinea = pagValorLinea;
        this.pagFechaContLinea = pagFechaContLinea;
        this.pagCodigoImpuesto = pagCodigoImpuesto;
        this.pagCuentaContable = pagCuentaContable;
        this.pagRetencionRenta = pagRetencionRenta;
        this.pagRetencionIva = pagRetencionIva;
        this.pagRetencionIca = pagRetencionIca;
        this.pagEstadoPago = pagEstadoPago;
        this.pagEstadoEnvio = pagEstadoEnvio;
    }
    
    /** full constructor */
    public AbstractSipPagosAP(Long pagCodigo, String pagNitEmpresa, String pagIdCabecera, String pagConsecLiq, String pagTipoTransaccion, Date pagFechaFactura, String pagTipoDocBen, String pagNumDocBen, String pagIdSucursal, Double pagValorFactura, String pagMoneda, String pagTerminoPago, String pagDescripcionCab, Date pagFechaRecepFac, Date pagFechaTerminos, String pagFacturaNotaCredito, String pagOrigen, Date pagFechaContable, String pagGrupoPago, String pagCuentaAlterna, String pagNitProveedorRemito, String pagMetodoPago, String pagNombreTercero, String pagTipoContribuyente, String pagDigitoVerificacion, String pagPais, String pagDireccionBen, String pagActividadEcon, String pagDirElecBen, String pagCuentaBancaria, String pagTipoCuentaBancaria, String pagNombreBanco, String pagCodigoOficina, String pagNomPersonaAut1, String pagNitPersonaAut1, String pagNomPersonaAut2, String pagNitPersonaAut2, String pagAgenciaCredito, String pagLineaCredito, String pagNumeroPagareCredito, String pagTipoAbono, String pagNumeroLinea, Double pagValorLinea, Date pagFechaContLinea, String pagDescripcionLinea, String pagCodigoImpuesto, String pagCuentaContable, String pagCopago, String pagCuotaModeradora, String pagRetencionRenta, String pagRetencionIva, String pagRetencionIca, String pagNumDocImpuesto, String pagNombreImpuesto, String pagTipoContrImp, String pagDigitoVerImp, String pagPrimerAuxiliar, String pagSegundoAuxiliar, String pagTercerAuxiliar, Double pagVlrRetefuente, Double pagVlrNetoPagado, String pagEstadoPago, String pagEstadoEnvio, String pagCodigoRetorno) {
        this.pagCodigo = pagCodigo;
        this.pagNitEmpresa = pagNitEmpresa;
        this.pagIdCabecera = pagIdCabecera;
        this.pagConsecLiq = pagConsecLiq;
        this.pagTipoTransaccion = pagTipoTransaccion;
        this.pagFechaFactura = pagFechaFactura;
        this.pagTipoDocBen = pagTipoDocBen;
        this.pagNumDocBen = pagNumDocBen;
        this.pagIdSucursal = pagIdSucursal;
        this.pagValorFactura = pagValorFactura;
        this.pagMoneda = pagMoneda;
        this.pagTerminoPago = pagTerminoPago;
        this.pagDescripcionCab = pagDescripcionCab;
        this.pagFechaRecepFac = pagFechaRecepFac;
        this.pagFechaTerminos = pagFechaTerminos;
        this.pagFacturaNotaCredito = pagFacturaNotaCredito;
        this.pagOrigen = pagOrigen;
        this.pagFechaContable = pagFechaContable;
        this.pagGrupoPago = pagGrupoPago;
        this.pagCuentaAlterna = pagCuentaAlterna;
        this.pagNitProveedorRemito = pagNitProveedorRemito;
        this.pagMetodoPago = pagMetodoPago;
        this.pagNombreTercero = pagNombreTercero;
        this.pagTipoContribuyente = pagTipoContribuyente;
        this.pagDigitoVerificacion = pagDigitoVerificacion;
        this.pagPais = pagPais;
        this.pagDireccionBen = pagDireccionBen;
        this.pagActividadEcon = pagActividadEcon;
        this.pagDirElecBen = pagDirElecBen;
        this.pagCuentaBancaria = pagCuentaBancaria;
        this.pagTipoCuentaBancaria = pagTipoCuentaBancaria;
        this.pagNombreBanco = pagNombreBanco;
        this.pagCodigoOficina = pagCodigoOficina;
        this.pagNomPersonaAut1 = pagNomPersonaAut1;
        this.pagNitPersonaAut1 = pagNitPersonaAut1;
        this.pagNomPersonaAut2 = pagNomPersonaAut2;
        this.pagNitPersonaAut2 = pagNitPersonaAut2;
        this.pagAgenciaCredito = pagAgenciaCredito;
        this.pagLineaCredito = pagLineaCredito;
        this.pagNumeroPagareCredito = pagNumeroPagareCredito;
        this.pagTipoAbono = pagTipoAbono;
        this.pagNumeroLinea = pagNumeroLinea;
        this.pagValorLinea = pagValorLinea;
        this.pagFechaContLinea = pagFechaContLinea;
        this.pagDescripcionLinea = pagDescripcionLinea;
        this.pagCodigoImpuesto = pagCodigoImpuesto;
        this.pagCuentaContable = pagCuentaContable;
        this.pagCopago = pagCopago;
        this.pagCuotaModeradora = pagCuotaModeradora;
        this.pagRetencionRenta = pagRetencionRenta;
        this.pagRetencionIva = pagRetencionIva;
        this.pagRetencionIca = pagRetencionIca;
        this.pagNumDocImpuesto = pagNumDocImpuesto;
        this.pagNombreImpuesto = pagNombreImpuesto;
        this.pagTipoContrImp = pagTipoContrImp;
        this.pagDigitoVerImp = pagDigitoVerImp;
        this.pagPrimerAuxiliar = pagPrimerAuxiliar;
        this.pagSegundoAuxiliar = pagSegundoAuxiliar;
        this.pagTercerAuxiliar = pagTercerAuxiliar;
        this.pagVlrRetefuente = pagVlrRetefuente;
        this.pagVlrNetoPagado = pagVlrNetoPagado;
        this.pagEstadoPago = pagEstadoPago;
        this.pagEstadoEnvio = pagEstadoEnvio;
        this.pagCodigoRetorno = pagCodigoRetorno;
    }

   
    // Property accessors

    public Long getPagCodigo() {
        return this.pagCodigo;
    }
    
    public void setPagCodigo(Long pagCodigo) {
        this.pagCodigo = pagCodigo;
    }

    public String getPagNitEmpresa() {
        return this.pagNitEmpresa;
    }
    
    public void setPagNitEmpresa(String pagNitEmpresa) {
        this.pagNitEmpresa = pagNitEmpresa;
    }

    public String getPagIdCabecera() {
        return this.pagIdCabecera;
    }
    
    public void setPagIdCabecera(String pagIdCabecera) {
        this.pagIdCabecera = pagIdCabecera;
    }

    public String getPagConsecLiq() {
        return this.pagConsecLiq;
    }
    
    public void setPagConsecLiq(String pagConsecLiq) {
        this.pagConsecLiq = pagConsecLiq;
    }

    public String getPagTipoTransaccion() {
        return this.pagTipoTransaccion;
    }
    
    public void setPagTipoTransaccion(String pagTipoTransaccion) {
        this.pagTipoTransaccion = pagTipoTransaccion;
    }

   

    public String getPagTipoDocBen() {
        return this.pagTipoDocBen;
    }
    
    public void setPagTipoDocBen(String pagTipoDocBen) {
        this.pagTipoDocBen = pagTipoDocBen;
    }

    public String getPagNumDocBen() {
        return this.pagNumDocBen;
    }
    
    public void setPagNumDocBen(String pagNumDocBen) {
        this.pagNumDocBen = pagNumDocBen;
    }

    public String getPagIdSucursal() {
        return this.pagIdSucursal;
    }
    
    public void setPagIdSucursal(String pagIdSucursal) {
        this.pagIdSucursal = pagIdSucursal;
    }

    public Double getPagValorFactura() {
        return this.pagValorFactura;
    }
    
    public void setPagValorFactura(Double pagValorFactura) {
        this.pagValorFactura = pagValorFactura;
    }

    public String getPagMoneda() {
        return this.pagMoneda;
    }
    
    public void setPagMoneda(String pagMoneda) {
        this.pagMoneda = pagMoneda;
    }

    public String getPagTerminoPago() {
        return this.pagTerminoPago;
    }
    
    public void setPagTerminoPago(String pagTerminoPago) {
        this.pagTerminoPago = pagTerminoPago;
    }

    public String getPagDescripcionCab() {
        return this.pagDescripcionCab;
    }
    
    public void setPagDescripcionCab(String pagDescripcionCab) {
        this.pagDescripcionCab = pagDescripcionCab;
    }

   

    public String getPagFacturaNotaCredito() {
        return this.pagFacturaNotaCredito;
    }
    
    public void setPagFacturaNotaCredito(String pagFacturaNotaCredito) {
        this.pagFacturaNotaCredito = pagFacturaNotaCredito;
    }

    public String getPagOrigen() {
        return this.pagOrigen;
    }
    
    public void setPagOrigen(String pagOrigen) {
        this.pagOrigen = pagOrigen;
    }

    

    public String getPagGrupoPago() {
        return this.pagGrupoPago;
    }
    
    public void setPagGrupoPago(String pagGrupoPago) {
        this.pagGrupoPago = pagGrupoPago;
    }

    public String getPagCuentaAlterna() {
        return this.pagCuentaAlterna;
    }
    
    public void setPagCuentaAlterna(String pagCuentaAlterna) {
        this.pagCuentaAlterna = pagCuentaAlterna;
    }

    public String getPagNitProveedorRemito() {
        return this.pagNitProveedorRemito;
    }
    
    public void setPagNitProveedorRemito(String pagNitProveedorRemito) {
        this.pagNitProveedorRemito = pagNitProveedorRemito;
    }

    public String getPagMetodoPago() {
        return this.pagMetodoPago;
    }
    
    public void setPagMetodoPago(String pagMetodoPago) {
        this.pagMetodoPago = pagMetodoPago;
    }

    public String getPagNombreTercero() {
        return this.pagNombreTercero;
    }
    
    public void setPagNombreTercero(String pagNombreTercero) {
        this.pagNombreTercero = pagNombreTercero;
    }

    public String getPagTipoContribuyente() {
        return this.pagTipoContribuyente;
    }
    
    public void setPagTipoContribuyente(String pagTipoContribuyente) {
        this.pagTipoContribuyente = pagTipoContribuyente;
    }

    public String getPagDigitoVerificacion() {
        return this.pagDigitoVerificacion;
    }
    
    public void setPagDigitoVerificacion(String pagDigitoVerificacion) {
        this.pagDigitoVerificacion = pagDigitoVerificacion;
    }

    public String getPagPais() {
        return this.pagPais;
    }
    
    public void setPagPais(String pagPais) {
        this.pagPais = pagPais;
    }

    public String getPagDireccionBen() {
        return this.pagDireccionBen;
    }
    
    public void setPagDireccionBen(String pagDireccionBen) {
        this.pagDireccionBen = pagDireccionBen;
    }

    public String getPagActividadEcon() {
        return this.pagActividadEcon;
    }
    
    public void setPagActividadEcon(String pagActividadEcon) {
        this.pagActividadEcon = pagActividadEcon;
    }

    public String getPagDirElecBen() {
        return this.pagDirElecBen;
    }
    
    public void setPagDirElecBen(String pagDirElecBen) {
        this.pagDirElecBen = pagDirElecBen;
    }

    public String getPagCuentaBancaria() {
        return this.pagCuentaBancaria;
    }
    
    public void setPagCuentaBancaria(String pagCuentaBancaria) {
        this.pagCuentaBancaria = pagCuentaBancaria;
    }

    public String getPagTipoCuentaBancaria() {
        return this.pagTipoCuentaBancaria;
    }
    
    public void setPagTipoCuentaBancaria(String pagTipoCuentaBancaria) {
        this.pagTipoCuentaBancaria = pagTipoCuentaBancaria;
    }

    public String getPagNombreBanco() {
        return this.pagNombreBanco;
    }
    
    public void setPagNombreBanco(String pagNombreBanco) {
        this.pagNombreBanco = pagNombreBanco;
    }

    public String getPagCodigoOficina() {
        return this.pagCodigoOficina;
    }
    
    public void setPagCodigoOficina(String pagCodigoOficina) {
        this.pagCodigoOficina = pagCodigoOficina;
    }

    public String getPagNomPersonaAut1() {
        return this.pagNomPersonaAut1;
    }
    
    public void setPagNomPersonaAut1(String pagNomPersonaAut1) {
        this.pagNomPersonaAut1 = pagNomPersonaAut1;
    }

    public String getPagNitPersonaAut1() {
        return this.pagNitPersonaAut1;
    }
    
    public void setPagNitPersonaAut1(String pagNitPersonaAut1) {
        this.pagNitPersonaAut1 = pagNitPersonaAut1;
    }

    public String getPagNomPersonaAut2() {
        return this.pagNomPersonaAut2;
    }
    
    public void setPagNomPersonaAut2(String pagNomPersonaAut2) {
        this.pagNomPersonaAut2 = pagNomPersonaAut2;
    }

    public String getPagNitPersonaAut2() {
        return this.pagNitPersonaAut2;
    }
    
    public void setPagNitPersonaAut2(String pagNitPersonaAut2) {
        this.pagNitPersonaAut2 = pagNitPersonaAut2;
    }

    public String getPagAgenciaCredito() {
        return this.pagAgenciaCredito;
    }
    
    public void setPagAgenciaCredito(String pagAgenciaCredito) {
        this.pagAgenciaCredito = pagAgenciaCredito;
    }

    public String getPagLineaCredito() {
        return this.pagLineaCredito;
    }
    
    public void setPagLineaCredito(String pagLineaCredito) {
        this.pagLineaCredito = pagLineaCredito;
    }

    public String getPagNumeroPagareCredito() {
        return this.pagNumeroPagareCredito;
    }
    
    public void setPagNumeroPagareCredito(String pagNumeroPagareCredito) {
        this.pagNumeroPagareCredito = pagNumeroPagareCredito;
    }

    public String getPagTipoAbono() {
        return this.pagTipoAbono;
    }
    
    public void setPagTipoAbono(String pagTipoAbono) {
        this.pagTipoAbono = pagTipoAbono;
    }

    public String getPagNumeroLinea() {
        return this.pagNumeroLinea;
    }
    
    public void setPagNumeroLinea(String pagNumeroLinea) {
        this.pagNumeroLinea = pagNumeroLinea;
    }

    public Double getPagValorLinea() {
        return this.pagValorLinea;
    }
    
    public void setPagValorLinea(Double pagValorLinea) {
        this.pagValorLinea = pagValorLinea;
    }

    

    public String getPagDescripcionLinea() {
        return this.pagDescripcionLinea;
    }
    
    public void setPagDescripcionLinea(String pagDescripcionLinea) {
        this.pagDescripcionLinea = pagDescripcionLinea;
    }

    public String getPagCodigoImpuesto() {
        return this.pagCodigoImpuesto;
    }
    
    public void setPagCodigoImpuesto(String pagCodigoImpuesto) {
        this.pagCodigoImpuesto = pagCodigoImpuesto;
    }

    public String getPagCuentaContable() {
        return this.pagCuentaContable;
    }
    
    public void setPagCuentaContable(String pagCuentaContable) {
        this.pagCuentaContable = pagCuentaContable;
    }

    public String getPagCopago() {
        return this.pagCopago;
    }
    
    public void setPagCopago(String pagCopago) {
        this.pagCopago = pagCopago;
    }

    public String getPagCuotaModeradora() {
        return this.pagCuotaModeradora;
    }
    
    public void setPagCuotaModeradora(String pagCuotaModeradora) {
        this.pagCuotaModeradora = pagCuotaModeradora;
    }

    public String getPagRetencionRenta() {
        return this.pagRetencionRenta;
    }
    
    public void setPagRetencionRenta(String pagRetencionRenta) {
        this.pagRetencionRenta = pagRetencionRenta;
    }

    public String getPagRetencionIva() {
        return this.pagRetencionIva;
    }
    
    public void setPagRetencionIva(String pagRetencionIva) {
        this.pagRetencionIva = pagRetencionIva;
    }

    public String getPagRetencionIca() {
        return this.pagRetencionIca;
    }
    
    public void setPagRetencionIca(String pagRetencionIca) {
        this.pagRetencionIca = pagRetencionIca;
    }

    public String getPagNumDocImpuesto() {
        return this.pagNumDocImpuesto;
    }
    
    public void setPagNumDocImpuesto(String pagNumDocImpuesto) {
        this.pagNumDocImpuesto = pagNumDocImpuesto;
    }

    public String getPagNombreImpuesto() {
        return this.pagNombreImpuesto;
    }
    
    public void setPagNombreImpuesto(String pagNombreImpuesto) {
        this.pagNombreImpuesto = pagNombreImpuesto;
    }

    public String getPagTipoContrImp() {
        return this.pagTipoContrImp;
    }
    
    public void setPagTipoContrImp(String pagTipoContrImp) {
        this.pagTipoContrImp = pagTipoContrImp;
    }

    public String getPagDigitoVerImp() {
        return this.pagDigitoVerImp;
    }
    
    public void setPagDigitoVerImp(String pagDigitoVerImp) {
        this.pagDigitoVerImp = pagDigitoVerImp;
    }

    public String getPagPrimerAuxiliar() {
        return this.pagPrimerAuxiliar;
    }
    
    public void setPagPrimerAuxiliar(String pagPrimerAuxiliar) {
        this.pagPrimerAuxiliar = pagPrimerAuxiliar;
    }

    public String getPagSegundoAuxiliar() {
        return this.pagSegundoAuxiliar;
    }
    
    public void setPagSegundoAuxiliar(String pagSegundoAuxiliar) {
        this.pagSegundoAuxiliar = pagSegundoAuxiliar;
    }

    public String getPagTercerAuxiliar() {
        return this.pagTercerAuxiliar;
    }
    
    public void setPagTercerAuxiliar(String pagTercerAuxiliar) {
        this.pagTercerAuxiliar = pagTercerAuxiliar;
    }

    public Double getPagVlrRetefuente() {
        return this.pagVlrRetefuente;
    }
    
    public void setPagVlrRetefuente(Double pagVlrRetefuente) {
        this.pagVlrRetefuente = pagVlrRetefuente;
    }

    public Double getPagVlrNetoPagado() {
        return this.pagVlrNetoPagado;
    }
    
    public void setPagVlrNetoPagado(Double pagVlrNetoPagado) {
        this.pagVlrNetoPagado = pagVlrNetoPagado;
    }

    public String getPagEstadoPago() {
        return this.pagEstadoPago;
    }
    
    public void setPagEstadoPago(String pagEstadoPago) {
        this.pagEstadoPago = pagEstadoPago;
    }

    public String getPagEstadoEnvio() {
        return this.pagEstadoEnvio;
    }
    
    public void setPagEstadoEnvio(String pagEstadoEnvio) {
        this.pagEstadoEnvio = pagEstadoEnvio;
    }

    public String getPagCodigoRetorno() {
        return this.pagCodigoRetorno;
    }
    
    public void setPagCodigoRetorno(String pagCodigoRetorno) {
        this.pagCodigoRetorno = pagCodigoRetorno;
    }

	@Override
	public String toString() {
		return "AbstractSipPagosAP [pagActividadEcon=" + pagActividadEcon
				+ ", pagAgenciaCredito=" + pagAgenciaCredito + ", pagCodigo="
				+ pagCodigo + ", pagCodigoImpuesto=" + pagCodigoImpuesto
				+ ", pagCodigoOficina=" + pagCodigoOficina
				+ ", pagCodigoRetorno=" + pagCodigoRetorno + ", pagConsecLiq="
				+ pagConsecLiq + ", pagCopago=" + pagCopago
				+ ", pagCuentaAlterna=" + pagCuentaAlterna
				+ ", pagCuentaBancaria=" + pagCuentaBancaria
				+ ", pagCuentaContable=" + pagCuentaContable
				+ ", pagCuotaModeradora=" + pagCuotaModeradora
				+ ", pagDescripcionCab=" + pagDescripcionCab
				+ ", pagDescripcionLinea=" + pagDescripcionLinea
				+ ", pagDigitoVerImp=" + pagDigitoVerImp
				+ ", pagDigitoVerificacion=" + pagDigitoVerificacion
				+ ", pagDirElecBen=" + pagDirElecBen + ", pagDireccionBen="
				+ pagDireccionBen + ", pagEstadoEnvio=" + pagEstadoEnvio
				+ ", pagEstadoPago=" + pagEstadoPago
				+ ", pagFacturaNotaCredito=" + pagFacturaNotaCredito
				+ ", pagFechaContLinea=" + pagFechaContLinea
				+ ", pagFechaContable=" + pagFechaContable
				+ ", pagFechaFactura=" + pagFechaFactura
				+ ", pagFechaRecepFac=" + pagFechaRecepFac
				+ ", pagFechaTerminos=" + pagFechaTerminos + ", pagGrupoPago="
				+ pagGrupoPago + ", pagIdCabecera=" + pagIdCabecera
				+ ", pagIdSucursal=" + pagIdSucursal + ", pagLineaCredito="
				+ pagLineaCredito + ", pagMetodoPago=" + pagMetodoPago
				+ ", pagMoneda=" + pagMoneda + ", pagNitEmpresa="
				+ pagNitEmpresa + ", pagNitPersonaAut1=" + pagNitPersonaAut1
				+ ", pagNitPersonaAut2=" + pagNitPersonaAut2
				+ ", pagNitProveedorRemito=" + pagNitProveedorRemito
				+ ", pagNomPersonaAut1=" + pagNomPersonaAut1
				+ ", pagNomPersonaAut2=" + pagNomPersonaAut2
				+ ", pagNombreBanco=" + pagNombreBanco + ", pagNombreImpuesto="
				+ pagNombreImpuesto + ", pagNombreTercero=" + pagNombreTercero
				+ ", pagNumDocBen=" + pagNumDocBen + ", pagNumDocImpuesto="
				+ pagNumDocImpuesto + ", pagNumeroLinea=" + pagNumeroLinea
				+ ", pagNumeroPagareCredito=" + pagNumeroPagareCredito
				+ ", pagOrigen=" + pagOrigen + ", pagPais=" + pagPais
				+ ", pagPrimerAuxiliar=" + pagPrimerAuxiliar
				+ ", pagRetencionIca=" + pagRetencionIca + ", pagRetencionIva="
				+ pagRetencionIva + ", pagRetencionRenta=" + pagRetencionRenta
				+ ", pagSegundoAuxiliar=" + pagSegundoAuxiliar
				+ ", pagTercerAuxiliar=" + pagTercerAuxiliar
				+ ", pagTerminoPago=" + pagTerminoPago + ", pagTipoAbono="
				+ pagTipoAbono + ", pagTipoContrImp=" + pagTipoContrImp
				+ ", pagTipoContribuyente=" + pagTipoContribuyente
				+ ", pagTipoCuentaBancaria=" + pagTipoCuentaBancaria
				+ ", pagTipoDocBen=" + pagTipoDocBen + ", pagTipoTransaccion="
				+ pagTipoTransaccion + ", pagValorFactura=" + pagValorFactura
				+ ", pagValorLinea=" + pagValorLinea + ", pagVlrNetoPagado="
				+ pagVlrNetoPagado + ", pagVlrRetefuente=" + pagVlrRetefuente
				+ "]";
	}

	public Date getPagFechaFactura() {
		return pagFechaFactura;
	}

	public void setPagFechaFactura(Date pagFechaFactura) {
		this.pagFechaFactura = pagFechaFactura;
	}

	public Date getPagFechaRecepFac() {
		return pagFechaRecepFac;
	}

	public void setPagFechaRecepFac(Date pagFechaRecepFac) {
		this.pagFechaRecepFac = pagFechaRecepFac;
	}

	public Date getPagFechaTerminos() {
		return pagFechaTerminos;
	}

	public void setPagFechaTerminos(Date pagFechaTerminos) {
		this.pagFechaTerminos = pagFechaTerminos;
	}

	public Date getPagFechaContable() {
		return pagFechaContable;
	}

	public void setPagFechaContable(Date pagFechaContable) {
		this.pagFechaContable = pagFechaContable;
	}

	public Date getPagFechaContLinea() {
		return pagFechaContLinea;
	}

	public void setPagFechaContLinea(Date pagFechaContLinea) {
		this.pagFechaContLinea = pagFechaContLinea;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean isSeleccionada() {
		return seleccionada;
	}

	public void setSeleccionada(boolean seleccionada) {
		this.seleccionada = seleccionada;
	}


	public void setDescMetodoPago(String descMetodoPago) {
		this.descMetodoPago = descMetodoPago;
	}

	public String getDescMetodoPago() {
		return descMetodoPago;
	}

	public void setDescEstadoPago(String descEstadoPago) {
		this.descEstadoPago = descEstadoPago;
	}

	public String getDescEstadoPago() {
		return descEstadoPago;
	}

	public void setDescEstadoEnvio(String descEstadoEnvio) {
		this.descEstadoEnvio = descEstadoEnvio;
	}

	public String getDescEstadoEnvio() {
		return descEstadoEnvio;
	}

	public void setPagFechaEnvio(Date pagFechaEnvio) {
		this.pagFechaEnvio = pagFechaEnvio;
	}

	public Date getPagFechaEnvio() {
		return pagFechaEnvio;
	}

	public void setPagFechaCorreccion(Date pagFechaCorreccion) {
		this.pagFechaCorreccion = pagFechaCorreccion;
	}

	public Date getPagFechaCorreccion() {
		return pagFechaCorreccion;
	}

	public void setPagDescripcionError(String pagDescripcionError) {
		this.pagDescripcionError = pagDescripcionError;
	}

	public String getPagDescripcionError() {
		return pagDescripcionError;
	}

	public void setPagCodigoRetornoTaylor(String pagCodigoRetornoTaylor) {
		this.pagCodigoRetornoTaylor = pagCodigoRetornoTaylor;
	}

	public String getPagCodigoRetornoTaylor() {
		return pagCodigoRetornoTaylor;
	}

}