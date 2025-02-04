package com.eruk.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private int cid;
	private String password;
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private String email;
	private long phone;
	
	public Customer(int cid, String password, String firstname, String lastname, String address, String city,
			String state, String email, long phone) {
		super();
		this.cid = cid;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.phone = phone;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", password=" + password + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", email=" + email + ", phone="
				+ phone + "]";
	}
	

}
