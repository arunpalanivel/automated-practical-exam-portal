package com.example.examportal.entity;


import jakarta.persistence.*;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long examId;
    private String questionCode;
    private String title;

    @Lob
    private String problemStatement;



    public Question() {
    }

    public Question(Long examId, String questionCode, String title, String problemStatement) {
        this.examId = examId;
        this.questionCode = questionCode;
        this.title = title;
        this.problemStatement = problemStatement;
    }

    public Long getId() {
        return id;
    }

    public Long getExamId() {
        return examId;
    }

    public String getQuestionCode() {
        return questionCode;
    }

    public String getTitle() {
        return title;
    }

    public String getProblemStatement() {
        return problemStatement;
    }


}
