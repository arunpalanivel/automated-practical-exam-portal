package com.example.examportal.service;


import com.example.examportal.dto.ExamRequestDTO;
import com.example.examportal.dto.ExamResponseDTO;
import com.example.examportal.entity.Exam;
import com.example.examportal.repository.ExamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {

    private ExamRepository examRepository;

    public ExamService(ExamRepository examRepository){
        this.examRepository = examRepository;
    }

    public ExamResponseDTO createExam(ExamRequestDTO requestDTO){
        if (examRepository.existsByExamCode(requestDTO.getExamCode())){
            throw new RuntimeException(
                    "Exam with code " + requestDTO.getExamCode() + " already exists."
            );
        }
        Exam exam = new Exam(
                requestDTO.getExamCode(),
                requestDTO.getSubject(),
                requestDTO.getDateTime(),
                requestDTO.getDurationInMinutes(),
                requestDTO.getFacultyCode()
        );

        Exam savedExam = examRepository.save(exam);

        return new ExamResponseDTO(
                savedExam.getId(),
                savedExam.getExamCode(),
                savedExam.getSubject(),
                savedExam.getDateTime(),
                savedExam.getDurationMinutes(),
                savedExam.getFacultyCode()
        );
    }

    public List<ExamResponseDTO> getAllExams(){
        return examRepository.findAll().stream().map(
                exam -> new ExamResponseDTO(
                        exam.getId(),
                        exam.getExamCode(),
                        exam.getSubject(),
                        exam.getDateTime(),
                        exam.getDurationMinutes(),
                        exam.getFacultyCode()
                )).toList();
    }



}
