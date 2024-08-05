package com.techlabs.list.test;

import java.util.Scanner;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;
import com.techlabs.list.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<Student> students = new ArrayList<Student>();
		readStudent(students, scanner);
		// System.out.println(students);
		System.out.println("Normal For Loop");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		System.out.println("\nAdvanced For Loop");
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("\nUsing Iterator");
		Iterator<Student> studentIterator = students.iterator();
		while (studentIterator.hasNext()) {
			System.out.println(studentIterator.next());
		}

		System.out.println("\nUsing List Iterator ");
		ListIterator<Student> studentListIterator = students.listIterator();
		System.out.println("Printing in Forward order with hasNext()");
		while (studentListIterator.hasNext()) {
			System.out.println(studentListIterator.next());
		}
		System.out.println("\nPrinting in Reverse order with hasPrevious()");
		while (studentListIterator.hasPrevious()) {
			System.out.println(studentListIterator.previous());
		}
	}

	private static void readStudent(List<Student> students, Scanner scanner) {
		System.out.println("Enter the number of students: ");
		int numberOfStudents = scanner.nextInt();
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Student Number : " + (i + 1));
			System.out.println("Roll number :");
			int rollNumber = scanner.nextInt();
			System.out.println("Name : ");
			String name = scanner.next();
			System.out.println("Percentage : ");
			double percentage = scanner.nextDouble();
			students.add(new Student(rollNumber, name, percentage));
		}
	}
	
	
}
