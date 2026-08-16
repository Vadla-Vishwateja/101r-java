package com.paraconst;

public class Vehicle {

    String brand;
    double price;

    Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;

        System.out.println("Vehicle Constructor Called\n");
    }
}