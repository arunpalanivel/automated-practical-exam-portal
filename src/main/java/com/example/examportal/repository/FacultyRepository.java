package com.example.examportal.repository;

import com.example.examportal.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty,Long> {
    boolean existsByFacultyCode(String facultyCode);
}
