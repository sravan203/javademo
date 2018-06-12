package com.ss.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ss.service.PinGenerate;

public class AfterAroundTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext ctx;
		ctx= new ClassPathXmlApplicationContext("com/ss/cfgs/applicationcontext.xml");
		
		PinGenerate service;
		service= ctx.getBean("pfb",PinGenerate.class);
	//	System.out.println(service.billGenerate(new String[] {"shirt","jeans","cooldrinks","cooker","grossery"}));
		
		System.out.println(service.pinGenerate((long) 955061438));
		
		((AbstractApplicationContext) ctx).close();
		
		
		
		
		

	}

}
