package com.test1;
import java.util.Scanner;


class InsurancePolicy{
	String customerName;
	String policyType;
	double policyAmount;
	double approvedAmount;
	String policyStatus;
	
		public InsurancePolicy() {
			customerName = "Not Available";
			policyType = "Not Available";
			policyAmount = 0;
			approvedAmount = 0;
			policyStatus = "Pending";
			System.out.println("Policy Profile Created");
		}
		
		public InsurancePolicy(String customerName, String policyType) {
			this.customerName = customerName;
			this.policyType = policyType;
			this.policyAmount = 0;
			this.approvedAmount = 0;
			this.policyStatus = "Pending";
			System.out.println("Policy Profile Created");
		}	
	
	
		public InsurancePolicy(String customerName, String policyType, double policyAmount) {
			this.customerName = customerName;
			this.policyType = policyType;
			this.policyAmount = policyAmount;
			this.approvedAmount = 0;
			this.policyStatus = "pending";
		
			System.out.println("policy record has been created.");
	}
	
	
	
		public void updateApprovedAmount(double a) {
			if(a<=0 || a > policyAmount) {
				System.out.println("Invalid Amount ..");
			}else {
				this.approvedAmount=a;
				System.out.println("Approved Amount Updated Successfully");
			}
		}
		
		public void updatePolicyStatus(String s) {
			if(s.isEmpty() || s==null) {
				System.out.println("Invalid Policy Status ..");
			}else {
				this.policyStatus=s;
				System.out.println("Policy Status Updated Successfully");
			}
		}
		
		public void display() {

			System.out.println("\nPolicy Summary");
			System.out.println("Customer : " + customerName);
			System.out.println("Policy Type : " + policyType);
			System.out.println("Policy Amount : " + policyAmount);
			System.out.println("Approved Amount : " + approvedAmount);
			System.out.println("Policy Status : " + policyStatus);
		}
}








public class InsuranceMang {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Customer Name : ");
		String name=s.nextLine();
		System.out.print("Enter Policy Type : ");
		String policy=s.nextLine();
		System.out.print("Enter Policy Amount ");
		double amt=s.nextDouble();
		
		InsurancePolicy i=new InsurancePolicy(name, policy, amt);
		
		int choice;
		
		do {
			System.out.println("\n\n--- Menu ---\r\n"
					+ "1. Update Approved Amount\r\n"
					+ "2. Change Policy Status\r\n"
					+ "3. View Summary\r\n"
					+ "4. Exit\r\n"
					+ "\r\n"
					+ "Enter choice : \r\n"
					+ "");
			choice=s.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Enter Approved Amount :");
					double amt1=s.nextDouble();
					i.updateApprovedAmount(amt1);
					break;
				case 2:
					s.nextLine();
					System.out.println("Enter Policy Status :");
					String p=s.nextLine();
					i.updatePolicyStatus(p);
					break;
				case 3:
					i.display();
					break;
				case 4:
					System.out.println("Thank You ..");
					break;
			}
				
		}while(choice!=4);
		
		s.close();

	}

}
