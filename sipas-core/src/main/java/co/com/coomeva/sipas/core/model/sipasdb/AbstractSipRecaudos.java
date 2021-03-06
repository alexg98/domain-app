package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractSipRecaudos generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipRecaudos  implements java.io.Serializable {


    // Fields    

     private Long consecutivo;
     private SipFacConceptoProducto sipFacConceptoProducto;
     private Long asoNumint;
     private Long periodo;
     private Long codigoMonetario;
     private Long codigoProductoPlt;
     private Long transaccionTipo;
     private Long transaccionNumero;
     private Long transaccionConsecutivo;
     private Long transaccionCodigo;
     private Long transaccionAgencia;
     private Long transaccionHora;
     private Long transaccionEstado;
     private Long medioPago;
     private String numeroProducto;
     private Double valorRecaudo;
     private String codigoAso;
     private Long fechaEfectiva;
     private Long fechaProceso;
     private Long tipoMovimiento;
     private Long codigoOperacion;
     private Date fechaRecaudo;
     private String exceso;
     private Double valorExceso;
     private Long estado;
     private String destino;
     private Set sipCuentasContablesPagoses = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractSipRecaudos() {
    }

	/** minimal constructor */
    public AbstractSipRecaudos(Long consecutivo, SipFacConceptoProducto sipFacConceptoProducto, Long asoNumint, Long periodo, Long transaccionCodigo) {
        this.consecutivo = consecutivo;
        this.sipFacConceptoProducto = sipFacConceptoProducto;
        this.asoNumint = asoNumint;
        this.periodo = periodo;
        this.transaccionCodigo = transaccionCodigo;
    }
    
    /** full constructor */
    public AbstractSipRecaudos(Long consecutivo, SipFacConceptoProducto sipFacConceptoProducto, Long asoNumint, Long periodo, Long codigoMonetario, Long codigoProductoPlt, Long transaccionTipo, Long transaccionNumero, Long transaccionConsecutivo, Long transaccionCodigo, Long transaccionAgencia, Long transaccionHora, Long transaccionEstado, Long medioPago, String numeroProducto, Double valorRecaudo, String codigoAso, Long fechaEfectiva, Long fechaProceso, Long tipoMovimiento, Long codigoOperacion, Date fechaRecaudo, String exceso, Double valorExceso, Long estado, String destino, Set sipCuentasContablesPagoses) {
        this.consecutivo = consecutivo;
        this.sipFacConceptoProducto = sipFacConceptoProducto;
        this.asoNumint = asoNumint;
        this.periodo = periodo;
        this.codigoMonetario = codigoMonetario;
        this.codigoProductoPlt = codigoProductoPlt;
        this.transaccionTipo = transaccionTipo;
        this.transaccionNumero = transaccionNumero;
        this.transaccionConsecutivo = transaccionConsecutivo;
        this.transaccionCodigo = transaccionCodigo;
        this.transaccionAgencia = transaccionAgencia;
        this.transaccionHora = transaccionHora;
        this.transaccionEstado = transaccionEstado;
        this.medioPago = medioPago;
        this.numeroProducto = numeroProducto;
        this.valorRecaudo = valorRecaudo;
        this.codigoAso = codigoAso;
        this.fechaEfectiva = fechaEfectiva;
        this.fechaProceso = fechaProceso;
        this.tipoMovimiento = tipoMovimiento;
        this.codigoOperacion = codigoOperacion;
        this.fechaRecaudo = fechaRecaudo;
        this.exceso = exceso;
        this.valorExceso = valorExceso;
        this.estado = estado;
        this.destino = destino;
        this.sipCuentasContablesPagoses = sipCuentasContablesPagoses;
    }

   
    // Property accessors

    public Long getConsecutivo() {
        return this.consecutivo;
    }
    
    public void setConsecutivo(Long consecutivo) {
        this.consecutivo = consecutivo;
    }

    public SipFacConceptoProducto getSipFacConceptoProducto() {
        return this.sipFacConceptoProducto;
    }
    
    public void setSipFacConceptoProducto(SipFacConceptoProducto sipFacConceptoProducto) {
        this.sipFacConceptoProducto = sipFacConceptoProducto;
    }

    public Long getAsoNumint() {
        return this.asoNumint;
    }
    
    public void setAsoNumint(Long asoNumint) {
        this.asoNumint = asoNumint;
    }

    public Long getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(Long periodo) {
        this.periodo = periodo;
    }

    public Long getCodigoMonetario() {
        return this.codigoMonetario;
    }
    
    public void setCodigoMonetario(Long codigoMonetario) {
        this.codigoMonetario = codigoMonetario;
    }

    public Long getCodigoProductoPlt() {
        return this.codigoProductoPlt;
    }
    
    public void setCodigoProductoPlt(Long codigoProductoPlt) {
        this.codigoProductoPlt = codigoProductoPlt;
    }

    public Long getTransaccionTipo() {
        return this.transaccionTipo;
    }
    
    public void setTransaccionTipo(Long transaccionTipo) {
        this.transaccionTipo = transaccionTipo;
    }

    public Long getTransaccionNumero() {
        return this.transaccionNumero;
    }
    
    public void setTransaccionNumero(Long transaccionNumero) {
        this.transaccionNumero = transaccionNumero;
    }

    public Long getTransaccionConsecutivo() {
        return this.transaccionConsecutivo;
    }
    
    public void setTransaccionConsecutivo(Long transaccionConsecutivo) {
        this.transaccionConsecutivo = transaccionConsecutivo;
    }

    public Long getTransaccionCodigo() {
        return this.transaccionCodigo;
    }
    
    public void setTransaccionCodigo(Long transaccionCodigo) {
        this.transaccionCodigo = transaccionCodigo;
    }

    public Long getTransaccionAgencia() {
        return this.transaccionAgencia;
    }
    
    public void setTransaccionAgencia(Long transaccionAgencia) {
        this.transaccionAgencia = transaccionAgencia;
    }

    public Long getTransaccionHora() {
        return this.transaccionHora;
    }
    
    public void setTransaccionHora(Long transaccionHora) {
        this.transaccionHora = transaccionHora;
    }

    public Long getTransaccionEstado() {
        return this.transaccionEstado;
    }
    
    public void setTransaccionEstado(Long transaccionEstado) {
        this.transaccionEstado = transaccionEstado;
    }

    public Long getMedioPago() {
        return this.medioPago;
    }
    
    public void setMedioPago(Long medioPago) {
        this.medioPago = medioPago;
    }

    public String getNumeroProducto() {
        return this.numeroProducto;
    }
    
    public void setNumeroProducto(String numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    public Double getValorRecaudo() {
        return this.valorRecaudo;
    }
    
    public void setValorRecaudo(Double valorRecaudo) {
        this.valorRecaudo = valorRecaudo;
    }

    public String getCodigoAso() {
        return this.codigoAso;
    }
    
    public void setCodigoAso(String codigoAso) {
        this.codigoAso = codigoAso;
    }

    public Long getFechaEfectiva() {
        return this.fechaEfectiva;
    }
    
    public void setFechaEfectiva(Long fechaEfectiva) {
        this.fechaEfectiva = fechaEfectiva;
    }

    public Long getFechaProceso() {
        return this.fechaProceso;
    }
    
    public void setFechaProceso(Long fechaProceso) {
        this.fechaProceso = fechaProceso;
    }

    public Long getTipoMovimiento() {
        return this.tipoMovimiento;
    }
    
    public void setTipoMovimiento(Long tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public Long getCodigoOperacion() {
        return this.codigoOperacion;
    }
    
    public void setCodigoOperacion(Long codigoOperacion) {
        this.codigoOperacion = codigoOperacion;
    }

    public Date getFechaRecaudo() {
        return this.fechaRecaudo;
    }
    
    public void setFechaRecaudo(Date fechaRecaudo) {
        this.fechaRecaudo = fechaRecaudo;
    }

    public String getExceso() {
        return this.exceso;
    }
    
    public void setExceso(String exceso) {
        this.exceso = exceso;
    }

    public Double getValorExceso() {
        return this.valorExceso;
    }
    
    public void setValorExceso(Double valorExceso) {
        this.valorExceso = valorExceso;
    }

    public Long getEstado() {
        return this.estado;
    }
    
    public void setEstado(Long estado) {
        this.estado = estado;
    }

    public String getDestino() {
        return this.destino;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Set getSipCuentasContablesPagoses() {
        return this.sipCuentasContablesPagoses;
    }
    
    public void setSipCuentasContablesPagoses(Set sipCuentasContablesPagoses) {
        this.sipCuentasContablesPagoses = sipCuentasContablesPagoses;
    }
   








}