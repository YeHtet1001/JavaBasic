package com.yha.event.listener;

import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.yha.event.MyEvent;

@Component
public class MyListener {
	
	@EventListener
	public void myApplicationEvent( ApplicationContextEvent event ) {
		
		System.out.println( event.getClass().getSimpleName() );
		
	}

	@EventListener
	public void myEvent( MyEvent event) {
		
		System.out.println( event.toString() );
		
	}
	
}
