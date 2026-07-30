package com.inheritance;

public class Laptop extends Computer{
	public void showModel(){
		System.out.println("Model: XPS 15");
	}
	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.showBrand();
		l.showModel();
	}

}
