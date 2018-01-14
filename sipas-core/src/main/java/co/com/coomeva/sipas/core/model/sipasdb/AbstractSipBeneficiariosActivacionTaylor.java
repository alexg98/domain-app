package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;


/**
 * AbstractSipBeneficiariosActivacionTaylor generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipBeneficiariosActivacionTaylor  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -2271868204949898994L;
	private Long benactConsecutivo;
     private Long benactTipoIdetificacion;
     private Long benactNumIdentificacion;
     private String benactEstado;
     private Date benactFechaRegistro;


    // Constructors

    /** default constructor */
    public AbstractSipBeneficiariosActivacionTaylor() {
    }

    
    /** full constructor */
    public AbstractSipBeneficiariosActivacionTaylor(Long benactConsecutivo, Long benactTipoIdetificacion, Long benactNumIdentificacion, String benactEstado, Date benactFechaRegistro) {
        this.benactConsecutivo = benactConsecutivo;
        this.benactTipoIdetificacion = benactTipoIdetificacion;
        this.benactNumIdentificacion = benactNumIdentificacion;
        this.benactEstado = benactEstado;
        this.benactFechaRegistro = benactFechaRegistro;
    }

   
    // Property accessors

    public Long getBenactConsecutivo() {
        return this.benactConsecutivo;
    }
    
    public void setBenactConsecutivo(Long benactConsecutivo) {
        this.benactConsecutivo = benactConsecutivo;
    }

    public Long getBenactTipoIdetificacion() {
        return this.benactTipoIdetificacion;
    }
    
    public void setBenactTipoIdetificacion(Long benactTipoIdetificacion) {
        this.benactTipoIdetificacion = benactTipoIdetificacion;
    }

    public Long getBenactNumIdentificacion() {
        return this.benactNumIdentificacion;
    }
    
    public void setBenactNumIdentificacion(Long benactNumIdentificacion) {
        this.benactNumIdentificacion = benactNumIdentificacion;
    }

    public String getBenactEstado() {
        return this.benactEstado;
    }
    
    public void setBenactEstado(String benactEstado) {
        this.benactEstado = benactEstado;
    }

    public Date getBenactFechaRegistro() {
        return this.benactFechaRegistro;
    }
    
    public void setBenactFechaRegistro(Date benactFechaRegistro) {
        this.benactFechaRegistro = benactFechaRegistro;
    }
   








}