package com.task11;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Strong Number.");
        } else {
            System.out.println(num + " is Not a Strong Number.");
        }

        sc.close();
    }
}