package com.paraconst;

public class Mobile {

    String brand;
    String model;
    double price;

    // No-Argument Constructor
    Mobile() {
        this("Samsung");
        System.out.println("No-Argument Constructor\n");
    }

    // One-Argument Constructor
    Mobile(String brand) {
        this(brand, "S24", 80000);
        System.out.println("One-Argument Constructor");
        System.out.println("Brand : " + brand + "\n");
    }

    // Three-Argument Constructor
    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;

        System.out.println("Three-Argument Constructor");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        new Mobile();
    }
}