package com.yha.event;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yha.event.publisher.MyPublisher;

public class MyEventListenerTest {
	
	@Test
	void test(){
		
		try( var context = new AnnotationConfigApplicationContext( AppConfig.class ) ){
			
			var publisher = context.getBean( MyPublisher.class ) ;
			
			publisher.publish( new MyEvent("Ye Htet Aung") );
			
			publisher.publish( new MyEvent("Htet Htoo Aung"));
			
		}
		
	}

}
