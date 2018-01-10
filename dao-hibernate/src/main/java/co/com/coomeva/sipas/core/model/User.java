package co.com.coomeva.sipas.core.model;

import java.io.Serializable;

public class User implements Serializable{//extends ParentEntity{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;

	private String firstName;
	
	private String lastName;
	
	private String phone;
	
	private String address;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}	
}
