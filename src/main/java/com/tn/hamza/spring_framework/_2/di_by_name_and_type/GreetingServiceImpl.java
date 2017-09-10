package com.tn.hamza.spring_framework._2.di_by_name_and_type;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService{

	@Override
	public void sayHello() {
		System.out.println("Hello All");
	}

}
