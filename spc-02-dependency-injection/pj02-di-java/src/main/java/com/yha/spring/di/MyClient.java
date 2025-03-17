package com.yha.spring.di;


public class MyClient {
	
	//dependency
	private MyService myService;
	private String name;
	
	public MyClient() {
		
	}
	
	public MyClient(MyService myService) {
		super();
		this.myService = myService;
	}

	public void setMyService(MyService myService) {
		this.myService = myService;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public void showMessage() {
		
		System.out.printf("%s -> %s%n",name,myService.message() );
		
	}

}
