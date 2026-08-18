package com.problemSolving;
import java.util.Scanner;

class Plane{
	public void fly() {
		
	};
}

class CargoPlane extends Plane{
	public void fly() {
		System.out.println("\nCargo Plane is flying at low heights.\n\n");
	}
}

class PassengerPlane extends Plane{
	public void fly() {
		System.out.println("\nPassenger Plane is flying at medium heights.\n\n");
	}
}

class FighterPlane extends Plane{
	public void fly() {
		System.out.println("\nFighter Plane is flying at great heights.\n\n");
	}
}

public class PlaneFlying {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		CargoPlane c=new CargoPlane();
		PassengerPlane p=new PassengerPlane();
		FighterPlane f=new FighterPlane();
		int ch=0;
		while(ch!=4) {
			System.out.println("Choose the Specific Plane ..");
			System.out.println("1.Cargo Plane ");
			System.out.println("2.Passenger Plane ");
			System.out.println("3.Fighter Plane ");
			System.out.println("4.Exit    ");
			
			ch=s.nextInt();
			switch(ch) {
			case 1:
				c.fly();
				break;		
			case 2:
				p.fly();
				break;
			case 3:
				f.fly();
				break;
			case 4:
				System.out.println("thank you ..");
			default:
				System.out.println("Enter Valid Choice ");
		}	
		}
	}

}
