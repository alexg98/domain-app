package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractSipDistribuciones generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipDistribuciones  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -2899437581088939055L;
	private Long disCod;
     private String disDesc;
     private String disNombreCorto;
     private Set sipFactoresDistribucions = new HashSet(0);
     private Set sipCuentasContableses = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractSipDistribuciones() {
    }

	/** minimal constructor */
    public AbstractSipDistribuciones(Long disCod, String disDesc, String disNombreCorto) {
        this.disCod = disCod;
        this.disDesc = disDesc;
        this.disNombreCorto = disNombreCorto;
    }
    
    /** full constructor */
    public AbstractSipDistribuciones(Long disCod, String disDesc, String disNombreCorto, Set sipFactoresDistribucions, Set sipCuentasContableses) {
        this.disCod = disCod;
        this.disDesc = disDesc;
        this.disNombreCorto = disNombreCorto;
        this.sipFactoresDistribucions = sipFactoresDistribucions;
        this.sipCuentasContableses = sipCuentasContableses;
    }

   
    // Property accessors

    public Long getDisCod() {
        return this.disCod;
    }
    
    public void setDisCod(Long disCod) {
        this.disCod = disCod;
    }

    public String getDisDesc() {
        return this.disDesc;
    }
    
    public void setDisDesc(String disDesc) {
        this.disDesc = disDesc;
    }

    public String getDisNombreCorto() {
        return this.disNombreCorto;
    }
    
    public void setDisNombreCorto(String disNombreCorto) {
        this.disNombreCorto = disNombreCorto;
    }

    public Set getSipFactoresDistribucions() {
        return this.sipFactoresDistribucions;
    }
    
    public void setSipFactoresDistribucions(Set sipFactoresDistribucions) {
        this.sipFactoresDistribucions = sipFactoresDistribucions;
    }

    public Set getSipCuentasContableses() {
        return this.sipCuentasContableses;
    }
    
    public void setSipCuentasContableses(Set sipCuentasContableses) {
        this.sipCuentasContableses = sipCuentasContableses;
    }
   








}