package InheritanceTest;

class Employee{
	String name;
	double baseSalary;
	public Employee(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	public double calculateAnnualSalary() {
		double anlSal=baseSalary*12;
		return anlSal;		
	}
	
	public void displayInfo() {
		System.out.println("Name : "+name);
		System.out.println("Base Salary : "+baseSalary);
	}
}


class Manager extends Employee{
	double bonus;
	int numberOfEmployeesManaged;
	public Manager(String name, double baseSalary, double bonus, int numberOfEmployeesManaged) {
		super(name, baseSalary);
		this.bonus = bonus;
		this.numberOfEmployeesManaged = numberOfEmployeesManaged;
	}
	
	public double calculateManagerSalary() {
		double manSal=bonus+calculateAnnualSalary();
		return manSal;
	}	
}

class Engineer extends Employee{
	int projectCount;

	public Engineer(String name, double baseSalary, int projectCount) {
		super(name, baseSalary);
		this.projectCount = projectCount;
	}
	public double calculateEngineerSalary() {  // annual salary + Bonus(based on projects done)
		double engSal;
		if(projectCount >=10) {
			engSal=calculateAnnualSalary()+(0.3*calculateAnnualSalary());					
		}else if(projectCount >=7) {
			engSal=calculateAnnualSalary()+(0.2*calculateAnnualSalary());					
		}else if(projectCount >=4) {
			engSal=calculateAnnualSalary()+(0.1*calculateAnnualSalary());					
		}else {
			engSal=calculateAnnualSalary();
		}
		return engSal;
	}
}

class Salesperson extends Employee{
	double commissionRate ;
	double totalSales;
	public Salesperson(String name, double baseSalary, double commissionRate, double totalSales) {
		super(name, baseSalary);
		this.commissionRate = commissionRate;
		this.totalSales = totalSales;
	}
	
	public double calculateSalespersonSalary() {
		double salesSal=calculateAnnualSalary()+(totalSales*commissionRate);
		return salesSal;
	}
}


public class EmployeeHierarchy {

	public static void main(String[] args) {
			Manager m1=new Manager("Vinay",50000,10000,5);
			System.out.println("Manager Details ");
			m1.displayInfo();
			System.out.println("Annual Salart of Manager : "+m1.calculateAnnualSalary());
			
			Engineer e1=new Engineer("Teja", 30000, 6);
			System.out.println("\n\nEngineer Details ");
			e1.displayInfo();
			System.out.println("Annual Salary of Engineer : "+e1.calculateEngineerSalary());
			
			Salesperson s1=new Salesperson("Vishwa", 30000, 0.2, 20000);
			System.out.println("\n\nSalesperson details ");
			s1.displayInfo();
			System.out.println("Annual Salary of Salesperson with Commission : "+s1.calculateSalespersonSalary());
			
	}

}
