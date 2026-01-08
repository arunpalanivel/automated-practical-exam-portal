package com.example.examportal.dto;

public class StudentResponseDTO {
    private Long id;
    private String rollNumber;
    private String name;

    public StudentResponseDTO(Long id, String rollNumber, String name){
        this.id = id;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }
}
