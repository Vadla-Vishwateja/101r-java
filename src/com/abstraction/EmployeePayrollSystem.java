package com.abstraction;

abstract class Employee {

	String employeeName;
	String employeeId;

	Employee(String employeeName, String employeeId) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}

	abstract void calculateSalary();

	void applyLeave() {
		System.out.println("Leave applied successfully.");
	}

	void getDetails() {
		System.out.println(
				"Employee Details: \nName : " + employeeName +
				"\nID: " + employeeId
				);
	}
}


class FullTimeEmployee extends Employee {

	double basePay;
	double benefits;

	FullTimeEmployee(
			String employeeName,
			String employeeId,
			double basePay,
			double benefits) {

		super(employeeName, employeeId);
		this.basePay = basePay;
		this.benefits = benefits;
	}

	@Override
	void calculateSalary() {

		double salary = basePay + benefits;

		System.out.println(
				"Calculating salary: Base pay + benefits = $" + salary
				);
	}
}


class PartTimeEmployee extends Employee {

	double hourlyRate;
	double hoursWorked;

	PartTimeEmployee(
			String employeeName,
			String employeeId,
			double hourlyRate,
			double hoursWorked) {

		super(employeeName, employeeId);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	void calculateSalary() {

		double salary = hourlyRate * hoursWorked;

		System.out.println(
				"Calculating salary: Hours worked × rate = $" + salary
				);
	}
}


class Freelancer extends Employee {

	double projectPayment;

	Freelancer(
			String employeeName,
			String employeeId,
			double projectPayment) {

		super(employeeName, employeeId);
		this.projectPayment = projectPayment;
	}

	@Override
	void calculateSalary() {

		System.out.println(
				"Calculating salary: Project payment = $" + projectPayment
				);
	}
}


public class EmployeePayrollSystem {

	public static void main(String[] args) {

		FullTimeEmployee fullTime =
				new FullTimeEmployee(
						"John Doe",
						"12345",
						50000,
						10000
						);

		PartTimeEmployee partTime =
				new PartTimeEmployee(
						"Jane Smith",
						"67890",
						20,
						15
						);

		Freelancer freelancer =
				new Freelancer(
						"Alice Johnson",
						"54321",
						5000
						);


		System.out.println("Full-Time Employee:");

		fullTime.calculateSalary();
		fullTime.applyLeave();
		fullTime.getDetails();


		System.out.println();


		System.out.println("Part-Time Employee:");

		partTime.calculateSalary();
		partTime.applyLeave();
		partTime.getDetails();


		System.out.println();


		System.out.println("Freelancer:");

		freelancer.calculateSalary();
		freelancer.applyLeave();
		freelancer.getDetails();
	}
}