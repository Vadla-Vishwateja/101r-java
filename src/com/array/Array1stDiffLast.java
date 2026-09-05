package com.array;

import java.util.Scanner;

public class Array1stDiffLast {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array :");
		int l=sc.nextInt();
		int[] arr=new int[l];
		System.out.println("Enter elements of array :");
		for(int j=0;j<l;j++) {
			arr[j]=sc.nextInt();
		}
		int difference = arr[0] - arr[arr.length - 1];
		int difference2 = Math.abs(arr[0] - arr[arr.length - 1]);

		System.out.println("Difference = " + difference);
		System.out.println("Absolute Difference = " + difference2);
		

	}


}
