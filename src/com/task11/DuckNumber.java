package com.task11;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int temp = num;
        boolean isDuck = false;

        temp = temp / 10;

        while (temp > 0) {
            if (temp % 10 == 0) {
                isDuck = true;
                break;
            }
            temp = temp / 10;
        }

        if (isDuck) {
            System.out.println(num + " is a Duck Number.");
        } else {
            System.out.println(num + " is Not a Duck Number.");
        }

        sc.close();
    }
}