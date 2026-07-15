package com.task11;
import java.util.*;

public class UglyNumber {
	public static boolean isUgly(int num) {
		
		if(num<=0){
            return false;
        }
        while(num%2==0){
            num = num / 2;
        }

        while(num%3==0){
            num = num / 3;
        }

        while(num% 5==0) {
            num = num/ 5;
        }
        return num==1;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n=sc.nextInt();
		boolean result=isUgly(n);
		System.out.print(result?"Ugly Number":"Not a Ugly Number");

	}

}
