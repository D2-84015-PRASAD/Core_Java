import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int total_miles;
		System.out.println("Enter Total Miles per day");
		total_miles=sc.nextInt();
		
		double cost_galon;
		System.out.println("Enter Cost per gallon");
		cost_galon=sc.nextDouble();
		
		double avg;
		System.out.println("Enter Average miles per gallon");
		avg=sc.nextDouble();
		
		int parking_fees;
		System.out.println("Enter Parking Fees");
		parking_fees=sc.nextInt();
		
		int toll;
		System.out.println("Enter toll ");
		toll=sc.nextInt();
		
		double avgmiles=(total_miles/avg)*cost_galon;
		
		double driving_work=avgmiles+parking_fees+toll;
		
		System.out.println("User cost per day of driving work = "+driving_work);
		
		

	}

}
