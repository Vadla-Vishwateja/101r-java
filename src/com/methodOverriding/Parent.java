package com.methodOverriding;

class Parent1 {
    static void print() {
        System.out.println("Parent");
    }
}

class Child extends Parent1 {
    static void print() {
        System.out.println("Child");
    }
}

public class Parent {
    public static void main(String[] args) {

        Parent1 p = new Parent1();
        p.print();

        Child c = new Child();
        c.print();
    }
}