package com.paraconst;

public class Car extends Vehicle {

    String model;

    Car(String brand, double price, String model) {
        super(brand, price);

        this.model = model;

        System.out.println("Car Constructor Called\n");

        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Model : " + model);
    }

    public static void main(String[] args) {

        new Car("Hyundai", 1500000, "Creta");
    }
}