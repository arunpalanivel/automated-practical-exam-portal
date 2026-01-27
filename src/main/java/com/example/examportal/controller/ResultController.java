package com.example.examportal.controller;

import com.example.examportal.dto.ResultRequestDTO;
import com.example.examportal.dto.ResultResponseDTO;
import com.example.examportal.service.ResultService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/results")
public class ResultController {
    private final ResultService resultService;

    public ResultController(ResultService resultService){
        this.resultService = resultService;
    }


    @PostMapping
    public ResultResponseDTO evaluateExamAttempt(@Valid @RequestBody ResultRequestDTO requestDTO){
        return resultService.evaluateExamAttempt(requestDTO);
    }

    @GetMapping("/attempt/{examAttemptId}")
    public ResultResponseDTO getResultByExamAttempt(@PathVariable Long examAttemptId){
        return resultService.getResultByExamAttemptId(examAttemptId);
    }

}
