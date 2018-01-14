/**
 * Dec 21, 200610:21:01 AM2006
 */
package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * @author Cesar Augusto Ortiz - UTI
 * @version 1.0
 * Descripción : Modelo de Datos de ClibenRep
 */
public class CliBenRep {
	
	private Long numInt;
	private Long tipDoc;
	private Long docume;
	private Long fecIng;
	private String fecIngreso;
	
	public Long getDocume() {
		return docume;
	}
	public void setDocume(Long docume) {
		this.docume = docume;
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
	public Long getNumInt() {
		return numInt;
	}
	public void setNumInt(Long numInt) {
		this.numInt = numInt;
	}
	public Long getTipDoc() {
		return tipDoc;
	}
	public void setTipDoc(Long tipDoc) {
		this.tipDoc = tipDoc;
	}
	
}
