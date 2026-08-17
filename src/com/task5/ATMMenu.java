package com.task5;
import java.util.Scanner;

public class ATMMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        int choice = 0;

        while (choice != 4) {
            System.out.println("******** ATM MENU ********");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance : ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount : ");
                    double deposit = sc.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Amount Deposited Successfully.");
                    System.out.println("Current Balance : ₹" + balance);
                    break;

                case 3:
                    System.out.print("Enter Withdraw Amount : ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Amount Withdrawn Successfully.");
                        System.out.println("Current Balance : ₹" + balance);
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank You for Using Our ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice. Please Try Again.");
            }

            System.out.println();
        }

        sc.close();
    }
}