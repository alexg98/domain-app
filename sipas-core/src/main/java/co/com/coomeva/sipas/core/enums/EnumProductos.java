package co.com.coomeva.sipas.core.enums;

/**
 * Enumerador que identifica los productos de solidaridad
 * @author alge3325
 *
 */
public enum EnumProductos  {	
	PLAN_60_VIDA(90l),
	PLAN_60_PERSEVERANCIA(91l),
	PLAN_60_RENTA_DIARIA(92l),
	PLAN_65_VIDA(93l),
	PLAN_65_PERSEVERANCIA(94l),
	PLAN_65_RENTA_DIARIA(95l),	
	
	VIDA_CLASICO(99);
	
	private long prodCodigo;
	
	private EnumProductos(long prodCodigo){
		this.prodCodigo = prodCodigo;
	}
	
	public long getProdCodigo() {
		return this.prodCodigo;
	}
}
