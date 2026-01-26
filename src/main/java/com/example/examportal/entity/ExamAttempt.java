package com.example.examportal.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class ExamAttempt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long studentId;

    private Long examId;

    private Long questionId;

    @Lob
    private String submittedAnswer;

    private LocalDateTime submittedAt;

    public ExamAttempt(){

    }

    public ExamAttempt(Long studentId, Long examId, Long questionId, String submittedAnswer, LocalDateTime submittedAt) {
        this.studentId = studentId;
        this.examId = examId;
        this.questionId = questionId;
        this.submittedAnswer = submittedAnswer;
        this.submittedAt = submittedAt;
    }

    public Long getId() {
        return id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public Long getExamId() {
        return examId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public String getSubmittedAnswer() {
        return submittedAnswer;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }
}
