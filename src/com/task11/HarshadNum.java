package com.task11;
import java.util.Scanner;

public class HarshadNum {
		public static boolean isHarshad(int num) {
			if(num<=0) {
				return false;
			}
			int original=num;
			int sum=0;
			while(num>0) {
				int t=num%10;
				sum=sum+t;
				num/=10;
			}
			return original%sum==0;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int a=sc.nextInt();
		boolean result=isHarshad(a);
		System.out.println(result?"Harshad Number ":"Not a Harshad Number ");

	}

}
