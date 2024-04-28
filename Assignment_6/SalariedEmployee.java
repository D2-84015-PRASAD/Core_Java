import java.util.Scanner;

public class SalariedEmployee extends Employee {
	double weeklySalary;
	
	@Override
	public double payRoll() {
		
		return weeklySalary;
	}
	
	
	
	public SalariedEmployee() {
		super();
		
	}



	public SalariedEmployee(String firstNmae, String lastName, double weeklySalary) {
		super(firstNmae, lastName);
		this.weeklySalary=weeklySalary;
	}



	@Override
	void accept() {
		super.accept();
		Scanner sc=new Scanner(System.in);
		System.out.println("Emter Weekly Salary - ");
		weeklySalary=sc.nextDouble();
		
	}
	
	@Override
	void display() {
		super.display();
		System.out.println("WeeklySalary - "+weeklySalary);
	}

	@Override
	public String toString() {
		return "SalariedEmployee [weeklySalary=" + weeklySalary + ", firstNmae=" + firstNmae + ", lastName=" + lastName
				+ ", SSN=" + SSN + "]";
	}
	

}
