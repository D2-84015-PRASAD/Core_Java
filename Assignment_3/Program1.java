import java.util.Scanner;

class Invoice {
	 Scanner sc=new Scanner(System.in);
	 String partno;
	 String partname;
	 int quant;
	 double price_per_item;
	 
	public Invoice() {
		
	}

	public Invoice(String partno, String partname, int quant, double price_per_item) {
		super();
		this.partno = partno;
		this.partname = partname;
		this.quant = quant;
		this.price_per_item = price_per_item;
	}

	public String getPartno() {
		return partno;
	}

	public void setPartno(String partno) {
		this.partno = partno;
	}

	public String getPartname() {
		return partname;
	}

	public void setPartname(String partname) {
		this.partname = partname;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public double getPrice_per_item() {
		return price_per_item;
	}

	public void setPrice_per_item(double price_per_item) {
		this.price_per_item = price_per_item;
	}
	
	void checkForPositive() {
		if(quant<0) {
			setQuant(0);
		}
		if(price_per_item<0) {
			setPrice_per_item(0.0);
		}
	}
	
	void calculate() {
		checkForPositive();
		double total=getQuant()*getPrice_per_item();
		System.out.println("Total="+total);
	}
	
	
	 
	 
	 
	
}




public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice i1=new Invoice("zzzz123","engine",-5,2000);
		i1.calculate();
		

	}

}
