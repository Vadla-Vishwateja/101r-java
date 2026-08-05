package com.test2;

import java.util.Scanner;

class StockHandler {
	String handlerName;
	String handlerID;

 public StockHandler(String handlerName, String handlerID) {
     this.handlerName = handlerName;
     this.handlerID = handlerID;
 }
}

class StockPerformance extends StockHandler {
	int totalStock;
	int count;
	double averageStock;
	String handlingGrade;

 public StockPerformance(String handlerName, String handlerID) {
     super(handlerName, handlerID);
     totalStock = 0;
     count = 0;
     averageStock = 0;
     handlingGrade = "Not Calculated";
     System.out.println("Stock Performance Profile Created");
 }

 public void addStock(int quantity) {
     if (quantity > 0) {
         totalStock += quantity;
         count++;
     } else {
         System.out.println("Invalid Stock Quantity");
     }
 }

 public void calculatePerformance() {
     if (count > 0) {
         averageStock = (double) totalStock / count;
     } else {
         averageStock = 0;
     }

     if (averageStock >= 40) {
         handlingGrade = "Efficient";
     } else if (averageStock >= 20) {
         handlingGrade = "Average";
     } else {
         handlingGrade = "Needs Improvement";
     }
 }

 public void displaySummary() {
     System.out.println("\nStock Performance Summary");
     System.out.println("Handler: " + handlerName);
     System.out.println("Handler ID: " + handlerID);
     System.out.println("Total Stock Handled: " + totalStock);
     System.out.println("Average Stock Per Entry: " + averageStock);
     System.out.println("Handling Grade: " + handlingGrade);
 }
}

public class WarehouseStock  {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Handler Name: ");
     String name = sc.nextLine();

     System.out.print("Enter Handler ID: ");
     String id = sc.nextLine();

     StockPerformance sp = new StockPerformance(name, id);

     int choice;

     do {
         System.out.println("\n--- Menu ---");
         System.out.println("1. Add Stock");
         System.out.println("2. Recalculate Result");
         System.out.println("3. View Summary");
         System.out.println("4. Exit");
         System.out.print("Enter choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter Stock Quantity: ");
                 int qty = sc.nextInt();
                 sp.addStock(qty);
                 break;

             case 2:
                 sp.calculatePerformance();
                 break;

             case 3:
                 sp.displaySummary();
                 break;

             case 4:
                 System.out.println("Thank You .");
                 break;

             default:
                 System.out.println("Invalid Choice");
         }
     } while (choice != 4);

     sc.close();
 }
}