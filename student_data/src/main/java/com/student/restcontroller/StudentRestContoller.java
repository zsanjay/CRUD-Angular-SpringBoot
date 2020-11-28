package com.student.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;


@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentRestContoller {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public List<Student> getStudentList(){
		
		return studentService.getStudentList();
	}
	
	@GetMapping("/{id}")
	public Student getStudentDetails(@PathVariable("id") Long id) {
		
		return studentService.getStudentDetails(id);
	}
	
	
	@PostMapping("/")
	public void createStudent(@RequestBody Student student) {
		
		studentService.createStudent(student);
	}
	
	@PutMapping("/{id}")
	public void updateStudent(@PathVariable("id") Long id , @RequestBody Student updatedStudent) {
		
		studentService.updateStudent(id, updatedStudent);
	}
	
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable("id") Long id){
		
		studentService.deleteStudent(id);
	}
	
}
