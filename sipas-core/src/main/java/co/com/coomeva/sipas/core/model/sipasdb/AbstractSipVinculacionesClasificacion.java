package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractSipVinculacionesClasificacion generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipVinculacionesClasificacion  implements java.io.Serializable {


    // Fields    

     private SipVinculacionesClasificacionId id;
     private SipVinculacionesTipo sipVinculacionesTipo;
     private Set sipVinculacioneses = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractSipVinculacionesClasificacion() {
    }

	/** minimal constructor */
    public AbstractSipVinculacionesClasificacion(SipVinculacionesClasificacionId id, SipVinculacionesTipo sipVinculacionesTipo) {
        this.id = id;
        this.sipVinculacionesTipo = sipVinculacionesTipo;
    }
    
    /** full constructor */
    public AbstractSipVinculacionesClasificacion(SipVinculacionesClasificacionId id, SipVinculacionesTipo sipVinculacionesTipo, Set sipVinculacioneses) {
        this.id = id;
        this.sipVinculacionesTipo = sipVinculacionesTipo;
        this.sipVinculacioneses = sipVinculacioneses;
    }

   
    // Property accessors

    public SipVinculacionesClasificacionId getId() {
        return this.id;
    }
    
    public void setId(SipVinculacionesClasificacionId id) {
        this.id = id;
    }

    public SipVinculacionesTipo getSipVinculacionesTipo() {
        return this.sipVinculacionesTipo;
    }
    
    public void setSipVinculacionesTipo(SipVinculacionesTipo sipVinculacionesTipo) {
        this.sipVinculacionesTipo = sipVinculacionesTipo;
    }

    public Set getSipVinculacioneses() {
        return this.sipVinculacioneses;
    }
    
    public void setSipVinculacioneses(Set sipVinculacioneses) {
        this.sipVinculacioneses = sipVinculacioneses;
    }
   








}