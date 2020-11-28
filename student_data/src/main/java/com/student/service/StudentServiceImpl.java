package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Student;
import com.student.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public List<Student> getStudentList() {
		
		return studentRepo.findAll();
	}

	@Override
	public void deleteStudent(Long id) {
		
		studentRepo.deleteById(id);
	}

	@Override
	public void createStudent(Student student) {
		
		studentRepo.save(student);
	}

	@Override
	public Student getStudentDetails(Long id) {
		
		return studentRepo.getOne(id);
	}

	@Override
	public void updateStudent(Long id, Student updatedStudent) {
		
		Student student = studentRepo.findById(id).get();
		
		student.setName(updatedStudent.getName());
		student.setAddress(updatedStudent.getAddress());
		student.setEmail(updatedStudent.getEmail());
		student.setPhoneNo(updatedStudent.getPhoneNo());
		
		studentRepo.save(student);
		
	}

}
