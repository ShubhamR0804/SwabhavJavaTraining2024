package com.techlabs.model;

public class Box {
	
	private int height;
	private int width;
	private int depth;
	
	
	
	public Box(int height, int width, int depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}

	public int getDepth() {
		return depth;
	}
	
	public void setHeight(int height) {
		this.height=height;
		
	}
	
	public void setWidth(int width) {
		this.width=width;
		
	}
	
	public void setDepth(int depth) {
		this.depth=depth;
		
	}

	
	public void initialize1(int w, int h, int d)
	{
		width = w;
		height = h;
		depth = d;
	}
	
	public void display1() 
	{
		System.out.println("Width of box 1 : " +width);
		System.out.println("Depth of box 1 : " +depth);
		System.out.println("Height of box 1 : " +height);
	}
	
	public int calculateArea()
	{
		return height*width*depth;
	}
}
	/*
	public void initialize2()
	{
		width = 200;
		height = 300;
		depth = 400;
	}
	
	public void display2() 
	{
		System.out.println("Width of box 1 : " +width);
		System.out.println("Depth of box 1 : " +depth);
		System.out.println("Height of box 1 : " +height);
	}
*/

