package com.interfaces;

import java.util.Scanner;

interface FoodService {
    void takeOrder();
    void prepareFood();
    void generateBill();
}

class Restaurant implements FoodService {

    String customerName;
    String foodItem;
    double bill;

    Restaurant(String customerName, String foodItem) {
        this.customerName = customerName;
        this.foodItem = foodItem;
    }

    public void takeOrder() {
        System.out.println("Restaurant: Order taken for " + customerName);
        System.out.println("Food Item: " + foodItem);
    }

    public void prepareFood() {
        System.out.println("Restaurant: Preparing food with premium quality.");
    }

    public void generateBill() {
        bill = 250 + 50; 
        System.out.println("Restaurant Bill: ₹" + bill);
    }
}

class Cafeteria implements FoodService {

    String customerName;
    String foodItem;
    double bill;

    Cafeteria(String customerName, String foodItem) {
        this.customerName = customerName;
        this.foodItem = foodItem;
    }

    public void takeOrder() {
        System.out.println("Cafeteria: Order taken for " + customerName);
        System.out.println("Food Item: " + foodItem);
    }

    public void prepareFood() {
        System.out.println("Cafeteria: Preparing food quickly.");
    }

    public void generateBill() {
        bill = 150 + 20;
        System.out.println("Cafeteria Bill: ₹" + bill);
    }
}

class FoodCourt implements FoodService {

    String customerName;
    String foodItem;
    double bill;

    FoodCourt(String customerName, String foodItem) {
        this.customerName = customerName;
        this.foodItem = foodItem;
    }

    public void takeOrder() {
        System.out.println("Food Court: Order taken for " + customerName);
        System.out.println("Food Item: " + foodItem);
    }

    public void prepareFood() {
        System.out.println("Food Court: Preparing food at the selected outlet.");
    }

    public void generateBill() {
        bill = 200 + 30;
        System.out.println("Food Court Bill: ₹" + bill);
    }
}

public class RestaurantDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Food Item: ");
        String food = sc.nextLine();

        FoodService fs;

        fs = new Restaurant(name, food);
        fs.takeOrder();
        fs.prepareFood();
        fs.generateBill();

        System.out.println();

        fs = new Cafeteria(name, food);
        fs.takeOrder();
        fs.prepareFood();
        fs.generateBill();

        System.out.println();

        fs = new FoodCourt(name, food);
        fs.takeOrder();
        fs.prepareFood();
        fs.generateBill();

        sc.close();
    }
}