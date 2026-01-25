package com.example.examportal.controller;


import com.example.examportal.dto.ExamRequestDTO;
import com.example.examportal.dto.ExamResponseDTO;
import com.example.examportal.service.ExamService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exams")
public class ExamController {
    private ExamService examService;

    public ExamController(ExamService examService){
        this.examService = examService;
    }

    @PostMapping
    public ExamResponseDTO createExam(@Valid @RequestBody ExamRequestDTO examRequestDTO){
        return examService.createExam(examRequestDTO);
    }
}
