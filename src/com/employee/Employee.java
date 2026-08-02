package com.employee;

public class Employee {
	
	public int employeeId; 
	public String employeeName;
	public double  salary;
	
	public void displayEmployee() {
		System.out.println("Employee Details : ");
		System.out.println("----------------------");
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Salary : "+salary);
	}
}
