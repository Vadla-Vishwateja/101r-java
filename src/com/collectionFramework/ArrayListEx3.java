package com.collectionFramework;

import java.util.ArrayList;

public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(2);
		a.add(4);
		a.add(6);
		a.add(5);
		a.add(3);
		a.add(9);
		a.add(1);
		a.add(14);
		a.add(16);

		
ArrayList<Integer> a2=new ArrayList<Integer>();
		
		a2.add(2);
		a2.add(4);
		a2.add(6);
		a2.add(5);
		a2.add(3);
		a2.add(14);
		
		for(Integer v:a) {
			if(a2.contains(v)) {
				System.out.println(v);;
			}
		}
	}

}
