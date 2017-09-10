package com.tn.hamza.spring_framework._3.di_beans_same_name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingService_1_Impl implements GreetingService_1 {

	@Autowired
	public MySimpleService_1 mySimpleService_1; // NoSuchBeanDefinitionException
												// => spring is
	// confused because there are two eligible implementations of MySimpleService_1, 
	// MySimpleService_1_Impl_1 & MySimpleService_1_Impl_2

	@Override
	public void sayHello() {
		System.out.println("Hi All");
		mySimpleService_1.doSonething();
	}

}
