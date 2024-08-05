package com.model.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techlabs.model.Employee;
import com.techlabs.model.EmployeeComparator;
import com.techlabs.model.Student;
import com.techlabs.model.StudentComparator;



public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>(); 
		
		employees.add(new Employee(2,"Shubham",90000));
		employees.add(new Employee(4,"Shivam",90000));
		employees.add(new Employee(5,"Yuvraj",90011));
		employees.add(new Employee(1,"Kunal",90010));
		employees.add(new Employee(3,"Apurv",900210));
		employees.add(new Employee(6,"Gautam",80220));
		
		System.out.println("Employees Not Sorted");
		printEmployees(employees);
		System.out.println("Employee Sorted Id Wise : ");
		Collections.sort(employees, new EmployeeComparator.EmployeeIdComparator());
		printEmployees(employees);
		
		System.out.println("Employees Sorted Name Wise : ");
		Collections.sort(employees, new EmployeeComparator.EmployeeNameComparator());
		printEmployees(employees);
		
		System.out.println("Employees Sorted Salary Wise : ");
		Collections.sort(employees, new EmployeeComparator.EmployeeSalaryComparator());
		printEmployees(employees);
		
		
	}

	private static void printEmployees(List<Employee> employees) {
		
		for(Employee employee: employees)
			System.out.println(employee);
		
	}


}
