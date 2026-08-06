package com.task11;
import java.util.Scanner;

public class PrimeNum {
		
	public static boolean isPrime(int num) {
		if (num<2) {
			return false;
		}
		for(int j=2;j<Math.sqrt(num);j++) {
			if (num%j==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number :");
		int a=sc.nextInt();
		boolean result=isPrime(a);
		System.out.println(result?"Prime Number ":"Not a Prime Number ");

	}

}
