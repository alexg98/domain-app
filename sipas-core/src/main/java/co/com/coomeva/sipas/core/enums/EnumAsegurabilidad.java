package co.com.coomeva.sipas.core.enums;

public enum EnumAsegurabilidad {

	ACUMULADO_VIDA(24l),
	ACUMULADO_PESEVERANCIA(25l),
	ACUMULADO_RENTA_DIARIA(26l),
	AMULADO_TOTAL(27L);
	
	
	private long aseCodigo;
	
	EnumAsegurabilidad(Long aseCodigo){
		this.aseCodigo = aseCodigo;
	}
	
	public long getAsecodigo() {
		return aseCodigo;
	}
}
