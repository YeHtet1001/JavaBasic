package com.yha.event;

import java.time.LocalDate;

public record MyEvent(
		
		String message,
		LocalDate publishAt
		
		) {
	
	 public MyEvent( String message ) {
		 
		 this( message , LocalDate.now() );
		 
	}

}
