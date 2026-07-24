package com.newtask;

public class BankAccount {
	public int accountNumber;
	public String accountHolder;
	public double balance;
	
	BankAccount(int accountNumber,String accountHolder,double balance){
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Balance After Deposit: "+getBalance());
	}
	public void withdraw(double amount) {
		if((balance>=amount) && (amount>0)) {
			balance=balance-amount;
			System.out.println("Withdraw Successful .");

			System.out.println("Balance after Transation : "+getBalance());
		}else {
			System.out.println("Insufficient Balance .");
		}
	}

}
