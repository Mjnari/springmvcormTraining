package com.mjnari.spring.springjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Dao dao = context.getBean(Dao.class);
		dao.create();
		((AbstractApplicationContext) context).close();
	}

}
