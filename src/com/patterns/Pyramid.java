package com.patterns;
import java.util.Scanner;

public class Pyramid {
	
	public static void printPyramid(int num) {
		if(num<=0) {
		    System.out.println("Size must be greater than 0.");
		    return;
		}
		for(int i=1;i<=num;i++) {
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
			System.out.println("Pyramid : ");
			printPyramid(n);
	}

}
