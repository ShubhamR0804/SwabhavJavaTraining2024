package com.techlabs.model;

import java.util.Comparator;

import com.techlabs.model.Student;

public class RollNumberComparator implements Comparator<Student> {
	
	public int compare(Student student1, Student student2) {
		if(student1.getRollNumber()>student2.getRollNumber())
			return 1;
		if(student1.getRollNumber()<student2.getRollNumber())
			return -1;
		return 0;

	}
}
