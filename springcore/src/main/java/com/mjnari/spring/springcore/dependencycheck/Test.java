package com.mjnari.spring.springcore.dependencycheck;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mjnari/spring/springcore/dependencycheck/config.xml");
		Prescription prescription = (Prescription) context.getBean("patient");
		System.out.println(prescription);
	}
}
