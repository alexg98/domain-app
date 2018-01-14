package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;


/**
 * AbstractSipReporteCertificadosDian entity provides the base persistence definition of the SipReporteCertificadosDian entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipReporteCertificadosDian  implements java.io.Serializable {


    // Fields    

     private Long codigoCertificado;
     private Long agno;
     private Long asoNumInt;	
	 private String tipoIdentificacion;
     private Long cedulaAsociado;
     private String nombreAsociado;
     private String ciudadAsociado;
     private Long fechaNacimiento;
     private String genero;
     private Long edadIngresoProducto;
     private Long edadActual;
     private Date fechaUltimoPago;
     private String estadoAsociadoCierreAgno;
     private Long fechaIngresoCooperativa;
     private Date fechaIngresoFondo;
     private Long codigoProducto;
     private String descripcionProducto;
     private Date fechaAprobacion;     
	 private String estadoProductoCierre;
     private Date fechaPerseverancia;
     private Double valorAcumuladoContribucion;
     private Double valorAcumuladoContribuciones;
     private Long numeroContribucionesPagadas;
     private Long valorProteccionAgnoVigente;
     private Long valorCuotaAgnoVigente;
     private Double valoresRescate;
     private Long reservaMatematica;
     private Long reservaMatematicaUltimoPeriodo;
     private Long valorAnualidad;


    // Constructors

    /** default constructor */
    public AbstractSipReporteCertificadosDian() {
    }

    
    /** full constructor */
    public AbstractSipReporteCertificadosDian(Long codigoCertificado, Long agno, 
    		Long asoNumInt, String tipoIdentificacion, Long cedulaAsociado, 
    		String nombreAsociado, String ciudadAsociado, Long fechaNacimiento, 
    		String genero, Long edadIngresoProducto, Long edadActual, 
    		Date fechaUltimoPago, String estadoAsociadoCierreAgno, 
    		Long fechaIngresoCooperativa, Date fechaIngresoFondo, 
    		Long codigoProducto, String descripcionProducto, Date fechaAprobacion,
    		String estadoProductoCierre, Date fechaPerseverancia, 
    		Double valorAcumuladoContribucion, Double valorAcumuladoContribuciones, 
    		Long numeroContribucionesPagadas, Long valorProteccionAgnoVigente, 
    		Long valorCuotaAgnoVigente, Double valoresRescate, Long reservaMatematica, 
    		Long reservaMatematicaUltimoPeriodo, Long valorAnualidad) {
        this.codigoCertificado = codigoCertificado;
        this.agno = agno;
        this.asoNumInt = asoNumInt;
        this.tipoIdentificacion = tipoIdentificacion;
        this.cedulaAsociado = cedulaAsociado;
        this.nombreAsociado = nombreAsociado;
        this.ciudadAsociado = ciudadAsociado;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.edadIngresoProducto = edadIngresoProducto;
        this.edadActual = edadActual;
        this.fechaUltimoPago = fechaUltimoPago;
        this.estadoAsociadoCierreAgno = estadoAsociadoCierreAgno;
        this.fechaIngresoCooperativa = fechaIngresoCooperativa;
        this.fechaIngresoFondo = fechaIngresoFondo;
        this.codigoProducto = codigoProducto;
        this.descripcionProducto = descripcionProducto;
        this.fechaAprobacion = fechaAprobacion; 
        this.estadoProductoCierre = estadoProductoCierre;
        this.fechaPerseverancia = fechaPerseverancia;
        this.valorAcumuladoContribucion = valorAcumuladoContribucion;
        this.valorAcumuladoContribuciones = valorAcumuladoContribuciones;
        this.numeroContribucionesPagadas = numeroContribucionesPagadas;
        this.valorProteccionAgnoVigente = valorProteccionAgnoVigente;
        this.valorCuotaAgnoVigente = valorCuotaAgnoVigente;
        this.valoresRescate = valoresRescate;
        this.reservaMatematica = reservaMatematica;
        this.reservaMatematicaUltimoPeriodo = reservaMatematicaUltimoPeriodo;
        this.valorAnualidad = valorAnualidad;
    }

   
    // Property accessors

    public Long getCodigoCertificado() {
        return this.codigoCertificado;
    }
    
    public void setCodigoCertificado(Long codigoCertificado) {
        this.codigoCertificado = codigoCertificado;
    }

    public String getTipoIdentificacion() {
        return this.tipoIdentificacion;
    }
    
    public Long getAgno() {
		return agno;
	}

	public void setAgno(Long agno) {
		this.agno = agno;
	}
	
	public Long getAsoNumInt() {
			return asoNumInt;
	}

	public void setAsoNumInt(Long asoNumInt) {
			this.asoNumInt = asoNumInt;
	}
    
    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Long getCedulaAsociado() {
        return this.cedulaAsociado;
    }
    
    public void setCedulaAsociado(Long cedulaAsociado) {
        this.cedulaAsociado = cedulaAsociado;
    }

    public String getNombreAsociado() {
        return this.nombreAsociado;
    }
    
    public void setNombreAsociado(String nombreAsociado) {
        this.nombreAsociado = nombreAsociado;
    }

    public String getCiudadAsociado() {
        return this.ciudadAsociado;
    }
    
    public Date getFechaAprobacion() {
		return fechaAprobacion;
	}


	public void setFechaAprobacion(Date fechaAprobacion) {
		this.fechaAprobacion = fechaAprobacion;
	}
    
    public void setCiudadAsociado(String ciudadAsociado) {
        this.ciudadAsociado = ciudadAsociado;
    }

    public Long getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Long fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return this.genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getEdadIngresoProducto() {
        return this.edadIngresoProducto;
    }
    
    public void setEdadIngresoProducto(Long edadIngresoProducto) {
        this.edadIngresoProducto = edadIngresoProducto;
    }

    public Long getEdadActual() {
        return this.edadActual;
    }
    
    public void setEdadActual(Long edadActual) {
        this.edadActual = edadActual;
    }

    public Date getFechaUltimoPago() {
        return this.fechaUltimoPago;
    }
    
    public void setFechaUltimoPago(Date fechaUltimoPago) {
        this.fechaUltimoPago = fechaUltimoPago;
    }

    public String getEstadoAsociadoCierreAgno() {
        return this.estadoAsociadoCierreAgno;
    }
    
    public void setEstadoAsociadoCierreAgno(String estadoAsociadoCierreAgno) {
        this.estadoAsociadoCierreAgno = estadoAsociadoCierreAgno;
    }

    public Long getFechaIngresoCooperativa() {
        return this.fechaIngresoCooperativa;
    }
    
    public void setFechaIngresoCooperativa(Long fechaIngresoCooperativa) {
        this.fechaIngresoCooperativa = fechaIngresoCooperativa;
    }

    public Date getFechaIngresoFondo() {
        return this.fechaIngresoFondo;
    }
    
    public void setFechaIngresoFondo(Date fechaIngresoFondo) {
        this.fechaIngresoFondo = fechaIngresoFondo;
    }

    public Long getCodigoProducto() {
        return this.codigoProducto;
    }
    
    public void setCodigoProducto(Long codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcionProducto() {
        return this.descripcionProducto;
    }
    
    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getEstadoProductoCierre() {
        return this.estadoProductoCierre;
    }
    
    public void setEstadoProductoCierre(String estadoProductoCierre) {
        this.estadoProductoCierre = estadoProductoCierre;
    }

    public Date getFechaPerseverancia() {
        return this.fechaPerseverancia;
    }
    
    public void setFechaPerseverancia(Date fechaPerseverancia) {
        this.fechaPerseverancia = fechaPerseverancia;
    }

    public Double getValorAcumuladoContribucion() {
        return this.valorAcumuladoContribucion;
    }
    
    public void setValorAcumuladoContribucion(Double valorAcumuladoContribucion) {
        this.valorAcumuladoContribucion = valorAcumuladoContribucion;
    }

    public Double getValorAcumuladoContribuciones() {
        return this.valorAcumuladoContribuciones;
    }
    
    public void setValorAcumuladoContribuciones(Double valorAcumuladoContribuciones) {
        this.valorAcumuladoContribuciones = valorAcumuladoContribuciones;
    }

    public Long getNumeroContribucionesPagadas() {
        return this.numeroContribucionesPagadas;
    }
    
    public void setNumeroContribucionesPagadas(Long numeroContribucionesPagadas) {
        this.numeroContribucionesPagadas = numeroContribucionesPagadas;
    }

    public Long getValorProteccionAgnoVigente() {
        return this.valorProteccionAgnoVigente;
    }
    
    public void setValorProteccionAgnoVigente(Long valorProteccionAgnoVigente) {
        this.valorProteccionAgnoVigente = valorProteccionAgnoVigente;
    }

    public Long getValorCuotaAgnoVigente() {
        return this.valorCuotaAgnoVigente;
    }
    
    public void setValorCuotaAgnoVigente(Long valorCuotaAgnoVigente) {
        this.valorCuotaAgnoVigente = valorCuotaAgnoVigente;
    }

    public Double getValoresRescate() {
        return this.valoresRescate;
    }
    
    public void setValoresRescate(Double valoresRescate) {
        this.valoresRescate = valoresRescate;
    }

    public Long getReservaMatematica() {
        return this.reservaMatematica;
    }
    
    public void setReservaMatematica(Long reservaMatematica) {
        this.reservaMatematica = reservaMatematica;
    }

    public Long getReservaMatematicaUltimoPeriodo() {
        return this.reservaMatematicaUltimoPeriodo;
    }
    
    public void setReservaMatematicaUltimoPeriodo(Long reservaMatematicaUltimoPeriodo) {
        this.reservaMatematicaUltimoPeriodo = reservaMatematicaUltimoPeriodo;
    }

    public Long getValorAnualidad() {
        return this.valorAnualidad;
    }
    
    public void setValorAnualidad(Long valorAnualidad) {
        this.valorAnualidad = valorAnualidad;
    }
   








}