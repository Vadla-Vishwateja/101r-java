package com.interfaces;

import java.util.Scanner;

interface RoomBooking {
    void bookRoom();
    void cancelRoom();
    void showRoomDetails();
}

class Hotel implements RoomBooking {

    String customerName;
    int days;
    double roomCharge = 3000;
    double totalBill;
    boolean booked;

    Hotel(String name, int days) {
        customerName = name;
        this.days = days;
    }

    public void bookRoom() {
        totalBill = roomCharge * days;
        booked = true;

        System.out.println("Hotel Room Booked.");
    }

    public void cancelRoom() {
        System.out.println("Hotel: 20% cancellation charge applied.");
        totalBill = totalBill * 0.20;
        booked = false;
    }

    public void showRoomDetails() {
        System.out.println("----- Hotel -----");
        System.out.println("Customer: " + customerName);
        System.out.println("Days: " + days);
        System.out.println("Total Bill: ₹" + totalBill);
        System.out.println("Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

class Resort implements RoomBooking {

    String customerName;
    int days;
    double roomCharge = 5000;
    double totalBill;
    boolean booked;

    Resort(String name, int days) {
        customerName = name;
        this.days = days;
    }

    public void bookRoom() {
        totalBill = roomCharge * days;
        booked = true;

        System.out.println("Resort Room Booked.");
    }

    public void cancelRoom() {
        System.out.println("Resort: 30% cancellation charge applied.");
        totalBill = totalBill * 0.30;
        booked = false;
    }

    public void showRoomDetails() {
        System.out.println("----- Resort -----");
        System.out.println("Customer: " + customerName);
        System.out.println("Days: " + days);
        System.out.println("Total Bill: ₹" + totalBill);
        System.out.println("Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

class GuestHouse implements RoomBooking {

    String customerName;
    int days;
    double roomCharge = 1500;
    double totalBill;
    boolean booked;

    GuestHouse(String name, int days) {
        customerName = name;
        this.days = days;
    }

    public void bookRoom() {
        totalBill = roomCharge * days;
        booked = true;

        System.out.println("Guest House Room Booked.");
    }

    public void cancelRoom() {
        System.out.println("Guest House: 10% cancellation charge applied.");
        totalBill = totalBill * 0.10;
        booked = false;
    }

    public void showRoomDetails() {
        System.out.println("----- Guest House -----");
        System.out.println("Customer: " + customerName);
        System.out.println("Days: " + days);
        System.out.println("Total Bill: ₹" + totalBill);
        System.out.println("Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

public class HotelDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        RoomBooking rb;

        rb = new Hotel(name, days);

        rb.bookRoom();
        rb.showRoomDetails();

        System.out.println();

        rb.cancelRoom();
        rb.showRoomDetails();

        sc.close();
    }
}