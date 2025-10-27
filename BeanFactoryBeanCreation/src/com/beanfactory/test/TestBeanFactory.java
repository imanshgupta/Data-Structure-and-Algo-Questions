package com.beanfactory.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.beanfactory.bean.HellowBean;

public class TestBeanFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource resourceObjectResource= new ClassPathResource("/com/beanfactory/resources/applicationContext.xml");
		BeanFactory beanFactoryObjectBeanFactory= new XmlBeanFactory(resourceObjectResource);
		HellowBean hellowBean = (HellowBean) beanFactoryObjectBeanFactory.getBean("hellowBean");
		System.out.println(hellowBean.sayHellow());
		
	}

}
