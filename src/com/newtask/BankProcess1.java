package com.newtask;
import java.util.Scanner;

public class BankProcess1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Bank Account Number :");
		int ano=s.nextInt();
		System.out.print("Enter Bank Account Holder Name :");
		String name=s.next();
		System.out.print("Enter Bank Account Balance :");
		double bal=s.nextDouble();
		BankAccount b1=new BankAccount(ano,name,bal);
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
