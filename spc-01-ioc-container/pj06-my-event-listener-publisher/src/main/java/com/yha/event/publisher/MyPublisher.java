package com.yha.event.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.yha.event.MyEvent;


@Component
public class MyPublisher implements ApplicationEventPublisherAware {
	
	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		
		this.publisher = applicationEventPublisher ;
		
	}
	
	public void publish( MyEvent event ) {
		
		publisher.publishEvent( event );
		
	}

}
