package com.yha.spring.autowired;

import org.springframework.stereotype.Component;

import jakarta.annotation.Priority;

@Priority(1)
@Component
public class MyService1 implements MyService {
	
	private String name;
	
	public MyService1 () {
		name = "service1";
	}

	@Override
	public String message() {
		
		return "Weclome, My Service from %s ".formatted(name);
		
	}
	
}
