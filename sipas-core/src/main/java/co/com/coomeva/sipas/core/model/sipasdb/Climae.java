package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * 
 * @author Cesar Augusto Ortiz - UTI
 * @version 1.0
 * Descripción : Se usa para transporte de datos de la capa de logica
 * 				 al delegado
 */
public class Climae {
	
	private Long numInt;
	private Long nitCli;
	private Long tipDoc;
	private String desTipDoc;
	private String nomCli;
	private String nomCl1;
	private Long fecCon;
	private String fecNac;
	private Long fecIng;
	private String fecIngreso;
	private Long edadIng;
	private Long edadAct;
	private String asoCod;
	private Long estAso;
	private String desEstado;
	private Long claVin;
	private String tipoVin;
	private Long asoCia;
	
	public Long getAsoCia() {
		return asoCia;
	}
	public void setAsoCia(Long asoCia) {
		this.asoCia = asoCia;
	}
	public String getAsoCod() {
		return asoCod;
	}
	public void setAsoCod(String asoCod) {
		this.asoCod = asoCod;
	}
	public Long getClaVin() {
		return claVin;
	}
	public void setClaVin(Long claVin) {
		this.claVin = claVin;
	}
	public String getDesEstado() {
		return desEstado;
	}
	public void setDesEstado(String desEstado) {
		this.desEstado = desEstado;
	}
	public String getDesTipDoc() {
		return desTipDoc;
	}
	public void setDesTipDoc(String desTipDoc) {
		this.desTipDoc = desTipDoc;
	}
	public Long getEdadAct() {
		return edadAct;
	}
	public void setEdadAct(Long edadAct) {
		this.edadAct = edadAct;
	}
	public Long getEdadIng() {
		return edadIng;
	}
	public void setEdadIng(Long edadIng) {
		this.edadIng = edadIng;
	}
	public Long getEstAso() {
		return estAso;
	}
	public void setEstAso(Long estAso) {
		this.estAso = estAso;
	}
	public Long getFecCon() {
		return fecCon;
	}
	public void setFecCon(Long fecCon) {
		this.fecCon = fecCon;
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
	public String getFecNac() {
		return fecNac;
	}
	public void setFecNac(String fecNac) {
		this.fecNac = fecNac;
	}
	public Long getNitCli() {
		return nitCli;
	}
	public void setNitCli(Long nitCli) {
		this.nitCli = nitCli;
	}
	public String getNomCl1() {
		return nomCl1;
	}
	public void setNomCl1(String nomCl1) {
		this.nomCl1 = nomCl1;
	}
	public String getNomCli() {
		return nomCli;
	}
	public void setNomCli(String nomCli) {
		this.nomCli = nomCli;
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
	public String getTipoVin() {
		return tipoVin;
	}
	public void setTipoVin(String tipoVin) {
		this.tipoVin = tipoVin;
	}
}
