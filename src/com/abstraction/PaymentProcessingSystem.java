package com.abstraction;


abstract class Payment {

	
	abstract void processPayment();

	abstract void validateTransaction();

	
	void generateTransactionId() {
		long transactionId = (long) (Math.random() * 900000000) + 100000000;
		System.out.println("Generated transaction ID: " + transactionId);
	}
}


class CreditCardPayment extends Payment {

	String cardNumber;
	String expiryDate;
	String cvv;

	CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	}

	@Override
	void processPayment() {
		System.out.println("Processing credit card payment.");
	}

	@Override
	void validateTransaction() {
		System.out.println("Validating card number, expiry, and CVV.");
	}
}


class UPIPayment extends Payment {

	String upiId;
	String phoneNumber;

	UPIPayment(String upiId, String phoneNumber) {
		this.upiId = upiId;
		this.phoneNumber = phoneNumber;
	}

	@Override
	void processPayment() {
		System.out.println("Processing UPI payment.");
	}

	@Override
	void validateTransaction() {
		System.out.println("Validating UPI ID and phone number.");
	}
}


class PayPalPayment extends Payment {

	String email;
	String authToken;

	PayPalPayment(String email, String authToken) {
		this.email = email;
		this.authToken = authToken;
	}

	@Override
	void processPayment() {
		System.out.println("Processing PayPal payment.");
	}

	@Override
	void validateTransaction() {
		System.out.println("Validating email and authentication token.");
	}
}


public class PaymentProcessingSystem {

	public static void main(String[] args) {

		CreditCardPayment ccp =
				new CreditCardPayment("1234567890123456", "12/25", "123");

		UPIPayment upi =
				new UPIPayment("user@upi", "1234567890");

		PayPalPayment paypal =
				new PayPalPayment("user@example.com", "abc123");


		System.out.println("Credit Card Payment:");
		ccp.processPayment();
		ccp.validateTransaction();
		ccp.generateTransactionId();


		System.out.println();


		System.out.println("UPI Payment:");
		upi.processPayment();
		upi.validateTransaction();
		upi.generateTransactionId();


		System.out.println();


		System.out.println("PayPal Payment:");
		paypal.processPayment();
		paypal.validateTransaction();
		paypal.generateTransactionId();
	}
}