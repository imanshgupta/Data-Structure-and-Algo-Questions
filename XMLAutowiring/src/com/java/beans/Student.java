package com.java.beans;

public class Student {

	private String nameString;
	private Address addressOfStudent;
	private Subjects subjectsOfStudentSubjects;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public Address getAddressOfStudent() {
		return addressOfStudent;
	}
	public void setAddressOfStudent(Address addressOfStudent) {
		this.addressOfStudent = addressOfStudent;
	}
	public Subjects getSubjectsOfStudentSubjects() {
		return subjectsOfStudentSubjects;
	}
	public void setSubjectsOfStudentSubjects(Subjects subjectsOfStudentSubjects) {
		this.subjectsOfStudentSubjects = subjectsOfStudentSubjects;
	}
	@Override
	public String toString() {
		return "Student [nameString=" + nameString + ", addressOfStudent=" + addressOfStudent
				+ ", subjectsOfStudentSubjects=" + subjectsOfStudentSubjects + "]";
	}
	
	
}
