package co.com.coomeva.sipas.core.enums;

public enum EnumEstadosAprobacionProteccion {
	
	APROBADO("1"),
	NEGADO("2"),
	EN_PROCESO("3");
	
	private String estado;
	
	private EnumEstadosAprobacionProteccion(String estado){
		this.estado = estado;		
	}

	public String getEstado() {
		return estado;
	}
}
