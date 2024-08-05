package com.techlabs.model;

public class Triangle implements Shape{

	
	private int breadth;
	private int height;
	
	
	public Triangle(int breadth, int height) {
		super();
		this.breadth = breadth;
		this.height = height;
	}
	@Override
	public void area() {
		System.out.println("Area of Triangle is : " +(0.5*(breadth*height)));
		
	}
	
	

}
