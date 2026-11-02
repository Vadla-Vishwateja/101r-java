package com.collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		
		
		s.add(4);
		s.add(6);
		s.add(8);
		s.remove(6);
		s.add(12);
		s.add(5);
		s.add(4);
		s.add(5);
		
		System.out.println(s);

	}

}
