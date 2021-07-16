package com.fsd.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fsd.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	@Query(value ="Select max(student_roll_number)+1 from Student")
	public long getAvailableRollNumber();
}
