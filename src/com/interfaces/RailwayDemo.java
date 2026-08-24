package com.interfaces;

import java.util.Scanner;
import java.util.Random;

interface RailwayService {
    void bookTicket();
    void cancelTicket();
    void showTicket();
}

class ExpressTrain implements RailwayService {

    String passengerName;
    String source;
    String destination;
    double fare;
    int ticketNumber;
    boolean booked;

    ExpressTrain(String name, String source, String destination) {
        this.passengerName = name;
        this.source = source;
        this.destination = destination;
    }

    public void bookTicket() {
        fare = 500;
        ticketNumber = new Random().nextInt(9000) + 1000;
        booked = true;

        System.out.println("Express Train Ticket Booked.");
    }

    public void cancelTicket() {
        booked = false;
        System.out.println("Express Train Ticket Cancelled.");
    }

    public void showTicket() {
        System.out.println("----- Express Train -----");
        System.out.println("Passenger: " + passengerName);
        System.out.println("From: " + source);
        System.out.println("To: " + destination);
        System.out.println("Ticket No: " + ticketNumber);
        System.out.println("Fare: ₹" + fare);
        System.out.println("Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

class SuperFastTrain implements RailwayService {

    String passengerName;
    String source;
    String destination;
    double fare;
    int ticketNumber;
    boolean booked;

    SuperFastTrain(String name, String source, String destination) {
        this.passengerName = name;
        this.source = source;
        this.destination = destination;
    }

    public void bookTicket() {
        fare = 750;
        ticketNumber = new Random().nextInt(9000) + 1000;
        booked = true;

        System.out.println("SuperFast Train Ticket Booked.");
    }

    public void cancelTicket() {
        booked = false;
        System.out.println("SuperFast Train Ticket Cancelled.");
    }

    public void showTicket() {
        System.out.println("----- SuperFast Train -----");
        System.out.println("Passenger: " + passengerName);
        System.out.println("From: " + source);
        System.out.println("To: " + destination);
        System.out.println("Ticket No: " + ticketNumber);
        System.out.println("Fare: ₹" + fare);
        System.out.println("Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

class LocalTrain implements RailwayService {

    String passengerName;
    String source;
    String destination;
    double fare;
    int ticketNumber;
    boolean booked;

    LocalTrain(String name, String source, String destination) {
        this.passengerName = name;
        this.source = source;
        this.destination = destination;
    }

    public void bookTicket() {
        fare = 100;
        ticketNumber = new Random().nextInt(9000) + 1000;
        booked = true;

        System.out.println("Local Train Ticket Booked.");
    }

    public void cancelTicket() {
        booked = false;
        System.out.println("Local Train Ticket Cancelled.");
    }

    public void showTicket() {
        System.out.println("----- Local Train -----");
        System.out.println("Passenger: " + passengerName);
        System.out.println("From: " + source);
        System.out.println("To: " + destination);
        System.out.println("Ticket No: " + ticketNumber);
        System.out.println("Fare: ₹" + fare);
        System.out.println("Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

public class RailwayDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Source: ");
        String source = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        RailwayService rs;

        rs = new ExpressTrain(name, source, destination);

        rs.bookTicket();
        rs.showTicket();

        System.out.println();

        rs.cancelTicket();
        rs.showTicket();

        sc.close();
    }
}