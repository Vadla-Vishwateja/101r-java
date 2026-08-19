package com.methodOverriding;

class Vehicle1 {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle1 {
    @Override
    void start() {
        System.out.println("Car started");
    }
}

public class Vehicle {
    public static void main(String[] args) {

        Vehicle1 v = new Vehicle1();
        v.start();

        Car c = new Car();
        c.start();
    }
}