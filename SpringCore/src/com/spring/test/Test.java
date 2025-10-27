package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.HellowBean;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resouces/applicationContext.xml");
		HellowBean hBean= (HellowBean) context.getBean("hellowBean");
		System.out.println(hBean.hellow());
				
	}

}
