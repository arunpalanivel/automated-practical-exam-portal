package com.example.examportal.controller;


import com.example.examportal.dto.ExamRequestDTO;
import com.example.examportal.dto.ExamResponseDTO;
import com.example.examportal.service.ExamService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<ExamResponseDTO> getAllExams(){
        return examService.getAllExams();
    }
}
