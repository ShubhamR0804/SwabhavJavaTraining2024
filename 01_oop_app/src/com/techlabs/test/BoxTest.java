package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Box;

public class BoxTest {
	
	public static void main(String[] args) {
		
		Box box1 = new Box(30,40,50);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the width : ");
		int width = sc.nextInt();
		box1.setWidth(width);
		System.out.print("Enter the height : ");
		int height = sc.nextInt();
		box1.setHeight(height);
		System.out.print("Enter the depth : ");
		int depth = sc.nextInt();
		box1.setDepth(depth);
		
		System.out.println("Width : " +box1.getWidth());
		System.out.println("Height : " +box1.getHeight());
		System.out.println("Depth : " +box1.getDepth());
		
		
		
		
	
	}
	
	

}
