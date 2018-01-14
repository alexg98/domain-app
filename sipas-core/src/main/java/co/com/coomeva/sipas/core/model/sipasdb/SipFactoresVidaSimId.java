package co.com.coomeva.sipas.core.model.sipasdb;

// default package
// Generated 15/01/2015 04:22:41 PM by Hibernate Tools 3.4.0.CR1

/**
 * SipFactoresVidaSimId generated by hbm2java
 */
public class SipFactoresVidaSimId implements java.io.Serializable {

	private short edad;
	private short plan;
	private short sexo;

	public SipFactoresVidaSimId() {
	}

	public SipFactoresVidaSimId(short edad, short plan, short sexo) {
		this.edad = edad;
		this.plan = plan;
		this.sexo = sexo;
	}

	public short getEdad() {
		return this.edad;
	}

	public void setEdad(short edad) {
		this.edad = edad;
	}

	public short getPlan() {
		return this.plan;
	}

	public void setPlan(short plan) {
		this.plan = plan;
	}

	public short getSexo() {
		return this.sexo;
	}

	public void setSexo(short sexo) {
		this.sexo = sexo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SipFactoresVidaSimId))
			return false;
		SipFactoresVidaSimId castOther = (SipFactoresVidaSimId) other;

		return (this.getEdad() == castOther.getEdad())
				&& (this.getPlan() == castOther.getPlan())
				&& (this.getSexo() == castOther.getSexo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEdad();
		result = 37 * result + this.getPlan();
		result = 37 * result + this.getSexo();
		return result;
	}

}
