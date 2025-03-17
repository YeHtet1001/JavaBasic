package com.yha.spring.autowired;

import org.springframework.stereotype.Component;

import jakarta.annotation.Priority;

@Priority(2)
@Component
public class MyService2 implements MyService {
	
	private String name;
	
	public MyService2 () {
		name = "service2";
	}

	@Override
	public String message() {
		
		return "Weclome, My Service from %s ".formatted(name);
		
	}
	
}
