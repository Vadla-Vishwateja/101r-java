package com.interfaces;

import java.util.Scanner;

interface BusBooking {
    void bookSeat();
    void cancelSeat();
    void showBooking();
}

class APSRTC implements BusBooking {

    String passengerName;
    String source;
    String destination;
    double ticketPrice = 500;
    boolean booked = false;

    APSRTC(String passengerName, String source, String destination) {
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
    }

    public void bookSeat() {
        booked = true;
        System.out.println("APSRTC Seat Booked Successfully.");
    }

    public void cancelSeat() {
        booked = false;
        System.out.println("APSRTC Booking Cancelled.");
    }

    public void showBooking() {
        System.out.println("----- APSRTC Booking -----");
        System.out.println("Passenger: " + passengerName);
        System.out.println("From: " + source);
        System.out.println("To: " + destination);
        System.out.println("Ticket Price: ₹" + ticketPrice);
        System.out.println("Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

class TSRTC implements BusBooking {

    String passengerName;
    String source;
    String destination;
    double ticketPrice = 450;
    boolean booked = false;

    TSRTC(String passengerName, String source, String destination) {
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
    }

    public void bookSeat() {
        booked = true;
        System.out.println("TSRTC Seat Booked Successfully.");
    }

    public void cancelSeat() {
        booked = false;
        System.out.println("TSRTC Booking Cancelled.");
    }

    public void showBooking() {
        System.out.println("----- TSRTC Booking -----");
        System.out.println("Passenger: " + passengerName);
        System.out.println("From: " + source);
        System.out.println("To: " + destination);
        System.out.println("Ticket Price: ₹" + ticketPrice);
        System.out.println("Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

class PrivateBus implements BusBooking {

    String passengerName;
    String source;
    String destination;
    double ticketPrice = 600;
    boolean booked = false;

    PrivateBus(String passengerName, String source, String destination) {
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
    }

    public void bookSeat() {
        booked = true;
        System.out.println("Private Bus Seat Booked Successfully.");
    }

    public void cancelSeat() {
        booked = false;
        System.out.println("Private Bus Booking Cancelled.");
    }

    public void showBooking() {
        System.out.println("----- Private Bus Booking -----");
        System.out.println("Passenger: " + passengerName);
        System.out.println("From: " + source);
        System.out.println("To: " + destination);
        System.out.println("Ticket Price: ₹" + ticketPrice);
        System.out.println("Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

public class BusDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Source: ");
        String source = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.println("\n1. APSRTC");
        System.out.println("2. TSRTC");
        System.out.println("3. Private Bus");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        BusBooking bus;

        switch (choice) {
            case 1:
                bus = new APSRTC(name, source, destination);
                break;

            case 2:
                bus = new TSRTC(name, source, destination);
                break;

            case 3:
                bus = new PrivateBus(name, source, destination);
                break;

            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        bus.bookSeat();
        bus.showBooking();

        System.out.println();

        bus.cancelSeat();
        bus.showBooking();

        sc.close();
    }
}