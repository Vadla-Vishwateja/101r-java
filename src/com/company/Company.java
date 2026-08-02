package com.company;
import com.employee.*;

public class Company {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		
		e.employeeId=10;
		e.employeeName="Teja";
		e.salary=30000;
		
		e.displayEmployee();

	}

}
