package com.array;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter array size : ");

        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Positive: ");

        for (int i = 0; i < n; i++) {

            if (arr[i] > 0)
                System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("Negative: ");

        for (int i = 0; i < n; i++) {

            if (arr[i] < 0)
                System.out.print(arr[i] + " ");
        }
    }
}