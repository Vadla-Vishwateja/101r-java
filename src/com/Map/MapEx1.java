package com.Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

	public static void main(String[] args) {
		
		Map<String, Integer> student = new HashMap<String, Integer>();
		
		System.out.println(student.isEmpty());
		
		student.put("Teja", 98);
		student.put("abhi", 96);
		student.put("vicky", 99);
		student.put("sai", 97);
		student.put("Kru", 99);
		
		System.out.println(student);
		
		System.out.println(student.get("sai"));
	}

}
