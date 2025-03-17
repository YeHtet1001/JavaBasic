package com.yha.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.yha.spring.autowired.MyClient;
import com.yha.spring.autowired.MyService;

@Configuration
public class AppConfig {
	
	@Bean
	//@Primary
	public MyService myService1() {
		
		return new MyService("service 1");
		
	}
	
	@Bean
	@Qualifier("s2")
	public MyService myService2() {
		
		return new MyService("service 2");
		
	}
	
	@Bean(name= {
			"myService3"
	})
	public MyService myService3() {
		
		return new MyService("service3");
		
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
