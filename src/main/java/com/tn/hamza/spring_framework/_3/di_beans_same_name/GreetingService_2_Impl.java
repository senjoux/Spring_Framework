package com.tn.hamza.spring_framework._3.di_beans_same_name;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class GreetingService_2_Impl implements GreetingService_2{

	@Resource(name="mySimpleService_2_Impl_2")
	MySimpleService_2 mySimpleService_2; 
	
	@Override
	public void sayHello() {
		System.out.println("Hi All");
		mySimpleService_2.doSomething();
	}

}
