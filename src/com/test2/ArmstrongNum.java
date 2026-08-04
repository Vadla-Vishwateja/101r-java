package com.test2;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a Number : ");
			int num=sc.nextInt();
			int original=num ;
			double sum=0;
			int TotalDigits=String.valueOf(num).length();
			while(num>0) {
				int d=num%10;
				sum=sum+Math.pow(d, TotalDigits);
				num=num/10;
			}
			if(original==sum) {
				System.out.println(original+" is an Armstrong Number .");
			}else {
				System.out.println(original+" is Not an  Armstrong Number .");
			}
			
			sc.close();
	}

}
