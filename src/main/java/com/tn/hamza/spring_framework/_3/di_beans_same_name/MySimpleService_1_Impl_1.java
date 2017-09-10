package com.tn.hamza.spring_framework._3.di_beans_same_name;

import org.springframework.stereotype.Component;

@Component
public class MySimpleService_1_Impl_1 implements MySimpleService_1{

	@Override
	public void doSonething() {
		System.out.println("MySimpleService_1_Impl_1");
	}

}
