package com.array;

import java.util.Scanner;

public class PrimeBtw10N50 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Prime numbers between 10 and 50:");

        for (int i = 0; i < n; i++) {

            if (arr[i] >= 10 && arr[i] <= 50) {

                boolean prime = true;

                for (int j = 2; j <= arr[i] / 2; j++) {

                    if (arr[i] % j == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}