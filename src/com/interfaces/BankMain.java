package com.interfaces;

interface BankOperations {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}

class SBI implements BankOperations {
    private double balance = 5000.0;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("[SBI] Deposited: ₹" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("[SBI] Withdrawn: ₹" + amount);
        } else {
            System.out.println("[SBI] Insufficient funds!");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("[SBI] Available Balance: ₹" + balance);
    }
}

class HDFC implements BankOperations {
    private double balance = 10000.0;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("[HDFC] Cash Deposit of ₹" + amount + " successful.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("[HDFC] Cash Withdrawal of ₹" + amount + " processed.");
        } else {
            System.out.println("[HDFC] Overdraft limit reached!");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("[HDFC] Total Account Balance: ₹" + balance);
    }
}

class ICICI implements BankOperations {
    private double balance = 7500.0;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("[ICICI] Credited ₹" + amount + " to account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("[ICICI] Debited ₹" + amount + " from account.");
        } else {
            System.out.println("[ICICI] Transaction declined: Low balance.");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("[ICICI] Net Balance: ₹" + balance);
    }
}

public class BankMain {
    public static void main(String[] args) {
        BankOperations bank;

        bank = new SBI();
        bank.deposit(2000);
        bank.withdraw(1500);
        bank.checkBalance();

        System.out.println("---------------------------");

        bank = new HDFC();
        bank.deposit(5000);
        bank.withdraw(2000);
        bank.checkBalance();

        System.out.println("---------------------------");

        bank = new ICICI();
        bank.deposit(3000);
        bank.withdraw(12000); 
        bank.checkBalance();
    }
}