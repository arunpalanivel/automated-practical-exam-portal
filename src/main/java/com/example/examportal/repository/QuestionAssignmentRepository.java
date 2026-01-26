package com.example.examportal.repository;

import com.example.examportal.entity.QuestionAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionAssignmentRepository
        extends JpaRepository<QuestionAssignment, Long> {

    boolean existsByExamIdAndStudentId(Long examId, Long studentId);

    QuestionAssignment findByExamIdAndStudentId(Long examId, Long studentId);

    boolean existsByExamId(Long examId);
}

