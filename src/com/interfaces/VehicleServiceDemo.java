package com.interfaces;

import java.util.Scanner;

interface VehicleService {
    void service();
    void calculateCost();
    void showServiceDetails();
}

class CarService implements VehicleService {

    String vehicleNumber;
    String ownerName;
    double cost;

    CarService(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    public void service() {
        System.out.println("Car Service Started.");
        System.out.println("Checking engine, brakes, oil and tyres.");
    }

    public void calculateCost() {
        cost = 3000;
        System.out.println("Car Service Cost: ₹" + cost);
    }

    public void showServiceDetails() {
        System.out.println("----- Car Service -----");
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Service Cost: ₹" + cost);
    }
}

class BikeService implements VehicleService {

    String vehicleNumber;
    String ownerName;
    double cost;

    BikeService(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    public void service() {
        System.out.println("Bike Service Started.");
        System.out.println("Checking chain, brakes, engine oil and tyres.");
    }

    public void calculateCost() {
        cost = 1500;
        System.out.println("Bike Service Cost: ₹" + cost);
    }

    public void showServiceDetails() {
        System.out.println("----- Bike Service -----");
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Service Cost: ₹" + cost);
    }
}

class TruckService implements VehicleService {

    String vehicleNumber;
    String ownerName;
    double cost;

    TruckService(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    public void service() {
        System.out.println("Truck Service Started.");
        System.out.println("Checking engine, brakes, tyres and heavy-duty components.");
    }

    public void calculateCost() {
        cost = 8000;
        System.out.println("Truck Service Cost: ₹" + cost);
    }

    public void showServiceDetails() {
        System.out.println("----- Truck Service -----");
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Service Cost: ₹" + cost);
    }
}

public class VehicleServiceDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Owner Name: ");
        String owner = sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String number = sc.nextLine();

        System.out.println("\n1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Truck");

        System.out.print("Enter Vehicle Type: ");
        int choice = sc.nextInt();

        VehicleService vs;

        switch (choice) {

            case 1:
                vs = new CarService(number, owner);
                break;

            case 2:
                vs = new BikeService(number, owner);
                break;

            case 3:
                vs = new TruckService(number, owner);
                break;

            default:
                System.out.println("Invalid Vehicle Type.");
                sc.close();
                return;
        }

        System.out.println();

        vs.service();
        vs.calculateCost();
        vs.showServiceDetails();

        sc.close();
    }
}