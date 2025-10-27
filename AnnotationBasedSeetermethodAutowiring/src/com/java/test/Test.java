package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.Beans.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("/com/java/resources/applicationContext.xml");
		
		Student student=(Student) context.getBean("student");
		System.out.println(student.toString());
	}

}
