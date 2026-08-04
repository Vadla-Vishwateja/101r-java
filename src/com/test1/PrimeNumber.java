package com.test1;
import java.util.Scanner;

public class PrimeNumber {
		
		public static boolean isPrime(int num) {
			if(num<1) {
				return false;
			}else {
				for(int i=2;i<=num/2;i++) {
					if(num%i==0) {
						return false;
					}
				}
				return true;
			}
		}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int num=s.nextInt();
		
		boolean res=isPrime(num);
		
		System.out.println(res ? "Prime Number ":"Not a Prime Number .");
		
		s.close();
	
	}

}
