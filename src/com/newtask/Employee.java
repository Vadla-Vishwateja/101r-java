package com.newtask;

public class Employee {
	public int empid;
	public String name;
	public String designation;
	public double salary;
	public int performanceRating;
	Employee(int empid,String name,String designation,double salary,int performanceRating){
		this.empid=empid;
		this.designation=designation;
		this.name=name;
		this.salary=salary;
		this.performanceRating=performanceRating;
	}
	public int getEmpid() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public double getSalary() {
		return salary;
	}
	public int getPerformanceRating() {
		return performanceRating;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void promoteEmployee(String designation) {
		if(performanceRating >=4) {
			double n=salary+(salary*.2);
			setSalary(n);
			setDesignation(designation);
		}	
	}
}
