package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		try {
			System.out.println("Enter Array Size : ");
			int[] arr=new int[s.nextInt()];
			System.out.println(arr[100]);
			
		} catch (NegativeArraySizeException | IndexOutOfBoundsException | InputMismatchException e) {
			e.printStackTrace();
		}
		System.out.println("Executed");
	}

}
