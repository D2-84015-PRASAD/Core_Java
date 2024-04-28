import java.util.Scanner;

public class HourlyEmployee extends Employee {
	double wage;
	double hrs;
	
	

	public HourlyEmployee() {
		super();
		
	}

	public HourlyEmployee(String firstNmae, String lastName,double wage,double hrs) {
		super(firstNmae, lastName);
		this.wage=wage;
		this.hrs=hrs;
		
	
	}

	@Override
	public double payRoll() {
		// TODO Auto-generated method stub
		if(hrs<=40)
		{
			 double totalalary=wage*hrs;
			 return totalalary;
			
		}
		else {
			double extraHrs=hrs-40;
			return (wage*40)+(wage*extraHrs*1.5);
		}
		

	}

	@Override
	void accept() {
		Scanner sc = new Scanner(System.in);
		super.accept();
		System.out.println("Enter Wages- ");
		wage = sc.nextDouble();
		System.out.println("Enter Hrs - ");
		hrs = sc.nextDouble();
	}

	@Override
	void display() {
          super.display();
          System.out.println("Wages -"+wage);
          System.out.println("Hrs -"+hrs);
          this.payRoll();
          System.out.println("Hourly Salary - "+this.payRoll());
	}

}
