package com.yha.spring.autowried;

public class MyClient {
	
	private MyService myService;
	
//	public MyClient() {
//		
//	}
	
	
	
	public MyClient(MyService myService) {
		
		super();
		this.myService = myService;
		
	}

	
	public void setMyService(MyService myService) {
		
		this.myService = myService;
		
	}


	public void showMessage() {
		
		System.out.print( myService.showMessage() );
		
	}

}
