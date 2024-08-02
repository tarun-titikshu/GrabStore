package com.grab.store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer addressId;
	private String cityName;
	private String landMark; 
	private String pincodeNo;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(Integer addressId, String cityName, String landMark, String pincodeNo) {
		super();
		this.addressId = addressId;
		this.cityName = cityName;
		this.landMark = landMark;
		this.pincodeNo = pincodeNo;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getPincodeNo() {
		return pincodeNo;
	}
	public void setPincodeNo(String pincodeNo) {
		this.pincodeNo = pincodeNo;
	}


}
