package com.collectionFramework.Linkedlist;

import java.util.LinkedList;

public class ExQs1 {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		int d=l.size()/2;
		
		System.out.println(l.get(d));

	}

}
