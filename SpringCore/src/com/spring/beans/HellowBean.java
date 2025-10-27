package com.spring.beans;

import javax.management.monitor.MonitorSettingException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HellowBean implements InitializingBean, DisposableBean {
	
	private String nameString;
	public String hellow() {
		return "Hi I am a Bean"+nameString;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		nameString="Ansh";
		
	}

	
}
