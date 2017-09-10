package com.tn.hamza.spring_framework._3.di_beans_same_name;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyMain_3_1 {

	/**
	 * See {@link GreetingService_1_Impl#mySimpleService_1} to inspect the exception source
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(MyMain_3_1.class, args);
		GreetingService_1 bean = context.getBean(GreetingService_1.class); 
		bean.sayHello();
	}

}
