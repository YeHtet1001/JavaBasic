package com.yha.spring.autowried;


import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Component
//@RequiredArgsConstructor
@AllArgsConstructor
public class MyClient {
	
	
//	private final MyService myService;
	
	private MyService myService;
	
//	public MyClient() {
//		
//	}

//	public MyClient(MyService myService) {
//		
//		super();
//		this.myService = myService;
//		
//	}
//
//	public void setMyService(MyService myService) {
//		
//		this.myService = myService;
//		
//	}


	public void showMessage() {
		
		System.out.print( myService.showMessage() );
		
	}

}
