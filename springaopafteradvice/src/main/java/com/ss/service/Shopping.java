package com.ss.service;

public class Shopping {
	
	public int billGenerate(String items[]) {
		
		int bill=0;
		bill=items.length*8500;
		System.out.println(bill);
		
		return bill;
		
	}

}
