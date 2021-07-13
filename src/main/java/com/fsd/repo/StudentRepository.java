package com.fsd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsd.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
