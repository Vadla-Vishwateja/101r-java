package com.task11;

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int next = num + 1;
        boolean isSunny = false;

        for (int i = 1; i <= next; i++) {
            if (i * i == next) {
                isSunny = true;
                break;
            }
        }

        if (isSunny) {
            System.out.println(num + " is a Sunny Number.");
        } else {
            System.out.println(num + " is Not a Sunny Number.");
        }

        sc.close();
    }
}