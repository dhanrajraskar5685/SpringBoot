package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.configurtion.Configuration1;

@SpringBootApplication
public class SpringDemoProfilingExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoProfilingExampleApplication.class, args);
	ApplicationContext apc= new AnnotationConfigApplicationContext(Configuration1.class);

	
	}

}
