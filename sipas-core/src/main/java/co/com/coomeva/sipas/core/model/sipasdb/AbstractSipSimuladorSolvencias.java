package co.com.coomeva.sipas.core.model.sipasdb;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractSipSimuladorSolvencias entity provides the base persistence
 * definition of the SipSimuladorSolvencias entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractSipSimuladorSolvencias implements
		java.io.Serializable {

	// Fields

	private Long simConsec;
	private Long simRecCodigo;
	private Long simAsoNumint;
	private Long simValProActual;
	private Long simValCuoTotal;
	private Long simValCuoSolve;
	private Long simNumCuoPag;
	private String simPriPerPag;
	private Date simFecNacAso;
	private Byte simEdadSoliSolve;
	private Byte simAnoPlanSolve;
	private String simSexAso;
	private Long simCapAporta;
	private Long simValDevSolve;
	private Boolean simEstado;
	private Timestamp simFecReg;

	// Constructors

	/** default constructor */
	public AbstractSipSimuladorSolvencias() {
	}

	/** minimal constructor */
	public AbstractSipSimuladorSolvencias(Long simConsec) {
		this.simConsec = simConsec;
	}

	/** full constructor */
	public AbstractSipSimuladorSolvencias(Long simConsec,
			Long simRecCodigo, Long simAsoNumint, Long simValProActual,
			Long simValCuoTotal, Long simValCuoSolve, Long simNumCuoPag,
			String simPriPerPag, Date simFecNacAso, Byte simEdadSoliSolve,
			Byte simAnoPlanSolve, String simSexAso, Long simCapAporta,
			Long simValDevSolve, Boolean simEstado, Timestamp simFecReg) {
		this.simConsec = simConsec;
		this.simRecCodigo = simRecCodigo;
		this.simAsoNumint = simAsoNumint;
		this.simValProActual = simValProActual;
		this.simValCuoTotal = simValCuoTotal;
		this.simValCuoSolve = simValCuoSolve;
		this.simNumCuoPag = simNumCuoPag;
		this.simPriPerPag = simPriPerPag;
		this.simFecNacAso = simFecNacAso;
		this.simEdadSoliSolve = simEdadSoliSolve;
		this.simAnoPlanSolve = simAnoPlanSolve;
		this.simSexAso = simSexAso;
		this.simCapAporta = simCapAporta;
		this.simValDevSolve = simValDevSolve;
		this.simEstado = simEstado;
		this.simFecReg = simFecReg;
	}

	// Property accessors

	public Long getSimConsec() {
		return this.simConsec;
	}

	public void setSimConsec(Long simConsec) {
		this.simConsec = simConsec;
	}

	public Long getSimRecCodigo() {
		return this.simRecCodigo;
	}

	public void setSimRecCodigo(Long simRecCodigo) {
		this.simRecCodigo = simRecCodigo;
	}

	public Long getSimAsoNumint() {
		return this.simAsoNumint;
	}

	public void setSimAsoNumint(Long simAsoNumint) {
		this.simAsoNumint = simAsoNumint;
	}

	public Long getSimValProActual() {
		return this.simValProActual;
	}

	public void setSimValProActual(Long simValProActual) {
		this.simValProActual = simValProActual;
	}

	public Long getSimValCuoTotal() {
		return this.simValCuoTotal;
	}

	public void setSimValCuoTotal(Long simValCuoTotal) {
		this.simValCuoTotal = simValCuoTotal;
	}

	public Long getSimValCuoSolve() {
		return this.simValCuoSolve;
	}

	public void setSimValCuoSolve(Long simValCuoSolve) {
		this.simValCuoSolve = simValCuoSolve;
	}

	public Long getSimNumCuoPag() {
		return this.simNumCuoPag;
	}

	public void setSimNumCuoPag(Long simNumCuoPag) {
		this.simNumCuoPag = simNumCuoPag;
	}

	public String getSimPriPerPag() {
		return this.simPriPerPag;
	}

	public void setSimPriPerPag(String simPriPerPag) {
		this.simPriPerPag = simPriPerPag;
	}

	public Date getSimFecNacAso() {
		return this.simFecNacAso;
	}

	public void setSimFecNacAso(Date simFecNacAso) {
		this.simFecNacAso = simFecNacAso;
	}

	public Byte getSimEdadSoliSolve() {
		return this.simEdadSoliSolve;
	}

	public void setSimEdadSoliSolve(Byte simEdadSoliSolve) {
		this.simEdadSoliSolve = simEdadSoliSolve;
	}

	public Byte getSimAnoPlanSolve() {
		return this.simAnoPlanSolve;
	}

	public void setSimAnoPlanSolve(Byte simAnoPlanSolve) {
		this.simAnoPlanSolve = simAnoPlanSolve;
	}

	public String getSimSexAso() {
		return this.simSexAso;
	}

	public void setSimSexAso(String simSexAso) {
		this.simSexAso = simSexAso;
	}

	public Long getSimCapAporta() {
		return this.simCapAporta;
	}

	public void setSimCapAporta(Long simCapAporta) {
		this.simCapAporta = simCapAporta;
	}

	public Long getSimValDevSolve() {
		return this.simValDevSolve;
	}

	public void setSimValDevSolve(Long simValDevSolve) {
		this.simValDevSolve = simValDevSolve;
	}

	public Boolean getSimEstado() {
		return this.simEstado;
	}

	public void setSimEstado(Boolean simEstado) {
		this.simEstado = simEstado;
	}

	public Timestamp getSimFecReg() {
		return this.simFecReg;
	}

	public void setSimFecReg(Timestamp simFecReg) {
		this.simFecReg = simFecReg;
	}

}