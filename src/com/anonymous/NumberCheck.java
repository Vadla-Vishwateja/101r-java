package com.anonymous;
import java.util.Scanner;


interface NumCheck{
	public abstract boolean isPrime(int n);
}

public class NumberCheck {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		NumCheck n=new NumCheck() {

			@Override
			public boolean isPrime(int n) {
				if (n <= 1) {
                    return false;
                }

                for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }

                return true;
			}
				
		};
		
		System.out.println("Enter Number to check :");
		int num=sc.nextInt();
		boolean res=n.isPrime(num);
		System.out.println(res?"Prime Number ." :"Not a Prime Number .");
		

	}

}
