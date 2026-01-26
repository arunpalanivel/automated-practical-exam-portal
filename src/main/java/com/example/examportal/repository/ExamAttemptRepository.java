package com.example.examportal.repository;

import com.example.examportal.entity.ExamAttempt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExamAttemptRepository extends JpaRepository<ExamAttempt, Long> {
    boolean existsByStudentIdAndExamId(Long studentId, Long examId);
    List<ExamAttempt> findByStudentId(Long studentId);
}
