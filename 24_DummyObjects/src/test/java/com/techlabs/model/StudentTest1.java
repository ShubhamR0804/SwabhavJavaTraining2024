package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StudentTest1 {

	private IStudentService studentService;
	private Student student;

	void init() {
		studentService = Mockito.mock(IStudentService.class);
		student = new Student(studentService);

	}

	@Test
	void testCalculatePercentage() {
		Mockito.when(studentService.getTotalMarks()).thenReturn(650);
		Mockito.when(studentService.getTotalNumberOfSubjects()).thenReturn(10);

		assertEquals(65, student.calculatePercentage());
	}

}
