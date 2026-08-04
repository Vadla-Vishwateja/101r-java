package com.test2;

import java.util.Scanner;

class Staff{
	String staffName;
	int staffID;
	String baseShift;
	public Staff(String staffName, int staffID, String baseShift) {
		this.staffName = staffName;
		this.staffID = staffID;
		this.baseShift = baseShift;
	}
	
	
}

class DepartmentStaff extends Staff{
	String departmentName;
	String responsibilityLevel;
	public DepartmentStaff(String staffName, int staffID, String baseShift, String departmentName,
			String responsibilityLevel) {
		super(staffName, staffID, baseShift);
		this.departmentName = departmentName;
		this.responsibilityLevel = responsibilityLevel;
		System.out.println("staff profile has been created");
	}
	
	
	public void updateResponsibility(String responsibility) {

		if (responsibility == null || responsibility.trim().isEmpty()) {
			System.out.println("Invalid Responsibility Level");
		} else {
			responsibilityLevel = responsibility;
			System.out.println("Responsibility Updated Successfully");
		}
	}

	public void updateDepartment(String department) {

		if (department == null || department.trim().isEmpty()) {
			System.out.println("Invalid Department Name");
		} else {
			departmentName = department;
			System.out.println("Department Updated Successfully");
		}
	}

	
	
	
	public void display() {

		System.out.println("\nStaff Details");
		System.out.println("Name : " + staffName);
		System.out.println("Staff ID : " + staffID);
		System.out.println("Department : " + departmentName);
		System.out.println("Responsibility : " + responsibilityLevel);
		System.out.println("Shift : " + baseShift);
	}
}
public class Hotel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Staff Name : ");
		String name = s.nextLine();

		System.out.print("Enter Staff ID : ");
		int id = s.nextInt();
		s.nextLine();

		System.out.print("Enter Base Shift : ");
		String shift = s.nextLine();

		System.out.print("Enter Department Name : ");
		String department = s.nextLine();

		System.out.print("Enter Responsibility Level : ");
		String responsibility = s.nextLine();
        
		DepartmentStaff d=new DepartmentStaff(name, id, shift, department, responsibility);
		int choice;
		do {

			System.out.println("\n--- Menu ---");
			System.out.println("1. Update Responsibility");
			System.out.println("2. Update Department");
			System.out.println("3. View Profile");
			System.out.println("4. Exit");
			System.out.print("Enter Choice : ");

			choice = s.nextInt();
			s.nextLine();

			switch (choice) {

			case 1:
				System.out.print("Enter New Responsibility Level : ");
				String newResponsibility = s.nextLine();
				d.updateResponsibility(newResponsibility);
				break;

			case 2:
				System.out.print("Enter New Department Name : ");
				String newDepartment = s.nextLine();
				d.updateDepartment(newDepartment);
				break;

			case 3:
				d.display();;
				break;

			case 4:
				System.out.println("Thank You!");
				break;

			default:
				System.out.println("Invalid Choice");
			}

		} while (choice != 4);
		
		
		s.close();
	}

}
