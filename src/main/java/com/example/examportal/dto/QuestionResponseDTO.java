package com.example.examportal.dto;

public class QuestionResponseDTO {

    private Long id;
    private Long examId;
    private String questionCode;
    private String title;
    private String problemStatement;
    private String expectedOutput;

    public QuestionResponseDTO(){

    }

    public QuestionResponseDTO(Long id, Long examCode, String questionCode, String title, String problemStatement, String expectedOutput) {
        this.id = id;
        this.examId = examCode;
        this.questionCode = questionCode;
        this.title = title;
        this.problemStatement = problemStatement;
        this.expectedOutput = expectedOutput;
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

    public String getExpectedOutput() {
        return expectedOutput;
    }
}
