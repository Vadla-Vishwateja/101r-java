package com.task9;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name=sc.nextLine();
		System.out.println("Enter id : ");
		int id=sc.nextInt();
		System.out.println("Enter phone number : ");
		long phn=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Street  : ");
		String st=sc.nextLine();
		System.out.println("Enter pincode : ");
		int pin=sc.nextInt();
		
		
		System.out.println(" Name : "+name);
		System.out.println(" id : "+id);
		System.out.println(" phone no  : "+phn);
		System.out.println(" Street : "+st);
		System.out.println(" pincode : "+pin);
	
		sc.close();
	}

}
