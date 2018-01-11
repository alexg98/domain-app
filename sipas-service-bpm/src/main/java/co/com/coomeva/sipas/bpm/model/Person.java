package co.com.coomeva.sipas.bpm.model;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String name;
	
	private Date birthDate;

	public Person() {		
	}
	
	public Person(String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}	
	
	
}
