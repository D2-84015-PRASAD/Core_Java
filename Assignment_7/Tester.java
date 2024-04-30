package p2;

import java.util.Scanner;

import p1.Cricketer;
import p1.Player;

public class Tester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int counter=0;
		int choice;
		int n=0;
		System.out.println("Enter No. of Players -");
		n=sc.nextInt();
		
		Player[] team=new Cricketer[n]; //upcasting
		
		do {
			System.out.println("0: Exit!");
			System.out.println("1: Add Batsman");
			System.out.println("2: Add Bowler");
			System.out.println("3: Total Runs of Batsman");
			System.out.println("4: Total wickets of Bowler");
			System.out.println("5: Display Total Matches Played");
			System.out.println("5: Display All Cricketers");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			switch (choice) {
			case 0:
				System.out.println("Thank you!!");
				break;
				
			case 1:
				if(counter<n) {
					team[counter]=new Cricketer();
				//	team[counter].accept(sc);
			
					
					
						Cricketer c=team[counter];
						c.acceptRuns(sc);
						
					}
					counter++;
				}else {
					System.out.println("Team is Full");
				}
				break;
				
			case 2:
				if(counter<n) {
					team[counter]=new Cricketer();
					//team[counter].accept(sc);
					if(team[counter] instanceof Cricketer) {
						Cricketer c=(Cricketer)team[counter];
						c.acceptWickets(sc);
					}
					counter++;
				}else {
					System.out.println("Team is Full");
				}
				break;
				
			case 3:
				
				int totalruns=0;
				
				for(int i=0;i<team.length;i++) {
					if(team[i]!=null) {
						Cricketer c=(Cricketer)team[i];
						totalruns+=c.getRuns();
					}
				}
				System.out.println("Total Runs="+totalruns);
				
				break;
				
			case 4:
				
				int totalwickets=0;
				
				for(int i=0;i<team.length;i++) {
					if(team[i]!=null) {
						Cricketer c=(Cricketer)team[i];
						totalwickets+=c.getWickets();
					}
				}
				System.out.println("Total Wickets= "+totalwickets);
				
				break;
				
			case 5:
				int totalMatches=0;
				
				for(int i=0;i<team.length;i++) {
					if(team[i]!=null) {
						Cricketer c=(Cricketer)team[i];
						totalMatches+=c.getMatchesPlayed();
					}
				}
				System.out.println("Total Matches Played= "+totalMatches);
				break;
				
			case 6:
				for(int i=0;i<team.length;i++) {
					if(team[i]!=null) {
						Cricketer c=(Cricketer)team[i];
						System.out.println(c); 
					}
				}
				break;
				
				
				
				

			default:
				break;
			}
		}while(choice!=0);
		

	}

}
