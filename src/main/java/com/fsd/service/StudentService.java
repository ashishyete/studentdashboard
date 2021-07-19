package com.fsd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsd.model.Student;
import com.fsd.repo.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepo;
	
	public void addStudentService(Student student) {
		studentRepo.save(student);
	}

	public Student getStudentService(long studentId) {
		return studentRepo.findById(studentId).get();
	}
	
	public List<Student> getAllStudentService(){
		return studentRepo.findAll();
	}
	
	public List<Student> deleteStudent(long studentId){
		studentRepo.deleteById(studentId);
		return getAllStudentService();
	}
	
	public Student updateStudent(Student student,long studentId) {
	Student stuObj = getStudentService(studentId);
	stuObj.setStudentAddress(student.getStudentAddress());
	stuObj.setStudentName(student.getStudentName());
	stuObj.setStudentId(studentId);
	stuObj.setStudentPercentage(student.getStudentPercentage());
	stuObj.setStudentRollNumber(student.getStudentRollNumber());
	return studentRepo.save(stuObj);
	}
	
	
	public long getNextAvailableRollNumber() {
		try {
		return studentRepo.getAvailableRollNumber();
		}catch (Exception e) {
			System.out.println("Exception Caught - No entries in DB : Sending a Default value of 1");
			return 1;
		}
	}
	
}
