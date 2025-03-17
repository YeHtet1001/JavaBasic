package com.yha.ioc;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {

	public String sayHello() {
		
		return "Konnichiwa from annotation configuration spring!";
		
	}
	
}
