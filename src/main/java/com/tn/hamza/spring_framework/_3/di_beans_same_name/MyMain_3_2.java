package com.tn.hamza.spring_framework._3.di_beans_same_name;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyMain_3_2 {
	/**
	 * To test out this main, first annotate one of {@link GreetingService_1} implementations with '@Primary'
	 * because SpringBoot scan's the entire package hence the exception as from {@link MyMain_3_1} will be thrown again,
	 * the utility of '@Primary' annotation will be explained in {@link MyMain_3_3}
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(MyMain_3_2.class, args);
		GreetingService_2 bean = context.getBean(GreetingService_2.class);
		bean.sayHello();
	}

}
