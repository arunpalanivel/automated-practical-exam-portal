package com.example.examportal.controller;


import com.example.examportal.service.QuestionAssignmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/assignments")
public class QuestionAssignmentController {

    private final QuestionAssignmentService assignmentService;

    public QuestionAssignmentController(QuestionAssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }

    /**
     * Trigger question assignment for an exam
     * Assumption (APEP v1): all students are eligible for this exam
     */
    @PostMapping("/exam/{examId}")
    public String assignQuestions(@PathVariable Long examId) {
        assignmentService.assignQuestions(examId);
        return "Questions assigned successfully for exam " + examId;
    }
}
