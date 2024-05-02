package p1;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product []arr= {
				new Product(1,"iphone","mobile",90000),
				new Product(2,"redmi","earbud",15000),
				new Product(3,"samsung","laptop",70000),
				new Product(4,"iquuu","charger",7000),
				new Product(5,"iphone","macbook",90000),
				new Product(6,"samsung","smartwatch",21000),
				new Product(7,"werfull","washingmachine",35000),
				new Product(8,"symphoni","cooler",9000),
				new Product(9,"bmw","car",850000),
				new Product(10,"honda","bike",90000),
			
		};
		
		System.out.println("Before-----------------------------");
		for(Product element:arr) {
			System.out.println("Products -"+element);
		}
		Arrays.sort(arr);
		System.out.println("After-------------------------------");
		for(Product element:arr) {
			System.out.println("Products -"+element);
	}

	}
	}
