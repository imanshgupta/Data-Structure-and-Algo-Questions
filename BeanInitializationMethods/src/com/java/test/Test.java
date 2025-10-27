package com.java.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.Beans.HellowBean;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/com/java/resources/applicationContext.xml");
		
		HellowBean hBean= (HellowBean) context.getBean("HellowBean");
		
		hBean.sayHellow();
		
		
		
		
	}

}
