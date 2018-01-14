/**
 * Jan 17, 20075:27:43 PM2007
 */
package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * @author Cesar Augusto Ortiz - UTI
 * @version 1.0
 * Descripción : Bean de tipo Cliben
 */
public class Cliben {
	
	private Long numInt;
	private Long docume;
	private String tipBen;
	private String parent;
	private String nombre;
	private Long fecIng;
	private String fecIngreso;
	private String estBeneficiario;
	private Double porcen;
	private Long fecNac;
	private String fecNacimiento;
	private String indSex;
	
	public Long getDocume() {
		return docume;
	}
	public void setDocume(Long docume) {
		this.docume = docume;
	}
	public String getEstBeneficiario() {
		return estBeneficiario;
	}
	public void setEstBeneficiario(String estBeneficiario) {
		this.estBeneficiario = estBeneficiario;
	}
	public Long getFecIng() {
		return fecIng;
	}
	public void setFecIng(Long fecIng) {
		this.fecIng = fecIng;
	}
	public String getFecIngreso() {
		return fecIngreso;
	}
	public void setFecIngreso(String fecIngreso) {
		this.fecIngreso = fecIngreso;
	}
	public Long getFecNac() {
		return fecNac;
	}
	public void setFecNac(Long fecNac) {
		this.fecNac = fecNac;
	}
	public String getFecNacimiento() {
		return fecNacimiento;
	}
	public void setFecNacimiento(String fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}
	public String getIndSex() {
		return indSex;
	}
	public void setIndSex(String indSex) {
		this.indSex = indSex;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getNumInt() {
		return numInt;
	}
	public void setNumInt(Long numInt) {
		this.numInt = numInt;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public Double getPorcen() {
		return porcen;
	}
	public void setPorcen(Double porcen) {
		this.porcen = porcen;
	}
	public String getTipBen() {
		return tipBen;
	}
	public void setTipBen(String tipBen) {
		this.tipBen = tipBen;
	}



}
