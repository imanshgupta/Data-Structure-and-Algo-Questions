package com.beanfactory.bean;

public class HellowBean {
	private String nameString;
	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getAgeString() {
		return ageString;
	}

	public void setAgeString(String ageString) {
		this.ageString = ageString;
	}

	private String ageString;

	public String sayHellow() {
		return "my name and age is "+nameString+ageString;
	}
}
