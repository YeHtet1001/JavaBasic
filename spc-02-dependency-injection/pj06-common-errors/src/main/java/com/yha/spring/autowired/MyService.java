package com.yha.spring.autowired;


public class MyService {
	
	private String name;
	
	
	public MyService( String name ) {
		
		super();
		this.name = name;
		
	}

	public String message() {
		
		return "Weclome, My Service from %s ".formatted(name);
		
	}
	
}
