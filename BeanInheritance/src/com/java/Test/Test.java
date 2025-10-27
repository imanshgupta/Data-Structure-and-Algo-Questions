package com.java.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.Beans.WishBean;
import com.java.Beans.WishEvening;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/java/resources/applicationContext.xml");
		WishEvening wBean=(WishEvening) context.getBean("WishEvening");
		wBean.sayHellow();
	}

}
