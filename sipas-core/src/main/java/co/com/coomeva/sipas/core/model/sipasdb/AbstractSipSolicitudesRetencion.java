package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;
import java.util.Date;


/**
 * AbstractSipSolicitudesRetencion entity provides the base persistence definition of the SipSolicitudesRetencion entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipSolicitudesRetencion  implements java.io.Serializable {


    // Fields    

     private Long srtConsecutivo;
     private Long srtProCodMadre;
     private Long srtProCodHija;
     private Long srtAsoNumint;
     private Long srtTipoSolicitud;
     private String srtPeriodoReliquidacion;
     private Long srtProdCodigoMadre;
     private Long srtProdCodigoHija;
     private Long srtValorDeseado;
     private Long srtAhorroRendimiento;
     private Long srtNuevaCuota;
     private Long srtNuevoFactor;
     private String srtContribucionVida;
     private Long srtMesesContVida;
     private Long srtMesesAplazaSolv;
     private Long srtValorCuotaVida;
     private Long srtProteccionVida;
     private Long srtEstadoRegistro;
     private Timestamp srtFechaRegistro;
     private String srtUsuario;


    // Constructors

    /** default constructor */
    public AbstractSipSolicitudesRetencion() {
    }

	/** minimal constructor */
    public AbstractSipSolicitudesRetencion(Long srtConsecutivo, Long srtAsoNumint, Long srtTipoSolicitud, Long srtProdCodigoMadre,Long srtProdCodigoHija, Long srtValorDeseado) {
        this.srtConsecutivo = srtConsecutivo;
        this.srtAsoNumint = srtAsoNumint;
        this.srtTipoSolicitud = srtTipoSolicitud;
        this.srtProdCodigoMadre = srtProdCodigoMadre;
        this.srtValorDeseado = srtValorDeseado;
        this.srtProdCodigoHija=srtProdCodigoHija;
    }
    
    /** full constructor */
    public AbstractSipSolicitudesRetencion(Long srtConsecutivo, Long srtProCodMadre,Long srtProCodHija, Long srtAsoNumint, Long srtTipoSolicitud, String srtPeriodoReliquidacion, Long srtProdCodigoMadre,Long srtProdCodigoHija,Long srtValorDeseado, Long srtAhorroRendimiento, Long srtNuevaCuota, Long srtNuevoFactor, String srtContribucionVida, Long srtMesesContVida, Long srtMesesAplazaSolv, Long srtValorCuotaVida, Long srtProteccionVida, Long srtEstadoRegistro,Timestamp srtFechaRegistro, String srtUsuario) {
        this.srtConsecutivo = srtConsecutivo;
        this.srtProCodMadre = srtProCodMadre;
        this.srtAsoNumint = srtAsoNumint;
        this.srtTipoSolicitud = srtTipoSolicitud;
        this.srtPeriodoReliquidacion = srtPeriodoReliquidacion;
        this.srtProdCodigoMadre = srtProdCodigoMadre;
        this.srtValorDeseado = srtValorDeseado;
        this.srtAhorroRendimiento = srtAhorroRendimiento;
        this.srtNuevaCuota = srtNuevaCuota;
        this.srtNuevoFactor = srtNuevoFactor;
        this.srtContribucionVida = srtContribucionVida;
        this.srtMesesContVida = srtMesesContVida;
        this.srtMesesAplazaSolv = srtMesesAplazaSolv;
        this.srtValorCuotaVida = srtValorCuotaVida;
        this.srtProteccionVida = srtProteccionVida;
        this.srtEstadoRegistro=srtEstadoRegistro;
        this.srtFechaRegistro = srtFechaRegistro;
        this.srtProCodHija=srtProCodHija;
        this.srtUsuario = srtUsuario;
        this.srtProdCodigoHija=srtProdCodigoHija;
    }

   
    // Property accessors

    public Long getSrtConsecutivo() {
        return this.srtConsecutivo;
    }
    
    public void setSrtConsecutivo(Long srtConsecutivo) {
        this.srtConsecutivo = srtConsecutivo;
    }

    public Long getSrtProCodMadre() {
        return this.srtProCodMadre;
    }
    
    public void setSrtProCodMadre(Long srtProCodMadre) {
        this.srtProCodMadre = srtProCodMadre;
    }

    public Long getSrtAsoNumint() {
        return this.srtAsoNumint;
    }
    
    public void setSrtAsoNumint(Long srtAsoNumint) {
        this.srtAsoNumint = srtAsoNumint;
    }

    public Long getSrtTipoSolicitud() {
        return this.srtTipoSolicitud;
    }
    
    public void setSrtTipoSolicitud(Long srtTipoSolicitud) {
        this.srtTipoSolicitud = srtTipoSolicitud;
    }

    public String getSrtPeriodoReliquidacion() {
        return this.srtPeriodoReliquidacion;
    }
    
    public void setSrtPeriodoReliquidacion(String srtPeriodoReliquidacion) {
        this.srtPeriodoReliquidacion = srtPeriodoReliquidacion;
    }

    public Long getSrtProdCodigoMadre() {
        return this.srtProdCodigoMadre;
    }
    
    public void setSrtProdCodigoMadre(Long srtProdCodigoMadre) {
        this.srtProdCodigoMadre = srtProdCodigoMadre;
    }

    public Long getSrtValorDeseado() {
        return this.srtValorDeseado;
    }
    
    public void setSrtValorDeseado(Long srtValorDeseado) {
        this.srtValorDeseado = srtValorDeseado;
    }

    public Long getSrtAhorroRendimiento() {
        return this.srtAhorroRendimiento;
    }
    
    public void setSrtAhorroRendimiento(Long srtAhorroRendimiento) {
        this.srtAhorroRendimiento = srtAhorroRendimiento;
    }

    public Long getSrtNuevaCuota() {
        return this.srtNuevaCuota;
    }
    
    public void setSrtNuevaCuota(Long srtNuevaCuota) {
        this.srtNuevaCuota = srtNuevaCuota;
    }

    public Long getSrtNuevoFactor() {
        return this.srtNuevoFactor;
    }
    
    public void setSrtNuevoFactor(Long srtNuevoFactor) {
        this.srtNuevoFactor = srtNuevoFactor;
    }

    public String getSrtContribucionVida() {
        return this.srtContribucionVida;
    }
    
    public void setSrtContribucionVida(String srtContribucionVida) {
        this.srtContribucionVida = srtContribucionVida;
    }

    public Long getSrtMesesContVida() {
        return this.srtMesesContVida;
    }
    
    public void setSrtMesesContVida(Long srtMesesContVida) {
        this.srtMesesContVida = srtMesesContVida;
    }

    public Long getSrtMesesAplazaSolv() {
        return this.srtMesesAplazaSolv;
    }
    
    public void setSrtMesesAplazaSolv(Long srtMesesAplazaSolv) {
        this.srtMesesAplazaSolv = srtMesesAplazaSolv;
    }

    public Long getSrtValorCuotaVida() {
        return this.srtValorCuotaVida;
    }
    
    public void setSrtValorCuotaVida(Long srtValorCuotaVida) {
        this.srtValorCuotaVida = srtValorCuotaVida;
    }

    public Long getSrtProteccionVida() {
        return this.srtProteccionVida;
    }
    
    public void setSrtProteccionVida(Long srtProteccionVida) {
        this.srtProteccionVida = srtProteccionVida;
    }

    public Timestamp getSrtFechaRegistro() {
        return this.srtFechaRegistro;
    }
    
    public void setSrtFechaRegistro(Timestamp srtFechaRegistro) {
        this.srtFechaRegistro = srtFechaRegistro;
    }

    public String getSrtUsuario() {
        return this.srtUsuario;
    }
    
    public void setSrtUsuario(String srtUsuario) {
        this.srtUsuario = srtUsuario;
    }

	public void setSrtEstadoRegistro(Long srtEstadoRegistro) {
		this.srtEstadoRegistro = srtEstadoRegistro;
	}

	public Long getSrtEstadoRegistro() {
		return srtEstadoRegistro;
	}

	public void setSrtProCodHija(Long srtProCodHija) {
		this.srtProCodHija = srtProCodHija;
	}

	public Long getSrtProCodHija() {
		return srtProCodHija;
	}

	public void setSrtProdCodigoHija(Long srtProdCodigoHija) {
		this.srtProdCodigoHija = srtProdCodigoHija;
	}

	public Long getSrtProdCodigoHija() {
		return srtProdCodigoHija;
	}
   








}