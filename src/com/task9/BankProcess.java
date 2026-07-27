package com.task9;
import java.util.Scanner;
public class BankProcess {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name : ");
		String n=sc.nextLine();
		System.out.print("Enter your address : ");
		String a=sc.nextLine();
		System.out.print("Enter your phone number : ");
		long pno=sc.nextLong();
		System.out.print("Enter your initial deposit balance  : ");
		double bal=sc.nextDouble();
		
		BankApplication b1=new BankApplication(n,a,pno,bal);
		int c;
		do {
			System.out.println("\n**** Select an Option from Below ****\n");
			System.out.println("1. Withdraw ");
			System.out.println("2. Deposit ");
			System.out.println("3. show Balance");
			System.out.println("4. Exit \n");
			
			System.out.print("Enter your option [1-4] : ");
			c=sc.nextInt();
			
			if(c==1) {
				System.out.print("\nEnter your withdrawal amount : ");
				double amt=sc.nextDouble();
				b1.withdraw(amt);
			}else if(c==2) {
				System.out.print("\nEnter your deposit amount : ");
				double amt=sc.nextDouble();
				b1.deposit(amt);
			}else if(c==3) {
				b1.showBalance();
			}else if(c==4) {
				System.out.println("\nThank You .");
			}else {
				System.out.println("\nInvalid option");
			}
		}while(c!=4);
		sc.close();
	}

}
