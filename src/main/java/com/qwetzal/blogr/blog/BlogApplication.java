package com.qwetzal.blogr.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BlogApplication {
	public static void main(String[] args) {
//		ConfigurableApplicationContext ctx = SpringApplication.run(BlogApplication.class, args);
//
//		System.out.println("Number of beans --> " + ctx.getBeanDefinitionCount());
//		String[] beanNames = ctx.getBeanDefinitionNames(); // get beans
//		for (String beanName : beanNames) {
//			System.out.println("Bean --> "+ beanName); // print bean
//		}
		SpringApplication.run(BlogApplication.class, args);
	}

}
