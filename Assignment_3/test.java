package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t1,t2;
		System.out.println("Enter First Point");
		t1=sc.nextInt();
		System.out.println("Enter Second Point");
		t2=sc.nextInt();
		
		Point2D p1=new Point2D(t1,t2);
		System.out.println(p1.getDetails());;
		System.out.println("Enter Point details:xPos, yPos");
		
		Point2D p2=new Point2D(sc.nextInt(),sc.nextInt());
		
		System.out.println(p1.isEqual(p2));
		
		if(p1.isEqual(p2)==true) {
			System.out.println("Coordinates are same");
		}
		else {
			System.out.println(p1.calculateDistance(p2));
		}

}
}
