package com.array;

import java.util.Scanner;

public class ArrayPriDivby5 {

    static boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (isPrime(arr[i]) && arr[i] % 5 == 0) {
                count++;
            }
        }

        System.out.println("Count = " + count);
    }
}