package com.assignment;

public class Student {
	int studentId;
	String studentName;
	String course;
	
	public void setDetails(int studentId,String studentName,String course) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.course=course;
	}
	public void  displayDetails() {
		System.out.println("Student Details : ");
		System.out.println("Student name : "+studentName);
		System.out.println("Student Id : "+studentId);
		System.out.println("Course : "+course);
	}

	public static void main(String[] args) {
		
		Student st=new Student();
		st.setDetails(101, "Vishwateja", "Java");
		st.displayDetails();

	}

}
