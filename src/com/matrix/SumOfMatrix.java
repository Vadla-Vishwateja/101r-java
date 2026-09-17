package com.matrix;

import java.util.Scanner;

public class SumOfMatrix {

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
		int sum=0;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
				sum+=arr[i][j];
			}
			System.out.println();
		}
				
		System.out.println("Sum of Elements of the matrix : "+sum);
		s.close();
	}

}
