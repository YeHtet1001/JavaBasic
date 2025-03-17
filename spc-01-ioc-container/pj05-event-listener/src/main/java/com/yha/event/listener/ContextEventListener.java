package com.yha.event.listener;

import org.springframework.context.event.ApplicationContextEvent;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ApplicationContextEvent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.yha.event.MyEvent;

@Component
public class ContextEventListener {

	@EventListener
	public void onApplicationEvent( ApplicationContextEvent event ) {
		
		System.out.println( event.getClass().getSimpleName() );
		
	}
	
	@EventListener
	public void listener( MyEvent event ) {
		
		System.out.println( event );
		
	}
	
	
	
}
