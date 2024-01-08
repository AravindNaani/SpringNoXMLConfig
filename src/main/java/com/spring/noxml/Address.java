package com.spring.noxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Value("${Address.city}")
	private String city;
	
	@Value("${Address.pincode}")
	private int pincode;

	public Address(String city, int pincode) {
		this.city = city;
		this.pincode = pincode;
	}
	
	public Address() {
		
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
	
}
