package com.java.Beans;

public class WishEvening {

	public String nameString;
	public String messageString;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getMessageString() {
		return messageString;
	}
	public void setMessageString(String messageString) {
		this.messageString = messageString;
	}
	
	public void sayHellow() {
		System.out.println("Hellow"+nameString+messageString);
	}
}
