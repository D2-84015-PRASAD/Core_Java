package com.app.friuts;

public class Apple extends Fruits {
	
	
	
	
	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apple(String name, String color, double weight, boolean isFresh) {
		super(name, color, weight, isFresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sweet n sour";
		
		
	}

	@Override
	public String toString() {
		return "Apple [name=" + name + ", color=" + color + ", weight=" + weight + ", isFresh=" + isFresh + "]";
	}

}
