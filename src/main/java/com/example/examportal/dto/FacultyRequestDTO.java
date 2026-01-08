package com.example.examportal.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class FacultyRequestDTO {

    @NotBlank(message = "Faculty code should not be blank")
    private String facultyCode;

    @NotBlank(message = "Name should not be blank")
    @Size(min = 2,max = 50, message = "Faculty name must be between 2 and 50 characters")
    private String name;

    @NotBlank(message = "email should not be blank")
    @Email(message = "Invalid email format")
    private String email;

    public FacultyRequestDTO(){

    }

    public String getFacultyCode() {
        return facultyCode;
    }

    public void setFacultyCode(String facultyCode) {
        this.facultyCode = facultyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
