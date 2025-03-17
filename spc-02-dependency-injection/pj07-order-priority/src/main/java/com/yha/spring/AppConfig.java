package com.yha.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.yha.spring.autowired.MyClient;
import com.yha.spring.autowired.MyService;
import com.yha.spring.autowired.MyService1;
import com.yha.spring.autowired.MyService2;
import com.yha.spring.autowired.MyService3;


@Configuration
@ComponentScan( basePackages = "com.yha.spring.autowired")
public class AppConfig {
	
//	@Bean
//	public MyService mySevice1() {
//		
//		return new MyService1();
//		
//	}
//	
//	@Bean
//	public MyService mySevice2() {
//		
//		return new MyService2();
//		
//	}
	
//	@Bean
//	public MyClient myClient() {
//		
//		return new MyClient();
//		
//	}
	
//	@Bean
//	public MyService mySevice3() {
//		
//		return new MyService3();
//		
//	}
	


}
