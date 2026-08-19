package com.methodOverriding;

class Person1 {
    protected void display() {
        System.out.println("I am a person");
    }
}

class Student extends Person1 {
    @Override
    public void display() {
        System.out.println("I am a student");
    }
}

public class Person {
    public static void main(String[] args) {

        Student s = new Student();
        s.display();
    }
}