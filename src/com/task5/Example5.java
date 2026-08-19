package com.task5;
import java.util.*;
public class Example5 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sn.nextInt();
		if (num<2) {
			System.out.println("Not a Prime Number .");
		}
		int count=0;
		for(int j=2;j<Math.sqrt(num);j++) {
			if (num%j==0) {
				System.out.println(num+" is Not a Prime Number .");
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println(num +" is Prime Number .");
		}
	}

}
