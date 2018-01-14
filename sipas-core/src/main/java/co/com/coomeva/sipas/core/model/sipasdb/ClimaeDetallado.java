package co.com.coomeva.sipas.core.model.sipasdb;

/**
 * 
 * @author Cesar Augusto Ortiz - UTI
 * @version 1.0 Descripci : Se usa para transporte de datos de la capa de
 *          logica al delegado
 */
public class ClimaeDetallado {

	private Long numInt;

	private Long nitCli;

	private Long tipDoc;

	private String desTipDoc;

	private String nomCli;

	private String nomCl1;

	private Long idOficina;

	private String desOfiVin;

	private Long fecCon;

	private String fecNac;

	private Long fecIng;

	private String fecIngreso;

	private Long edadIng;

	private Long edadAct;

	private String asoCod;

	private Long codSex;

	private String sexo;

	private Long ciuNac;

	private String desCiuNac;

	private Long ciuExp;

	private String desCiuExp;

	private Long estAso;

	private String desEstado;

	private Long claVin;

	private String tipoVin;

	private Long indInd;

	private Long estCiv;

	private String estCivil;

	private String profesion;

	private Long asoCor;

	private String desCorte;

	private String dirCor;

	private String dirRes;

	private String dirCom;

	private String dirFam;
	
	private String dirNe;

	private String telRes;

	private String telCom;

	private String telFam;

	private String cel;

	

	private String mail;

	private String ciuRes;

	private String ciuCom;
	
	private String ciuFam;
	
	private String ciuNe;

	private String barRes;

	private String barCom;

	private String barFam;
	
	private String barNe;
	
	private String proMaximaVida;

	private String proMaximaPerseverancia;
	
	private String proMaximaRenta;
	
	private String proMaxTotal;

	private String proAcumulada;
	
	private String proAcumuladaTotal;
	
	private String proPerseveranciaAcumulada;
	
	private String proRentaAcumulada;
	
	private String proAltoCostoAcumulado;
	
	private String vinSolvenciasAcumulado;

	private Long nivelRiesgo;

	private String nombre1;

	private String nombre2;

	private String apellido1;

	private String apellido2;

	private Long repLeg;

	private String nomRep;

	private String nomConyugue;

	private Long codCiuRe;

	private Long codCiuCo;

	private Long codCiuFa;
	
	private Long codCiuNe;

	private Long fecEst;

	private String fecEstado;

	private String tipUbiDirCor;

	private String codNomOfiVin;

	private String smmlv;

	private Long indCvi;

	private String descIndCvi;

	private String nombreCompleto;
	
	private String regionalAso;
	
	private String zonaAso;
	
	private String extTelCom;
	
	private String apartadoAereo;
	
	private String ciudadAA;
	
	private Long codCiudadAA;
	
	private String casilleroAA;
	
	private Long vinIndFechaNacimiento;
	
	private String vinIndFechaNacimientoDesc;
	
	private String observacion;
	
	private String proteccionTotalPrimaNivelada;
	
	public String getProteccionTotalPrimaNivelada() {
		return proteccionTotalPrimaNivelada;
	}

	public void setProteccionTotalPrimaNivelada(String proteccionTotalPrimaNivelada) {
		this.proteccionTotalPrimaNivelada = proteccionTotalPrimaNivelada;
	}

	public Long getCodCiudadAA() {
		return codCiudadAA;
	}

	public void setCodCiudadAA(Long codCiudadAA) {
		this.codCiudadAA = codCiudadAA;
	}

	public String getCasilleroAA() {
		return casilleroAA;
	}

	public void setCasilleroAA(String casilleroAA) {
		this.casilleroAA = casilleroAA;
	}

	public String getCiudadAA() {
		return ciudadAA;
	}

	public void setCiudadAA(String ciudadAA) {
		this.ciudadAA = ciudadAA;
	}

	public String getExtTelCom() {
		return extTelCom;
	}

	public void setExtTelCom(String extTelCom) {
		this.extTelCom = extTelCom;
	}

	public String getApartadoAereo() {
		return apartadoAereo;
	}

	public void setApartadoAereo(String apartadoAereo) {
		this.apartadoAereo = apartadoAereo;
	}

	public String getRegionalAso() {
		return regionalAso;
	}

	public void setRegionalAso(String regionalAso) {
		this.regionalAso = regionalAso;
	}

	public String getZonaAso() {
		return zonaAso;
	}

	public void setZonaAso(String zonaAso) {
		this.zonaAso = zonaAso;
	}

	public String getDescIndCvi() {
		return descIndCvi;
	}

	public void setDescIndCvi(String descIndCvi) {
		this.descIndCvi = descIndCvi;
	}

	public Long getIndCvi() {
		return indCvi;
	}

	public void setIndCvi(Long indCvi) {
		this.indCvi = indCvi;
	}

	public String getCodNomOfiVin() {
		return codNomOfiVin;
	}

	public void setCodNomOfiVin(String codNomOfiVin) {
		this.codNomOfiVin = codNomOfiVin;
	}

