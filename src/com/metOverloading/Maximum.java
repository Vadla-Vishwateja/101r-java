package com.metOverloading;

public class Maximum {
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Maximum m = new Maximum();
        System.out.println("Maximum: " + m.max(10, 25));
    }
}