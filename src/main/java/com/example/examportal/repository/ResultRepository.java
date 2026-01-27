package com.example.examportal.repository;

import com.example.examportal.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Result, Long> {
    boolean existsByExamAttemptId(Long examAttemptId);
    Result findByExamAttemptId(Long examAttemptId);
}
