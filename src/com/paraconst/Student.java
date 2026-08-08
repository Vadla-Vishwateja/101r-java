package com.paraconst;

public class Student {

    int studentId;
    String studentName;
    String course;

    // Parameterized Constructor
    Student(int studentId, String studentName, String course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
    }

    // Copy Constructor
    Student(Student s) {
        this.studentId = s.studentId;
        this.studentName = s.studentName;
        this.course = s.course;
    }

    void display() {
        System.out.println("ID      : " + studentId);
        System.out.println("Name    : " + studentName);
        System.out.println("Course  : " + course);
    }
}