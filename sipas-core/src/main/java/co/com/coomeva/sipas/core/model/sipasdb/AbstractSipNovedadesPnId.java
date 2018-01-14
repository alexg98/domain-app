package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;


/**
 * AbstractSipNovedadesPnId entity provides the base persistence definition of the SipNovedadesPnId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipNovedadesPnId  implements java.io.Serializable {


    // Fields    

     private Long consecutivo;
     private Long nitcli;
     private Timestamp fechaAprobacion;
     private Timestamp fechaRegistro;
     private Timestamp fechaRetiro;
     private String sistemaOrigen;
     private String descripcion;
     private Long tipoNovedad;
     private String estado;


    // Constructors

    /** default constructor */
    public AbstractSipNovedadesPnId() {
    }

	/** minimal constructor */
    public AbstractSipNovedadesPnId(Long consecutivo, Long nitcli, Timestamp fechaRegistro, String sistemaOrigen, Long tipoNovedad) {
        this.consecutivo = consecutivo;
        this.nitcli = nitcli;
        this.fechaRegistro = fechaRegistro;
        this.sistemaOrigen = sistemaOrigen;
        this.tipoNovedad = tipoNovedad;
    }
    
    /** full constructor */
    public AbstractSipNovedadesPnId(Long consecutivo, Long nitcli, Timestamp fechaAprobacion, Timestamp fechaRegistro, Timestamp fechaRetiro, String sistemaOrigen, String descripcion, Long tipoNovedad, String estado) {
        this.consecutivo = consecutivo;
        this.nitcli = nitcli;
        this.fechaAprobacion = fechaAprobacion;
        this.fechaRegistro = fechaRegistro;
        this.fechaRetiro = fechaRetiro;
        this.sistemaOrigen = sistemaOrigen;
        this.descripcion = descripcion;
        this.tipoNovedad = tipoNovedad;
        this.estado = estado;
    }

   
    // Property accessors

    public Long getConsecutivo() {
        return this.consecutivo;
    }
    
    public void setConsecutivo(Long consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Long getNitcli() {
        return this.nitcli;
    }
    
    public void setNitcli(Long nitcli) {
        this.nitcli = nitcli;
    }

    public Timestamp getFechaAprobacion() {
        return this.fechaAprobacion;
    }
    
    public void setFechaAprobacion(Timestamp fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public Timestamp getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Timestamp getFechaRetiro() {
        return this.fechaRetiro;
    }
    
    public void setFechaRetiro(Timestamp fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public String getSistemaOrigen() {
        return this.sistemaOrigen;
    }
    
    public void setSistemaOrigen(String sistemaOrigen) {
        this.sistemaOrigen = sistemaOrigen;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getTipoNovedad() {
        return this.tipoNovedad;
    }
    
    public void setTipoNovedad(Long tipoNovedad) {
        this.tipoNovedad = tipoNovedad;
    }

    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractSipNovedadesPnId) ) return false;
		 AbstractSipNovedadesPnId castOther = ( AbstractSipNovedadesPnId ) other; 
         
		 return ( (this.getConsecutivo()==castOther.getConsecutivo()) || ( this.getConsecutivo()!=null && castOther.getConsecutivo()!=null && this.getConsecutivo().equals(castOther.getConsecutivo()) ) )
 && ( (this.getNitcli()==castOther.getNitcli()) || ( this.getNitcli()!=null && castOther.getNitcli()!=null && this.getNitcli().equals(castOther.getNitcli()) ) )
 && ( (this.getFechaAprobacion()==castOther.getFechaAprobacion()) || ( this.getFechaAprobacion()!=null && castOther.getFechaAprobacion()!=null && this.getFechaAprobacion().equals(castOther.getFechaAprobacion()) ) )
 && ( (this.getFechaRegistro()==castOther.getFechaRegistro()) || ( this.getFechaRegistro()!=null && castOther.getFechaRegistro()!=null && this.getFechaRegistro().equals(castOther.getFechaRegistro()) ) )
 && ( (this.getFechaRetiro()==castOther.getFechaRetiro()) || ( this.getFechaRetiro()!=null && castOther.getFechaRetiro()!=null && this.getFechaRetiro().equals(castOther.getFechaRetiro()) ) )
 && ( (this.getSistemaOrigen()==castOther.getSistemaOrigen()) || ( this.getSistemaOrigen()!=null && castOther.getSistemaOrigen()!=null && this.getSistemaOrigen().equals(castOther.getSistemaOrigen()) ) )
 && ( (this.getDescripcion()==castOther.getDescripcion()) || ( this.getDescripcion()!=null && castOther.getDescripcion()!=null && this.getDescripcion().equals(castOther.getDescripcion()) ) )
 && ( (this.getTipoNovedad()==castOther.getTipoNovedad()) || ( this.getTipoNovedad()!=null && castOther.getTipoNovedad()!=null && this.getTipoNovedad().equals(castOther.getTipoNovedad()) ) )
 && ( (this.getEstado()==castOther.getEstado()) || ( this.getEstado()!=null && castOther.getEstado()!=null && this.getEstado().equals(castOther.getEstado()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getConsecutivo() == null ? 0 : this.getConsecutivo().hashCode() );
         result = 37 * result + ( getNitcli() == null ? 0 : this.getNitcli().hashCode() );
         result = 37 * result + ( getFechaAprobacion() == null ? 0 : this.getFechaAprobacion().hashCode() );
         result = 37 * result + ( getFechaRegistro() == null ? 0 : this.getFechaRegistro().hashCode() );
         result = 37 * result + ( getFechaRetiro() == null ? 0 : this.getFechaRetiro().hashCode() );
         result = 37 * result + ( getSistemaOrigen() == null ? 0 : this.getSistemaOrigen().hashCode() );
         result = 37 * result + ( getDescripcion() == null ? 0 : this.getDescripcion().hashCode() );
         result = 37 * result + ( getTipoNovedad() == null ? 0 : this.getTipoNovedad().hashCode() );
         result = 37 * result + ( getEstado() == null ? 0 : this.getEstado().hashCode() );
         return result;
   }   





}