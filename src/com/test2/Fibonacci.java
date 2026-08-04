package com.test2;
import java.util.*;
public class Fibonacci {
	public static void display(int n) {
		int first = 0;
		int second = 1;

		if (n <= 0) {
			System.out.println("Please enter a positive number.");
		} else {
			System.out.println("Fibonacci Series:");

			for (int i = 1; i <= n; i++) {
				System.out.print(first + " ");

				int next = first + second;
				first = second;
				second = next;
			}
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Size of Series  : ");
		int num=s.nextInt();
		display(num);
		
		s.close();

	}

}
