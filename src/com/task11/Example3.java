package com.task11;

public class Example3 {

	public static int power(int n,int n2) {
		int pow=1;
		for(int i=1;i<=n2;i++) {
			pow*=n;
		}
		return pow;

	}
	
	public static int getNoOfDigits(int v) {
		int count=0;
		while(v>0) {
			count++;
			v/=10;
		}
		return count;
		
	}
	
	public static boolean isArmstrong(int a) {
		int count=getNoOfDigits(a);
		int sum=0;
		int original=a;
		while(a>0) {
			int t=a%10;
			sum+=power(t,count);
			a/=10;
		}
		return original==sum;
	}
	
	public static void main(String[] args) {
		int num=153;
		
		boolean result =isArmstrong(num);
		System.out.println(result?"Armstrong Number .":"Not a Armstrong Number .");
		

}
}