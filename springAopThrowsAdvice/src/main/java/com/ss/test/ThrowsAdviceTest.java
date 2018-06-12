package com.ss.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ss.service.BillGenerate;

public class ThrowsAdviceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx;
		BillGenerate big;
		ctx= new ClassPathXmlApplicationContext("com/ss/cfgs/applicationcontext.xml");
		
		big= ctx.getBean("pfb",BillGenerate.class);
		
		System.out.println("----------------------------------------");
		System.out.println(big.billgenerate(2, 50000));
		
		System.out.println(big.billgenerate(0, 0));

	}

}
