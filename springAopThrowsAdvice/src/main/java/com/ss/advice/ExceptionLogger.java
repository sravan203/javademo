package com.ss.advice;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionLogger implements ThrowsAdvice {
	
	
	public void afterThrowing(IllegalArgumentException ie) {
		
		
		throw new NumberFormatException("changed exception");
	}

	

}
