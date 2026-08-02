package com.app;
import com.calculator.*;

public class Calcu {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		
		System.out.println("Addition : "+c.add(10, 20));
		System.out.println("Subtraction : "+c.sub(20, 10));
		System.out.println("Multiplication : "+c.mul(10, 20));
		System.out.println("Division : "+c.div(20, 10));
	}

}
