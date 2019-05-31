package com.mjnari.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static <CountriesAndLanguages> void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mjnari/spring/springcore/properties/propertyconfig.xml");
		CountriesAndLanguages countriesAndLangs = (CountriesAndLanguages) context.getBean("countriesAndLangs");
		System.out.println(countriesAndLangs);
	}
}
