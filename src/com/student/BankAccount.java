package com.student;

public class BankAccount {

    public String bankName = "SBI";
    private double balance = 50000.0;
    protected String branchName = "Hyderabad";
    int accountNumber = 123456;

    public double getBalance() {
        return balance;
    }

    public void displayDetails() {
        System.out.println("Bank Name      : " + bankName);
        System.out.println("Branch Name    : " + branchName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + getBalance());
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.displayDetails();
    }
}