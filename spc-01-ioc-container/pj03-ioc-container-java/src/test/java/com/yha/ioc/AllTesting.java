package com.yha.ioc;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yha.ioc.bean.AnnotatedBean;
import com.yha.ioc.bean.HelloBean;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder( OrderAnnotation.class )
public class AllTesting {
	
	@Test
	@Order(1)
	void test() {
		
		try( var context = new AnnotationConfigApplicationContext( ApplicationConfig.class ) ){
			
			var bean = context.getBean( HelloBean.class);
			
			System.out.println( bean.saySomething() );
			
		}
		
	}
	
	@Test
	@Order(2)
	void test1() {
		
		try( var context = new AnnotationConfigApplicationContext( ApplicationConfig.class ) ){
			
			var bean = context.getBean( AnnotatedBean.class );
			System.out.println( bean.saySomething() );
			
		}
		
	}

}
