package com.anonymous;

import java.util.function.Predicate;

public class PredefinedFunInter {

	public static void main(String[] args) {
		
		Predicate<Integer> p=new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				
				return t%2==0;
			}
			
		};
		
		System.out.println(p.test(10)?"Even":"Odd");

	}

}
