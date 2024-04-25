package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestpointArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter size of points");
		Point2D[] points=new Point2D[sc.nextInt()]; // ref 
		for(int i=0;i<points.length;i++) {
			System.out.println("Enter xpoint and yPoint");
			points[i]=new Point2D(sc.nextInt(),sc.nextInt());
		}
		
		
		int choice;	

	do {
		System.out.println("Enter choices ");
		System.out.println("1 : Display details of a specific point");
		System.out.println("2 : Display x, y co-ordinates of all points");
		System.out.println("3 : User i/p : 2 indices for the points , validate the indice");
		System.out.println("4 : Exit");
	//	Scanner sc=new Scanner(System.in);
	     choice=sc.nextInt();
		
		switch(choice) {
		
		case 1 :
			
			System.out.println("Enter index to Search");
			int index=sc.nextInt();
			
			if(index>points.length)
			{
				System.out.println("ArrayOutofBound");
			}
			else {
				System.out.println(points[index].getDetails());
			}
			
			break;
			
		case 2 :
			
			for(Point2D point:points) {
				System.out.println(point.getDetails());
				//point.displayPoints();
			}
			
			break;
			
		case 3 :
			System.out.println("Enter First Index");
			int index1=sc.nextInt();
			System.out.println("Enter Second Index");
			int index2=sc.nextInt();
			
			if(index1<points.length && index2<points.length) {
				if(points[index1].isEqual(points[index2])==true) {
					System.out.println("Coordinates are same");}
					else {
						
						System.out.println("Distance=2"+points[index1].calculateDistance(points[index2]));
					}
			
				
				
			}
			
			break;
			
		case 4 :
			System.out.println("Than you !!");
			break ;
			
		}}while(choice!=0);
}
	


}
