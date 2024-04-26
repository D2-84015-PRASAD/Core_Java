package com.app.friuts;

public class Orange extends Fruits {

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sour";
	}

	

	@Override
	public String toString() {
		return "Orange [name=" + name + ", color=" + color + ", weight=" + weight + ", isFresh=" + isFresh + "]";
	}



	public Orange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orange(String name, String color, double weight, boolean isFresh) {
		super(name, color, weight, isFresh);
		// TODO Auto-generated constructor stub
	}
   
}
