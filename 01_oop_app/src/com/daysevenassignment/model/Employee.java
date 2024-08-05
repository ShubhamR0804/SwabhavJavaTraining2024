package com.daysevenassignment.model;

public class Employee {

	private static int employeeId;
	private static String name;
	private static double salary;
	
	public static int getEmployeeId() {
		return employeeId;
	}
	
	public static String getName() {
		return name;
	}
	
	public static double getSalary() {
		return salary;
	}
	
	public static void setName(String n) {
		name = n;
	}
	
	public static void setEmployeeId(int eId) {
		employeeId = eId;
	}
	
	public static void setSalary(double sal) {
		salary = sal;
	}
}
