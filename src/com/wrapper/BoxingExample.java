package com.wrapper;

public class BoxingExample {

	public static void main(String[] args) {
		
		// Manual Boxing 
		
		int a=11;
		Integer i1=Integer.valueOf(a);
		System.out.println(i1);
		
		
		// Auto Boxing 
		
		int b=13;
		Integer i2=b;
		System.out.println(i2);

	}

}
