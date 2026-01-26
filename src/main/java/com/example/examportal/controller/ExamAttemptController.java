package com.example.examportal.controller;

import com.example.examportal.dto.ExamAttemptRequestDTO;
import com.example.examportal.dto.ExamAttemptResponseDTO;
import com.example.examportal.entity.ExamAttempt;
import com.example.examportal.service.ExamAttemptService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExamAttemptController {
    private final ExamAttemptService examAttemptService;

    public ExamAttemptController(ExamAttemptService examAttemptService){
        this.examAttemptService = examAttemptService;
    }

    @PostMapping("/exam-attempts")
    public ExamAttemptResponseDTO submitExam(@Valid @RequestBody ExamAttemptRequestDTO requestDTO){
        return examAttemptService.submitExam(requestDTO);
    }

    @GetMapping("/exam-attempts/student/{studentId}")
    public List<ExamAttempt> getAttemptsByStudent(@PathVariable Long studentId){
        return examAttemptService.getAttemptsByStudent(studentId);
    }
}
