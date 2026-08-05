package com.patterns;
import java.util.Scanner;

public class Rectangle{
	
		public static void printRectangle(int n,int m) {
			if(n<=0 || m<=0) {
			    System.out.println("Length and breadth must be greater than 0.");
			    return;
			}
			System.out.println("Rectangle of length "+n+" and breadth "+m+ ":\n");
			for(int i=1;i<=m;i++) {
				for(int j=1;j<=n;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter length : ");
		int l=sc.nextInt();
		System.out.print("Enter Breadth : ");
		int b=sc.nextInt();
		printRectangle(l,b);

	}

}
