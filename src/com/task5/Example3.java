package com.task5;
import java.util.Scanner;

public class Example3 {	
	public int display(int n1) {
		int n=0;
		while (n1>0) {
			int t=n1%10;
			n=n*10+t;
			n1=n1/10;
		}
		return n;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int a=sc.nextInt();
		Example3 obj=new Example3();
		int res=obj.display(a);
		System.out.println(res);

	}

}

