package com.example.examportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.examportal.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    boolean existsByRollNumber(String rollNumber);
}
