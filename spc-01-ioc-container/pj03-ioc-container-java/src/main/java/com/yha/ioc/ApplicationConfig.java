package com.yha.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.yha.ioc.bean.HelloBean;

@Configuration
@ComponentScan("com.yha.ioc.bean")
public class ApplicationConfig {
	
	@Bean
	public HelloBean helloBean() {
		
		return new HelloBean() ;
		
	}

}
