import java.util.Scanner;

public class CreditCalculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int acc;
		System.out.println("Enter Account No.");
		acc=sc.nextInt();
		int pending_bal;
		System.out.println("Enter Pending Balance");
		pending_bal=sc.nextInt();
		int charged_items;
		System.out.println("Enter Charged Items by customers by this months");
		charged_items=sc.nextInt();
		int credits;
		System.out.println("Enter Credits");
		credits=sc.nextInt();
		int credit_limit;
		System.out.println("Enter Credit_limit");
		credit_limit=sc.nextInt();
		
		int calc_new_bal=(pending_bal+charged_items)-credits;
		if(calc_new_bal<credit_limit) {
			System.out.println("New balance for Next Month ="+calc_new_bal);
			}
		else {
			System.out.println("Limit is exceeds!!!!");
		}
		
	}

}
