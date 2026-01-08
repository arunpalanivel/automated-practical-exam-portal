package com.example.examportal.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
public class StudentRequestDTO {

    @NotBlank(message = "Roll Number must not be blank")
    @Size(min = 11, max = 11, message = "Roll number must be between 5 and 20 characters")
    private String rollNumber;

    @NotBlank(message = "Student must not be blank")
    @Size(min = 2,max = 50, message = "Student name must be between 2 and 50 characters")
    private String name;

    public StudentRequestDTO(){

    }
    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
