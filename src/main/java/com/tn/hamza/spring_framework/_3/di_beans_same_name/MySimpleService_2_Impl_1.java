package com.tn.hamza.spring_framework._3.di_beans_same_name;

import org.springframework.stereotype.Component;

@Component
public class MySimpleService_2_Impl_1 implements MySimpleService_2{

	@Override
	public void doSomething() {
		System.out.println("MySimpleService_2_Impl_1");
	}

}
