package com.java.Beans;

public class Student {

	private String nameString;
	private Address address;
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
	@Override
	public String toString() {
		return "Student [nameString=" + nameString + ", address=" + address + "]";
	}
	
}
