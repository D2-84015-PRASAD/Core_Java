import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=0;
		int counter=0;
		int choice;
		
		System.out.println("Enter Size of Employees");
		n=sc.nextInt();		
		Employee [] arr=new Employee[n];
		
//		arr[0]=(Employee) new SalariedEmployee("p","n",1,50000);
//			arr[0].accept();
//			arr[0].display();
//			arr[0].toString();
		do {
			System.out.println("0 : Exit!");
			System.out.println("1 : PayRoll of Salaried Employee");
			System.out.println("2 : PayRoll of Hourly Employee");
			System.out.println("3 : PayRoll of Commission Employee");
			System.out.println("4 : PayRoll of Base Slaried Commission Employee");
			System.out.println("5: Dispaly All Employees");
            System.out.println("Enter Your Choice");
            choice=sc.nextInt();
			
			switch (choice) {
			case 0:
				System.out.println("Thank you!!");
				break;
				
			case 1:
				if(counter<n) {
					arr[counter]= new SalariedEmployee();
					arr[counter].accept();
					//arr[counter].display();
					counter ++;
				}else {
					System.out.println("Arr is full");
				}
				break;
				
			case 2:
				if(counter<n) {
					arr[counter]=new HourlyEmployee();
					arr[counter].accept();
				//	arr[counter].display();
					counter ++;
				}else {
					System.out.println("Array is Full");
				}
				break;
				
			case 3:
				if(counter<n) {
					arr[counter]=new CommissionEmployee();
					arr[counter].accept();
				//	arr[counter].display();
					counter ++;
				}else {
					System.out.println("Array is Full");
				}
				break;
				
			case 4:
				if(counter<n) {
					arr[counter]=new BaseSalariedCommissionEmployee();
					arr[counter].accept();
				//	arr[counter].display();
					counter ++;
				}else {
					System.out.println("Array is Full");
				}
				break;
				
			case 5 :
				for(Employee ele:arr) {
					if(ele != null)
					ele.display();
				}
				break; 
				
			
				

			default:
				break;
			}
			
			
		}while(choice!=0);
		
		

	}

}
