package com.matrix;

import java.util.Scanner;

public class PrimeNumInMatrix {
	
	
	public static boolean isPrime(int num) {
		if (num<2) {
			return false;
		}
		for(int j=2;j<=Math.sqrt(num);j++) {
			if (num%j==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter number of Row's  :");
		int r=s.nextInt();
		
		System.out.println("Enter number of Column's :");
		int c=s.nextInt();
		
		int[][] arr=new int[r][c];
		
		System.out.println("Enter Matrix Elements : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println("Enter Value of "+(i+1)+"th row and "+(j+1)+" Element : ");
				arr[i][j]=s.nextInt();
			}
		}
		
		
		System.out.println("\n\nMatrix :\n");
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
				
		
		
		System.out.println("\n\nPrime Numbers from the Matrix : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(isPrime(arr[i][j])){
					System.out.print(arr[i][j]+" ");
			}
			}
		}
		s.close();
		
		
	}

}
