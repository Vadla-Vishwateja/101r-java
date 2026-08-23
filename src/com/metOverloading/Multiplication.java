package com.metOverloading;

public class Multiplication {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Multiplication m = new Multiplication();
        System.out.println("Product: " + m.multiply(5, 10));
    }
}