package com.tn.hamza.spring_framework._2.di_by_name_and_type;

import org.springframework.stereotype.Component;

@Component("foo")
public class MyShapeDrawerImpl implements MyShapeDrawer{

	@Override
	public void drawSomething() {
		System.out.println("draw something");
	}

}
