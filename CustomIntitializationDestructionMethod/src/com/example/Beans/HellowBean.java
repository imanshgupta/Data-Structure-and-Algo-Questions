package com.example.Beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HellowBean implements InitializingBean, DisposableBean {

	private String nameString;
	private String ageString;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		System.out.println("Intializing via Cunstructor name" +nameString);
		this.nameString = nameString;
	}
	public String getAgeString() {
		return ageString;
	}
	public void setAgeString(String ageString) {
		System.out.println("Intializing via Cunstructor age" + ageString);
		this.ageString = ageString;
	}
	
	public void initializationCustom() {
		System.out.println("Intializing via init-method");
		nameString="Ansh";
		ageString="29";
	}
	
	public void destroyCustom() {
		System.out.println("Destruction via destructon-menthod");
		nameString="";
		ageString="";
	}
	
	public void sayHellow() {
		System.out.println("Hellow" +nameString+"--------------"+ageString);
		
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
