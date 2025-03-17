package com.yha.spring.autowired;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyClient {
	
	@Autowired
	private List<MyService> myServices;
	
	
	public void showMessage() {
		
		myServices.forEach( a -> System.out.println( a.message() ) );
		
//		System.out.println( myService.message() );
		
	}

}
