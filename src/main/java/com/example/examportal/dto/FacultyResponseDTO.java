package com.example.examportal.dto;


public class FacultyResponseDTO {
    private Long id;
    private String facultyCode;
    private String name;
    private String email;

    public FacultyResponseDTO(){

    }

    public FacultyResponseDTO(Long id, String facultyCode, String name, String email) {
        this.id = id;
        this.facultyCode = facultyCode;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getFacultyCode() {
        return facultyCode;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
