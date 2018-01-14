package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * AbstractSipEstudiosCuentaDetalleId entity provides the base persistence definition of the SipEstudiosCuentaDetalleId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipEstudiosCuentaDetalleId  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 2889575872559360818L;
	private Long estDetConsecutivo;
     private SipEstudiosCuentaProtecciones sipEstudiosCuentaProtecciones;


    // Constructors

    /** default constructor */
    public AbstractSipEstudiosCuentaDetalleId() {
    }

    
    /** full constructor */
    public AbstractSipEstudiosCuentaDetalleId(Long estDetConsecutivo, SipEstudiosCuentaProtecciones sipEstudiosCuentaProtecciones) {
        this.estDetConsecutivo = estDetConsecutivo;
        this.sipEstudiosCuentaProtecciones = sipEstudiosCuentaProtecciones;
    }

   
    // Property accessors

    public Long getEstDetConsecutivo() {
        return this.estDetConsecutivo;
    }
    
    public void setEstDetConsecutivo(Long estDetConsecutivo) {
        this.estDetConsecutivo = estDetConsecutivo;
    }

    public SipEstudiosCuentaProtecciones getSipEstudiosCuentaProtecciones() {
        return this.sipEstudiosCuentaProtecciones;
    }
    
    public void setSipEstudiosCuentaProtecciones(SipEstudiosCuentaProtecciones sipEstudiosCuentaProtecciones) {
        this.sipEstudiosCuentaProtecciones = sipEstudiosCuentaProtecciones;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractSipEstudiosCuentaDetalleId) ) return false;
		 AbstractSipEstudiosCuentaDetalleId castOther = ( AbstractSipEstudiosCuentaDetalleId ) other; 
         
		 return ( (this.getEstDetConsecutivo()==castOther.getEstDetConsecutivo()) || ( this.getEstDetConsecutivo()!=null && castOther.getEstDetConsecutivo()!=null && this.getEstDetConsecutivo().equals(castOther.getEstDetConsecutivo()) ) )
 && ( (this.getSipEstudiosCuentaProtecciones()==castOther.getSipEstudiosCuentaProtecciones()) || ( this.getSipEstudiosCuentaProtecciones()!=null && castOther.getSipEstudiosCuentaProtecciones()!=null && this.getSipEstudiosCuentaProtecciones().equals(castOther.getSipEstudiosCuentaProtecciones()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEstDetConsecutivo() == null ? 0 : this.getEstDetConsecutivo().hashCode() );
         result = 37 * result + ( getSipEstudiosCuentaProtecciones() == null ? 0 : this.getSipEstudiosCuentaProtecciones().hashCode() );
         return result;
   }   





}