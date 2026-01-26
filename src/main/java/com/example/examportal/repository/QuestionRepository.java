package com.example.examportal.repository;

import com.example.examportal.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    long countByExamId(Long examId);
    List<Question> findByExamId(Long examId);

    List<Question> findByExamIdOrderByQuestionCodeAsc(Long examCode);
}
