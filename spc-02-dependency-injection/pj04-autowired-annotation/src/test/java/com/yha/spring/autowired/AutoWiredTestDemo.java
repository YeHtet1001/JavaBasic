package com.yha.spring.autowired;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.yha.spring.autowried.MyClient;

public class AutoWiredTestDemo {
	
	@Test
	void test() {
		
		try( var context = new AnnotationConfigApplicationContext( "com.yha.spring") ){
			
			var bean = context.getBean( MyClient.class );
			
			bean.showMessage();
			
		}
		
	}

}
