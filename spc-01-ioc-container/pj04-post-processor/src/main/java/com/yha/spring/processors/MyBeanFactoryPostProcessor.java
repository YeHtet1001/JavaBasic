package com.yha.spring.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
		System.out.println("Bean Factory is ready!!");
		
		var values = beanFactory.getBeanDefinitionNames();
		
		for( var value : values) {
			
			System.out.println(value);
			
		}
		
	}

}
