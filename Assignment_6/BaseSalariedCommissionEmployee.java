import java.util.Scanner;

public class BaseSalariedCommissionEmployee extends CommissionEmployee {
	double base_salary;
	
	

	public BaseSalariedCommissionEmployee() {
		super();
		
	}

	public BaseSalariedCommissionEmployee(String firstNmae, String lastName,  double grossSale,
			double commissionRate,double baseSalary) {
		super(firstNmae, lastName, grossSale, commissionRate);
		this.base_salary=baseSalary;
	}

	@Override
	public double payRoll() {
		
		return super.payRoll()+this.baseSalary();
		
		

	}
	
	double baseSalary() {
		return base_salary*1.1;
	}

	@Override
	void accept() {
		Scanner sc = new Scanner(System.in);
		super.accept();
		System.out.println("Enter Base Salry - ");
		base_salary = sc.nextDouble();
	}
	
	
	@Override
	void display() {
		super.display();
		System.out.println("Base salary -" +base_salary);
		System.out.println("Base Salary + commission - "+this.payRoll());
	}

	@Override
	public String toString() {
		return "BaseSalariedCommissionEmployee [base_salary=" + base_salary + ", grossSale=" + grossSale
				+ ", commissionRate=" + commissionRate + ", firstNmae=" + firstNmae + ", lastName=" + lastName
				+ ", SSN=" + SSN + "]";
	}
	
	
}
