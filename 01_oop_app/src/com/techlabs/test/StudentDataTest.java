package com.techlabs.test;

import java.util.Scanner;
import com.techlabs.model.StudentData;

public class StudentDataTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


		StudentData student = new StudentData();
		
		String name = sc.next();
		student.setName(name);
		
		int rollNumber = sc.nextInt();
		student.setRollNumber(rollNumber);
		
		int age = sc.nextInt();
		student.setAge(age);
		
		double percentage = sc.nextDouble();
		student.setPercentage(percentage);
		
		
		
		System.out.println(student.getName());
		System.out.println(student.getRollNumber());
		System.out.println(student.getAge());
		System.out.println(student.getPercentage());
		
	
		
	    
		

	}

}
