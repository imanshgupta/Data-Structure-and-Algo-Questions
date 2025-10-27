package com.java.beans;

public class Address {
 private String addressString;

 public String getAddressString() {
	return addressString;
 }

 public void setAddressString(String addressString) {
	this.addressString = addressString;
 }

 @Override
 public String toString() {
	return "Address [addressString=" + addressString + "]";
 }
 
}
