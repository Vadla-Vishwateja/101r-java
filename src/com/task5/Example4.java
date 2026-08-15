package com.task5;

public class Example4 {

		
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
			int a=10201;
			Example4 obj=new Example4();
			int res=obj.display(a);
			String result=(res==a)?"Palendrome ." : "Not a Palendrome .";
			System.out.println(result);

		}

	}

