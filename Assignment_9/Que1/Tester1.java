import java.util.Scanner;

public class Tester1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ReverseString s1=new ReverseString();
		System.out.println("Enter String");
		String s=sc.next();
		s1.checkrev(s);
		

	}

}
