package com.assignment;
import java.util.Scanner;
public class StudentResultProcess {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student Name : ");
		String name = sc.nextLine();

		System.out.print("Enter Student ID : ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Course Name : ");
		String course = sc.nextLine();

		System.out.print("Enter First Subject Marks : ");
		double marks = sc.nextDouble();

		StudentResult student = new StudentResult(name, id, course, marks);

		int choice;

		do {
			System.out.println("\n===== Student Result Menu =====");
			System.out.println("1. Add More Subject Marks");
			System.out.println("2. Calculate Grade");
			System.out.println("3. View Total Marks");
			System.out.println("4. Exit");
			System.out.print("Enter Your Choice : ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter Subject Marks : ");
				double newMarks = sc.nextDouble();
				student.addMarks(newMarks);
				break;

			case 2:
				student.calculateGrade();
				break;

			case 3:
				student.viewTotalMarks();
				break;

			case 4:
				System.out.println("Thank You! Result Processing Completed.");
				break;

			default:
				System.out.println("Invalid option");
			}

		} while (choice != 4);

		sc.close();
	}
}