package com.fsd.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.model.Student;
import com.fsd.service.StudentService;

@RestController
public class StudentController {
	Logger log = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	StudentService studentService;

	@PostMapping("/addStudent")
	public ResponseEntity<Object> addStudent(@RequestBody Student student) {
		studentService.addStudentService(student);
		return ResponseEntity.status(HttpStatus.CREATED).build();

	}

	@GetMapping("/getStudent/{studentId}")
	public Student getStudent(@PathVariable Long studentId) {
		log.info("getStudent() called");
		return studentService.getStudentService(studentId);
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents(){
		return studentService.getAllStudentService();
	}
	
	@PutMapping("/updateStudent/{studentId}")
	public Student updateStudent(@RequestBody Student student, @PathVariable Long studentId) {
		return studentService.updateStudent(student, studentId);
	}
	
	
}
