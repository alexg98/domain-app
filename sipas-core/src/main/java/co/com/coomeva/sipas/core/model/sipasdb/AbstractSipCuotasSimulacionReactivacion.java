package co.com.coomeva.sipas.core.model.sipasdb;



/**
 * AbstractSipCuotasSimulacionReactivacion entity provides the base persistence
 * definition of the SipCuotasSimulacionReactivacion entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipCuotasSimulacionReactivacion implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 7627311237169916183L;
	private SipCuotasSimulacionReactivacionId id;
	private Long csrConsecutivoProteccion;
	private Integer csrPeriodo;
	private Long csrProCod;
	private Long csrValorFacturado;
	private Long csrValorPagado;
	private String csrEstado;
	private Long csrValorMora;
	private Long csrValorMoraPagada;
	private String csrObservacion;

	// Constructors

	/** default constructor */
	public AbstractSipCuotasSimulacionReactivacion() {
	}

	/** minimal constructor */
	public AbstractSipCuotasSimulacionReactivacion(
			SipCuotasSimulacionReactivacionId id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractSipCuotasSimulacionReactivacion(
			SipCuotasSimulacionReactivacionId id,
			Long csrConsecutivoProteccion, Integer csrPeriodo,
			Long csrProCod, Long csrValorFacturado, Long csrValorPagado,
			String csrEstado, Long csrValorMora, Long csrValorMoraPagada,
			String csrObservacion) {
		this.id = id;
		this.csrConsecutivoProteccion = csrConsecutivoProteccion;
		this.csrPeriodo = csrPeriodo;
		this.csrProCod = csrProCod;
		this.csrValorFacturado = csrValorFacturado;
		this.csrValorPagado = csrValorPagado;
		this.csrEstado = csrEstado;
		this.csrValorMora = csrValorMora;
		this.csrValorMoraPagada = csrValorMoraPagada;
		this.csrObservacion = csrObservacion;
	}

	// Property accessors

	public SipCuotasSimulacionReactivacionId getId() {
		return this.id;
	}

	public void setId(SipCuotasSimulacionReactivacionId id) {
		this.id = id;
	}

	public Long getCsrConsecutivoProteccion() {
		return this.csrConsecutivoProteccion;
	}

	public void setCsrConsecutivoProteccion(Long csrConsecutivoProteccion) {
		this.csrConsecutivoProteccion = csrConsecutivoProteccion;
	}

	public Integer getCsrPeriodo() {
		return this.csrPeriodo;
	}

	public void setCsrPeriodo(Integer csrPeriodo) {
		this.csrPeriodo = csrPeriodo;
	}

	public Long getCsrProCod() {
		return this.csrProCod;
	}

	public void setCsrProCod(Long csrProCod) {
		this.csrProCod = csrProCod;
	}

	public Long getCsrValorFacturado() {
		return this.csrValorFacturado;
	}

	public void setCsrValorFacturado(Long csrValorFacturado) {
		this.csrValorFacturado = csrValorFacturado;
	}

	public Long getCsrValorPagado() {
		return this.csrValorPagado;
	}

	public void setCsrValorPagado(Long csrValorPagado) {
		this.csrValorPagado = csrValorPagado;
	}

	public String getCsrEstado() {
		return this.csrEstado;
	}

	public void setCsrEstado(String csrEstado) {
		this.csrEstado = csrEstado;
	}

	public Long getCsrValorMora() {
		return this.csrValorMora;
	}

	public void setCsrValorMora(Long csrValorMora) {
		this.csrValorMora = csrValorMora;
	}

	public Long getCsrValorMoraPagada() {
		return this.csrValorMoraPagada;
	}

	public void setCsrValorMoraPagada(Long csrValorMoraPagada) {
		this.csrValorMoraPagada = csrValorMoraPagada;
	}

	public String getCsrObservacion() {
		return this.csrObservacion;
	}

	public void setCsrObservacion(String csrObservacion) {
		this.csrObservacion = csrObservacion;
	}

}