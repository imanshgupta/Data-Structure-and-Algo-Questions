package com.java.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {


	@Autowired(required=true)
	@Qualifier("address") // to resolve byType problems 
	private Address address;
	
	
	@Override
	public String toString() {
		return "Student [address=" + address + ", nameString=" + nameString + "]";
	}
	private String nameString;
	
	
	
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	
}
