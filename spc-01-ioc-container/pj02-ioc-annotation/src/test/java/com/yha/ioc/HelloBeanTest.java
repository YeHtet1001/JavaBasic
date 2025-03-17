package com.yha.ioc;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@TestMethodOrder( OrderAnnotation.class )
public class HelloBeanTest {
	
	@Test
	@Order(1)
	void helloBeanTest() {
		
		try( var context = new AnnotationConfigApplicationContext("com.yha.ioc") ){
			
			var bean = context.getBean(HelloBean.class);
			
			System.out.println( "@Component!!!" );
			System.out.println( bean.sayHello() );
			
		}
		
		
	}

}
