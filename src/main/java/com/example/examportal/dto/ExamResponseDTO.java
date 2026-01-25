package com.example.examportal.dto;

import java.time.LocalDateTime;

public class ExamResponseDTO {

    private Long id;
    private String examCode;
    private String subject;
    private LocalDateTime dateTime;
    private Integer durationInMinutes;
    private String facultyCode;

    // No-arg constructor
    public ExamResponseDTO() {
    }

    // All-args constructor
    public ExamResponseDTO(Long id,
                           String examCode,
                           String subject,
                           LocalDateTime dateTime,
                           Integer durationInMinutes,
                           String facultyCode) {
        this.id = id;
        this.examCode = examCode;
        this.subject = subject;
        this.dateTime = dateTime;
        this.durationInMinutes = durationInMinutes;
        this.facultyCode = facultyCode;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
