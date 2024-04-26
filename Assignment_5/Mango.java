package com.app.friuts;

public class Mango extends Fruits {

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sweet";
	}

	@Override
	public String toString() {
		return "Mango [name=" + name + ", color=" + color + ", weight=" + weight + ", isFresh=" + isFresh + "]";
	}

	public Mango() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mango(String name, String color, double weight, boolean isFresh) {
		super(name, color, weight, isFresh);
		// TODO Auto-generated constructor stub
	}
	
	

}
