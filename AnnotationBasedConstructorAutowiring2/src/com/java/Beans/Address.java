package com.java.Beans;

public class Address {

	private String addString;

	@Override
	public String toString() {
		return "Address [addString=" + addString + "]";
	}

	public String getAddString() {
		return addString;
	}

	public void setAddString(String addString) {
		this.addString = addString;
	}
}
