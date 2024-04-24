import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		
		int quant1=0,quant2=0,quant3=0,choice;
		int totalbill=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println(" Enter your choice and Select from Menu");
			System.out.println("0 : Exit");
			System.out.println("1 : Samosa");
			System.out.println("2 : Dosa");
			System.out.println("3 : Idli");
			System.out.println("4 : Generate Bill");
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 0 :
				System.out.println("Thank you!");
				break;
				
			case 1 :
				System.out.println("Enter Quantity");
				quant1=sc.nextInt();
				int bill1=quant1*10;
				totalbill+=bill1;
				break;
				
			case 2 :
				System.out.println("Enter Quantity");
				quant2=sc.nextInt();
				int bill2=quant2*15;
				totalbill+=bill2;
				break;
				
			case 3 :
				System.out.println("Enter Quantity");
				quant3=sc.nextInt();
				int bill3=quant3*20;
				totalbill+=bill3;
				break;
				
			case 4 :
				System.out.println("Totalbill = "+totalbill);
				System.exit(1);
				break;
				
			default :
			
			}
			
			
		}while(choice!=0);

	}
}






