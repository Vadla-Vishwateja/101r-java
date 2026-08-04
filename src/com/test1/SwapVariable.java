package com.test1;
import java.util.Scanner;

public class SwapVariable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter First Number :");
		int a=s.nextInt();
		System.out.print("Enter Second Number :");
		int b=s.nextInt();
		System.out.println("-----Before Swapping----- ");
		System.out.println("First Number : "+a);
		System.out.println("Second Number : "+b);
		                                       // Swaping without 3rd variable
		b=a+b;                                 // b=a+b 10+25=35
		a=b-a;                                 // a=b-a 35-10=25=a
		b=b-a;                                 // b=b-a 35-25=10=b 
		System.out.println("-----After Swapping----- ");
		System.out.println("First Number : "+a);
		System.out.println("Second Number : "+b);
		
		s.close();
		

	}

}
