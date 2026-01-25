package com.example.examportal.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

public class ExamRequestDTO {

    @NotBlank(message = "Exam Code cannot be blank")
    private String examCode;

    @NotBlank(message = "Subject cannot be blank")
    private String subject;

    @NotNull(message = "Exam start date and time cannot be null")
    private LocalDateTime dateTime;

    @NotNull(message = "Exam duration cannot be null")
    @Positive(message = "Exam duration must be greater than 0")
    private Integer durationInMinutes;

    @NotBlank(message = "Faculty Code/Id cannot be blank")
    private String facultyCode;

    // Getters and Setters

    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getFacultyCode() {
        return facultyCode;
    }

    public void setFacultyCode(String facultyCode) {
        this.facultyCode = facultyCode;
    }
}
