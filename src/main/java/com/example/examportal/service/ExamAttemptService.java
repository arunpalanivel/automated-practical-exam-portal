package com.example.examportal.service;


import com.example.examportal.dto.ExamAttemptRequestDTO;
import com.example.examportal.dto.ExamAttemptResponseDTO;
import com.example.examportal.entity.ExamAttempt;
import com.example.examportal.entity.Question;
import com.example.examportal.entity.QuestionAssignment;
import com.example.examportal.repository.ExamAttemptRepository;
import com.example.examportal.repository.ExamRepository;
import com.example.examportal.repository.QuestionAssignmentRepository;
import com.example.examportal.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ExamAttemptService {

    private final ExamAttemptRepository examAttemptRepository;
    private final ExamRepository examRepository;
    private final QuestionAssignmentRepository questionAssignmentRepository;

    public ExamAttemptService(
            ExamAttemptRepository examAttemptRepository,
            ExamRepository examRepository,
            QuestionAssignmentRepository questionAssignmentRepository
    ) {
        this.examAttemptRepository = examAttemptRepository;
        this.examRepository = examRepository;
        this.questionAssignmentRepository = questionAssignmentRepository;
    }

    public ExamAttemptResponseDTO submitExam(ExamAttemptRequestDTO requestDTO) {

        if (examAttemptRepository.existsByStudentIdAndExamId(
                requestDTO.getStudentId(), requestDTO.getExamId())) {
            throw new RuntimeException("Student already submitted the exam");
        }

        if (!examRepository.existsById(requestDTO.getExamId())) {
            throw new RuntimeException("Exam does not exist");
        }

        QuestionAssignment assignment =
                questionAssignmentRepository
                        .findByExamIdAndStudentId(
                                requestDTO.getExamId(),
                                requestDTO.getStudentId()
                        );

        if (assignment == null) {
            throw new RuntimeException("Question not assigned to student");
        }

        ExamAttempt examAttempt = new ExamAttempt(
                requestDTO.getStudentId(),
                requestDTO.getExamId(),
                assignment.getQuestionId(),
                requestDTO.getSubmittedAnswer(),
                LocalDateTime.now()
        );

        ExamAttempt savedAttempt = examAttemptRepository.save(examAttempt);

        return new ExamAttemptResponseDTO(
                savedAttempt.getId(),
                savedAttempt.getExamId(),
                savedAttempt.getQuestionId(),
                savedAttempt.getSubmittedAt()
        );
    }

    public List<ExamAttempt> getAttemptsByStudent(Long studentId) {
        return examAttemptRepository.findByStudentId(studentId);
    }
}
