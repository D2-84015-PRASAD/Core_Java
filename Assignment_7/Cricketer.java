package p1;

import java.nio.channels.AcceptPendingException;
import java.util.Objects;
import java.util.Scanner;

public class Cricketer extends Player implements Batter,Bowler {
	
	int runs;
	int wickets;
	
	
	public Cricketer() {
		super();
		
	}

	public Cricketer(int id,String name, int age, int matchesPlayed,int runs,int wickets) {
		super(id,name, age, matchesPlayed);
		this.runs=runs;
		this.wickets=wickets;
		
	}
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
	}
	
	public
	void acceptRuns(Scanner sc) {
		//Scanner sc=new Scanner(System.in);
		super.accept(sc);
		System.out.println("Enter Runs");
		runs=sc.nextInt();
	}
	public
	void acceptWickets(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Wickets");
		wickets=sc.nextInt();
	}
	
	
	
	

	@Override
	public String toString() {
		return "Cricketer[  id=" + id +", name=" +name+ ", age=" + age + ", matchesPlayed="
				+ matchesPlayed +" , runs"+runs+" , wickets"+wickets+"]";
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(runs, wickets);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cricketer other = (Cricketer) obj;
		return runs == other.runs && wickets == other.wickets;
	}

	@Override
	public int getWickets() {
		
		return wickets;
	}

	@Override
	public int getRuns() {
		
		return runs;
	}

}
