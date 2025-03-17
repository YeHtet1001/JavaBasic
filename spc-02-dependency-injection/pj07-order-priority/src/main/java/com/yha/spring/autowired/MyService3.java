package com.yha.spring.autowired;

import org.springframework.stereotype.Component;

import jakarta.annotation.Priority;

@Priority(3)
@Component
public class MyService3 implements MyService {
	
	private String name;
	
	public MyService3 () {
		name = "service3";
	}

	@Override
	public String message() {
		
		return "Weclome, My Service from %s ".formatted(name);
		
	}
	
}
