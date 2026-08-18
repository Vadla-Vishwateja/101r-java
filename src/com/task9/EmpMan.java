package com.task9;
import java.util.*;

public class EmpMan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Name : ");
		String n=sc.nextLine();
		System.out.println("Enter Employee Id : ");
		int id=sc.nextInt();
		System.out.println("Enter Employee Designation : ");
		String desg=sc.nextLine();
		sc.nextLine();
		System.out.println("Employee Employee Salary : ");
		double sal=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Manager Name  : ");
		String m=sc.nextLine();
		Manager mgr=new Manager(m);
		Employee emp=new Employee(n,desg,id,sal);
		mgr.checkdetails(emp);
		
		
		sc.close();

	}

}
