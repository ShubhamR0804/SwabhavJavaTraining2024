package com.techlabs.model;

import com.techlabs.model.Employee;
import java.util.Comparator;

public class EmployeeComparator {
	
	public static class EmployeeIdComparator implements Comparator<Employee>{
		public int compare(Employee employee1, Employee employee2) {
			return employee1.getEmployeeId()-employee2.getEmployeeId();		
		}
		
	}
	
	public static class EmployeeNameComparator implements Comparator<Employee>{
		public int compare(Employee employee1, Employee employee2) {
			return employee1.getName().compareTo(employee2.getName());	
		}
		
	}
	
	public static class EmployeeSalaryComparator implements Comparator<Employee>{
		public int compare(Employee employee1, Employee employee2) {
			if(employee1.getSalary() > employee2.getSalary())
				return 1;
			if(employee1.getSalary() < employee2.getSalary())
				return -1;
			return 0;
		}
	}

}
