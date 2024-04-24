import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1=0,d2=0,avg;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first no.");
		if(sc.hasNextDouble())
		{
			d1=sc.nextDouble();
				
		}
		else {
			System.out.println("Error:Entered value not double");
			System.exit(11);
		}
		System.out.println("Enter second no.");
		if(sc.hasNextDouble()) {
			d2=sc.nextDouble();
		}
		else {
			System.out.println("Error:Entered value not double");
			System.exit(1);
		}
		
		avg=(d1+d2)/2;
		System.out.println("Avg ="+avg);
		
	}


}
