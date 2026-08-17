package com.task13;
import java.util.*;

public class EvenOrOdd {
	
	public static boolean  isEvenOdd(int a) {
		if(a%2==0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int j=sc.nextInt();
		
		boolean res=isEvenOdd(j);
		System.out.println(res?"Yes":"No");

	}

}
