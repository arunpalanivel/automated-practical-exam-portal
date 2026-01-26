package com.example.examportal.service;

import com.example.examportal.entity.Question;
import com.example.examportal.entity.QuestionAssignment;
import com.example.examportal.entity.Student;
import com.example.examportal.repository.QuestionAssignmentRepository;
import com.example.examportal.repository.QuestionRepository;
import com.example.examportal.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionAssignmentService {

    private final StudentRepository studentRepository;
    private final QuestionRepository questionRepository;
    private final QuestionAssignmentRepository assignmentRepository;

    public QuestionAssignmentService(StudentRepository studentRepository, QuestionRepository questionRepository, QuestionAssignmentRepository assignmentRepository) {
        this.studentRepository = studentRepository;
        this.questionRepository = questionRepository;
        this.assignmentRepository = assignmentRepository;
    }

    public void assignQuestions(Long examId) {
        if (assignmentRepository.existsByExamId(examId)) {
            throw new RuntimeException("Questions already assigned for this exam");
        }


        List<Student> students =
                studentRepository.findAllByOrderByRollNumberAsc();

        List<Question> questions =
                questionRepository.findByExamIdOrderByQuestionCodeAsc(examId);

        if (questions.size() < 2) {
            throw new RuntimeException("At least 2 questions required");
        }

        for (int i = 0; i < students.size(); i++) {
            Question q = questions.get(i % questions.size());

            assignmentRepository.save(
                    new QuestionAssignment(examId,
                            students.get(i).getId(),
                            q.getId())
            );
        }
    }
}
