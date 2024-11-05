package com.practisespringboot.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloworldBean {
	
	record Person (String name,String age) {};
	@Bean
	public String name() {
		return "nikhil";
	}

	@Bean(name="Person2")
	public Person person() {
		return new Person("nikhil","20");
	}
}
