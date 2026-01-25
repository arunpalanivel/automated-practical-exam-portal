package com.example.examportal.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String examCode;
    private String subject;
    private LocalDateTime dateTime;
    private Integer durationMinutes;
    private String facultyCode;

    public Exam() {
    }

    public Exam(String examCode, String subject, LocalDateTime dateTime, Integer durationMinutes, String facultyCode) {
        this.examCode = examCode;
        this.subject = subject;
        this.dateTime = dateTime;
        this.durationMinutes = durationMinutes;
        this.facultyCode = facultyCode;
    }

    public Long getId() {
        return id;
    }

    public String getExamCode() {
        return examCode;
    }


    public String getSubject() {
        return subject;
    }



    public LocalDateTime getDateTime() {
        return dateTime;
    }



    public Integer getDurationMinutes() {
        return durationMinutes;
    }


    public String getFacultyCode() {
        return facultyCode;
    }


}
