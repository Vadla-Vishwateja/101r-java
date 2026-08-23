package com.metOverloading;

public class Printer {
    public void print(int number) {
        System.out.println("Number: " + number);
    }

    public void print(String name) {
        System.out.println("Name: " + name);
    }

    public void print(int number, String name) {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(11, "Teja");
    }
}