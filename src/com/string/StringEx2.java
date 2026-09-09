package com.string;

public class StringEx2 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		String s4 = new String("Hello");

		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//true

		System.out.println(s1 == s3);//true
		System.out.println(s1.equals(s3));//true

		System.out.println(s2 == s4);//false
		System.out.println(s2.equals(s4));//true
	}

}
