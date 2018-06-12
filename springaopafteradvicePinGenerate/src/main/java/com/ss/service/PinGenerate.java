package com.ss.service;

import java.util.Random;

public class PinGenerate {
	
	public int pinGenerate(Long cardno) {
		
		Random pin1;
		int pin;
		pin1= new Random();
		
		pin=pin1.nextInt(9999);
		
		
		System.out.println(pin);
		
		return pin;
		
	}

}
