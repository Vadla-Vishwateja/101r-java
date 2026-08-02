package com.newtask;

public class BankProcessor {

	public static void main(String[] args) {
		BankAccount b1=new BankAccount(1113,"Vadla Vishwateja",50000);
		System.out.println("Bank Account Details : ");
		System.out.println("Account Number : "+b1.getAccountNumber());
		System.out.println("Account Holder Name :"+b1.getAccountHolder());
		System.out.println("Balance : "+b1.getBalance());
		System.out.println("------------------------");
		System.out.println("Current Balance : "+b1.getBalance());
		b1.deposit(6000);
		System.out.println("-------------------------------");
		b1.withdraw(30000);
		b1.withdraw(27000);
	}

}
