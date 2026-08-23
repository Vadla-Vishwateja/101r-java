package com.metOverloading;

public class Employee {
    public void display(String name) {
        System.out.println("Name: " + name);
    }

    public void display(String name, double salary) {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + (int)salary);
    }

    public void display(String name, double salary, String department) {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + (int)salary);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.display("Vinay", 80000, "IT");
    }
}