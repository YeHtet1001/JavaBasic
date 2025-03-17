package com.yha.event;

import java.time.LocalDate;

public record MyEvent(
		
		String name,
		LocalDate publishAt
		
		
		) {
	
	public MyEvent( String name ) {
		
		this( name , LocalDate.now() );
		
	}

}
