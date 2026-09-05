package com.array;

import java.util.Scanner;

public class LargestPrime {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array :");
		int l=sc.nextInt();
		int[] arr=new int[l];
		System.out.println("Enter elements of array :");
		for(int j=0;j<l;j++) {
			arr[j]=sc.nextInt();
		}
		int largestPrime = -1;

		for (int i = 0; i < arr.length; i++) {

		    if (arr[i] >= 2) {

		        boolean prime = true;

		        for (int j = 2; j <= arr[i] / 2; j++) {

		            if (arr[i] % j == 0) {
		                prime = false;
		                break;
		            }
		        }

		        if (prime && arr[i] > largestPrime) {
		            largestPrime = arr[i];
		        }
		    }
		}

		if (largestPrime != -1)
		    System.out.println("Largest prime = " + largestPrime);
		else
		    System.out.println("No prime number found");
		

	}


}
