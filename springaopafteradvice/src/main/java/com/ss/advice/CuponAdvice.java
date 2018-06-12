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
		write= new FileWriter("E:\\cupon.txt",true);
		String msg=null;
		if(((int)retval)>40000) {
			msg="avail discount 40%";
			
		}else {
			if(((int)retval)>20000) {
				msg="avail discount 20%";
		}else 
				if(((int)retval)>10000) {
					msg="avail discount 10%";
			} {
			
		}
			msg="avail discount 5%";
		}
		write.write(msg);
		write.flush();
		write.close();
		
		
		}
		

	}


