package com.java.test;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import com.java.beans.User;
import com.java.beans.UserValidator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context= new ClassPathXmlApplicationContext("/com/java/resources/applicationContext.xml");
		
		 User user=(User) context.getBean("User");
		 UserValidator userValidatior=(UserValidator) context.getBean("UserValidatior");
		 
		 if(userValidatior.supports(user.getClass())) {
			 System.out.println("Uservalidator Supports User Validation");
			 
		 }
		 
		 Map<String, String> map=new HashMap<String, String>();
		 MapBindingResult mapBindingResult=new MapBindingResult(map,"com.java.beans.User");
		 userValidatior.validate(user,mapBindingResult);
		 
		 java.util.List<ObjectError> list= mapBindingResult.getAllErrors();
		 
		 for(ObjectError err:list) {
			 System.out.println(err.getDefaultMessage());
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
