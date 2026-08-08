package com.task5;
import java.util.*;

public class SumOfNaturalNum {

	public static void main(String[] args) {
			Scanner sc=new  Scanner(System.in);
			System.out.print("Enter a Number : ");
			int num=sc.nextInt();
			int sum=0;
			while(num>0) {
				sum +=num;
				num--;
			}
			System.out.println("Sum : "+sum);
	}

}
