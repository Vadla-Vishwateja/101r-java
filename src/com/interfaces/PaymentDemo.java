package com.interfaces;

import java.util.Scanner;

interface PaymentGateway {
    void makePayment();
    void refund();
    void checkTransaction();
}

class UPIPayment implements PaymentGateway {

    double amount;
    String transactionId;

    UPIPayment(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    public void makePayment() {
        System.out.println("Payment through UPI.");
        System.out.println("UPI Payment of ₹" + amount + " successful.");
    }

    public void refund() {
        System.out.println("UPI Refund initiated for ₹" + amount);
    }

    public void checkTransaction() {
        System.out.println("UPI Transaction ID: " + transactionId);
    }
}

class CardPayment implements PaymentGateway {

    double amount;
    String transactionId;

    CardPayment(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    public void makePayment() {
        System.out.println("Payment through Debit/Credit Card.");
        System.out.println("Card Payment of ₹" + amount + " successful.");
    }

    public void refund() {
        System.out.println("Card Refund initiated for ₹" + amount);
    }

    public void checkTransaction() {
        System.out.println("Card Transaction ID: " + transactionId);
    }
}

class NetBanking implements PaymentGateway {

    double amount;
    String transactionId;

    NetBanking(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    public void makePayment() {
        System.out.println("Payment through Net Banking.");
        System.out.println("Net Banking Payment of ₹" + amount + " successful.");
    }

    public void refund() {
        System.out.println("Net Banking Refund initiated for ₹" + amount);
    }

    public void checkTransaction() {
        System.out.println("Net Banking Transaction ID: " + transactionId);
    }
}

public class PaymentDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter Transaction ID: ");
        String id = sc.nextLine();

        PaymentGateway pg;

        pg = new UPIPayment(amount, id);

        pg.makePayment();
        pg.checkTransaction();
        pg.refund();

        sc.close();
    }
}