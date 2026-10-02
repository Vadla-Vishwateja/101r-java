package com.array;

import java.util.Scanner;

public class SearchTarget {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array :");
		int l=sc.nextInt();
		int[] arr=new int[l];
		System.out.println("Enter elements of array :");
		for(int j=0;j<l;j++) {
			arr[j]=sc.nextInt();
		}
		System.out.println("Enter element to be searched in array :");
		int search = sc.nextInt();

		boolean found = false;

		for (int i = 0; i < arr.length; i++) {

		    if (arr[i] == search) {
		        found = true;
		        break;
		    }
		}

		if (found)
		    System.out.println("Element found");
		else
		    System.out.println("Element not found");
		

	}


}
