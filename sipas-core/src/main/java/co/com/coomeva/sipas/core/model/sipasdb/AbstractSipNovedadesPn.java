package co.com.coomeva.sipas.core.model.sipasdb;



/**
 * AbstractSipNovedadesPn entity provides the base persistence definition of the SipNovedadesPn entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipNovedadesPn  implements java.io.Serializable {


    // Fields    

     private SipNovedadesPnId id;


    // Constructors

    /** default constructor */
    public AbstractSipNovedadesPn() {
    }

    
    /** full constructor */
    public AbstractSipNovedadesPn(SipNovedadesPnId id) {
        this.id = id;
    }

   
    // Property accessors

    public SipNovedadesPnId getId() {
        return this.id;
    }
    
    public void setId(SipNovedadesPnId id) {
        this.id = id;
    }
   








}