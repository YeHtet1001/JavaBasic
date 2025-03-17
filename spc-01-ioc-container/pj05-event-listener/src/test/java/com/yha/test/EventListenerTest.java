package com.yha.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yha.event.ApplicationConfig;
import com.yha.event.MyEvent;
import com.yha.event.publish.MyEventPublisher;


public class EventListenerTest {
	
	@Test
	void test() {
		
		try( var context = new AnnotationConfigApplicationContext( ApplicationConfig.class ) ){
			
			var publisher = context.getBean( MyEventPublisher.class);
			
			publisher.publish( new MyEvent( "My first Event!!" ) );
			
			publisher.publish( new MyEvent( "My Second Event!!" ) );
			
		}
		
	}

}
