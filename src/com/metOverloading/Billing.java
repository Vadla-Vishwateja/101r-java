package com.metOverloading;

public class Billing {
    public double calculateBill(double price) {
        return price;
    }

    public double calculateBill(double price, int quantity) {
        return price * quantity;
    }

    public double calculateBill(double price, int quantity, double discount) {
        return (price * quantity) - discount;
    }

    public static void main(String[] args) {
        Billing billing = new Billing();
        System.out.println("Final Bill: " + (int)billing.calculateBill(1000.0, 2, 100.0));
    }
}