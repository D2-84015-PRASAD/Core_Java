package p1;

import java.util.Scanner;

public abstract class Player   {
	int id;
	String name;
	int age;
	int matchesPlayed;
	
	public Player() {
		super();
	}
	
	
	public Player(int id,String  name, int age, int matchesPlayed) {
		super();
		this.id = id;
		this.name=name;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
	}
	
	public void accept(Scanner sc) {
	//	Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID -  ");
		id=sc.nextInt();
		System.out.println("Enter Name -");
		name=sc.next();
		System.out.println("Enter Age - ");
		age=sc.nextInt();
		System.out.println("Enter MatchesPlayed - ");
		matchesPlayed=sc.nextInt();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getMatchesPlayed() {
		return matchesPlayed;
	}


	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}


	
	
	
	
	

}
