package com.inheritance;

public class Manager extends Employee{
public double bonus=20000;
	public static void main(String[] args) {
		
		Manager m=new Manager();
		
		System.out.println("Total Salary = "+(m.salary+m.bonus));

	}

}
