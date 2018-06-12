package com.ss.service;

public class BillGenerate {
	
	
	public int billgenerate(int item, int amount) {
		
		
		if (item==0 || amount==0) {
			
			
			throw new IllegalArgumentException("invalid inputs");
			
		}else {
			
			
			return amount*item;
			
			
		}
		
		
		
	
		
	}

}
