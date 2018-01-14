package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;


/**
 * AbstractSipBeneficiariosAsociadoAud generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipBeneficiariosAsociadoAud  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 5047847631758796821L;
	private Long consecutivo;
     private Long codigo;
     private Long benCod;
     private String asoNumint;
     private Long proCod;
     private String tipoCod;
     private String parentesco;
     private String estadoBeneficiario;
     private String estado;
     private Double proteccionAcumulada;
     private Double cuotaAcumulada;
     private Double pagoUnico;
     private Double porcentaje;
     private String usuario;
     private String observaciones;
     private Date fechaRegistro;
     private Date fechaRegistroAud;
     private Date fechaGenCarta;


    // Constructors

    public Date getFechaRegistroAud() {
		return fechaRegistroAud;
	}

	public void setFechaRegistroAud(Date fechaRegistroAud) {
		this.fechaRegistroAud = fechaRegistroAud;
	}

	/** default constructor */
    public AbstractSipBeneficiariosAsociadoAud() {
    }

	/** minimal constructor */
    public AbstractSipBeneficiariosAsociadoAud(Long consecutivo, Long codigo, Long benCod, String asoNumint, String tipoCod, String estadoBeneficiario, String usuario, Date fechaRegistro, Date fechaRegistroAud) {
        this.consecutivo = consecutivo;
        this.codigo = codigo;
        this.benCod = benCod;
        this.asoNumint = asoNumint;
        this.tipoCod = tipoCod;
        this.estadoBeneficiario = estadoBeneficiario;
        this.usuario = usuario;
        this.fechaRegistro = fechaRegistro;
        this.fechaRegistroAud = fechaRegistroAud;
    }
    
    /** full constructor */
    public AbstractSipBeneficiariosAsociadoAud(Long consecutivo, Long codigo, Long benCod, String asoNumint, Long proCod, String tipoCod, String parentesco, String estadoBeneficiario, String estado, Double proteccionAcumulada, Double cuotaAcumulada, Double pagoUnico, Double porcentaje, String usuario, String observaciones, Date fechaRegistro, Date fechaRegistroAud, Date fechaGenCarta) {
        this.consecutivo = consecutivo;
        this.codigo = codigo;
        this.benCod = benCod;
        this.asoNumint = asoNumint;
        this.proCod = proCod;
        this.tipoCod = tipoCod;
        this.parentesco = parentesco;
        this.estadoBeneficiario = estadoBeneficiario;
        this.estado = estado;
        this.proteccionAcumulada = proteccionAcumulada;
        this.cuotaAcumulada = cuotaAcumulada;
        this.pagoUnico = pagoUnico;
        this.porcentaje = porcentaje;
        this.usuario = usuario;
        this.observaciones = observaciones;
        this.fechaRegistro = fechaRegistro;
        this.fechaRegistroAud = fechaRegistroAud;
        this.fechaGenCarta = fechaGenCarta;
    }

   
    // Property accessors

    public Long getConsecutivo() {
        return this.consecutivo;
    }
    
    public void setConsecutivo(Long consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Long getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Long getBenCod() {
        return this.benCod;
    }
    
    public void setBenCod(Long benCod) {
        this.benCod = benCod;
    }

    public String getAsoNumint() {
        return this.asoNumint;
    }
    
    public void setAsoNumint(String asoNumint) {
        this.asoNumint = asoNumint;
    }

    public Long getProCod() {
        return this.proCod;
    }
    
    public void setProCod(Long proCod) {
        this.proCod = proCod;
    }

    public String getTipoCod() {
        return this.tipoCod;
    }
    
    public void setTipoCod(String tipoCod) {
        this.tipoCod = tipoCod;
    }

    public String getParentesco() {
        return this.parentesco;
    }
    
    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getEstadoBeneficiario() {
        return this.estadoBeneficiario;
    }
    
    public void setEstadoBeneficiario(String estadoBeneficiario) {
        this.estadoBeneficiario = estadoBeneficiario;
    }

    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getProteccionAcumulada() {
        return this.proteccionAcumulada;
    }
    
    public void setProteccionAcumulada(Double proteccionAcumulada) {
        this.proteccionAcumulada = proteccionAcumulada;
    }

    public Double getCuotaAcumulada() {
        return this.cuotaAcumulada;
    }
    
    public void setCuotaAcumulada(Double cuotaAcumulada) {
        this.cuotaAcumulada = cuotaAcumulada;
    }

    public Double getPagoUnico() {
        return this.pagoUnico;
    }
    
    public void setPagoUnico(Double pagoUnico) {
        this.pagoUnico = pagoUnico;
    }

    public Double getPorcentaje() {
        return this.porcentaje;
    }
    
    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

	public Date getFechaGenCarta() {
		return fechaGenCarta;
	}

	public void setFechaGenCarta(Date fechaGenCarta) {
		this.fechaGenCarta = fechaGenCarta;
	}
   








}