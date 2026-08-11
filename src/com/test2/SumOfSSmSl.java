package com.test2;

import java.util.Scanner;

public class SumOfSSmSl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[8];
		
		for(int i = 0; i < 8; i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			a[i] = sc.nextInt();
	}
		
		int large = Integer.MIN_VALUE, seclarge = Integer.MIN_VALUE;
		int small = Integer.MAX_VALUE, secsmall = Integer.MAX_VALUE;
		
		for(int j = 0; j < 8; j++) {
			// largest and second largest
			if(a[j] > large) {
				seclarge = large; // old largest becomes second
				large = a[j];
			} else if(a[j] > seclarge && a[j]!= large) {
				seclarge = a[j];
			}
			
			// smallest and second smallest
			if(a[j] < small) {
				secsmall = small; // old smallest becomes second
				small = a[j];
			} else if(a[j] < secsmall && a[j]!= small) {
				secsmall = a[j];
			}
	}
		
		System.out.print("Array: ");
		for(int x : a) System.out.print(x + " ");
		System.out.println();
		
		System.out.println("Largest Number : " + large);
		System.out.println("Second Largest : " + seclarge);
		System.out.println("Smallest Number : " + small);
		System.out.println("Second Smallest : " + secsmall);
		
		sc.close();
	}
	
}