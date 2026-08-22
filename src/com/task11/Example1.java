package com.task11;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num :");
		int num=sc.nextInt();
		int sq=num*num;
		int sum=0;
		while(sq>0) {
			int t=sq%10;
			sum+=t;
			sq/=10;
		}
		if(sum==num) {
			System.out.println("Neon number");
		}else {
			System.out.println("Not a Neon number");
		}
	}

}
