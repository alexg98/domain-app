package co.com.coomeva.sipas.core.enums;

public enum EnumEstadosProteccion {
	ACTIVO("1"),
	INACTIVO("2"),
	INACTIVO_POR_MORA("4"),
	PAGADA("5"),
	SUSPENDIDO_POR_MORA("7"),
	ACTIVO_ESPECIAL("8");
	
	private String estado;
	
	private EnumEstadosProteccion(String estado){
		this.estado = estado;		
	}

	public String getEstado() {
		return estado;
	}
	
	public static String[] getActivoEInactivoMora() {
		return new String[] {ACTIVO.getEstado(), INACTIVO_POR_MORA.getEstado()};
	}
}
