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
    private Long facultyId;

    public Exam() {
    }

    public Exam(String examCode, String subject, LocalDateTime dateTime, Integer durationMinutes, Long facultyId) {
        this.examCode = examCode;
        this.subject = subject;
        this.dateTime = dateTime;
        this.durationMinutes = durationMinutes;
        this.facultyId = facultyId;
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


    public Long getFacultyId() {
        return facultyId;
    }


}
