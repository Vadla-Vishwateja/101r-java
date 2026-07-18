package com.task11;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int square = num * num;
        int temp = num;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                System.out.println(num + " is Not an Automorphic Number.");
                sc.close();
                return;
            }

            temp = temp / 10;
            square = square / 10;
        }

        System.out.println(num + " is an Automorphic Number.");

        sc.close();
    }
}