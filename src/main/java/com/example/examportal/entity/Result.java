package com.example.examportal.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long examAttemptId;


    private Integer marksAwarded;

    @Column(length = 500)
    private String remarks;


    private LocalDateTime evaluatedAt;

    public Result() {
    }

    public Result(Long examAttemptId, Integer marksAwarded, String remarks, LocalDateTime evaluatedAt) {
        this.examAttemptId = examAttemptId;
        this.marksAwarded = marksAwarded;
        this.remarks = remarks;
        this.evaluatedAt = evaluatedAt;
    }

    public Long getId() {
        return id;
    }

    public Long getExamAttemptId() {
        return examAttemptId;
    }

    public Integer getMarksAwarded() {
        return marksAwarded;
    }

    public String getRemarks() {
        return remarks;
    }

    public LocalDateTime getEvaluatedAt() {
        return evaluatedAt;
    }
}
