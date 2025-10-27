package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Beans.HellowBean;

public class Test {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/example/resources/applicationContext.xml");
		
		HellowBean bean=(HellowBean) context.getBean("HellowBean");
		bean.sayHellow();
		
		//to destroy bean we have to use abstract application context object 
		context.registerShutdownHook();
	}

}
