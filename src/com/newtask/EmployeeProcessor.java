package com.newtask;

public class EmployeeProcessor {

	public static void main(String[] args) {
		Employee e1=new Employee(1001,"Vishwateja","Software Developer",50000,4);
		
		System.out.println("Employee details before Promotion : ");
		System.out.println("Employee ID : "+e1.getEmpid());
		System.out.println("Employee Name : "+e1.getName());
		System.out.println("Designation : "+e1.getDesignation());
		System.out.println("Salary : " +e1.getSalary());
		System.out.println("Performance : "+e1.getPerformanceRating());
		
		String des="Senior Software Developer .";
		e1.promoteEmployee(des);
		if(e1.getPerformanceRating()>=4) {
			System.out.println("After Promotion ");
			System.out.println("New Designation :" +e1.getDesignation());
			System.out.println("New salary :"+e1.getSalary());
		}else {

			System.out.println("Designation :" +e1.getDesignation());
			System.out.println("salary :"+e1.getSalary());
		}

	}

}
