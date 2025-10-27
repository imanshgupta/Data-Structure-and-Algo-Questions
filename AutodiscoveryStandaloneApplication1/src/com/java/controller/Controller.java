package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.service.ServiceImpl;

@org.springframework.stereotype.Controller
public class Controller {

	
	@Autowired
	private ServiceImpl impl;
	
	
	public String getAnswer() {
		return impl.getStudent();
	}
	
	
}
