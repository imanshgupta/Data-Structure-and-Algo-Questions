package com.java.beans;

public class Address {

	private String addressString;

	public Address(String add) {
		this.addressString=add;
		
	}
	public String getAddressString() {
		return addressString;
	}

	@Override
	public String toString() {
		return "Address [addressString=" + addressString + "]";
	}
	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}
	
}
