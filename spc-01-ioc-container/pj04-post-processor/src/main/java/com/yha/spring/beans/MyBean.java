package com.yha.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
	
	private String value;
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String saySomething() {
		
		return """
				Title:My Bean
				Description:post-processor-test 
				""";
		
	}

}
