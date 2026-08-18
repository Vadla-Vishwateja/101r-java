package com.inheritance;



class Vehicle1{
	String make;
	String model;
	int year;
	public Vehicle1(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public void displayInfo() {
		System.out.println("Vehicle Made By : "+make);
		System.out.println("Model : "+model);
		System.out.println("Year : "+year);
	}
}

class Car1 extends Vehicle1{
	int numberOfDoors;

	public Car1(String make, String model, int year, int numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors = numberOfDoors;
	}
	
	public void displayCarInfo() {
		super.displayInfo();
		System.out.println("Number of Doors :"+numberOfDoors+"\n\n");
	}
}

class Truck extends Vehicle1{
	int cargoCapacity;

	public Truck(String make, String model, int year, int cargoCapacity) {
		super(make, model, year);
		this.cargoCapacity = cargoCapacity;
	}
	
	public void displayTruckInfo() {
		super.displayInfo();
		System.out.println("Cargo Capacity : "+cargoCapacity+"\n\n");
	}
}

class MotorCycle extends Vehicle1{
	boolean hasSideCar;

	public MotorCycle(String make, String model, int year, boolean hasSideCar) {
		super(make, model, year);
		this.hasSideCar = hasSideCar;
	}
	
	public void displayMotorCycleInfo() {
		super.displayInfo();
		System.out.println("Has Side Car : "+hasSideCar+"\n\n");
	}
}

public class HierarchyExample1 {

	public static void main(String[] args) {
		Car1 c=new Car1("BMW","M4",2025,4);
		c.displayCarInfo();
		
		Truck t=new Truck("Tata","Q12",2000,200);
		t.displayTruckInfo();
		
		Vehicle1 m=new MotorCycle("RE","GT-650",2022,false);
		
		((MotorCycle)m).displayMotorCycleInfo();
	}

}
