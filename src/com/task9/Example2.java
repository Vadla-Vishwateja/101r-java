package com.task9;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name=sc.nextLine();
		System.out.println("Enter age : ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Gender : ");
		String g=sc.nextLine();
		
		if(g.equals("male") && age>=27 ) {
			System.out.println(" Eligible for Voting");
		}else if(g.equals("female") && age>=23 ) {
			System.out.println(" Eligible for Voting");
		}else {
			System.out.println("Not Eligible for voting");
		}
		
		
		sc.close();
	}

}
