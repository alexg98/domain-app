package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * AbstractSipEstudiosCuentaProteccionesId entity provides the base persistence definition of the SipEstudiosCuentaProteccionesId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipEstudiosCuentaProteccionesId  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 3863999099343535310L;
	private SipEstudiosCuenta sipEstudiosCuenta;
     private Long estProConsecutivo;


    // Constructors

    /** default constructor */
    public AbstractSipEstudiosCuentaProteccionesId() {
    }

    
    /** full constructor */
    public AbstractSipEstudiosCuentaProteccionesId(SipEstudiosCuenta sipEstudiosCuenta, Long estProConsecutivo) {
        this.sipEstudiosCuenta = sipEstudiosCuenta;
        this.estProConsecutivo = estProConsecutivo;
    }

   
    // Property accessors

    public SipEstudiosCuenta getSipEstudiosCuenta() {
        return this.sipEstudiosCuenta;
    }
    
    public void setSipEstudiosCuenta(SipEstudiosCuenta sipEstudiosCuenta) {
        this.sipEstudiosCuenta = sipEstudiosCuenta;
    }

    public Long getEstProConsecutivo() {
        return this.estProConsecutivo;
    }
    
    public void setEstProConsecutivo(Long estProConsecutivo) {
        this.estProConsecutivo = estProConsecutivo;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractSipEstudiosCuentaProteccionesId) ) return false;
		 AbstractSipEstudiosCuentaProteccionesId castOther = ( AbstractSipEstudiosCuentaProteccionesId ) other; 
         
		 return ( (this.getSipEstudiosCuenta()==castOther.getSipEstudiosCuenta()) || ( this.getSipEstudiosCuenta()!=null && castOther.getSipEstudiosCuenta()!=null && this.getSipEstudiosCuenta().equals(castOther.getSipEstudiosCuenta()) ) )
 && ( (this.getEstProConsecutivo()==castOther.getEstProConsecutivo()) || ( this.getEstProConsecutivo()!=null && castOther.getEstProConsecutivo()!=null && this.getEstProConsecutivo().equals(castOther.getEstProConsecutivo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSipEstudiosCuenta() == null ? 0 : this.getSipEstudiosCuenta().hashCode() );
         result = 37 * result + ( getEstProConsecutivo() == null ? 0 : this.getEstProConsecutivo().hashCode() );
         return result;
   }   





}