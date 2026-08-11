package com.task13;

import java.util.Scanner;

public class SumofEvenOfArr {
	
	public static void sumOfEven(int arr[]) {
		int sum=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%2==0) {
				sum+=arr[j];
			}
		}	
		System.out.println("Sum of Even elements in  array : "+sum);
	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array : ");
		int n=sc.nextInt();
		System.out.println("Enter array elements : ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sumOfEven(arr);

	}

}
