package com.matrix;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Matrix 1 :");
		
		System.out.println("\nEnter number of Row's of 1st Matrix:");
		int r=s.nextInt();
		
		System.out.println("Enter number of Column's of 1st Matrix:");
		int c=s.nextInt();
		
		int[][] arr=new int[r][c];
		
		System.out.println("\nEnter 1st Matrix Elements : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println("Enter Value of row "+(i+1)+" and Element "+(j+1)+" : ");
				arr[i][j]=s.nextInt();
			}
		}
		
		System.out.println("\n\nMatrix 2: ");
		
		System.out.println("\n\nEnter number of Row's of second Matrix :");
		int r1=s.nextInt();
		
		System.out.println("Enter number of Column's of second Matrix :");
		int c2=s.nextInt();
		
		int[][] arr2=new int[r1][c2];
		
		System.out.println("\nEnter 2nd Matrix Elements : ");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				System.out.println("Enter Value of row "+(i+1)+" and Element "+(j+1)+" : ");
				arr2[i][j]=s.nextInt();
			}
		}

		
		System.out.println("\n\n1st Matrix :\n");
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n2nd Matrix :\n");
		
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		if(r==c2) {
			int[][] mat=new int[r][c2];
			for(int i=0;i<r;i++) {
				for(int j=0;j<c2;j++) {
					for(int k=0;k<c;k++) {
						mat[i][j]+=arr[i][k]*arr2[k][j];
					}	
				}
			}
			System.out.println("\n\nProduct of Two Matrix :\n");
			
			for(int i=0;i<r;i++) {
				for(int j=0;j<c2;j++) {
					System.out.print(mat[i][j]+" ");
				}
				System.out.println();
			}
			
		}else {
			System.out.println("Matrix Multiplication  not Possible....");
		}
						
		s.close();
	}

}
