package com.metOverloading;

public class DiscountCalculator {
    public double discount(double price, double discountPercentage) {
        return price - (price * (discountPercentage / 100.0));
    }

    public double discount(double price, double discountPercentage, int quantity) {
        double total = price * quantity;
        return total - (total * (discountPercentage / 100.0));
    }

    public double discount(double price, int fixedAmount) {
        return price - fixedAmount;
    }

    public static void main(String[] args) {
        DiscountCalculator calc = new DiscountCalculator();
        System.out.println("Final Price: " + (int)calc.discount(5000.0, 10.0));
    }
}