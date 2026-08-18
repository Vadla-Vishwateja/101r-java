package com.task9;

public class Employee {
		private String empName;
		private String desg;
		private int empNo;
		private double salary;
		public Employee(String empName, String desg, int empNo, double salary) {
			this.empName = empName;
			this.desg = desg;
			this.empNo = empNo;
			this.salary = salary;
		}
		public String getEmpName() {
			return empName;
		}
		public String getDesg() {
			return desg;
		}
		public int getEmpNo() {
			return empNo;
		}
		public double getSalary() {
			return salary;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public void setDesg(String desg) {
			this.desg = desg;
		}
		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		
}
