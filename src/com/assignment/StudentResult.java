package com.assignment;


public class StudentResult {

	private String studentName;
	private int studentId;
	private String courseName;
	private double totalMarks;

	public StudentResult(String studentName, int studentId, String courseName, double totalMarks) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.courseName = courseName;
		this.totalMarks = totalMarks;
		System.out.println("Student Record Created Successfully");
	}

	public void addMarks(double marks) {
		if (marks <= 0) {
			System.out.println("Invalid marks entered");
		} else {
			totalMarks += marks;
			System.out.println("Marks added successfully.");
			System.out.println("Updated Total Marks : " + totalMarks);
		}
	}

	public void calculateGrade() {
		if (totalMarks <= 0) {
			System.out.println("No marks available to calculate grade");
			return;
		}

		System.out.println("Total Marks : " + totalMarks);

		if (totalMarks >= 90) {
			System.out.println("Grade : A");
		} else if (totalMarks >= 80) {
			System.out.println("Grade : B");
		} else if (totalMarks >= 70) {
			System.out.println("Grade : C");
		} else if (totalMarks >= 60) {
			System.out.println("Grade : D");
		} else {
			System.out.println("Grade : Fail");
		}
	}

	public void viewTotalMarks() {
		System.out.println("Total Marks : " + totalMarks);
	}
}