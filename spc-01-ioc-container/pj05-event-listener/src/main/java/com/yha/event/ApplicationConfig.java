package com.yha.event;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan( basePackages = { 
		"com.yha.event.listener"
		,"com.yha.event.publish"
		})
public class ApplicationConfig {
	
	

}
