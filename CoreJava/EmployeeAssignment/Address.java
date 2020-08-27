package com.pojo;

import java.io.Serializable;

public class Address implements Serializable{
	
	private String city_name,pincode,state;

	public Address(String city_name, String pincode, String state) {
		super();
		this.city_name = city_name;
		this.pincode = pincode;
		this.state = state;
	}

	public Address() {
		super();
		city_name="hyd";
		pincode="1234";
		state="telangana";
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city_name=" + city_name + ", pincode=" + pincode + ", state=" + state + "]";
	}
	

	
	
	

}
