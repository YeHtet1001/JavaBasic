package com.yha.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class MyClient {
	
	@Autowired
//	@Qualifier("s1")
	private MyService myService3;
	
	
	public void showMessage() {
		
		System.out.println( myService3.message() );
		
	}

}
