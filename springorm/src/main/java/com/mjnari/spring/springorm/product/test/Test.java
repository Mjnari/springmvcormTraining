package com.mjnari.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mjnari.spring.springorm.product.dao.ProductDao;
import com.mjnari.spring.springorm.product.entity.Product;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mjnari/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		/*Product product = new Product();
		product.setId(2);
		product.setName("Iphone");
		product.setDesc("It's awesome!");
		product.setPrice(800);
//		productDao.create(product);
//		productDao.update(product);
		productDao.delete(product);*/
//		Product product = productDao.find(3);
		List<Product> products = productDao.findAll();
		System.out.println(products);
	} 
}
