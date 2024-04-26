package com.app.friuts;

public class Fruits {
	
	// TODO Auto-generated method stub
	String name;
	String color;
	double weight;
	boolean isFresh;
	public Fruits() {
		
	}
	public Fruits(String name, String color, double weight, boolean isFresh) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = isFresh;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	public String toString() {
		return "Fruits [name=" + name + ", color=" + color + ", weight=" + weight + ", isFresh=" + isFresh + "]";
	}
	
	public String taste() {
		return "no specific taste";
	}
	
	
	
	
	
	
	

	
}
