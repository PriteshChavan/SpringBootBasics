package com.java.spring.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


//RECODS FEATURE OF JAVA 16

//Eliminate verbosity in creating Java Beans
//equals, hashcode and toString are automatically created.
//Public accessor methods, constructor
record Person(String name, int age, Address address) {
	
};
record Address(String address, String city) {
	
};
@Configuration
//Define spring beans below
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 15;
		
	}
	@Bean
	public Person person() {
		return new Person("ranga", 20,new  Address("Roman League","Roman") );
		
	}
	
	@Bean
	
	public Person person2MethodCall() {
		return new Person(name(),age(),address()); //name, age
		
	}
	
	
	
	@Bean
	public Person person3ArgumentCall(String name, int age, Address address1) {
		return new Person(name,age,address1); //name, age
		
	}	
	
	@Bean
	@Primary
	public Person person4ArgumentCall(String name, int age,@Qualifier("address3qualifier") Address address1) {
		return new Person(name,age,address1); //name, age
		
	}	
	
	@Bean(name="address")
	@Primary
	public Address address() {
		return new Address("Baker Street ", "Italy");
		
	}
	
	@Bean(name="address1")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Baker Street 2", "Italy");
		
	}
}
