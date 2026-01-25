package com.example.examportal.service;


import com.example.examportal.dto.QuestionRequestDTO;
import com.example.examportal.dto.QuestionResponseDTO;
import com.example.examportal.entity.Exam;
import com.example.examportal.entity.Question;
import com.example.examportal.repository.ExamRepository;
import com.example.examportal.repository.QuestionRepository;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;
    private final ExamRepository examRepository;

    public QuestionService(QuestionRepository questionRepository, ExamRepository examRepository) {
        this.questionRepository = questionRepository;
        this.examRepository = examRepository;
    }

    public QuestionResponseDTO createQuestion(QuestionRequestDTO request){
       Exam exam = examRepository.findById(request.getExamId()).orElseThrow(()->
                new RuntimeException("Exam id with " + request.getExamId() + "Not Found"));

       long questionCount = questionRepository.countByExamId(request.getExamId());

       String questionCode = exam.getExamCode() + "_Q" + (questionCount+1);

        Question question = new Question(
                request.getExamId(),
                questionCode,
                request.getTitle(),
                request.getProblemStatement(),
                request.getExpectedOutput()
        );

        Question savedQuestion = questionRepository.save(question);


        return new QuestionResponseDTO(
                savedQuestion.getId(),
                savedQuestion.getExamId(),
                savedQuestion.getQuestionCode(),
                savedQuestion.getTitle(),
                savedQuestion.getProblemStatement(),
                savedQuestion.getExpectedOutput()
        );

    }
}
