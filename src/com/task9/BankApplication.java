package com.task9;

public class BankApplication {
	// BLC 
	
	public String customerName;
	public String customerAddress;
	public long phoneNumber;
	public double balance;
	public BankApplication(String customerName,String customerAddress,long phoneNumber,double balance){
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
		System.out.println("\nAccount Created Successfully");
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("\nDeposit of " + amount + " successful.\n New balance: " + balance);
		}else {
			System.out.println("\nInvalid");
		}
	}
	
	public void withdraw(double amount) {
		if(balance>=amount) {
			if(amount>0) {
				balance-=amount;
				System.out.println("\nWithdraw of " + amount + " successful.\n Remaining balance: " + balance);
			}else {
				System.out.println("\nInvalid amount");
			}
		}else {
			System.out.println("\nInsufficient funds");
		}
	}
	
	public void showBalance() {
		System.out.println("\nYour  Balance is : "+balance);
	}
	
	

}
