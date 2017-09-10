package com.tn.hamza.spring_framework._3.di_beans_same_name;

import org.springframework.stereotype.Component;

@Component("a")
public class MySimpleService_3_Impl_1 implements MySimpleService_3 {

	@Override
	public void doSomething() {
		System.out.println("MySimpleService_3_Impl_1");
	}

}
