package com.example.examportal.service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.examportal.exception.DuplicateRollNumberException;
import org.springframework.stereotype.Service;

import com.example.examportal.dto.StudentRequestDTO;
import com.example.examportal.dto.StudentResponseDTO;
import com.example.examportal.entity.Student;
import com.example.examportal.repository.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public StudentResponseDTO createStudent(StudentRequestDTO request){

        if(studentRepository.existsByRollNumber(request.getRollNumber())){
            throw new DuplicateRollNumberException(
                    "Student with roll number " + request.getRollNumber() + " already exists");
        }
        Student student = new Student(request.getRollNumber(), request.getName());
        Student savedStudent = studentRepository.save(student);
        return new StudentResponseDTO(
                savedStudent.getId(),
                savedStudent.getRollnumber(),
                savedStudent.getName()
        );
    }

    public List<StudentResponseDTO> getAllStudents(){
        return studentRepository.findAll().stream().map(student -> new StudentResponseDTO(
                student.getId(),
                student.getRollnumber(),
                student.getName()
        )).collect(Collectors.toList());
    }

}
