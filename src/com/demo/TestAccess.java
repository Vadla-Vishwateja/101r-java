package com.demo;

public class TestAccess {

    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();

        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();

        // obj.privateMethod(); // Not Accessible
    }
}