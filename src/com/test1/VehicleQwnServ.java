package com.test1;
import java.util.Scanner;
class Vehicle {
	String ownerName;
	String vehicleNumber;
	String vehicleType;
	public Vehicle(String ownerName, String vehicleNumber, String vehicleType) {
		this.ownerName = ownerName;
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
	}
	public void displayParentData() {
		System.out.println("Vehicle Owenwer Name : " + ownerName);
		System.out.println("Vehicle Vehicle Number : " + vehicleNumber);
		System.out.println("Vehicle Vehicle Type  : " + vehicleType);
	}
}
class ServiceVehicle extends Vehicle{
	String serviceCenterName;
	String serviceCategory;
	public ServiceVehicle(String ownerName, String vehicleNumber, String vehicleType, String serviceCenterName,
			String serviceCategory) {
		super(ownerName, vehicleNumber, vehicleType);
		this.serviceCenterName = serviceCenterName;
		this.serviceCategory = serviceCategory;
		System.out.println("vehicle profile has been created");
	}

	public void updatedServiceCategory(String category) {
		if (category == null && category.equals("")) {
			System.out.println("invalid category details.....");
		} else {
			this.serviceCategory = category;
			System.out.println("servce category upadted successfully");
		}

	}

	public void updatedServiceCenterName(String centerName) {
		if (centerName == null && centerName.equals("")) {
			System.out.println("invalid category details.....");
		} else {
			this.serviceCenterName = centerName;
			System.out.println("Service Center name Updated Successfully..");
		}
	}

	public void profileDetails() {
		displayParentData();
		System.out.println("Servce Center Name : " + serviceCenterName);
		System.out.println("Service Category Name : " + serviceCategory);
	}
	
	

}







public class VehicleQwnServ {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Owner Name : ");
		String ownerName=s.nextLine();
		System.out.print("Enter Vehicle Number : ");
		String vechileNumber=s.nextLine();
		System.out.print("Enter Vehicle Type : ");
		String vehicleType=s.nextLine();
		System.out.print("Enter Service Center Name : ");
		String serCenter=s.nextLine();
		System.out.print("Enter Service Category : ");
		String SerCat=s.nextLine();
		
		ServiceVehicle v=new ServiceVehicle(ownerName, vechileNumber, vehicleType, serCenter, SerCat);
		
		int choice = 0;
		boolean status = true;

		while (status) {

			System.out.println("Provide a menu to perform the following operations:\r\n" + 
					"1.Update Service Category\r\n"+ 
					"2. Update Service Center Name\r\n" + 
					"3. View Vehicle Profile Details\r\n" + 
					"4. Exit the program\r\n"+ " ");
			choice = s.nextInt();
			s.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter updated Service category : ");
				String categorys = s.nextLine();
				v.updatedServiceCategory(categorys);
				break;
			case 2:
				System.out.println("Enter updated Service Center Name : ");
				String cName = s.nextLine();
				v.updatedServiceCenterName(cName);
				break;
			case 3:
				v.profileDetails();
				break;
			case 4:
				System.out.println("Thank You !");
				status=false;
				break;

			default:System.out.println("Invalid Options selected....");
				break;
			}

		}
		s.close();
	}

}
