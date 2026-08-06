package com.task5;
import java.util.Scanner;
public class CountOfDigits {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter a Number : ");
			int num=sc.nextInt();
			int digits=0;
			while(num>0) {
				digits=digits+1;
				num=num/10;
			}
			System.out.println("Total Diigits : "+digits);
			}

}
