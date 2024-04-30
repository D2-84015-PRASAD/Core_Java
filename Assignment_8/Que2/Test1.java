package com.tester;

import java.util.Scanner;

import com.entities.Circle;

import custom.exception.ExceptionNegativeNumber;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c1 = new Circle();
		try {

			// System.out.println("Enter Diameter -");
			// c1.setDiameter(sc.nextDouble());
			c1.accept(sc);
		} catch (ExceptionNegativeNumber e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("indide the finally");

			sc.close();
		}

		System.out.println(c1.getDiameter());

	}

}
