package com.array;

import java.util.Scanner;

public class LastOccurance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array :");
		int l=sc.nextInt();
		int[] arr=new int[l];
		System.out.println("Enter elements of array :");
		for(int j=0;j<l;j++) {
			arr[j]=sc.nextInt();
		}
		System.out.println("Enter Target Element : ");
		int search = sc.nextInt();

		int index = -1;

		for (int i = 0; i < arr.length; i++) {

		    if (arr[i] == search) {
		        index = i;
		    }
		}

		if (index != -1)
		    System.out.println("Last occurrence at index = " + index);
		else
		    System.out.println("Element not found");
		

	}


}
