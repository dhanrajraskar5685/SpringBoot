package com.example.demo.configurtion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Configuration1 {

	
	@Value("${output.message}")
	private String msg;
	
@Profile(value="uatt")	
@Bean
public String getDatSource() {
	return msg+"uatt check";
	
	
	
}

@Profile(value="test")	
@Bean
public String getDatSource1() {
return msg+"test check";



}
	
}
