package com.matrix;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Matrix 1 :");
		
		System.out.println("\nEnter number of Row's of  Matrix: ");
		int r=s.nextInt();
		
		System.out.println("Enter number of Column's of  Matrix: ");
		int c=s.nextInt();
		
		int[][] arr=new int[r][c];
		
		System.out.println("\nEnter  Matrix Elements : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println("Enter Value of row "+(i+1)+" and Element "+(j+1)+" : ");
				arr[i][j]=s.nextInt();
			}
		}

		System.out.println("\n\n1st Matrix :\n");
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose of Matrix : ");
		int[][] res=new int[c][r];
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				res[i][j]=arr[j][i];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
