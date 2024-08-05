package com.techlabs.model;

public class Circle {
	
	private double radius;
	
	public Circle(double ra) {
		radius = ra;
	}
	
	
	public Circle() {
	}


	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double r) {
		radius = r;
	}

	
	
	public void initializeRadius(double r) {
		radius = r;
	}
	
	public void display() {
		System.out.println("the radius of the circle is : " +radius);
	}
	
	public void calculateArea() {
		double pi = 3.14;
		System.out.println("The area of circle is : " +pi*radius*radius);
	}
	

}
