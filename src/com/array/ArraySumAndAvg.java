package com.array;

public class ArraySumAndAvg {
	public static int sumOfArr(int arr[]) {
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		return sum;
	}
	public static double avgOfArr(int arr[]) {
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		return sum/arr.length;
	}
	

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int sum=sumOfArr(arr);
		System.out.println("Sum of Array Elements : "+sum);
		double av=avgOfArr(arr);
		System.out.println("Average of Array Elements : "+av);
		
	}

}
