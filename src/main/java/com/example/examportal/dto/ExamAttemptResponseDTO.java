package com.example.examportal.dto;

import java.time.LocalDateTime;

public class ExamAttemptResponseDTO {

    private Long attemptId;
    private Long examId;
    private Long questionId;
    private LocalDateTime submittedAt;

    public ExamAttemptResponseDTO() {
    }

    public ExamAttemptResponseDTO(Long attemptId,
                                  Long examId,
                                  Long questionId,
                                  LocalDateTime submittedAt) {
        this.attemptId = attemptId;
        this.examId = examId;
        this.questionId = questionId;
        this.submittedAt = submittedAt;
    }

    public Long getAttemptId() {
        return attemptId;
    }

    public Long getExamId() {
        return examId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }
}
