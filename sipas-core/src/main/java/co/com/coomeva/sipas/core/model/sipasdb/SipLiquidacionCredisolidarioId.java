package co.com.coomeva.sipas.core.model.sipasdb;



public class SipLiquidacionCredisolidarioId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;


	private Long idLiquidacion;
	private Long nroPagare;
	
	public SipLiquidacionCredisolidarioId(){
	
	}
	
	public SipLiquidacionCredisolidarioId(Long idLiquidacion, Long nroPagare) {
		super();
		this.idLiquidacion = idLiquidacion;
		this.nroPagare = nroPagare;
	}
	
	public Long getIdLiquidacion() {
		return idLiquidacion;
	}
	public void setIdLiquidacion(Long idLiquidacion) {
		this.idLiquidacion = idLiquidacion;
	}
	public Long getNroPagare() {
		return nroPagare;
	}
	public void setNroPagare(Long nroPagare) {
		this.nroPagare = nroPagare;
	}
	
	
	
	

   
    
 
   
}
