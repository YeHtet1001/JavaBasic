package com.yha.ioc.bean;

import org.springframework.stereotype.Component;

@Component
public class AnnotatedBean {

	public String saySomething() {
		
		return """
				Title : Java Base Configuration
				Description : this is annotated bean.
				""";
		
	}
	
}
