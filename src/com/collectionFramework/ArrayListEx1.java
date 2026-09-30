package com.collectionFramework;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		
		a.add("teja");
		a.add("vinay");
		a.add("vishwa");
		a.add("teja");
		a.add("vinay");
		a.add("Dragon");
		
		
		for(int i=0;i<a.size();i++) {
			for(int j=i+1;j<a.size();j++) {
				if(a.get(i).equals(a.get(j))) {
					System.out.println(a.get(i));
					break;
				}
			}
		}

	}

}
