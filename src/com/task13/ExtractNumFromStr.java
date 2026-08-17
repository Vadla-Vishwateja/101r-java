package com.task13;
import java.util.*;

public class ExtractNumFromStr {

	public static String solution(String str) {
		String res="";
		String numRes="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) >='a' && str.charAt(i) <='z') {
				res+=str.charAt(i);
			}else {
				numRes+=str.charAt(i);
			}
		}
		
		
		return numRes;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String d=s.nextLine();
		String r=solution(d);
		System.out.println(r);
		
		int w=Integer.parseInt(r);
		System.out.println(w);
		

	}

}
