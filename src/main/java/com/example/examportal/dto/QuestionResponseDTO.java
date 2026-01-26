package com.example.examportal.dto;

public class QuestionResponseDTO {

    private Long id;
    private Long examId;
    private String questionCode;
    private String title;
    private String problemStatement;

    public QuestionResponseDTO(){

    }

    public QuestionResponseDTO(Long id, Long examId, String questionCode, String title, String problemStatement) {
        this.id = id;
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
