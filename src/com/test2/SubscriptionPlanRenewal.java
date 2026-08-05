package com.test2;


import java.util.Scanner;

class SubscriptionPlan {
     String subscriberName;
     String planType;
     double planCost;
     double paidAmount;
     String subscriptionStatus;

    public SubscriptionPlan() {
        System.out.println("Subscription Profile Created");
        subscriberName = "";
        planType = "";
        planCost = 0;
        paidAmount = 0;
        subscriptionStatus = "Active";
    }

    public SubscriptionPlan(String subscriberName, String planType, double planCost) {
        this();
        this.subscriberName = subscriberName;
        this.planType = planType;

        if (planCost >= 0) {
            this.planCost = planCost;
        } else {
            System.out.println("Invalid Plan Cost");
            this.planCost = 0;
        }
    }

    public void setPaidAmount(double paidAmount) {
        if (paidAmount >= 0 && paidAmount <= planCost) {
            this.paidAmount = paidAmount;
        } else {
            System.out.println("Invalid Paid Amount");
        }
    }

    public void setSubscriptionStatus(String status) {
        this.subscriptionStatus = status;
    }

    public void displaySummary() {
        System.out.println("\nSubscription Summary");
        System.out.println("Subscriber: " + subscriberName);
        System.out.println("Plan Type: " + planType);
        System.out.println("Plan Cost: " + planCost);
        System.out.println("Paid Amount: " + paidAmount);
        System.out.println("Subscription Status: " + subscriptionStatus);
    }
}

public class SubscriptionPlanRenewal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Subscriber Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Plan Type: ");
        String type = sc.nextLine();

        System.out.print("Enter Plan Cost: ");
        double cost = sc.nextDouble();

        SubscriptionPlan plan = new SubscriptionPlan(name, type, cost);

        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Update Payment");
            System.out.println("2. Change Status");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Paid Amount: ");
                    double amount = sc.nextDouble();
                    plan.setPaidAmount(amount);
                    break;

                case 2:
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Subscription Status: ");
                    String status = sc.nextLine();
                    plan.setSubscriptionStatus(status);
                    break;

                case 3:
                    plan.displaySummary();
                    break;

                case 4:
                    System.out.println("Thank You.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);

        sc.close();
    }
}