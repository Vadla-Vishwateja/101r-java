package com.string;

public class StringEx3 {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";

		System.out.println(s1 == s2);//true

		s1 = "Python";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);//f
		System.out.println(s1.equals(s2));//f


	}

}
