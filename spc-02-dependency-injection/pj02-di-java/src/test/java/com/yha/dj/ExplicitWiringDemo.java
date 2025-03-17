package com.yha.dj;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.yha.spring.AppConfig;
import com.yha.spring.di.MyClient;

public class ExplicitWiringDemo {
	
	@Test
	void test() {
		
		try( var context = new AnnotationConfigApplicationContext( AppConfig.class ) ){
			
			var bean1 = context.getBean( "client1" , MyClient.class );
			
			bean1.showMessage();
			
			var bean2 = context.getBean( "client2" , MyClient.class );
			
			bean2.showMessage();
			
		}
		
	}

}
