package com.newtask;
import java.util.Scanner;

public class BankProcess1 {
	
    public static void main(String[] args) {
    	
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Bank Account Number : ");
        int ano = s.nextInt();
        System.out.print("Enter Bank Account Holder Name : ");
        String name = s.next();
        System.out.print("Enter Bank Account Balance : ");
        double bal = s.nextDouble();
        BankAccount b1 = new BankAccount(ano, name, bal);
        System.out.println("\nBank Account Created Successfully!");
        System.out.println("Account Number : " + b1.getAccountNumber());
        System.out.println("Account Holder : " + b1.getAccountHolder());
        System.out.println("Balance : " + b1.getBalance());
        int choice;
        do {
            System.out.println("\n========== BANK MENU ==========");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice : ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to Deposit : ");
                    double depositAmount = s.nextDouble();
                    b1.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to Withdraw : ");
                    double withdrawAmount = s.nextDouble();
                    b1.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current Balance : " + b1.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using our banking system!");
                    break;
                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 4);

        s.close();
    }
}