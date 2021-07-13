/**
 * 
 */
package com.fsd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentId;
	private String studentName;
	private String studentAddress;
	private long studentRollNumber;
	private Double studentPercentage;

	public Student() {

	}

	public Student(String studentName, String studentAddress, long studentRollNumber, Double studentPercentage) {
		super();
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentRollNumber = studentRollNumber;
		this.studentPercentage = studentPercentage;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public long getStudentRollNumber() {
		return studentRollNumber;
	}

	public void setStudentRollNumber(long studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}

	public Double getStudentPercentage() {
		return studentPercentage;
	}

	public void setStudentPercentage(Double studentPercentage) {
		this.studentPercentage = studentPercentage;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentRollNumber=" + studentRollNumber + ", studentPercentage=" + studentPercentage + "]";
	}

}
