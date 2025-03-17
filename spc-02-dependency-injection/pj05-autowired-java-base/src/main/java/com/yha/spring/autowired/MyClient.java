package com.yha.spring.autowired;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


public class MyClient {
	
	@Autowired
	private Optional<MyService> myService;
	
//	@Autowired
//	public MyClient( MyService myService ) {
//		
//		this.myService = myService;
//		
//	}
	
	public void showMessage() {
		
		System.out.println( myService.map( a -> a.message()).orElse("Default Message"));
		
	}

}
