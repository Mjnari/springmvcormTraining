package com.mjnari.spring.springcore.shoppingcartexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mjnari/spring/springcore/shoppingcartexam/config.xml");
		ShoppingCart shoppingCart = (ShoppingCart) context.getBean("shoppingCart");
		System.out.println(shoppingCart);
	}
}
