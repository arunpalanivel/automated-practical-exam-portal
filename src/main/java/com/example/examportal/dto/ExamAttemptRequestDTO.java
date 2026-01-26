package com.example.examportal.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ExamAttemptRequestDTO {

    @NotNull(message = "Student ID cannot be null")
    private Long studentId;

    @NotNull(message = "Exam ID cannot be null")
    private Long examId;

    @NotBlank(message = "Submitted answer cannot be blank")
    private String submittedAnswer;

    public ExamAttemptRequestDTO() {
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public String getSubmittedAnswer() {
        return submittedAnswer;
    }

    public void setSubmittedAnswer(String submittedAnswer) {
        this.submittedAnswer = submittedAnswer;
    }
}
