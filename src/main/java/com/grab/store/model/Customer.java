package com.grab.store.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer cutomerId;
	private String customerName;
	private String mobileNumber;
	private String email;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer cutomerId, String customerName, String mobileNumber, String email) {
		super();
		this.cutomerId = cutomerId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	public Integer getCutomerId() {
		return cutomerId;
	}
	public void setCutomerId(Integer cutomerId) {
		this.cutomerId = cutomerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}