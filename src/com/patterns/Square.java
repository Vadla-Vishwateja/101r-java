package com.patterns;
import java.util.Scanner;
public class Square {
		public static void printSquare(int num) {
			if(num<=0) {
			    System.out.println("Size must be greater than 0.");
			    return;
			}
			System.out.println("Square  :\n");
			for(int i=1;i<=num;i++) {
				for(int j=1;j<=num;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter size : ");
		int s=sc.nextInt();
		printSquare(s);

	}

}
