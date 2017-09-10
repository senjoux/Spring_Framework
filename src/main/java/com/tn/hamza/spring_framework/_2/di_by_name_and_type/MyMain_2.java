package com.tn.hamza.spring_framework._2.di_by_name_and_type;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyMain_2 {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(MyMain_2.class, args);
		MySimpleService bean= (MySimpleService) context.getBean("mySimpleServiceImpl");
		bean.doSomething();
	}

}
