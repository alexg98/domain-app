package co.com.coomeva.sipas.core.model.sipasdb;
// Generated Apr 2, 2011 12:27:04 PM by Zathura powered by Hibernate Tools 3.2.4.GA



/**
 * SipFactoresInactividadId generated by Zathura powered by Hibernate-tools(hbm2java)
 */
public class SipFactoresInactividadId  implements java.io.Serializable {


     private Long factorCodigo;
     private Long perCodigo;
     private Long prodCodigo;

    public SipFactoresInactividadId() {
    }

    public SipFactoresInactividadId(Long factorCodigo, Long perCodigo, Long prodCodigo) {
       this.factorCodigo = factorCodigo;
       this.perCodigo = perCodigo;
       this.prodCodigo = prodCodigo;
    }
   
    public Long getFactorCodigo() {
        return this.factorCodigo;
    }
    
    public void setFactorCodigo(Long factorCodigo) {
        this.factorCodigo = factorCodigo;
    }
    public Long getPerCodigo() {
        return this.perCodigo;
    }
    
    public void setPerCodigo(Long perCodigo) {
        this.perCodigo = perCodigo;
    }
    public Long getProdCodigo() {
        return this.prodCodigo;
    }
    
    public void setProdCodigo(Long prodCodigo) {
        this.prodCodigo = prodCodigo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SipFactoresInactividadId) ) return false;
		 SipFactoresInactividadId castOther = ( SipFactoresInactividadId ) other; 
         
		 return ( (this.getFactorCodigo()==castOther.getFactorCodigo()) || ( this.getFactorCodigo()!=null && castOther.getFactorCodigo()!=null && this.getFactorCodigo().equals(castOther.getFactorCodigo()) ) )
 && ( (this.getPerCodigo()==castOther.getPerCodigo()) || ( this.getPerCodigo()!=null && castOther.getPerCodigo()!=null && this.getPerCodigo().equals(castOther.getPerCodigo()) ) )
 && ( (this.getProdCodigo()==castOther.getProdCodigo()) || ( this.getProdCodigo()!=null && castOther.getProdCodigo()!=null && this.getProdCodigo().equals(castOther.getProdCodigo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getFactorCodigo() == null ? 0 : this.getFactorCodigo().hashCode() );
         result = 37 * result + ( getPerCodigo() == null ? 0 : this.getPerCodigo().hashCode() );
         result = 37 * result + ( getProdCodigo() == null ? 0 : this.getProdCodigo().hashCode() );
         return result;
   }   


}

