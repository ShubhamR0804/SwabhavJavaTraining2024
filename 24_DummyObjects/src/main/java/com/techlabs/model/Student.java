package com.techlabs.model;

public class Student {
	
	private IStudentService studentService;
	
	
	public Student(IStudentService studentService) {
		// TODO Auto-generated constructor stub
		super();
		this.studentService= studentService;
	}



	double calculatePercentage() {
		return studentService.getTotalMarks()/studentService.getTotalNumberOfSubjects();
	}

}
