package com.example.examportal.service;

import com.example.examportal.dto.ResultRequestDTO;
import com.example.examportal.dto.ResultResponseDTO;
import com.example.examportal.entity.ExamAttempt;
import com.example.examportal.entity.Result;
import com.example.examportal.repository.ExamAttemptRepository;
import com.example.examportal.repository.ResultRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ResultService {

    private final ResultRepository resultRepository;
    private final ExamAttemptRepository examAttemptRepository;

    public ResultService(ResultRepository resultRepository,
                         ExamAttemptRepository examAttemptRepository) {
        this.resultRepository = resultRepository;
        this.examAttemptRepository = examAttemptRepository;
    }

    /**
     * Faculty evaluates an exam attempt
     */
    public ResultResponseDTO evaluateExamAttempt(ResultRequestDTO request) {

        // 1️⃣ Check exam attempt exists
        ExamAttempt attempt = examAttemptRepository.findById(request.getExamAttemptId())
                .orElseThrow(() ->
                        new RuntimeException("Exam attempt not found")
                );

        // 2️⃣ Prevent double evaluation
        if (resultRepository.existsByExamAttemptId(attempt.getId())) {
            throw new RuntimeException("This exam attempt is already evaluated");
        }

        // 3️⃣ Create Result
        Result result = new Result(
                attempt.getId(),
                request.getMarksAwarded(),
                request.getRemarks(),
                LocalDateTime.now()
        );

        // 4️⃣ Save Result
        Result savedResult = resultRepository.save(result);

        // 5️⃣ Return response
        return new ResultResponseDTO(
                savedResult.getId(),
                savedResult.getExamAttemptId(),
                savedResult.getMarksAwarded(),
                savedResult.getRemarks(),
                savedResult.getEvaluatedAt()
        );
    }

    /**
     * View result for an exam attempt
     */
    public ResultResponseDTO getResultByExamAttemptId(Long examAttemptId) {

        Result result = resultRepository.findByExamAttemptId(examAttemptId);

        if (result == null) {
            throw new RuntimeException("Result not found for this exam attempt");
        }

        return new ResultResponseDTO(
                result.getId(),
                result.getExamAttemptId(),
                result.getMarksAwarded(),
                result.getRemarks(),
                result.getEvaluatedAt()
        );
    }
}
