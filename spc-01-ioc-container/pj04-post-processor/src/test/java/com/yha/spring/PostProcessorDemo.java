package com.yha.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.yha.spring.beans.MyBean;

public class PostProcessorDemo {
	
	@Test
	void testDemo() {
		
		try( var context = new GenericXmlApplicationContext( "classpath:/application.xml" )){
			
			var myBean = context.getBean( MyBean.class );
			
			System.out.println( myBean.getValue() );
			
			System.out.println( myBean.saySomething() );
			
		}
		
	}

}
