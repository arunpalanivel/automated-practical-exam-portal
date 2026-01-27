package com.example.examportal.dto;

import java.time.LocalDateTime;

public class ResultResponseDTO {

    private Long resultId;
    private Long examAttemptId;
    private Integer marksAwarded;
    private String remarks;
    private LocalDateTime evaluatedAt;

    public ResultResponseDTO() {
    }

    public ResultResponseDTO(Long resultId,
                             Long examAttemptId,
                             Integer marksAwarded,
                             String remarks,
                             LocalDateTime evaluatedAt) {
        this.resultId = resultId;
        this.examAttemptId = examAttemptId;
        this.marksAwarded = marksAwarded;
        this.remarks = remarks;
        this.evaluatedAt = evaluatedAt;
    }

    public Long getResultId() {
        return resultId;
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
