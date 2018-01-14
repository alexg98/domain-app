package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractSipNovedadesTipo generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipNovedadesTipo  implements java.io.Serializable {


    // Fields    

     private Long tnovCodigo;
     private String tnovDescripcion;
     private Set sipNovedadeses = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractSipNovedadesTipo() {
    }

	/** minimal constructor */
    public AbstractSipNovedadesTipo(Long tnovCodigo) {
        this.tnovCodigo = tnovCodigo;
    }
    
    /** full constructor */
    public AbstractSipNovedadesTipo(Long tnovCodigo, String tnovDescripcion, Set sipNovedadeses) {
        this.tnovCodigo = tnovCodigo;
        this.tnovDescripcion = tnovDescripcion;
        this.sipNovedadeses = sipNovedadeses;
    }

   
    // Property accessors

    public Long getTnovCodigo() {
        return this.tnovCodigo;
    }
    
    public void setTnovCodigo(Long tnovCodigo) {
        this.tnovCodigo = tnovCodigo;
    }

    public String getTnovDescripcion() {
        return this.tnovDescripcion;
    }
    
    public void setTnovDescripcion(String tnovDescripcion) {
        this.tnovDescripcion = tnovDescripcion;
    }

    public Set getSipNovedadeses() {
        return this.sipNovedadeses;
    }
    
    public void setSipNovedadeses(Set sipNovedadeses) {
        this.sipNovedadeses = sipNovedadeses;
    }
   








}