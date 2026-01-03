package com.example.examportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.examportal.entity.Student;
import com.example.examportal.repository.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent(String rollNumber, String name){
        Student student = new Student(rollNumber, name);
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

}
