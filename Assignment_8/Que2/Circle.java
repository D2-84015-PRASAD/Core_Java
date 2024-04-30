package com.entities;

import java.util.Scanner;

import custom.exception.ExceptionNegativeNumber;

public class Circle {
	 double diameter;
	 Point2D p1;
	
	public Circle() {
		super();
		diameter=100;
		p1=new Point2D();
	}
	
	public Circle(int diameter, Point2D p1) {
		super();
		this.diameter = diameter;
		this.p1 = new Point2D();
	}
	
	public double getDiameter() {
		return diameter;
	}
	
	public void setDiameter(double diameter) throws ExceptionNegativeNumber  {
		if(diameter<0) {
			throw new ExceptionNegativeNumber("Diameter can not be Negative");
		}
		
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		return "Circle [diameter=" + diameter + ", p1=" + p1 + "]";
	}
	
  public void accept(Scanner sc) throws ExceptionNegativeNumber {
		System.out.println("Entet diameter - ");
		
		diameter=sc.nextDouble();
		if(diameter<0) {
			throw new ExceptionNegativeNumber("Diameter can not be negative");
		}
		p1.accept(sc);
	}
	
	
	
	
	
	

}
