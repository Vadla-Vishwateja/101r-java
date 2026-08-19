package com.methodOverriding;

class Shape1 {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape1 {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape1 {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class Shape {
    public static void main(String[] args) {

        Shape1 s;

        s = new Circle();
        s.draw();

        s = new Square();
        s.draw();
    }
}