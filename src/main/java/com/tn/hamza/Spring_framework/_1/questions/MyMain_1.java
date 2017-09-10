package com.tn.hamza.Spring_framework._1.questions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyMain_1 {
	
	public static void main(String []args) {
		//SpringApplication 'run' method returns an ApplicationContext
		ApplicationContext context = SpringApplication.run(MyMain_1.class, args);
		//get the bean by the bean class name from the application context
		BalloonsMaker maker = context.getBean(BalloonsMaker.class);
		maker.makeTheBallon();
		
	}
}
