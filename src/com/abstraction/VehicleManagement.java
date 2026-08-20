package com.abstraction;

abstract class Vehicle {


	String modelName;
	String vehicleNumber;
	String company;

 
	Vehicle(String modelName, String vehicleNumber, String company) {
		this.modelName = modelName;
		this.vehicleNumber = vehicleNumber;
		this.company = company;
	}


	abstract void startEngine();

	void fuelType() {
		System.out.println("Petrol");
	}
}


class Car extends Vehicle {

	int numberOfDoors;
	boolean hasSunroof;

	Car(String modelName, String vehicleNumber, String company,
			int numberOfDoors, boolean hasSunroof) {

		super(modelName, vehicleNumber, company);
		this.numberOfDoors = numberOfDoors;
		this.hasSunroof = hasSunroof;
	}

	@Override
	void startEngine() {
		System.out.println("Starting engine with key ignition.");
	}
}


class Bike extends Vehicle {

	boolean hasSidecar;

	Bike(String modelName, String vehicleNumber, String company,
			boolean hasSidecar) {

		super(modelName, vehicleNumber, company);
		this.hasSidecar = hasSidecar;
	}

	@Override
	void startEngine() {
		System.out.println("Starting engine with kick-start.");
	}
}


class Truck extends Vehicle {

 double cargoCapacity;

 Truck(String modelName, String vehicleNumber, String company,
       double cargoCapacity) {

     super(modelName, vehicleNumber, company);
     this.cargoCapacity = cargoCapacity;
 }

 @Override
 void startEngine() {
     System.out.println("Starting engine with heavy-load warm-up.");
 }

 @Override
 void fuelType() {
     System.out.println("Diesel");
 }
}


//Main class
public class VehicleManagement {

 public static void main(String[] args) {

     Car c = new Car(
         "Toyota Camry",
         "ABC123",
         "Toyota",
         4,
         true
     );

     Bike b = new Bike(
         "Yamaha R1",
         "XYZ789",
         "Yamaha",
         false
     );

     Truck t = new Truck(
         "Volvo FH",
         "DEF456",
         "Volvo",
         20000
     );

     System.out.println("Car:");
     c.startEngine();
     System.out.print("fuelType() : ");
     c.fuelType();

     System.out.println();

     System.out.println("Bike:");
     b.startEngine();
     System.out.print("fuelType() : ");
     b.fuelType();

     System.out.println();

     System.out.println("Truck:");
     t.startEngine();
     System.out.print("fuelType() : ");
     t.fuelType();
 }
}