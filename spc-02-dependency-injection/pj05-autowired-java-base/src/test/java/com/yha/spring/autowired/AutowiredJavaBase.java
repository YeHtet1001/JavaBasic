package com.yha.spring.autowired;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yha.spring.AppConfig;

public class AutowiredJavaBase {
	
	@Test
	public void test() {
		
		try( var context = new AnnotationConfigApplicationContext( AppConfig.class) ){
			
			var bean = context.getBean( MyClient.class );
			
			bean.showMessage();
			
		}
		
		
	}
	

}
