package com.collectionFramework;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(2);
		a.add(4);
		a.add(6);
		a.add(5);
		a.add(3);
		a.add(2);
		a.add(1);
		a.add(4);
		a.add(6);
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		for(Integer v:a) {
			if(!a1.contains(v)) {
				a1.add(v);
			}
		}
		System.out.println(a1);
	}

}
