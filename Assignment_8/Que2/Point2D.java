package com.entities;

import java.util.Scanner;

import custom.exception.ExceptionNegativeNumber;

public class Point2D {
	
	int x;
	int y;
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point2D() {
		super();
		x=0;
		y=0;
	}
	 public void accept(Scanner sc) throws ExceptionNegativeNumber {
		System.out.println("Enter first point");
		
		x=sc.nextInt();
		if(x<0) {
			throw new ExceptionNegativeNumber("Point can not be Negative");
		}
		System.out.println("Enter Second point");
		y=sc.nextInt();
		if(y<0) {
			throw new ExceptionNegativeNumber("Point can not be Negative");
		}
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	

}
