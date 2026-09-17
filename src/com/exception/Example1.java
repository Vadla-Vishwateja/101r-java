package com.exception;

public class Example1 {

	public static void main(String[] args) {
		
		
		try {
			String str=null;
			System.out.println(str.toLowerCase());
			
		} catch (NullPointerException e) { // RuntimeException or Exception
			e.printStackTrace();
		}
		
		System.out.println("Executed Null pointer Exception ");
	}

}
