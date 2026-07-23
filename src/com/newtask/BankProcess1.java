package com.newtask;
import java.util.Scanner;

public class BankProcess1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BankAccount b1=new BankAccount(1113,"Vadla Vishwateja",50000);
		System.out.println("Bank Account Details : ");
		System.out.println("Account Number : "+b1.getAccountNumber());
		System.out.println("Account Holder Name :"+b1.getAccountHolder());
		System.out.println("Balance : "+b1.getBalance());
		System.out.println("------------------------");
		System.out.println("Current Balance : "+b1.getBalance());
		System.out.print("Enter amount to Deposit : ");
		b1.deposit(s.nextDouble());
		System.out.println("-------------------------------");
		System.out.print("Enter amount to Withdraw : ");
		b1.withdraw(s.nextDouble());
		System.out.print("Enter amount to Withdraw : ");
		b1.withdraw(s.nextDouble());
	}

}
