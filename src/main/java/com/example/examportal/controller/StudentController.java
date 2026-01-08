package com.example.examportal.controller;

import java.util.List;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.example.examportal.dto.StudentRequestDTO;
import com.example.examportal.dto.StudentResponseDTO;
import com.example.examportal.entity.Student;
import com.example.examportal.service.StudentService;


@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentResponseDTO> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping
    public StudentResponseDTO createStudent(@Valid @RequestBody StudentRequestDTO request){
        return studentService.createStudent(request);
    }

}
