package com.tn.hamza.spring_framework._3.di_beans_same_name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingService_3_Impl implements GreetingService_3 {

	@Autowired
	MySimpleService_3 a; // for MySimpleService_3_Impl_1
	//MySimpleService_3 b; // for MySimpleService_3_Impl_2
	
	@Override
	public void sayHello() {
		System.out.println("Hi All");
		a.doSomething();
	}

}
