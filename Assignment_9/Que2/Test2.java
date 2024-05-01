import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PalindromString p1=new PalindromString();
		System.out.println("Enter String- ");
		String s=sc.next();
		p1.checkPalindrom(s);

	}

}
