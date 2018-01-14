package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractSipEstudiosCuentaProtecciones entity provides the base persistence definition of the SipEstudiosCuentaProtecciones entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipEstudiosCuentaProtecciones  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -7146393886146527629L;
	private SipEstudiosCuentaProteccionesId id;
     private Double estProValorProteccion;
     private Date estProFechaIngreso;
     private String estProClasificacionIngreso;
     private String estProCodFactor;
     private Long estProConsecutivoProteccion;
     private String estProConcepto;
     private Set<SipEstudiosCuentaDetalle> sipEstudiosCuentaDetalles = new HashSet<>(0);


    // Constructors

    /** default constructor */
    public AbstractSipEstudiosCuentaProtecciones() {
    }

	/** minimal constructor */
    public AbstractSipEstudiosCuentaProtecciones(SipEstudiosCuentaProteccionesId id, Long estProConsecutivoProteccion) {
        this.id = id;
        this.estProConsecutivoProteccion = estProConsecutivoProteccion;
    }
    
    /** full constructor */
    public AbstractSipEstudiosCuentaProtecciones(SipEstudiosCuentaProteccionesId id, Double estProValorProteccion, Date estProFechaIngreso, String estProClasificacionIngreso, String estProCodFactor, Long estProConsecutivoProteccion,String estProConcepto, Set<SipEstudiosCuentaDetalle> sipEstudiosCuentaDetalles) {
        this.id = id;
        this.estProValorProteccion = estProValorProteccion;
        this.estProFechaIngreso = estProFechaIngreso;
        this.estProClasificacionIngreso = estProClasificacionIngreso;
        this.estProCodFactor = estProCodFactor;
        this.estProConsecutivoProteccion = estProConsecutivoProteccion;
        this.sipEstudiosCuentaDetalles = sipEstudiosCuentaDetalles;
        this.estProConcepto=estProConcepto;
    }

   
    // Property accessors

    public SipEstudiosCuentaProteccionesId getId() {
        return this.id;
    }
    
    public void setId(SipEstudiosCuentaProteccionesId id) {
        this.id = id;
    }

    public Double getEstProValorProteccion() {
        return this.estProValorProteccion;
    }
    
    public void setEstProValorProteccion(Double estProValorProteccion) {
        this.estProValorProteccion = estProValorProteccion;
    }

    public Date getEstProFechaIngreso() {
        return this.estProFechaIngreso;
    }
    
    public void setEstProFechaIngreso(Date estProFechaIngreso) {
        this.estProFechaIngreso = estProFechaIngreso;
    }

    public String getEstProClasificacionIngreso() {
        return this.estProClasificacionIngreso;
    }
    
    public void setEstProClasificacionIngreso(String estProClasificacionIngreso) {
        this.estProClasificacionIngreso = estProClasificacionIngreso;
    }

    public String getEstProCodFactor() {
        return this.estProCodFactor;
    }
    
    public void setEstProCodFactor(String estProCodFactor) {
        this.estProCodFactor = estProCodFactor;
    }

    public Long getEstProConsecutivoProteccion() {
        return this.estProConsecutivoProteccion;
    }
    
    public void setEstProConsecutivoProteccion(Long estProConsecutivoProteccion) {
        this.estProConsecutivoProteccion = estProConsecutivoProteccion;
    }

    public Set<SipEstudiosCuentaDetalle> getSipEstudiosCuentaDetalles() {
        return this.sipEstudiosCuentaDetalles;
    }
    
    public void setSipEstudiosCuentaDetalles(Set<SipEstudiosCuentaDetalle> sipEstudiosCuentaDetalles) {
        this.sipEstudiosCuentaDetalles = sipEstudiosCuentaDetalles;
    }

	public void setEstProConcepto(String estProConcepto) {
		this.estProConcepto = estProConcepto;
	}

	public String getEstProConcepto() {
		return estProConcepto;
	}
}