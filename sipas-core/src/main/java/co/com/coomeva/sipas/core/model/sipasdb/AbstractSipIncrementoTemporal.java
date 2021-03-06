package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;


/**
 * AbstractSipIncrementoTemporal generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipIncrementoTemporal  implements java.io.Serializable {


    // Fields    

     private SipIncrementoTemporalId id;
     private SipIncrementoAnual sipIncrementoAnual;
     private Long consecutivo;
     private Long asoNumint;
     private Double proteccionAnt;
     private Double proteccionPos;
     private Long cuotaAnt;
     private Long cuotaPos;
     private Double factorAnt;
     private Double factorPos;
     private Long nitcli;
     private String corte;
     private Date fechaAprobacion;
     private Long edadProteccion;
     private Long edadCorte;
     private Long prodCodigo;
     private Long agenciaCodigo;
     private String agenciaNombre;
     private String tipoVinculacion;
     private String estado;
     private Long factorCodigo;
     private Double proValorAnt;
     private Long proCuotaAnt;
     private Double proValorAntPos;
     private Long proCuotaAntPos;
     
     /* 
      * Campos solicitados RQSIP20111018_014 �Ajustes_Incremento_Anual 
      * @autor: aguerrero@intergrupo.com
      * */
     private String tipoBeneficiario;
     private Date benFechaNac;
     private Long edadProteccionBeneficiario;
     private Long benEdad;
     private Long benCod;
     private Long codigoBenAsociado;
     
    // Constructors     

     public Double getProValorAnt() {
 		return proValorAnt;
 	}

 	public void setProValorAnt(Double proValorAnt) {
 		this.proValorAnt = proValorAnt;
 	}

 	public Long getProCuotaAnt() {
 		return proCuotaAnt;
 	}

 	public void setProCuotaAnt(Long proCuotaAnt) {
 		this.proCuotaAnt = proCuotaAnt;
 	}

 	public Double getProValorAntPos() {
 		return proValorAntPos;
 	}

 	public void setProValorAntPos(Double proValorAntPos) {
 		this.proValorAntPos = proValorAntPos;
 	}

 	public Long getProCuotaAntPos() {
 		return proCuotaAntPos;
 	}

 	public void setProCuotaAntPos(Long proCuotaAntPos) {
 		this.proCuotaAntPos = proCuotaAntPos;
 	}


    public Long getFactorCodigo() {
		return factorCodigo;
	}
    
	public void setFactorCodigo(Long factorCodigo) {
		this.factorCodigo = factorCodigo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	/** default constructor */
    public AbstractSipIncrementoTemporal() {
    }

	/** minimal constructor */
    public AbstractSipIncrementoTemporal(SipIncrementoTemporalId id, SipIncrementoAnual sipIncrementoAnual, Long consecutivo, Long asoNumint, Double proteccionAnt, Double proteccionPos, Long cuotaAnt, Long cuotaPos, Double factorAnt, Double factorPos) {
        this.id = id;
        this.sipIncrementoAnual = sipIncrementoAnual;
        this.consecutivo = consecutivo;
        this.asoNumint = asoNumint;
        this.proteccionAnt = proteccionAnt;
        this.proteccionPos = proteccionPos;
        this.cuotaAnt = cuotaAnt;
        this.cuotaPos = cuotaPos;
        this.factorAnt = factorAnt;
        this.factorPos = factorPos;
    }
    
    /** full constructor */
    public AbstractSipIncrementoTemporal(SipIncrementoTemporalId id, SipIncrementoAnual sipIncrementoAnual, Long consecutivo, Long asoNumint, Double proteccionAnt, Double proteccionPos, Long cuotaAnt, Long cuotaPos, Double factorAnt, Double factorPos, Long nitcli, String corte, Date fechaAprobacion, Long edadProteccion, Long edadCorte, Long prodCodigo, Long agenciaCodigo, String agenciaNombre, String tipoVinculacion, String estado,Long factorCodigo,Double proValorAnt, Long proCuotaAnt,Double proValorAntPos, Long proCuotaAntPos) {
        this.id = id;
        this.sipIncrementoAnual = sipIncrementoAnual;
        this.consecutivo = consecutivo;
        this.asoNumint = asoNumint;
        this.proteccionAnt = proteccionAnt;
        this.proteccionPos = proteccionPos;
        this.cuotaAnt = cuotaAnt;
        this.cuotaPos = cuotaPos;
        this.factorAnt = factorAnt;
        this.factorPos = factorPos;
        this.nitcli = nitcli;
        this.corte = corte;
        this.fechaAprobacion = fechaAprobacion;
        this.edadProteccion = edadProteccion;
        this.edadCorte = edadCorte;
        this.prodCodigo = prodCodigo;
        this.agenciaCodigo = agenciaCodigo;
        this.agenciaNombre = agenciaNombre;
        this.tipoVinculacion = tipoVinculacion;
        this.estado = estado;
        this.factorCodigo=factorCodigo;
        this.proValorAnt=proValorAnt;
        this.proCuotaAnt=proCuotaAnt;
        this.proValorAntPos=proValorAntPos;
        this.proCuotaAntPos=proCuotaAntPos;
    }

   
    // Property accessors

    public SipIncrementoTemporalId getId() {
        return this.id;
    }
    
    public void setId(SipIncrementoTemporalId id) {
        this.id = id;
    }

    public SipIncrementoAnual getSipIncrementoAnual() {
        return this.sipIncrementoAnual;
    }
    
    public void setSipIncrementoAnual(SipIncrementoAnual sipIncrementoAnual) {
        this.sipIncrementoAnual = sipIncrementoAnual;
    }

    public Long getConsecutivo() {
        return this.consecutivo;
    }
    
    public void setConsecutivo(Long consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Long getAsoNumint() {
        return this.asoNumint;
    }
    
    public void setAsoNumint(Long asoNumint) {
        this.asoNumint = asoNumint;
    }

    public Double getProteccionAnt() {
        return this.proteccionAnt;
    }
    
    public void setProteccionAnt(Double proteccionAnt) {
        this.proteccionAnt = proteccionAnt;
    }

    public Double getProteccionPos() {
        return this.proteccionPos;
    }
    
    public void setProteccionPos(Double proteccionPos) {
        this.proteccionPos = proteccionPos;
    }

    public Long getCuotaAnt() {
        return this.cuotaAnt;
    }
    
    public void setCuotaAnt(Long cuotaAnt) {
        this.cuotaAnt = cuotaAnt;
    }

    public Long getCuotaPos() {
        return this.cuotaPos;
    }
    
    public void setCuotaPos(Long cuotaPos) {
        this.cuotaPos = cuotaPos;
    }

    public Double getFactorAnt() {
        return this.factorAnt;
    }
    
    public void setFactorAnt(Double factorAnt) {
        this.factorAnt = factorAnt;
    }

    public Double getFactorPos() {
        return this.factorPos;
    }
    
    public void setFactorPos(Double factorPos) {
        this.factorPos = factorPos;
    }

    public Long getNitcli() {
        return this.nitcli;
    }
    
    public void setNitcli(Long nitcli) {
        this.nitcli = nitcli;
    }

    public String getCorte() {
        return this.corte;
    }
    
    public void setCorte(String corte) {
        this.corte = corte;
    }

    public Date getFechaAprobacion() {
        return this.fechaAprobacion;
    }
    
    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public Long getEdadProteccion() {
        return this.edadProteccion;
    }
    
    public void setEdadProteccion(Long edadProteccion) {
        this.edadProteccion = edadProteccion;
    }

    public Long getEdadCorte() {
        return this.edadCorte;
    }
    
    public void setEdadCorte(Long edadCorte) {
        this.edadCorte = edadCorte;
    }

    public Long getProdCodigo() {
        return this.prodCodigo;
    }
    
    public void setProdCodigo(Long prodCodigo) {
        this.prodCodigo = prodCodigo;
    }

    public Long getAgenciaCodigo() {
        return this.agenciaCodigo;
    }
    
    public void setAgenciaCodigo(Long agenciaCodigo) {
        this.agenciaCodigo = agenciaCodigo;
    }

    public String getAgenciaNombre() {
        return this.agenciaNombre;
    }
    
    public void setAgenciaNombre(String agenciaNombre) {
        this.agenciaNombre = agenciaNombre;
    }

    public String getTipoVinculacion() {
        return this.tipoVinculacion;
    }
    
    public void setTipoVinculacion(String tipoVinculacion) {
        this.tipoVinculacion = tipoVinculacion;
    }

	public String getTipoBeneficiario() {
		return tipoBeneficiario;
	}

	public void setTipoBeneficiario(String tipoBeneficiario) {
		this.tipoBeneficiario = tipoBeneficiario;
	}

	public Date getBenFechaNac() {
		return benFechaNac;
	}

	public void setBenFechaNac(Date benFechaNac) {
		this.benFechaNac = benFechaNac;
	}

	public Long getEdadProteccionBeneficiario() {
		return edadProteccionBeneficiario;
	}

	public void setEdadProteccionBeneficiario(Long edadProteccionBeneficiario) {
		this.edadProteccionBeneficiario = edadProteccionBeneficiario;
	}

	public Long getBenEdad() {
		return benEdad;
	}

	public void setBenEdad(Long benEdad) {
		this.benEdad = benEdad;
	}

	public Long getBenCod() {
		return benCod;
	}

	public void setBenCod(Long benCod) {
		this.benCod = benCod;
	}

	public Long getCodigoBenAsociado() {
		return codigoBenAsociado;
	}

	public void setCodigoBenAsociado(Long codigoBenAsociado) {
		this.codigoBenAsociado = codigoBenAsociado;
	}

    
}