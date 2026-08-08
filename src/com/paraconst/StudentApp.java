package com.paraconst;

public class StudentApp {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul", "Java Full Stack");
        Student s2 = new Student(s1);

        System.out.println("Student 1 Details");
        System.out.println("-----------------");
        s1.display();

        System.out.println("\nStudent 2 Details");
        System.out.println("-----------------");
        s2.display();
    }
}