package com.yha.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.yha.spring.di.MyClient;
import com.yha.spring.di.MyService;

@Configuration
@ComponentScan
public class AppConfig {
	
	@Bean( name="service")
	public MyService service() {
		
		return new MyService();
		
	}
	
	@Bean( name = "client1")
	public MyClient client1() {
		
		var bean = new MyClient( service() );
		bean.setName("Client1");
		
		return bean;
		
	}
	
	@Bean( name = "client2" )
	public MyClient client2() {
		
		var bean = new MyClient();
		
		bean.setMyService( service() );
		
		bean.setName( "Client2");
		
		return bean;
		
	}
	

}
