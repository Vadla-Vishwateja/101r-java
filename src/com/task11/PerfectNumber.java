package com.task11;
import java.util.Scanner;
public class PerfectNumber {
	
	public static boolean isPerfect(int num) {
		if(num<=0) {
			return false;
		}
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum==num;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n=sc.nextInt();
		boolean result=isPerfect(n);
		System.out.println(result?"Perfect Number .":"Not a Perfect Number .");
		

	}

}
