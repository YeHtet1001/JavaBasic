package com.yha.ioc;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.context.support.GenericXmlApplicationContext;

@TestMethodOrder( OrderAnnotation.class )
public class HelloBeanTest {
	
	@Test
	@Order(1)
	void test() {
		
		try ( var context = new GenericXmlApplicationContext( "classpath:/application.xml" ) ){
			
//			context.load("classpath:/application.xml");
//			context.refresh();
			
			var bean = context.getBean(HelloBean.class);
			
			System.out.println( bean.sayHelloWorld() );
			
		}
		
	}
	
	
	@Order(2)
	@Test
	void test1() {
		
		try( var context = new GenericXmlApplicationContext( "classpath:/application.xml" ) ){
			
			var bean = context.getBean(AnnotatedBean.class);
			
			System.out.println( bean.saySomething() );
			
		}
		
	}
	

}
