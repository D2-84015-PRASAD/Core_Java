import java.util.Scanner;

public class CommissionEmployee extends Employee{
	double grossSale;
	double commissionRate;
	
	
	

	public CommissionEmployee() {
		super();
		
	}

	public CommissionEmployee(String firstNmae, String lastName, double grossSale,double commissionRate) {
		super(firstNmae, lastName);
		this.grossSale=grossSale;
		this.commissionRate=commissionRate;
	}

	@Override
	public double payRoll() {
		double totalSalary=(grossSale*commissionRate)/100;
		return totalSalary;
	}
	
	@Override
	void accept() {
		Scanner sc=new Scanner(System.in);
		super.accept();
		System.out.println("Enter Gross Sale- ");
		grossSale=sc.nextDouble();
		System.out.println("Enter CommissionRate- ");
		commissionRate=sc.nextDouble();
	}
	
	@Override
	void display() {
		super.display();
		System.out.println("Gross Sale- "+grossSale);
		System.out.println("Commission Rate- "+commissionRate);
		this.payRoll();
		System.out.println("Commission Employee Salary - "+this.payRoll());
	}

	@Override
	public String toString() {
		return "CommissionEmployee [grossSale=" + grossSale + ", commissionRate=" + commissionRate + ", firstNmae="
				+ firstNmae + ", lastName=" + lastName + ", SSN=" + SSN + "]";
	}
	
}
