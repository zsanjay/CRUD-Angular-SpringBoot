package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentService {

	 List<Student> getStudentList();
	
	 void deleteStudent(Long id);
	
	 void createStudent(Student student);
	 
	 Student getStudentDetails(Long id);
	 
	 void updateStudent(Long id , Student updatedStudent);
	
}
