package com.example.examportal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class QuestionAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long examId;
    private Long studentId;
    private Long questionId;

    public QuestionAssignment() {}

    public QuestionAssignment(Long examId, Long studentId, Long questionId) {
        this.examId = examId;
        this.studentId = studentId;
        this.questionId = questionId;
    }

    public Long getId() {
        return id;
    }

    public Long getExamId() {
        return examId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public Long getQuestionId() {
        return questionId;
    }
}

