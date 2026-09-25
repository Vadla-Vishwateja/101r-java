package com.anonymous;

import java.util.function.Consumer;
import java.util.function.Predicate;

class Employee{
	String name;
	String desg;
	double sal;
	public Employee(String name, String desg, double sal) {
		super();
		this.name = name;
		this.desg = desg;
		this.sal = sal;
	}
	
	public void setSal(double sal) {
		this.sal = sal;
	}

	public void getDetails() {
		System.out.println("Name : "+name);
		System.out.println("Designation : "+desg);
		System.out.println("Salary : "+sal);
	}
	
	
}

public class Example2 {

	public static void main(String[] args) {
		
		Employee emp=new Employee("Teja","SE",30000);
		
		
		Predicate<Employee> p=new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
			
				return t.sal>10000;
			}		
		};
		
		if(p.test(emp)) {
			emp.getDetails();
		}
		Consumer<Employee> c=new Consumer<Employee>() {

			@Override
			public void accept(Employee t) {
				if(t.sal>10000) {
					t.setSal(t.sal+(0.1*t.sal));
					System.out.println("Salary After : "+t.sal);
				}			
			}			
		};
		c.accept(emp);

	}

}
