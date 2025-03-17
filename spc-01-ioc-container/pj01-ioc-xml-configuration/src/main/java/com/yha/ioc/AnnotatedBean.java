package com.yha.ioc;

import org.springframework.stereotype.Component;

@Component
public class AnnotatedBean {

	public String saySomething() {
		
		return "This is annotatedBaen with component scan in application.xml.";
		
	}
	
}
