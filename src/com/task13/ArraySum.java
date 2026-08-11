package com.task13;
import java.util.*;

public class ArraySum {
	
	public static void sumOfArr(int arr[],int n) {
		int sum=0;
		for(int j=0;j<n;j++) {
			sum+=arr[j];
		}
		System.out.println("Sum of array : "+sum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter Element "+(i+1)+" : ");
			arr[i]=sc.nextInt();
		}
		sumOfArr(arr,n);
		sc.close();

	}

}
