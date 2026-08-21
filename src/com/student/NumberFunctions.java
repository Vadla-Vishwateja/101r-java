package com.student;

public class NumberFunctions {

    // Function to count digits
    public static int countDigits(int n) {
        n = Math.abs(n);

        if (n == 0)
            return 1;

        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // Function to generate Fibonacci series
    public static void fibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    // Function to find prime numbers in a range
    public static void primeNumbers(int start, int end) {
        System.out.print("Prime Numbers: ");

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Helper function to check prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    // Function to find factors
    public static void factors(int n) {
        System.out.print("Factors: ");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }

        System.out.println();
    }

    // Function to find GCD
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {

        int num = 12345;

        System.out.println("Number of Digits: " + countDigits(num));

        fibonacci(10);

        primeNumbers(10, 50);

        factors(24);

        int a = 12, b = 18;

        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }
}