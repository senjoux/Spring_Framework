package com.tn.hamza.Spring_framework._1.questions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BalloonsMaker {

	@Autowired
	private AirBlower airBlower;
	
	public void  makeTheBallon() {
		System.out.println("construct the balloon");
		airBlower.blowAir();
	}
}
