package com.collectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args) {
		Vector<String> a=new Vector<>();
		
		a.add("vinay");
		a.add("teja");
		a.add("vikil");
		Enumeration<String> e=a.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