	public String getSmmlv() {
		return smmlv;
	}

	public void setSmmlv(String smmlv) {
		this.smmlv = smmlv;
	}

	public String getTipUbiDirCor() {
		return tipUbiDirCor;
	}

	public void setTipUbiDirCor(String tipUbiDirCor) {
		this.tipUbiDirCor = tipUbiDirCor;
	}

	public String getNomConyugue() {
		return nomConyugue;
	}

	public void setNomConyugue(String nomConyugue) {
		this.nomConyugue = nomConyugue;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getNomRep() {
		return nomRep;
	}

	public void setNomRep(String nomRep) {
		this.nomRep = nomRep;
	}

	public Long getRepLeg() {
		return repLeg;
	}

	public void setRepLeg(Long repLeg) {
		this.repLeg = repLeg;
	}

	public Long getNivelRiesgo() {
		return nivelRiesgo;
	}

	public void setNivelRiesgo(Long nivelRiesgo) {
		this.nivelRiesgo = nivelRiesgo;
	}

	public String getAsoCod() {
		return asoCod;
	}

	public void setAsoCod(String asoCod) {
		this.asoCod = asoCod;
	}

	public Long getAsoCor() {
		return asoCor;
	}

	public void setAsoCor(Long asoCor) {
		this.asoCor = asoCor;
	}

	public String getBarCom() {
		return barCom;
	}

	public void setBarCom(String barCom) {
		this.barCom = barCom;
	}

	public String getBarFam() {
		return barFam;
	}

	public void setBarFam(String barFam) {
		this.barFam = barFam;
	}

	public String getBarRes() {
		return barRes;
	}

	public void setBarRes(String barRes) {
		this.barRes = barRes;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getCiuCom() {
		return ciuCom;
	}

	public void setCiuCom(String ciuCom) {
		this.ciuCom = ciuCom;
	}

	public Long getCiuExp() {
		return ciuExp;
	}

	public void setCiuExp(Long ciuExp) {
		this.ciuExp = ciuExp;
	}

	public String getCiuFam() {
		return ciuFam;
	}

	public void setCiuFam(String ciuFam) {
		this.ciuFam = ciuFam;
	}

	public Long getCiuNac() {
		return ciuNac;
	}

	public void setCiuNac(Long ciuNac) {
		this.ciuNac = ciuNac;
	}

	public String getCiuRes() {
		return ciuRes;
	}

	public void setCiuRes(String ciuRes) {
		this.ciuRes = ciuRes;
	}

	public Long getClaVin() {
		return claVin;
	}

	public void setClaVin(Long claVin) {
		this.claVin = claVin;
	}

	public Long getCodSex() {
		return codSex;
	}

	public void setCodSex(Long codSex) {
		this.codSex = codSex;
	}

	public String getDesCiuExp() {
		return desCiuExp;
	}

	public void setDesCiuExp(String desCiuExp) {
		this.desCiuExp = desCiuExp;
	}

	public String getDesCiuNac() {
		return desCiuNac;
	}

	public void setDesCiuNac(String desCiuNac) {
		this.desCiuNac = desCiuNac;
	}

	public String getDesCorte() {
		return desCorte;
	}

	public void setDesCorte(String desCorte) {
		this.desCorte = desCorte;
	}

	public String getDesEstado() {
		return desEstado;
	}

	public void setDesEstado(String desEstado) {
		this.desEstado = desEstado;
	}

	public String getDesOfiVin() {
		return desOfiVin;
	}

	public void setDesOfiVin(String desOfiVin) {
		this.desOfiVin = desOfiVin;
	}

	public String getDesTipDoc() {
		return desTipDoc;
	}

	public void setDesTipDoc(String desTipDoc) {
		this.desTipDoc = desTipDoc;
	}

	public String getDirCom() {
		return dirCom;
	}

	public void setDirCom(String dirCom) {
		this.dirCom = dirCom;
	}

	public String getDirCor() {
		return dirCor;
	}

	public void setDirCor(String dirCor) {
		this.dirCor = dirCor;
	}

	public String getDirFam() {
		return dirFam;
	}

	public void setDirFam(String dirFam) {
		this.dirFam = dirFam;
	}

	public String getDirRes() {
		return dirRes;
	}

	public void setDirRes(String dirRes) {
		this.dirRes = dirRes;
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

	public Long getEstCiv() {
		return estCiv;
	}

	public void setEstCiv(Long estCiv) {
		this.estCiv = estCiv;
	}

	public String getEstCivil() {
		return estCivil;
	}

	public void setEstCivil(String estCivil) {
		this.estCivil = estCivil;
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

	public Long getIdOficina() {
		return idOficina;
	}

	public void setIdOficina(Long idOficina) {
		this.idOficina = idOficina;
	}

	public Long getIndInd() {
		return indInd;
	}

	public void setIndInd(Long indInd) {
		this.indInd = indInd;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
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

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelCom() {
		return telCom;
	}

	public void setTelCom(String telCom) {
		this.telCom = telCom;
	}

	public String getTelFam() {
		return telFam;
	}

	public void setTelFam(String telFam) {
		this.telFam = telFam;
	}

	public String getTelRes() {
		return telRes;
	}

	public void setTelRes(String telRes) {
		this.telRes = telRes;
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

	public String getProAcumulada() {
		return proAcumulada;
	}

	public void setProAcumulada(String proAcumulada) {
		this.proAcumulada = proAcumulada;
	}

	public String getProMaximaVida() {
		return proMaximaVida;
	}

	public void setProMaximaVida(String proMaximaVida) {
		this.proMaximaVida = proMaximaVida;
	}

	public String getProMaximaPerseverancia() {
		return proMaximaPerseverancia;
	}

	public void setProMaximaPerseverancia(String proMaximaPerseverancia) {
		this.proMaximaPerseverancia = proMaximaPerseverancia;
	}

	public String getProMaximaRenta() {
		return proMaximaRenta;
	}

	public void setProMaximaRenta(String proMaximaRenta) {
		this.proMaximaRenta = proMaximaRenta;
	}

	public String getProMaxTotal() {
		return proMaxTotal;
	}

	public void setProMaxTotal(String proMaxTotal) {
		this.proMaxTotal = proMaxTotal;
	}

	public Long getCodCiuCo() {
		return codCiuCo;
	}

	public void setCodCiuCo(Long codCiuCo) {
		this.codCiuCo = codCiuCo;
	}

	public Long getCodCiuFa() {
		return codCiuFa;
	}

	public void setCodCiuFa(Long codCiuFa) {
		this.codCiuFa = codCiuFa;
	}

	public Long getCodCiuRe() {
		return codCiuRe;
	}

	public void setCodCiuRe(Long codCiuRe) {
		this.codCiuRe = codCiuRe;
	}

	public Long getFecEst() {
		return fecEst;
	}

	public void setFecEst(Long fecEst) {
		this.fecEst = fecEst;
	}

	public String getFecEstado() {
		return fecEstado;
	}

	public void setFecEstado(String fecEstado) {
		this.fecEstado = fecEstado;
	}

	public String getNombreCompleto() {
		this.nombreCompleto = new String();
		if (this.getNombre1() != null)
			nombreCompleto += this.getNombre1();
		if (this.getNombre2() != null)
			nombreCompleto += " " + this.getNombre2();
		if (this.getApellido1() != null)
			nombreCompleto += " " + this.getApellido1();
		if (this.getApellido2() != null)
			nombreCompleto += " " + this.getApellido2();

		return nombreCompleto;
	}	

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getProAcumuladaTotal() {
		return proAcumuladaTotal;
	}

	public void setProAcumuladaTotal(String proAcumuladaTotal) {
		this.proAcumuladaTotal = proAcumuladaTotal;
	}

	public String getProPerseveranciaAcumulada() {
		return proPerseveranciaAcumulada;
	}

	public void setProPerseveranciaAcumulada(String proPerseveranciaAcumulada) {
		this.proPerseveranciaAcumulada = proPerseveranciaAcumulada;
	}

	public String getProRentaAcumulada() {
		return proRentaAcumulada;
	}

	public void setProRentaAcumulada(String proRentaAcumulada) {
		this.proRentaAcumulada = proRentaAcumulada;
	}

	public String getProAltoCostoAcumulado() {
		return proAltoCostoAcumulado;
	}

	public void setProAltoCostoAcumulado(String proAltoCostoAcumulado) {
		this.proAltoCostoAcumulado = proAltoCostoAcumulado;
	}

	public String getVinSolvenciasAcumulado() {
		return vinSolvenciasAcumulado;
	}

	public void setVinSolvenciasAcumulado(String vinSolvenciasAcumulado) {
		this.vinSolvenciasAcumulado = vinSolvenciasAcumulado;
	}

	public void setVinIndFechaNacimiento(Long vinIndFechaNacimiento) {
		this.vinIndFechaNacimiento = vinIndFechaNacimiento;
	}

	public Long getVinIndFechaNacimiento() {
		return vinIndFechaNacimiento;
	}

	public void setVinIndFechaNacimientoDesc(String vinIndFechaNacimientoDesc) {
		this.vinIndFechaNacimientoDesc = vinIndFechaNacimientoDesc;
	}

	public String getVinIndFechaNacimientoDesc() {
		return vinIndFechaNacimientoDesc;
	}
	
	public String getObservacion() {
		return observacion;
	}
	
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getDirNe() {
		return dirNe;
	}

	public void setDirNe(String dirNe) {
		this.dirNe = dirNe;
	}

	public String getCiuNe() {
		return ciuNe;
	}

	public void setCiuNe(String ciuNe) {
		this.ciuNe = ciuNe;
	}

	public String getBarNe() {
		return barNe;
	}

	public void setBarNe(String barNe) {
		this.barNe = barNe;
	}

	public Long getCodCiuNe() {
		return codCiuNe;
	}

	public void setCodCiuNe(Long codCiuNe) {
		this.codCiuNe = codCiuNe;
	}	
}
