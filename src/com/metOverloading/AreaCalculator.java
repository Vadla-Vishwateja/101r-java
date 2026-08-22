package com.metOverloading;

public class AreaCalculator {
    public double area(double side) {
        return side * side;
    }

    public double area(double length, double breadth) {
        return length * breadth;
    }

    public double area(float radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        System.out.println("Area of Square: " + (int)calc.area(5.0));
    }
}