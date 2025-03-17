package com.yha.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yha.spring.autowired.MyClient;
import com.yha.spring.autowired.MyService;

@Configuration
public class AppConfig {
	
	@Bean
	public MyService myService() {
		
		return new MyService();
		
	}

	@Bean
	public MyClient myClient() {
		
		return new MyClient();
		
	}
	
//	@Bean
//	public MyClient myClient() {
//		
//		return new MyClient( myService() );
//		
//	}
	
//	@Bean
//	public MyClient myClient( MyService myService) {
//		
//		return new MyClient( myService );
//		
//	}

}
