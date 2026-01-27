package com.example.examportal.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class ResultRequestDTO {

    @NotNull(message = "Exam attempt id is required")
    private Long examAttemptId;

    @NotNull(message = "Marks are required")
    @Min(value = 0, message = "Marks cannot be negative")
    private Integer marksAwarded;

    private String remarks;

    public ResultRequestDTO() {
    }

    public Long getExamAttemptId() {
        return examAttemptId;
    }

    public void setExamAttemptId(Long examAttemptId) {
        this.examAttemptId = examAttemptId;
    }

    public Integer getMarksAwarded() {
        return marksAwarded;
    }

    public void setMarksAwarded(Integer marksAwarded) {
        this.marksAwarded = marksAwarded;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
