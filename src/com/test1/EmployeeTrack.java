package com.test1;
import java.util.Scanner;

class SalesEmployee{
	String employeeName;
	int employeeID;
	public SalesEmployee(String employeeName, int employeeID) {
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		System.out.print("Employee Details Updated ");
	}
}

class PerformanceEmployee extends SalesEmployee{
		
	int listofSalesEntries;
	double totalSales;
	double averageSales;
	String performanceGrade;

	public PerformanceEmployee(String employeeName, int employeeID) {
		super(employeeName, employeeID);
		
		listofSalesEntries=0;
		totalSales=0;
		averageSales=0;
		performanceGrade="None";	
	}
	
	public void addTotalSales(double amt) {
		if(amt<=0) {
			System.out.println("Invalid sales ammount entered");
		}else {
			totalSales +=amt;
			listofSalesEntries++;
			
			averageSales=totalSales/listofSalesEntries;
			
			System.out.println("Sales entry added successfully.");
		}
	}
	
	public void checkPerformanceGrade() {
		if (listofSalesEntries == 0) {
			System.out.println("No sales entries available.");
			return;
		}
		if (averageSales >=20000) {
			performanceGrade="Excellent";
		}else if (averageSales >=16000) {
			performanceGrade="Very good";
		}else if (averageSales >=12000) {
			performanceGrade="Good";
		}else if (averageSales >=9000) {
			performanceGrade="Average";
		}else {
			performanceGrade="Poor";
		}
		System.out.println("Performance Profile Created");
}
	
	public void display() {
		System.out.println("Performance Summary \r\n"
				+ "Employee:"+employeeName+"\r\n"
				+ "Employee ID: "+employeeID+"\r\n"
				+ "Total Sales: "+totalSales+"\r\n"
				+ "Average Sales: "+averageSales+"\r\n"
				+ "Performance Grade: "+performanceGrade+"\r\n"
				+ "");
	}
}


public class EmployeeTrack {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Employee Name : ");
		String name=s.nextLine();
		
		System.out.print("Enter Employee ID : ");
		int id=s.nextInt();
		
		PerformanceEmployee p1=new PerformanceEmployee(name, id);
		
		int choice=0;
		do {
			System.out.println("--- Menu ---\r\n"
					+ "1. Add Sales\r\n"
					+ "2. Recalculate Result\r\n"
					+ "3. View Summary\r\n"
					+ "4. Exit\r\n"
					+ "\r\n"
					+ "Enter choice:\r\n"
					+ "");
					choice=s.nextInt();
					switch(choice) {
						case 1 :
							System.out.print("Enter Sales Amount to be added  : ");
							double ammt=s.nextDouble();
							p1.addTotalSales(ammt);
							break;
						case 2:
							p1.checkPerformanceGrade();
							break;
						case 3:
							p1.display();
							break;
						case 4:
							System.out.println("Thank You !");
							break;
						default :
							System.out.println("Invalid Choice");
					}
			
		}while(choice!=4);	
		s.close();
	}

}
