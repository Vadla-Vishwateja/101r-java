package com.array;

import java.util.Scanner;

public class ArrayPrime {
	public static void notPrimeOfArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<2) {
				System.out.print(arr[i]+" ");
			}else {
				for(int j=2;j<=arr[i]/2;j++) {
					if(arr[i]%j==0) {
						System.out.print(arr[i]+" ");
					}
				}
			}	
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array :");
		int l=sc.nextInt();
		int[] arr=new int[l];
		System.out.println("Enter elements of array :");
		for(int j=0;j<l;j++) {
			arr[j]=sc.nextInt();
		}
		System.out.println("Numbers which are not prime in the array : ");
		notPrimeOfArray(arr);
		

	}

}
