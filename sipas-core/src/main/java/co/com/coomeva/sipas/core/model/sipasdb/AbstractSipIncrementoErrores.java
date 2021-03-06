package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;


/**
 * AbstractSipIncrementoErrores generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipIncrementoErrores  implements java.io.Serializable {


    // Fields    

     private Long errCodigo;
     private SipIncrementoAnual sipIncrementoAnual;
     private SipProteccionesEventos sipProteccionesEventos;
     private String descripcion;
     private Date fechaRegistro;


    // Constructors

    /** default constructor */
    public AbstractSipIncrementoErrores() {
    }

	/** minimal constructor */
    public AbstractSipIncrementoErrores(Long errCodigo, SipIncrementoAnual sipIncrementoAnual, SipProteccionesEventos sipProteccionesEventos) {
        this.errCodigo = errCodigo;
        this.sipIncrementoAnual = sipIncrementoAnual;
        this.sipProteccionesEventos = sipProteccionesEventos;
    }
    
    /** full constructor */
    public AbstractSipIncrementoErrores(Long errCodigo, SipIncrementoAnual sipIncrementoAnual, SipProteccionesEventos sipProteccionesEventos, String descripcion, Date fechaRegistro) {
        this.errCodigo = errCodigo;
        this.sipIncrementoAnual = sipIncrementoAnual;
        this.sipProteccionesEventos = sipProteccionesEventos;
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro;
    }

   
    // Property accessors

    public Long getErrCodigo() {
        return this.errCodigo;
    }
    
    public void setErrCodigo(Long errCodigo) {
        this.errCodigo = errCodigo;
    }

    public SipIncrementoAnual getSipIncrementoAnual() {
        return this.sipIncrementoAnual;
    }
    
    public void setSipIncrementoAnual(SipIncrementoAnual sipIncrementoAnual) {
        this.sipIncrementoAnual = sipIncrementoAnual;
    }

    public SipProteccionesEventos getSipProteccionesEventos() {
        return this.sipProteccionesEventos;
    }
    
    public void setSipProteccionesEventos(SipProteccionesEventos sipProteccionesEventos) {
        this.sipProteccionesEventos = sipProteccionesEventos;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
   








}