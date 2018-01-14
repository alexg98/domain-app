package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * SipConceptosLiquidacion entity. @author MyEclipse Persistence Tools
 */
public class SipConceptosLiquidacion extends AbstractSipConceptosLiquidacion
		implements java.io.Serializable {

	private String anualidad;
	private Double rentabilidad;
	// Constructors

	/** default constructor */
	public SipConceptosLiquidacion() {
	}

	/** minimal constructor */
	public SipConceptosLiquidacion(SipConceptosLiquidacionId id) {
		super(id);
	}

	/** full constructor */
	public SipConceptosLiquidacion(SipConceptosLiquidacionId id,
			Long conlValor, Double conlPorcentaje, Long conlPadre,Long conlLiqPago) {
		super(id, conlValor, conlPorcentaje, conlPadre, conlLiqPago);
	}

	public String getAnualidad() {
		return anualidad;
	}

	public void setAnualidad(String anualidad) {
		this.anualidad = anualidad;
	}
	
	public double getRentabilidad() {
		return rentabilidad;
	}

	public void setRentabilidad(double rentabilidad) {
		this.rentabilidad = rentabilidad;
	}

	@Override
	public String toString() {		
		return "SipConceptosLiquidacion [ valor = "+ getConlValor() +  (anualidad != null ? ", anualidad  = "+ anualidad : "" )   	
				+ (rentabilidad != null ? ", rentabilidad  = "+ rentabilidad : "" ) +  ( getConlPorcentaje() != null ? ", porcentaje=" + getConlPorcentaje() : "" )   + "]";
	}
	
	
}
