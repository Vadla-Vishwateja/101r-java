package com.collectionFramework;

import java.util.LinkedList;

public class LinkedListEx2 {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		
		for(int i=1;i<=10;i++) {
			l.add(i);
		}
		System.out.println(l);
		
		l.addFirst(0);
		l.addLast(11);
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		

	}

}
