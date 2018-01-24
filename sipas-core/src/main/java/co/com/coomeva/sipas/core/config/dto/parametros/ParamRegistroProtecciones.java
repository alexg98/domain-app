package co.com.coomeva.sipas.core.config.dto.parametros;

import java.util.Date;

import co.com.coomeva.sipas.core.model.sipasdb.ClimaeDetallado;

public class ParamRegistroProtecciones {
	
	ClimaeDetallado climae;
	Date fechaNacimiento;
	Long promotor;
	Long usuario;
	Long prodCodigo;
	
	public ClimaeDetallado getClimae() {
		return climae;
	}
	public void setClimae(ClimaeDetallado climae) {
		this.climae = climae;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Long getPromotor() {
		return promotor;
	}
	public void setPromotor(Long promotor) {
		this.promotor = promotor;
	}
	public Long getUsuario() {
		return usuario;
	}
	public void setUsuario(Long usuario) {
		this.usuario = usuario;
	}
	public Long getProdCodigo() {
		return prodCodigo;
	}
	public void setProdCodigo(Long prodCodigo) {
		this.prodCodigo = prodCodigo;
	}
	
}
