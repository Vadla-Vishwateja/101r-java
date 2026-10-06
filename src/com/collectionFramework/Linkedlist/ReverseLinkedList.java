package com.collectionFramework.Linkedlist;

import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		System.out.println(l.reversed());

	}

}
