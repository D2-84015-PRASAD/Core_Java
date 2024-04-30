package com.entities;

import java.util.Scanner;

import custom.exception.ExceptionLineToolLong;

public class StringCheker {
	String string;
	int length;

	public void calculateStringLength() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String -");
		string = sc.nextLine();
		length = string.length();
		if (length > 80) {
			throw new ExceptionLineToolLong("The String is too long");
		} else {
			System.out.println("String Length- " + length);
		}
	}

}
