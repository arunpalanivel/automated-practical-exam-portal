package com.example.examportal.controller;

import com.example.examportal.dto.QuestionRequestDTO;
import com.example.examportal.dto.QuestionResponseDTO;
import com.example.examportal.service.QuestionService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public QuestionResponseDTO createQuestion(
            @Valid @RequestBody QuestionRequestDTO request) {

        return questionService.createQuestion(request);
    }
}
