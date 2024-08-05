package com.model.test;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import com.techlabs.model.NameComparator;
import com.techlabs.model.RollNumberComparator;
import com.techlabs.model.Student;
import com.techlabs.model.StudentComparator;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>(); 
		
		students.add(new Student(2,"Shubham",90));
		students.add(new Student(4,"Shivam",90));
		students.add(new Student(5,"Yuvraj",90));
		students.add(new Student(1,"Kunal",90));
		students.add(new Student(3,"Apurv",90));
		students.add(new Student(6,"Gautam",80));
		
		System.out.println("Students Not Sorted");
		printStudents(students);
		System.out.println("Students Sorted Roll Number Wise : ");
		Collections.sort(students, new StudentComparator.RollNumberComparator());
		printStudents(students);
		
		System.out.println("Students Sorted Name Wise : ");
		Collections.sort(students, new StudentComparator.NameComparator());
		printStudents(students);
		
		
	}

	private static void printStudents(List<Student> students) {
		
		for(Student student: students)
			System.out.println(student);
		
	}

}
