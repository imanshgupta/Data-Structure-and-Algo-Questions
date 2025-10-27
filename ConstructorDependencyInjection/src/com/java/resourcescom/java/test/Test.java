package com.java.resourcescom.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Course;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/java/resources/applicationContext.xml");
		Course c1=(Course)context.getBean("bean1");
		c1.sayHellow();
		
		Course c2=(Course)context.getBean("bean2");
		c2.sayHellow();
		
		Course c3=(Course)context.getBean("bean3");
		c3.sayHellow();
	}

}
