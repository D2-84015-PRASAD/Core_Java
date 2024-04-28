import java.util.Scanner;

public abstract class Employee {
	String firstNmae;
	String lastName;
	int SSN;
	static int auto_SSN=0;
	
	

	public Employee() {
		super();
		SSN=++auto_SSN;
	}

	public Employee(String firstNmae, String lastName) {
		super();
		this.firstNmae = firstNmae;
		this.lastName = lastName;
		this.SSN = ++auto_SSN;
	}

	public abstract double payRoll();
	
	void accept() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter FirstName - ");
		firstNmae=sc.next();
		System.out.println("Enter LastName - ");
		lastName=sc.next();
		//System.out.println("Enter SSN - " );
		//SSN=sc.nextInt();
	
	}
	
	void display() {
		System.out.println("FirstName-"+firstNmae);
		System.out.println("LastName-"+lastName);
		System.out.println("SSN-"+SSN);
	}

	@Override
	public String toString() {
		return "Employee [firstNmae=" + firstNmae + ", lastName=" + lastName + ", SSN=" + SSN + "]";
	}
	
	
}
