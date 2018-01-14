package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSipSolicitud entity provides the base persistence definition of the
 * SipSolicitud entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipSolicitud implements java.io.Serializable {

	// Fields

	private Long solCodigo;
	private Timestamp solFechaRegistro;
	private Timestamp solFechaSolicitud;
	private Long solAsoNumint;
	private Short solTipo;
	private String solOfiRadicacion;
	private String solUsuario;
	private Byte solEstado;
	private Long solValorTotalDescapitalizacion;
	

	private Set sipDetalleDocSolicituds = new HashSet(0);
	private Set sipDetalleSolicituds = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSipSolicitud() {
	}

	/** minimal constructor */
	public AbstractSipSolicitud(Long solCodigo, Timestamp solFechaRegistro,
			Timestamp solFechaSolicitud, Long solAsoNumint, Short solTipo,
			String solOfiRadicacion, String solUsuario, Byte solEstado) {
		this.solCodigo = solCodigo;
		this.solFechaRegistro = solFechaRegistro;
		this.solFechaSolicitud = solFechaSolicitud;
		this.solAsoNumint = solAsoNumint;
		this.solTipo = solTipo;
		this.solOfiRadicacion = solOfiRadicacion;
		this.solUsuario = solUsuario;
		this.solEstado = solEstado;
		
	}

	/** full constructor */
	public AbstractSipSolicitud(Long solCodigo, Timestamp solFechaRegistro,
			Timestamp solFechaSolicitud, Long solAsoNumint, Short solTipo,
			String solOfiRadicacion, String solUsuario, Byte solEstado,Long solValorTotalDescapitalizacion,
			Set sipDetalleDocSolicituds, Set sipDetalleSolicituds) {
		this.solCodigo = solCodigo;
		this.solFechaRegistro = solFechaRegistro;
		this.solFechaSolicitud = solFechaSolicitud;
		this.solAsoNumint = solAsoNumint;
		this.solTipo = solTipo;
		this.solOfiRadicacion = solOfiRadicacion;
		this.solUsuario = solUsuario;
		this.solEstado = solEstado;
		this.solValorTotalDescapitalizacion=solValorTotalDescapitalizacion;
		this.sipDetalleDocSolicituds = sipDetalleDocSolicituds;
		this.sipDetalleSolicituds = sipDetalleSolicituds;
		
	}

	// Property accessors

	public Long getSolCodigo() {
		return this.solCodigo;
	}

	public void setSolCodigo(Long solCodigo) {
		this.solCodigo = solCodigo;
	}

	public Timestamp getSolFechaRegistro() {
		return this.solFechaRegistro;
	}

	public void setSolFechaRegistro(Timestamp solFechaRegistro) {
		this.solFechaRegistro = solFechaRegistro;
	}

	public Timestamp getSolFechaSolicitud() {
		return this.solFechaSolicitud;
	}

	public void setSolFechaSolicitud(Timestamp solFechaSolicitud) {
		this.solFechaSolicitud = solFechaSolicitud;
	}

	public Long getSolAsoNumint() {
		return this.solAsoNumint;
	}

	public void setSolAsoNumint(Long solAsoNumint) {
		this.solAsoNumint = solAsoNumint;
	}

	public Short getSolTipo() {
		return this.solTipo;
	}

	public void setSolTipo(Short solTipo) {
		this.solTipo = solTipo;
	}

	public String getSolOfiRadicacion() {
		return this.solOfiRadicacion;
	}

	public void setSolOfiRadicacion(String solOfiRadicacion) {
		this.solOfiRadicacion = solOfiRadicacion;
	}

	public String getSolUsuario() {
		return this.solUsuario;
	}

	public void setSolUsuario(String solUsuario) {
		this.solUsuario = solUsuario;
	}

	public Byte getSolEstado() {
		return this.solEstado;
	}

	public void setSolEstado(Byte solEstado) {
		this.solEstado = solEstado;
	}

	public Set getSipDetalleDocSolicituds() {
		return this.sipDetalleDocSolicituds;
	}

	public void setSipDetalleDocSolicituds(Set sipDetalleDocSolicituds) {
		this.sipDetalleDocSolicituds = sipDetalleDocSolicituds;
	}

	public Set getSipDetalleSolicituds() {
		return this.sipDetalleSolicituds;
	}

	public void setSipDetalleSolicituds(Set sipDetalleSolicituds) {
		this.sipDetalleSolicituds = sipDetalleSolicituds;
	}
	public Long getSolValorTotalDescapitalizacion() {
		return solValorTotalDescapitalizacion;
	}

	public void setSolValorTotalDescapitalizacion(Long solValorTotalDescapitalizacion) {
		this.solValorTotalDescapitalizacion = solValorTotalDescapitalizacion;
	}
}