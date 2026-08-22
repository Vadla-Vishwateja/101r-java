package com.task9;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		do {
				System.out.println("Enter User Name : ");
				String usr=sc.nextLine(); 
				System.out.println("Enter Password : ");
				String pass=sc.nextLine();
				count++;
				if(usr.equals("admin@123") && pass.equals("admin123")) {
					System.out.println("Login Successful");
				}else {
					System.out.println("Invalid Credentials");
					System.out.println("Attempts Left  : "+(3-count)+"\n");
				}
			}while(count<3);
		if(count>=3) {
			System.out.println("Attempts Completed try again tommorrow");
		}
		sc.close();
	}
}

