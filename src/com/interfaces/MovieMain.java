package com.interfaces;

interface TicketBooking {
    void bookTicket();
    void cancelTicket();
    void showTicketDetails();
}

class PVR implements TicketBooking {
    private String movieName;
    private String seatNumber;
    private String customerName;
    private boolean isBooked;

    public PVR(String movieName, String seatNumber, String customerName) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.customerName = customerName;
    }

    @Override
    public void bookTicket() {
        isBooked = true;
        System.out.println("[PVR Cinemas] Booking confirmed with complimentary popcorn voucher!");
    }

    @Override
    public void cancelTicket() {
        isBooked = false;
        System.out.println("[PVR Cinemas] Ticket cancelled. 80% refund processed.");
    }

    @Override
    public void showTicketDetails() {
        System.out.println("--- PVR Gold Class Ticket ---");
        System.out.println("Customer: " + customerName + " | Movie: " + movieName + " | Seat: " + seatNumber + " | Status: " + (isBooked ? "ACTIVE" : "CANCELLED"));
    }
}

class INOX implements TicketBooking {
    private String movieName;
    private String seatNumber;
    private String customerName;
    private boolean isBooked;

    public INOX(String movieName, String seatNumber, String customerName) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.customerName = customerName;
    }

    @Override
    public void bookTicket() {
        isBooked = true;
        System.out.println("[INOX Megaplex] Ticket reserved successfully with Dolby Atmos sound.");
    }

    @Override
    public void cancelTicket() {
        isBooked = false;
        System.out.println("[INOX Megaplex] Ticket cancelled with a cancellation fee of ₹50.");
    }

    @Override
    public void showTicketDetails() {
        System.out.println("--- INOX Standard E-Ticket ---");
        System.out.println("Holder: " + customerName + " | Screen Show: " + movieName + " | Seat No: " + seatNumber + " | Booked: " + isBooked);
    }
}

class Cinepolis implements TicketBooking {
    private String movieName;
    private String seatNumber;
    private String customerName;
    private boolean isBooked;

    public Cinepolis(String movieName, String seatNumber, String customerName) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.customerName = customerName;
    }

    @Override
    public void bookTicket() {
        isBooked = true;
        System.out.println("[Cinepolis VIP] VIP Recliner confirmed with in-seat service.");
    }

    @Override
    public void cancelTicket() {
        isBooked = false;
        System.out.println("[Cinepolis VIP] Booking cancelled. Full wallet credit applied.");
    }

    @Override
    public void showTicketDetails() {
        System.out.println("--- Cinepolis VIP Boarding Pass ---");
        System.out.println("Guest: " + customerName + " | Feature: " + movieName + " | Recliner: " + seatNumber + " | Confirmed: " + isBooked);
    }
}

public class MovieMain {
    public static void main(String[] args) {
        TicketBooking booking;

        booking = new PVR("Interstellar", "P-12", "Teja");
        booking.bookTicket();
        booking.showTicketDetails();

        System.out.println("----------------------------------------");

        booking = new INOX("Avatar", "A-5", "Rahul");
        booking.bookTicket();
        booking.showTicketDetails();
        booking.cancelTicket();

        System.out.println("----------------------------------------");

        booking = new Cinepolis("Inception", "VIP-1", "Aditya");
        booking.bookTicket();
        booking.showTicketDetails();
    }
}