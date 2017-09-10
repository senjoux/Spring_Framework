package com.tn.hamza.spring_framework._2.di_by_name_and_type;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class MySimpleServiceImpl implements MySimpleService{

	@Resource
	GreetingService greetingServiceImpl;
	
	@Override
	public void doSomething() {
		greetingServiceImpl.sayHello();
		//some other logic
	}

}
