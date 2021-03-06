package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;


/**
 * AbstractSipFacAjustes generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipFacAjustes  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 3298768492408305145L;
	private Long ajuCod;
     private SipProtecciones sipProtecciones;
     private SipProteccionesEventos sipProteccionesEventos;
     private SipFacConceptoProducto sipFacConceptoProducto;
     private Long asoNumint;
     private Long periodoInicial;
     private Long periodoFinal;
     private Long valorAjuste;
     private Long valorCuota;
     private Long cuotasPactadas;
     private Long cuotasFacturadas;
     private Date fechaAjuste;
     private String usuario;
     private String observacion;
     private String estado;
     private String tipo;


    // Constructors

    /** default constructor */
    public AbstractSipFacAjustes() {
    }

	/** minimal constructor */
    public AbstractSipFacAjustes(Long ajuCod, SipProtecciones sipProtecciones, SipProteccionesEventos sipProteccionesEventos, SipFacConceptoProducto sipFacConceptoProducto, Long asoNumint, Long periodoInicial, Long periodoFinal, Long valorAjuste, Long valorCuota, Long cuotasPactadas, Long cuotasFacturadas, Date fechaAjuste, String usuario) {
        this.ajuCod = ajuCod;
        this.sipProtecciones = sipProtecciones;
        this.sipProteccionesEventos = sipProteccionesEventos;
        this.sipFacConceptoProducto = sipFacConceptoProducto;
        this.asoNumint = asoNumint;
        this.periodoInicial = periodoInicial;
        this.periodoFinal = periodoFinal;
        this.valorAjuste = valorAjuste;
        this.valorCuota = valorCuota;
        this.cuotasPactadas = cuotasPactadas;
        this.cuotasFacturadas = cuotasFacturadas;
        this.fechaAjuste = fechaAjuste;
        this.usuario = usuario;
    }
    
    /** full constructor */
    public AbstractSipFacAjustes(Long ajuCod, SipProtecciones sipProtecciones, SipProteccionesEventos sipProteccionesEventos, SipFacConceptoProducto sipFacConceptoProducto, Long asoNumint, Long periodoInicial, Long periodoFinal, Long valorAjuste, Long valorCuota, Long cuotasPactadas, Long cuotasFacturadas, Date fechaAjuste, String usuario, String observacion, String estado, String tipo) {
        this.ajuCod = ajuCod;
        this.sipProtecciones = sipProtecciones;
        this.sipProteccionesEventos = sipProteccionesEventos;
        this.sipFacConceptoProducto = sipFacConceptoProducto;
        this.asoNumint = asoNumint;
        this.periodoInicial = periodoInicial;
        this.periodoFinal = periodoFinal;
        this.valorAjuste = valorAjuste;
        this.valorCuota = valorCuota;
        this.cuotasPactadas = cuotasPactadas;
        this.cuotasFacturadas = cuotasFacturadas;
        this.fechaAjuste = fechaAjuste;
        this.usuario = usuario;
        this.observacion = observacion;
        this.estado = estado;
        this.tipo = tipo;
    }

   
    // Property accessors

    public Long getAjuCod() {
        return this.ajuCod;
    }
    
    public void setAjuCod(Long ajuCod) {
        this.ajuCod = ajuCod;
    }

    public SipProtecciones getSipProtecciones() {
        return this.sipProtecciones;
    }
    
    public void setSipProtecciones(SipProtecciones sipProtecciones) {
        this.sipProtecciones = sipProtecciones;
    }

    public SipProteccionesEventos getSipProteccionesEventos() {
        return this.sipProteccionesEventos;
    }
    
    public void setSipProteccionesEventos(SipProteccionesEventos sipProteccionesEventos) {
        this.sipProteccionesEventos = sipProteccionesEventos;
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

    public Long getPeriodoInicial() {
        return this.periodoInicial;
    }
    
    public void setPeriodoInicial(Long periodoInicial) {
        this.periodoInicial = periodoInicial;
    }

    public Long getPeriodoFinal() {
        return this.periodoFinal;
    }
    
    public void setPeriodoFinal(Long periodoFinal) {
        this.periodoFinal = periodoFinal;
    }

    public Long getValorAjuste() {
        return this.valorAjuste;
    }
    
    public void setValorAjuste(Long valorAjuste) {
        this.valorAjuste = valorAjuste;
    }

    public Long getValorCuota() {
        return this.valorCuota;
    }
    
    public void setValorCuota(Long valorCuota) {
        this.valorCuota = valorCuota;
    }

    public Long getCuotasPactadas() {
        return this.cuotasPactadas;
    }
    
    public void setCuotasPactadas(Long cuotasPactadas) {
        this.cuotasPactadas = cuotasPactadas;
    }

    public Long getCuotasFacturadas() {
        return this.cuotasFacturadas;
    }
    
    public void setCuotasFacturadas(Long cuotasFacturadas) {
        this.cuotasFacturadas = cuotasFacturadas;
    }

    public Date getFechaAjuste() {
        return this.fechaAjuste;
    }
    
    public void setFechaAjuste(Date fechaAjuste) {
        this.fechaAjuste = fechaAjuste;
    }

    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
   








}