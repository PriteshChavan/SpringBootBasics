package com.java.spring.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App002HelloWorldSpring {
		public static void main(String[] args) {
			
			//1. Launch a Spring Context
			
			try(
					var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
					
					
					
					
					//2. Config the thing using @Configuration
					//HelloWorldConfig @Configuration
					//name -@Bean
					//3. Retrieving Beans managed by Spring
					System.out.println(context.getBean("name"));
					System.out.println(context.getBean("person"));
					//System.out.println(context.getBean("address2"));
					System.out.println(context.getBean(Address.class));
					System.out.println(context.getBean(Person.class));			
					//System.out.println(context.getBean("person2MethodCall"));
					//System.out.println(context.getBean("person3ArgumentCall"));
					
					//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
					
			
			}

		}
}
