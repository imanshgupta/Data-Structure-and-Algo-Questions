package com.java.beans;

public class Course {

	private String nameString;
	private int age;
	private int classs;
	

	public Course(String name,int age) {
		this.nameString=name;
		this.age=age;
	}
	
	public Course(String name,int age,int classs) {
		this.nameString=name;
		this.age=age;
		this.classs=classs;
		
	}
	
	
	public void sayHellow() {
		System.out.println("HIII "+nameString+age+classs);
	}
}
