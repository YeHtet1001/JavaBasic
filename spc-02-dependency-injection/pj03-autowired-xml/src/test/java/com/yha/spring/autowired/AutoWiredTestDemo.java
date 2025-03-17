package com.yha.spring.autowired;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.yha.spring.autowried.MyClient;

public class AutoWiredTestDemo {
	
	@Test
	void test() {
		
		try( var context = new GenericXmlApplicationContext("classpath:/application.xml") ){
			
			var bean = context.getBean(MyClient.class);
			
			bean.showMessage();
			
		}
		
	}

}
