package com.tn.hamza.spring_framework._3.di_beans_same_name;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyMain_3_3 {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(MyMain_3_3.class, args);
		GreetingService_3 bean = context.getBean(GreetingService_3.class); 
		bean.sayHello();
	}

}
