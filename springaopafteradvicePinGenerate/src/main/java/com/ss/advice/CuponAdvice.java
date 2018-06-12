package com.ss.advice;

import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class CuponAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object retval, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		Writer write;
		
		
		System.out.println(retval);
		System.out.println(method.getName());
		System.out.println("-----------------");
		write= new FileWriter("E:\\cupon1.txt",true);
		String msg=null;
		int p1;
		if((int)retval<1000) {
			
			throw new IllegalArgumentException("invalid pin");
			
		}else {
			
			p1= (int) retval;
		}
		
		
		System.out.println(p1);
		write.write(p1);
		write.flush();
		write.close();
		
		
		}
		

	}


