package com.collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx1 {

	public static void main(String[] args) {
		Deque<Integer> a=new ArrayDeque<>();
		
		a.offerLast(45);
		a.offerLast(78);
		a.offerLast(32);
		a.offerFirst(45);
		a.offer(45);
		a.poll();
		a.addLast(3);
		a.peek();
		a.offerLast(4);
		
		
		
		System.out.println(a); 

	}

}
