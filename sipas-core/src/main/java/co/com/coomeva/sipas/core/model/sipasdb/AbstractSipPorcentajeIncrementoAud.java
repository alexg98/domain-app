package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.util.Date;


/**
 * AbstractSipPorcentajeIncrementoAud entity provides the base persistence definition of the SipPorcentajeIncrementoAud entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipPorcentajeIncrementoAud  implements java.io.Serializable {


    // Fields    

     private Long porIncAudConsecutivo;
     private String porIncAudEstado;
     private String porIncAudTipo;
     private Integer porIncAudAnno;
     private Double porIncAudValor;
     private String porIncAudMesIncre;
     private Date porIncAudFechaRegistro;


    // Constructors

    /** default constructor */
    public AbstractSipPorcentajeIncrementoAud() {
    }

	/** minimal constructor */
    public AbstractSipPorcentajeIncrementoAud(Long porIncAudConsecutivo) {
        this.porIncAudConsecutivo = porIncAudConsecutivo;
    }
    
    /** full constructor */
    public AbstractSipPorcentajeIncrementoAud(Long porIncAudConsecutivo, String porIncAudEstado, String porIncAudTipo, Integer porIncAudAnno, Double porIncAudValor, String porIncAudMesIncre, Date porIncAudFechaRegistro) {
        this.porIncAudConsecutivo = porIncAudConsecutivo;
        this.porIncAudEstado = porIncAudEstado;
        this.porIncAudTipo = porIncAudTipo;
        this.porIncAudAnno = porIncAudAnno;
        this.porIncAudValor = porIncAudValor;
        this.porIncAudMesIncre = porIncAudMesIncre;
        this.porIncAudFechaRegistro = porIncAudFechaRegistro;
    }

   
    // Property accessors

    public Long getPorIncAudConsecutivo() {
        return this.porIncAudConsecutivo;
    }
    
    public void setPorIncAudConsecutivo(Long porIncAudConsecutivo) {
        this.porIncAudConsecutivo = porIncAudConsecutivo;
    }

    public String getPorIncAudEstado() {
        return this.porIncAudEstado;
    }
    
    public void setPorIncAudEstado(String porIncAudEstado) {
        this.porIncAudEstado = porIncAudEstado;
    }

    public String getPorIncAudTipo() {
        return this.porIncAudTipo;
    }
    
    public void setPorIncAudTipo(String porIncAudTipo) {
        this.porIncAudTipo = porIncAudTipo;
    }

    public Integer getPorIncAudAnno() {
        return this.porIncAudAnno;
    }
    
    public void setPorIncAudAnno(Integer porIncAudAnno) {
        this.porIncAudAnno = porIncAudAnno;
    }

    public Double getPorIncAudValor() {
        return this.porIncAudValor;
    }
    
    public void setPorIncAudValor(Double porIncAudValor) {
        this.porIncAudValor = porIncAudValor;
    }

    public String getPorIncAudMesIncre() {
        return this.porIncAudMesIncre;
    }
    
    public void setPorIncAudMesIncre(String porIncAudMesIncre) {
        this.porIncAudMesIncre = porIncAudMesIncre;
    }

    public Date getPorIncAudFechaRegistro() {
        return this.porIncAudFechaRegistro;
    }
    
    public void setPorIncAudFechaRegistro(Date porIncAudFechaRegistro) {
        this.porIncAudFechaRegistro = porIncAudFechaRegistro;
    }
   








}