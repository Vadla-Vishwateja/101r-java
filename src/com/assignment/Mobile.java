package com.assignment;

public class Mobile {
	
	String brand;
	String model;
	double price;
	
	public void setMobileDetails(String brand,String model,double price) {
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	public void getDetails() {
		System.out.println("Mobile Details");
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Price : "+price);
	}

	public static void main(String[] args) {
		
		Mobile m1=new Mobile();
		m1.setMobileDetails("Samsung", "S26", 75000);
		m1.getDetails();
	}

}
