package com.constructorchaining.model;

public class Box {

	private int height;
	private int width;
	private int depth;
	
	
	public Box() {
		
	}
	
	


	@Override
	public String toString() {
		return "Box [height=" + height + ", width=" + width + ", depth=" + depth + "]";
	}




	public Box(int height, int width, int depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	
	
	
}
