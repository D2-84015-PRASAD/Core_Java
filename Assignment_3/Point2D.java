package com.app.geometry;

public class Point2D {
	int x;
	int y;

	public Point2D() {
		super();
	}

	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
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
	
	public String getDetails() {
		return x+","+y;
	}
	
	 public boolean isEqual(Point2D p) {
		 
		 if(this.x==p.x && this.y==p.y) 
			 return true;
		 return false;
		
		 }
	 public double calculateDistance(Point2D p) {
	 double d=Math.sqrt(Math.pow((this.x-p.x),2) + Math.pow((this.y-p.y),2));
		return d;
	 }
}
