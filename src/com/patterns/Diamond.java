package com.patterns;
import java.util.Scanner;

public class Diamond {
	
	public static void printPyramid(int num) {
		if(num<=0) {
		    System.out.println("Size must be greater than 0.");
		    return;
		}
		for(int i=1;i<=num-1;i++) {
			for(int k=1;k<=num-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=num;i>0;i--) {
			for(int k=1;k<=num-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String []args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter number of rows : ");
			int n=sc.nextInt();
			System.out.println("Diamond : ");
			printPyramid(n);
	}

}
