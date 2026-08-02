package com.student;

public class Student {
	public int id;
	public String name;
	public String course;
	
	public void setDetails(int i,String n,String c) {
		id=i;
		name=n;
		course=c;
	}
	
	public void displayDetails() {
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Course : "+course);
		
	}
}
