package com.example.demo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SampleRequest {

	private Integer phone;
	private String name;
	private Address address;
	
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
