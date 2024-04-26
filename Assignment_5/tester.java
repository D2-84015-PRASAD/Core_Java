package com.app.friuts;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int n = 0;
		int choice;

		System.out.println("Enter Quantity of Fruits");
		n = sc.nextInt();
		Fruits[] basket = new Fruits[n];

		do {
			System.out.println("1 : Add Mango");
			System.out.println("2 : Add Orange");
			System.out.println("3 : Add Apple");
			System.out.println("4 : Display All Fruits");
			System.out.println("5 : Display all Fresh Fruits");
			System.out.println("6 : Mark Fruit as Stale");
			System.out.println("7 :Display stale fruits");
			System.out.println("8 :Mark all sour fruits stale");
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				if (counter < n) {

					basket[counter] = new Mango("Mango", "Yellow", 120.2, true);

					counter++;
				} else {
					System.out.println("Basket is Full");
				}
				break;

			case 2:
				if (counter < n) {
					basket[counter] = new Orange("Orange", "orange", 105.2, true);

					counter++;
				} else {
					System.out.println("Basket is Full");
				}
				break;

			case 3:
				if (counter < n) {
					basket[counter] = new Apple("Apple", "Red", 100.2, true);

				} else {
					System.out.println("Basket is Full");
				}
				break;

			case 4:
				for (Fruits fruit : basket) {
					if (fruit != null) {
						System.out.println(fruit.getName());

					} else {
						System.out.println("Basket is still empty");
					}
				}
				break;

			case 5:
				for (Fruits fruit : basket) {
					if (fruit != null) {
						if (fruit.isFresh == true) {
							System.out.println(fruit.toString());
							System.out.println(fruit.taste());
							System.out.println(fruit.isFresh());
						}
					}
				}
				break;

			case 6:
				
					System.out.println("Enter Index to Search");
					int index = sc.nextInt();
					if(index<n) {
					basket[index].setFresh(false);
					System.out.println(basket[index]);
				} else {
					System.out.println("Invalid index");
				}
				break;

			case 7:
				for (Fruits fruit : basket) {
					if (fruit != null)
						if (fruit.isFresh == false) {
							System.out.println(fruit.taste());
						}
				}
				break;

			case 8:
				for (Fruits fruit : basket) {
					if (fruit != null)
					if (fruit.taste() == "sour") {
						fruit.setFresh(false);

					}
				}
				break;

			}

		} while (choice != 0);

	}

}
