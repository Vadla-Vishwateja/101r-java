package com.task9;

public class Manager {
	private String managerName;
	
	public Manager(String managerName) {
		this.managerName = managerName;
	}
	

	public String getManagerName() {
		return managerName;
	}


	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}


	public void  checkdetails(Employee emp) {
		System.out.println("Employee Details : ");
		System.out.println("Employee Name : "+emp.getEmpName());
		System.out.println("Employee ID : "+emp.getEmpNo());
		System.out.println("Employee Designation : "+emp.getDesg());
		System.out.println("Employee Salary : "+emp.getSalary());
		
		double s1=emp.getSalary();
		

	}

}
