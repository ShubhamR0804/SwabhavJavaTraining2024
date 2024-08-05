package com.daysevenassignment.test;

import java.util.Scanner;

import com.daysevenassignment.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// StudentData student = new StudentData();
		System.out.println("Enter the number of employee data to be printed : ");
		int size = sc.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println("Name : ");
			String nameEmployee = sc.next();
			Employee.setName(nameEmployee);

			System.out.println("Employee ID : ");
			int idEmp = sc.nextInt();
			Employee.setEmployeeId(idEmp);

			System.out.println("Salary : ");
			double sal = sc.nextDouble();
			Employee.setSalary(sal);

			System.out.println(" Employee " + (i + 1) + "\n Name :" + Employee.getName() + "\n Employee ID : "
					+ Employee.getEmployeeId() + "\n Salary : " + Employee.getSalary());
		}
	}

}
